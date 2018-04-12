
package com.kodilla.good.patterns.flightSearch;

public class Search {
    public static void main(String[] args) {
        SearchEngine searchEngine = new SearchEngine();
        Airport warsaw = new Airport("Warsaw");
        Airport poznan = new Airport("Poznan");
        Airport wroclaw = new Airport("Wroclaw");

        System.out.println("Searching flights from Warsaw");
        searchEngine.searchFrom(warsaw);

        System.out.println("\nSearching flights to Warsaw");
        searchEngine.searchTo(warsaw);

        System.out.println("\nSearching connecting flight from Poznan to Wroclaw");
        searchEngine.searchBetween(poznan, wroclaw);
    }
}
