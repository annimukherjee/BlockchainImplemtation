import java.util.Arrays;

public class HashDemo {

    public static void main(String[] args) {

        System.out.println("Lists are same so hashcode should also be the same");
        String[] list1 = {"a", "b", "c"};
        System.out.println("List1: " + list1);
        String[] list2 = {"a", "b", "c"};
        System.out.println("List2: " + list2);

        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));

        System.out.println("Lists are different so hashcode is different");
        list1[0] = "ab";
        System.out.println("List1: " + list1);
        System.out.println("List2: " + list2);

        System.out.println(Arrays.hashCode(list1));
        System.out.println(Arrays.hashCode(list2));
    }
}
