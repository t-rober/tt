import java.io.FileReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.rat(args[0]);
    }
    public void rat(String file1) throws Exception {
        FileReader fr = new FileReader(file1);
        Scanner sc = new Scanner(fr);
        FileReader fr1 = new FileReader(file1);
        Scanner sc1 = new Scanner(fr1);
        int lines = 0;
        while (sc.hasNextLine()) {
            lines++;
            sc.nextLine();
        }
        int[] arr = new int[lines];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc1.nextInt();
        }
        Arrays.sort(arr);
        int median;
        if (arr.length % 2 == 0) {
            median = ((int) arr[arr.length / 2] + (int) arr[arr.length / 2 - 1]) / 2;
        } else {
            median = (int) arr[arr.length / 2];
        }
        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            while (arr[i] != median) {
                if (arr[i] < median) {
                    counter++;
                    arr[i]++;
                } else {
                    if (arr[i] > median) {
                        counter++;
                        arr[i]--;
                    }
                }
            }
        }
        System.out.println(counter);
    }}