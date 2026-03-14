public class Second {
    public static void main(String[] args) {
        int n = 6; // number of rows

        for (int i = 1; i <= n; i++) {
            int num;

            if (i % 2 == 1)
                num = 1;   // odd row starts with 1
            else
                num = 0;   // even row starts with 0

            for (int j = 1; j <= i; j++) {
                System.out.print(num + " ");
                num = 1 - num; // toggle between 0 and 1
            }

            System.out.println();
        }
    }
}
