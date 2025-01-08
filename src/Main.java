import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        ArrayList<Integer> integers = new ArrayList<>();
        integers.add(1);
        integers.add(2);
        integers.add(3);

        ArrayList<String> strings = new ArrayList<>();
        strings.add("Hello");
        strings.add("world");

        printArrayListElements(integers);
        printArrayListElements(strings);
    }

    public static  <T> void printArrayListElements(ArrayList<T> arrayList) {
        for (T element: arrayList) {
            System.out.println(element);
        }
    }
}