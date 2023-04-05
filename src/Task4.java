public class Task4 {
    public static void main(String[] args) {
        int a = 0;

        for (int h = 0; h < 24; h++) {
            for (int m = 0; m < 60; m++) {
                int b = h / 10; // перша цифра години
                int c = h % 10; // друга цифра години
                int d = m / 10; // перша цифра хв
                int e = m % 10; // друга цифра хв

                if (b == e & c == d) {
                    a++;
                }
            }
        }

        System.out.println("Кількість симетричних комбінацій: " + a);
    }
}


