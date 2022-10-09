package com.module2.gdstruc;

public class Main {
    public static void main(String[] args) {
        // add players to the ArrayList
        Player goku = new Player(1, "Goku", 9001);
        Player vegeta = new Player(2, "Vegeta", 9000);
        Player broly = new Player(3, "Broly", 20000);

        // add the players to a linked list
        PlayerLinkedList linkedList = new PlayerLinkedList();
        linkedList.addToFront(goku);
        linkedList.addToFront(vegeta);
        linkedList.addToFront(broly);

        // adding two more players
        linkedList.addToFront(new Player(10, "Yamcha", 500));
        linkedList.addToFront(new Player(4, "Tien", 1000));

        // print the elements of the starting from the head
        linkedList.printList();

        // removing the first element
        linkedList.removeFirstElement(linkedList);

        // print the elements after removing the first element
        linkedList.printList();

        // Testing if the listSize function works
        System.out.println("Number of elements: " + linkedList.listSize());

        // This should be true and at index 1
        int brolyIndex = linkedList.indexOfElement(broly);  // Find where Broly is in the list
        boolean brolyFound = linkedList.containsElement(broly);     // Test to see if Broly can be found
        System.out.println("Is Broly here? " + brolyFound + " At index: " + brolyIndex);    // Printing results

        // This should be true and at index 0
        Player yamchaPlayer = new Player(10, "Yamcha", 500);
        int yamchaIndex = linkedList.indexOfElement(yamchaPlayer);
        boolean yamchaFound = linkedList.containsElement(yamchaPlayer);
        System.out.println("Is Yamcha here? " + yamchaFound + " At index: " + yamchaIndex);

        // This should be false and at index -1
        Player tienPlayer = new Player(8, "Tien", 2000);
        int tienIndex = linkedList.indexOfElement(tienPlayer);
        boolean tienFound = linkedList.containsElement(tienPlayer);
        System.out.println("Is Tien here? " + tienFound + " At index: " + tienIndex);
    }
}