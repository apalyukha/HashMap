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

}
