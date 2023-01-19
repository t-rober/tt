public class Main {
    public static void main(String[] args) {
        int n = Integer.parseInt(args[0]);
        int m = Integer.parseInt(args[1]);
        String result = "";
        int[] array = new int[n];
        for (int i = 0; i < n; i++) {
            array[i] = i + 1;
        }
        int i = 0;
        do {
            result = result + array[i];
            if (i + m - 1 < n) {
                i = i + m - 1;
            } else {
                i = i + m - 1 - n;
            }
        } while(array[i] != array[0]);
        System.out.println(result);
    }
}