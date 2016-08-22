package com.corebaseit.bevia;

/**
 * Created by vbevia on 22/08/16.
 */
public class Util {

    public static <K, V> boolean compare(PairForUtil<K, V> p1, PairForUtil<K, V> p2) {

        return /*p1.getKey().equals(p2.getKey()) &&*/
                p1.getValue().equals(p2.getValue());
    }
}
