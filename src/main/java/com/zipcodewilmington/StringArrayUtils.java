package com.zipcodewilmington;

import org.codehaus.plexus.util.StringUtils;

import java.util.*;

/**
 * Created by leon on 1/29/18.
 */
public class StringArrayUtils {
    /**
     * @param array array of String objects
     * @return first element of specified array
     */ // TODO
    public static String getFirstElement(String[] array) {

        return array[0];
    }

    /**
     * @param array array of String objects
     * @return second element in specified array
     */
    public static String getSecondElement(String[] array) {
        return array[1];
    }

    /**
     * @param array array of String objects
     * @return last element in specified array
     */ // TODO
    public static String getLastElement(String[] array) {
        return array[array.length - 1];
    }

    /**
     * @param array array of String objects
     * @return second to last element in specified array
     */ // TODO
    public static String getSecondToLastElement(String[] array) {

        return array[array.length - 2];
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return true if the array contains the specified `value`
     */ // TODO
    public static boolean contains(String[] array, String value) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == value) {
                return true;
            }
        }
        return false;
    }

    /**
     * @param array of String objects
     * @return an array with identical contents in reverse order
     */ // TODO
    public static String[] reverse(String[] array) {
        String[] revArray = new String[array.length];

        for (int i = 0; i < array.length; i++) {
            revArray[i] = array[array.length - 1 - i];
        }
        return revArray;
    }

    /**
     * @param array array of String objects
     * @return true if the order of the array is the same backwards and forwards
     */ // TODO
    public static boolean isPalindromic(String[] array) {
        int a = 0;
        int b = array.length - 1;

        while (a < b) {
            if (array[a] == array[b]) {
                return true;
            }
            a++;
            b--;
        }
        return false;
    }

    /**
     * @param array array of String objects
     * @return true if each letter in the alphabet has been used in the array
     */ // TODO
    public static boolean isPangramic(String[] array) {
        String arr = Arrays.toString(array).toLowerCase();

        boolean allLettersPresent = true;

        for (char ch = 'a'; ch <= 'z'; ch++) {
            if (!arr.contains(String.valueOf(ch))) {
                allLettersPresent = false;
                break;
            }
        }
        return allLettersPresent;
    }

    /**
     * @param array array of String objects
     * @param value value to check array for
     * @return number of occurrences the specified `value` has occurred
     */ // TODO
    public static int getNumberOfOccurrences(String[] array, String value) {
        String arr = Arrays.toString(array);
        return StringUtils.countMatches(arr, value);
    }

    /**
     * @param array         array of String objects
     * @param valueToRemove value to remove from array
     * @return array with identical contents excluding values of `value`
     */ // TODO
    public static String[] removeValue(String[] array, String valueToRemove) {
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        arrayList.remove(valueToRemove);

        String[] newArray = arrayList.toArray(new String[array.length - 1]);

        return newArray;
    }

    /**
     * @param array array of chars
     * @return array of Strings with consecutive duplicates removes
     */ // TODO
    public static String[] removeConsecutiveDuplicates(String[] array) {
        List<String> arrayList = new ArrayList<>(Arrays.asList(array));

        for (int i = arrayList.size() - 1; i > 0; i--) {
            if (arrayList.get(i).equals(arrayList.get(i - 1))) {
                arrayList.remove(i);
            }
        }

        return arrayList.toArray(new String[0]);
    }

    /**
     * @param array array of chars
     * @return array of Strings with each consecutive duplicate occurrence concatenated as a single string in an array of Strings
     */ // TODO
    public static String[] packConsecutiveDuplicates(String[] array) {
        List<String> newArrList = new ArrayList<>();

        if (array.length > 0) {
            StringBuilder tempGroup = new StringBuilder(array[0]);

            for (int i = 1; i < array.length; i++) {
                if (array[i].equals(array[i-1])) {
                    tempGroup.append(array[i]);
                } else {
                    newArrList.add(tempGroup.toString());
                    tempGroup = new StringBuilder(array[i]);
                }
            }
            newArrList.add(tempGroup.toString());
        }

        return newArrList.toArray(new String[0]);
    }
}



