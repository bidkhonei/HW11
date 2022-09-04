package ir.maktab;

import java.util.*;

public class Question3 {
    

        


    public static class Collection {
        private int left;
        private int right;
        private int[] array = new int[2];

        public Collection(int left, int right) {
            this.left = left;
            this.right = right;
            array[0] = left;
            array[1] = right;
        }

        public int getLeft() {
            return left;
        }

        public int getRight() {
            return right;
        }

        @Override
        public String toString() {
            return
                    Arrays.toString(array);

        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Collection that = (Collection) o;
            return left == that.left && right == that.right && Arrays.equals(array, that.array);
        }

        @Override
        public int hashCode() {
            int result = Objects.hash(left, right);
            result = 31 * result + Arrays.hashCode(array);
            return result;
        }
    }
}


