package EXERCISE;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindTheSmallestElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int [] numbers = Arrays.stream(input.split("\\s+")).mapToInt(Integer::parseInt).toArray();

        Function<int[], Integer> arrayMinIndex = array -> Arrays.stream(array).min().orElse(0);
        arrayMinIndex.apply(numbers);

        List<Integer> nums = new ArrayList<>(Arrays.stream(numbers).boxed().collect(Collectors.toList()));
        System.out.println(nums.lastIndexOf(arrayMinIndex.apply(numbers)));

    }
}
