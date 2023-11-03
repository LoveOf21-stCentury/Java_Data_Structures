public class Main {
    public static void main(String[] args) {
        HashTable<Integer, String> hashTable = new HashTable<>();
        hashTable.putNode(1, "my");
        hashTable.putNode(2, "mind");
        hashTable.putNode(3, "and");
        hashTable.putNode(2, "me");
        hashTable.putNode(6, "you");
        hashTable.putNode(5, "too");
        System.out.println(hashTable.get(2));
        System.out.println(hashTable.get(7));
    }
}