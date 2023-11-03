public class HashTable<K, V> {
    private int capacity = 16;
    Node<K, V>[] arrayNode = new Node[capacity];
    private int size = 0;

    public int getSize() {
        return size;
    }

    private class Node<K, V> {
        private final K key;
        private final int hash;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            hash = key.hashCode() ^ value.hashCode();
        }

        public K getKey() {
            return key;
        }

        public int getHash() {
            return hash;
        }

        public V getValue() {
            return value;
        }

        public void setValue(V value) {
            this.value = value;
        }
    }

    public void putNode(K key, V value) {

        Node<K, V> node = new Node<K, V>(key, value);
        int index = node.getHash() % capacity;
        if (arrayNode[index] == null) {
            arrayNode[index] = node;
            size++;
            return;
        }
        for (Node<K, V> i = arrayNode[index]; i != null; i = i.next) {
            if (i.next == null) {
                i.next = node;
                size++;
                return;
            }
            if(i.key == key){
                i.value = value;
                return;
            }
        }
    }

    public V get(K key) {
        for (Node<K, V> kvNode : arrayNode) {
            if (kvNode != null) {
                for (Node<K, V> i = kvNode; i != null; i = i.next) {
                    if (i.key == key) {
                        return i.value;
                    }
                }
            }
        }
        return null;
    }
}
