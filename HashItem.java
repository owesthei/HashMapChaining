public class HashItem {
    private int key;
    private int value;
    private HashItem next;

    public HashItem(int key, int value) {
        this.key = key;
        this.value = value;
    }

    public int getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }

    public HashItem getNext() {
        return next;
    }

    public void setNext(HashItem next) {
        this.next = next;
    }
}