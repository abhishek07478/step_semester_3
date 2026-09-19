class IdCard {
    String name;
    int booksIssued;

    IdCard(String name, int booksIssued) {
        this.name = name;
        this.booksIssued = booksIssued;
    }

    public static void main(String[] args) {

        IdCard ravi = new IdCard("Ravi", 0);

        // Reference copy
        IdCard duplicate = ravi;

        // Change through duplicate
        duplicate.booksIssued = 3;

        System.out.println(
                "Ravi's booksIssued (via first variable): "
                + ravi.booksIssued
        );

        System.out.println(
                "duplicate == ravi: " + (duplicate == ravi)
        );

        // Separate object
        IdCard separate = new IdCard("Ravi", 3);

        System.out.println(
                "separate == ravi: " + (separate == ravi)
        );
    }
}