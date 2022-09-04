package ir.maktab;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Runner {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Question1 question1 = new Question1();
        Question2 question2 = new Question2();
        Question3 question3 = new Question3();
        Question4 question4 = new Question4();

        //question1
        {
            question1.BuildMap();
            question1.BuildWords(10);
        }
        //question2
        {
            question2.printRandomString();
            question2.community(question2.characterSet, question2.characterSet1);
            question2.Subscription();
        }
        //question3

        Question3.Collection[] collections = new Question3.Collection[]{
                new Question3.Collection(3, 7),
                new Question3.Collection(9, 2),
                new Question3.Collection(5, 5),
                new Question3.Collection(8, 5),
                new Question3.Collection(6, 3),
                new Question3.Collection(4, 7),
                new Question3.Collection(3, 1)};

        java.util.List<Question3.Collection> list = new ArrayList<>();
        list.addAll(List.of(collections));
        System.out.println(list);
        Iterator<Question3.Collection> iterator = list.iterator();

        while (iterator.hasNext()) {
            Question3.Collection collection = iterator.next();
            if (collection.getLeft() > collection.getRight()) {
                iterator.remove();
            }
        }
        System.out.println(list);


        //question4
        {
            question4.putMap(1, "Maktab");
            question4.putMap(2, "Maktab");
            question4.putMap(3, "Maktab");
            question4.findKeys(1);
            question4.isEmpty();
            System.out.println("enter key and value:");
            question4.setValue(scanner.nextInt(), scanner.next());
            question4.GetValue();
        }
    }
}

