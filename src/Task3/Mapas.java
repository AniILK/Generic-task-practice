package Task3;

import java.util.ArrayList;

public class Mapas<K, V> {

    private ArrayList<Pora<K, V>> poruSarasas;

    public Mapas() {
        this.poruSarasas = new ArrayList<>();
    }

    public void ideti(K key, V value) {
        Pora<K,V> pora = new Pora<>(key, value);
        poruSarasas.add(pora);
    }

    public V gauti(K key) {
        try {
            for (Pora<K, V> pora : poruSarasas) {
                if (pora.getKey().equals(key)) {
                    return pora.getValue();
                }
            }
        } catch (NullPointerException npe) {
            System.out.println("Encountered null value");
        }
        return null;
    }

    @Override
    public String toString() {
        return String.format("Mapas ->[poru sarasas - %s]", this.poruSarasas);
    }
}
