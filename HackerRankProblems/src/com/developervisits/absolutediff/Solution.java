package com.developervisits.absolutediff;

import java.util.Arrays;
import java.util.Scanner;

// https://www.hackerrank.com/challenges/minimum-absolute-difference-in-an-array/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=greedy-algorithms
public class Solution {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int noOfElement = scanner.nextInt();

        int[] elements = new int[noOfElement];
        for (int i = 0; i < noOfElement; i++) {
            elements[i] = scanner.nextInt();
        }

        findAbsoluteDiff(elements);
        scanner.close();
    }

    public static void findAbsoluteDiff(int[] arr) {
        int minAbsolutediff = Integer.MAX_VALUE;
        Arrays.sort(arr);
        for (int i = 0; i < arr.length-1; i++) {
            if (Math.abs(arr[i] - arr[i+1]) < minAbsolutediff) {
                minAbsolutediff = Math.abs(arr[i] - arr[i+1]);
            }
        }
        System.out.println(minAbsolutediff);


    }


}
