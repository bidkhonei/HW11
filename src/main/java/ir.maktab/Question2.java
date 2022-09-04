package ir.maktab;

import java.util.Set;
import java.util.TreeSet;

public class Question2 {
    static int MAX = 26;
    char[] alphabet = {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};

    Set<Character> characterSet = new TreeSet<>();
    Set<Character> characterSet1 = new TreeSet<>();

    //By creating two TreeSets, fill them with 11 random characters from the letters 'a' to 'z'//

    public void printRandomString() {

        int n = 10;
        int n2 = 10;

        for (int i = 0; i <= n; i++) {
            characterSet.add(alphabet[(int) (Math.random() * MAX)]);
            if (characterSet.size() < 10) {
                n++;
            } else {
                break;
            }
        }

        for (int i = 0; i <= n2; i++) {
            characterSet1.add(alphabet[(int) (Math.random() * MAX)]);
            if (characterSet1.size() < 10) {
                n2++;
            } else {
                break;
            }
        }

        for (Character c : characterSet1) {
            System.out.print(" " + c);
        }
        System.out.println(" " + characterSet1.size());

        for (Character c : characterSet) {
            System.out.print(" " + c);
        }
        System.out.println(" " + characterSet.size());
    }

    //Write a method that the two sets above are its input and find their community and in
    //Print the output of the result.//
    public void Subscription() {
        for (Character c : characterSet) {
            if (characterSet1.contains(c)) {
                System.out.print(" " +c);
            }
        }
    }
    //Write a method that the two sets above are its input and find their community and in
    //Print the output of the result.//

    public void community(Set<Character> characterSet, Set<Character> characterSet1) {

        int counter = 0;
        for (Character c : characterSet) {
            if (!characterSet1.contains(c)) {
                counter++;
                System.out.print(" " + c);
            }
        }
        for (Character c1 : characterSet1) {
            if (!characterSet.contains(c1)) {
                counter++;
                System.out.print(" " + c1);
            }
        }
        System.out.print(" " + counter);
    }

}



