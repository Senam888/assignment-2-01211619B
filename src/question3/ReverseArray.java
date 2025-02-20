package question3;

import java.util.Arrays;
import java.util.Collections;

public class ReverseArray {
    public static void main(String[] args) {
        Integer[] numbers = {4,5,7,8,9,10};

        Collections.reverse(Arrays.asList(numbers));

        System.out.println("Reversed array: " + Arrays.toString(numbers));
    }
}

