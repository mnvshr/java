public class first {
    public static void main(String[] args) {
        int n = 5, sum = 0;
        int[] a = new int[10];

        System.out.println("Squares of first 5 numbers: ");

        for (int i = 1; i <= n; i++) {
            a[i] = i;
            int sq = a[i] * a[i];
            System.out.print(sq + " ");
        }
        System.out.println("\n");
        System.out.println("Average:");

        for (int i = 0; i <= n; i++) {
            sum = sum + a[i];
        }
        int avg = sum / n;
        System.out.println(avg + " ");
        System.out.print("\n");

        System.out.println("Array reverse order:");

        int num = 0;
        int[] b = new int[10];

        for (int i = n; i >= 0; i--) {
            b[num] = a[i];
            num = num + 1;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(b[i] + " ");
        }
        System.out.println("\n");

        System.out.println("Fibonacci series:");
        int m = 10;
        int t1 = 0, t2 = 1;
        int t3 = t1 + t2;

        System.out.print(t1 + " " + t2);

        for (int k = 0; k <= m; k++) {
            System.out.print(" " + t3);
            t1 = t2;
            t2 = t3;
            t3 = t1 + t2;
        }
    }
}