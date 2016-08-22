package com.corebaseit.bevia;

public class Main {

    public static void main(String[] args) {

        Pair<String, Integer> p1 = new OrderedPair<>("MultiSafePay", 2016);
        Pair<String, String>  p2 = new OrderedPair<>("El Paraiso", "Estepona");

        System.out.print(p1.getKey() + "  " + p1.getValue());
        System.out.print("\n" + p2.getKey() + "  " + p2.getValue());

        /**
         *
         *
         * test to see if values are the same:
         */

        PairForUtil<Integer, String> p1Utils = new PairForUtil<>(1, "Estepona");
        PairForUtil<Integer, String> p2Utils = new PairForUtil<>(2, "Valencia");

        boolean same = Util.compare(p1Utils, p2Utils);
        System.out.print("\n" + same);

        //Now lest set the same value...and tested again:
        p2Utils.setKey(3);
        p2Utils.setValue("Estepona");
        same = Util.compare(p1Utils, p2Utils);
        System.out.print("\n" + same);



    }
}
