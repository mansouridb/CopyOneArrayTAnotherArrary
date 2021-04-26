package org.example;

public class CpArrToArray {
    public static void main(String[] args) {

        int[] FirstArray = new int[]{1, 15,20};

        int secoundArray[] = new int[FirstArray.length];

        for (int i = 0; i < FirstArray.length; i++) {
            secoundArray[i] = FirstArray[i];
        }
        System.out.println("The Elements of the First Array: ");
        for (int i = 0; i < FirstArray.length; i++) {
            System.out.print(FirstArray[i] + " ");
        }
        System.out.println("The Elements of the second Array: ");
        for (int i = 0; i < secoundArray.length; i++) {
            System.out.print(secoundArray[i] + " ");
        }
    }
}
