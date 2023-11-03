public class HashTable<K, V> {
    Node<K, V>[] arrayNode;
    private int capacity = 16;

    private class Node<K, V> {
        private final K key;
        private final int hash;
        private V value;
        private Node<K, V> next;

        public Node(K key, V value) {
            this.key = key;
            this.value = value;
            hash = key.hashCode() ^ value.hashCode();
            arrayNode = new Node[capacity];
            // TODO: 11/2/2023 make sure that initialization is right
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
}
