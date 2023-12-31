package org.apalyukha.hashmap;

public class HashMap implements Map {

    private final String[] values;

    public HashMap() {
        this.values = new String[100];
    }

    @Override
    public void put(int key, String value) {

        values[computeIndex(key)] = value;
    }

    @Override
    public String get(int key) {

        return values[computeIndex(key)];
    }

    private int computeIndex(int key) {
        return Math.abs(key) % values.length;
    }
}
