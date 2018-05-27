public class HashTable {
    private HashItem[] hashArray;

    public HashTable() {
        hashArray = new HashItem[Constants.TABLE_SIZE];
    }

    private int hash(int key) {
        return key % Constants.TABLE_SIZE;
    }

    public void put(int key, int value) {
        int hashArrayIndex = hash(key);

        if (hashArray[hashArrayIndex] == null) {
            hashArray[hashArrayIndex] = new HashItem(key, value);
        } else {
            HashItem hashItem = hashArray[hashArrayIndex];

            while (hashItem.getNext() != null) {
                hashItem = hashItem.getNext();
            }

            hashItem.setNext(new HashItem(key, value));
        }
    }

    public int get(int key) {
        int hashArrayIndex = hash(key);

        HashItem hashItem = hashArray[hashArrayIndex];

        while (hashItem != null && hashItem.getKey() != key) {
            hashItem = hashItem.getNext();
        }

        return (hashItem == null) ? -1 : hashItem.getValue();
    }
}