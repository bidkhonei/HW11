package ir.maktab;

import java.util.HashMap;

public class Question4 {
    HashMap<Integer, String> map = new HashMap<>();

    public void putMap(Integer integer, String s) {
        map.put(integer, s);

    }

    public boolean IsValid(Integer integer) {
        if (map.containsKey(integer)) {
            return true;
        }
        return false;
    }

    public boolean isEmpty() {
        if (map.isEmpty()) {
            return true;
        }
        return false;
    }

    public void setValue(Integer key, String value) {
        for (int i = 0; i < map.size(); i++) {
            map.replace(key, value);
        }
    }

    public void GetValue() {
        for (int i = 1; i < map.size()+1; i++) {
            System.out.println(map.get(i));
        }
    }

    public void findKeys(Integer integer) {
        for (int i = 1; i < map.size()+1; i++) {
            if (map.containsKey(integer)) {
                System.out.println("has a key:"+i);
            }
        }
    }
}