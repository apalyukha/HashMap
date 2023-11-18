package org.apalyukha.hashmap;

public class HashMap implements Map {

    private final String[] values;

    public HashMap() {
        this.values = new String[100];
    }

    @Override
    public void put(int key, String value) {
        if (key < 0) {
            key -= key;
        }
        values[key] = value;
    }

    @Override
    public String get(int key) {
        if (key < 0) {
            key -= key;
        }
        return values[key];
    }
}
