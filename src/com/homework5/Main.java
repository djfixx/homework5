package com.homework5;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        /*. ������� ��� �������� ������� �� 5 ��������� ������ �� ���������� ����������. ������� ������ ������ ����� �� �����, ������.
        ��������� � ���� ������������ �������� �� ������ ����(���������� ���� �� ������� � ������� �������). */

        Random random = new Random();

        int[] firstArray = new int[5];
        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(firstArray));
        int[] secondArray = new int[5];
        for (int i = 0; i < secondArray.length; i++) {
            secondArray[i] = random.nextInt();
        }
        System.out.println(Arrays.toString(secondArray));


        int[] thirdArray = new int[5];

        for (int i = 0; i < thirdArray.length; i++) {
            thirdArray[i] = Math.max(firstArray[i], secondArray[i]);
        }
        System.out.println(Arrays.toString(thirdArray));

        // ��������� ������ �� ����������������� ����� � ������� �� ������� ���-�� ���������� ������� 'n' � ���� ������.

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please, input string: ");

        String input = scanner.nextLine();
        char someChar = 'n';
        int count = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == someChar) {
                count++;
            }

        }
        System.out.println(count);
        //��������� ������ �� ����������������� ����� � ��������� � ������ ��� ������� ������� 'n' � ���� ������.

        System.out.println("Please, input string: ");

        String userIn = scanner.nextLine();

        char nChar = 'n';
        int counter = 0;
        for (int i = 0; i < userIn.length(); i++) {
            if (userIn.charAt(i) == nChar)
                counter++;

        }
        int[] index = new int[counter];
        for (int a = 0, b = 0; a < userIn.length(); a++) {
            if (userIn.charAt(a) == nChar)
                index[b++] = a;
        }
        System.out.println(Arrays.toString(index));
    }
}






