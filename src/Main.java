import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        ArrayList<String> objectA = new ArrayList<>();
        ArrayList<String> objectB = new ArrayList<>();
        System.out.println("Введите 5 строк: ");
        ArrayList<String> objectC = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            objectA.add(scanner.nextLine());

        }
        System.out.println(objectA);
        for (int i = 0; i < 5; i++) {
            objectB.add(scanner.nextLine());

        }
        System.out.println(objectB);
        Collections.reverse(objectB);
        System.out.println(objectB);

        int x = 0;
        while (objectC.size() < objectA.size() + objectB.size()) {
            objectC.add(objectA.get(x));
            objectC.add(objectB.get(x));
            x++;
        }
        objectC.add(objectA.get(0));
        objectC.add(objectB.get(1));
        System.out.println(objectC);
        objectC.sort(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.length() - o2.length();
            }
        });
        System.out.println(objectC);
    }
}