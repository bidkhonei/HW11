package ir.maktab;

import java.util.HashMap;
import java.util.Map;
import java.util.Random;
import java.util.Scanner;

public class Question1 {
    Scanner scanner = new Scanner(System.in);
    Map<Integer, String> map = new HashMap<>();

    public void BuildMap() {

        System.out.println("enter value:");
        String str = scanner.next();
        String[] c = str.split("");

        for (int i = 0; i < str.length(); i++) {
            map.put(i, c[i]);
        }

    }

    public void BuildWords(int index) {

        Random Random = new Random();
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < map.size(); j++) {
                System.out.print(map.get(Random.nextInt(map.size())));
            }
            System.out.println();
        }

    }
}

