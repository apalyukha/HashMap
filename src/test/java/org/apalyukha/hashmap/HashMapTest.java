package org.apalyukha.hashmap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class HashMapTest {

    @Test
    void get_shouldReturnValue_whenSavedWithPut() {
        Map map = new HashMap();
        map.put(42, "hello");

        assertEquals("hello", map.get(42));
    }

    @Test
    void get_shouldReturnMappedValues_whenDifferentKeysUsed() {
        HashMap map = new HashMap();

        map.put(1, "one");
        map.put(2, "two");

        assertEquals("one", map.get(1));
        assertEquals("two", map.get(2));

    }

    @Test
    void map_shouldSupportNegativeKeys() {
        Map map = new HashMap();
        map.put(-42, "negative");

        assertEquals("negative", map.get(-42));

    }

    @Test
    void map_shouldSupportLargeNumericKeys() {
        Map map = new HashMap();
        map.put(Integer.MAX_VALUE, "large");

        assertEquals("large", map.get(Integer.MAX_VALUE));
    }
}
