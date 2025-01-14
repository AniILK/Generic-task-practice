package Task3;

public class Pora<K, V> {
    private K key;
    private V value;

    public Pora(K raktas, V reiksme) {
        this.key = raktas;
        this.value = reiksme;
    }

    public K getKey() {
        return key;
    }

    public V getValue() {
        return value;
    }

    @Override
    public String toString() {
        return  String.format("\nPora ->[key - %s] [value - %s]\n", this.key, this.value);
    }
}
