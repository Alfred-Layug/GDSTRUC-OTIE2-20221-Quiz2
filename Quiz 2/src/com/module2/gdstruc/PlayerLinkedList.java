package com.module2.gdstruc;

public class PlayerLinkedList {
    private PlayerNode head;

    int counter = 0;    // Initialize the counter variable

    boolean contains = false;   // Initialize the contains variable

    public boolean containsElement(Player player){
        // Set contains equal to false every time this function is called since we have not searched yet
        contains = false;
        PlayerNode current = head;  // We loop through the list starting at the head

        while (current != null) {
            //We have to check all attributes of the player to see if that specific player is in the linked list
            if (player.getId() == current.getPlayer().getId() &&
                    player.getLevel() == current.getPlayer().getLevel() &&
                    player.getName() == current.getPlayer().getName()) {
                contains = true;
                break;

            } else {
                current = current.getNextPlayer();
            }
        }

        return contains;
    }

    public int indexOfElement(Player player) {  // This function is mostly similar to the containsElement one
        int index = 0;
        PlayerNode current = head;  //We loop through the list starting at the head

        while (current != null) {
            //Have to check all attributes of player to see if that specific player is in the list
            if (player.getId() == current.getPlayer().getId() &&
                    player.getLevel() == current.getPlayer().getLevel() &&
                    player.getName() == current.getPlayer().getName()) {
                break;

            } else {
                index++;    // We increment the index each time check an element
                current = current.getNextPlayer();
            }
        }

        if (index == counter)   // This will run if we loop through the whole list and do not find the element.
        // Last index = counter - 1;     For example, a linked list with 5 elements will have 4 as its last index.
        {
            return -1;  // Return -1 if the element is not found
        }

        return index;
    }

    public int listSize(){
        return counter;     // We only need to return the value of the counter
    }

    // function to add a new player to the front of the linked list
    public void addToFront(Player player) {
        PlayerNode playerNode = new PlayerNode(player);
        playerNode.setNextPlayer(head);
        head = playerNode;
        counter++;  // Increment because we add an element
    }

    // function to remove the first element of the linked list
    public void removeFirstElement(PlayerLinkedList player){
        head = head.getNextPlayer();
        counter--;  // Decrement because we remove an element
    }

    // function to print the elements of the linked list
    public void printList() {
        System.out.print("HEAD -> ");
        PlayerNode current = head;

        while (current != null) {
            System.out.print(current.getPlayer() + " -> ");
            current = current.getNextPlayer();
        }
        System.out.print(" NULL\n");
        System.out.println("Linked List Size: " + counter);     // Print the number of elements in the linked list
    }
}