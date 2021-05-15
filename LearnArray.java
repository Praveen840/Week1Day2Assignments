package week1.day2;

import org.apache.tools.ant.types.resources.Last;

public class LearnArray {
    public static void main(String[] args) {
        int [] values = {10,20}; // stored in memory with index;index starts with 0

        // to get single value from array
        System.out.println(values[1]);
        //to find the number of items in an array
        System.out.println(values.length);
        //to get the last item index
        int lastItemIndex = values.length-1;

        System.out.println(values[lastItemIndex]);

    }
}
