import java.util.Arrays;

public class arrays {


    public static void main(String[] arg) {
        int[] marks = new int[5];
        System.out.println(marks[4]);

        int age[] = {2, 5, 1, 34, 12};
        double[] marks1 = {23.3, 90.4};
        marks[1] = 76;
        System.out.println(marks1[1]);
        for (int i = 0; i < age.length; i++) {
            System.out.println(age[i]);
        }
        // maximum and minimum
        int a[] = {1, 423, 6, 46, 34, 23, 13, 53, 4};
        Arrays.sort(a);
        System.out.println("min-" + a[0] + " max-" + a[a.length - 1]);
        reverse();



    }
 //reverse an array
    static void reverse() {
        int a[] = {1, 423, 6, 46, 34, 23, 13, 53, 4};
        int n = a.length;

        int i, k, t;
        for (i = 0; i < n / 2; i++) {
            t = a[i];
            a[i] = a[n - i - 1];
            a[n - i - 1] = t;
        }

        // printing the reversed array
        System.out.println("Reversed array is: \n");
        for (k = 0; k < n; k++) {
            System.out.println(a[k]);
        }


    }






}





