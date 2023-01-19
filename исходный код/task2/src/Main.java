
import java.io.FileReader;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) throws Exception {
        Main main = new Main();
        main.whereIsDot(args[0],args[1]);
    }

    public void whereIsDot (String file1, String file2) throws Exception {
        FileReader fr1 = new FileReader(file1);
        FileReader fr2 = new FileReader(file2);
        Scanner sc1 = new Scanner(fr1);
        Scanner sc2 = new Scanner(fr2);
        float x1 = sc1.nextFloat();
        float y1 = sc1.nextFloat();
        float r = sc1.nextFloat();
        float x2;
        float y2;
        float l;
        while(sc2.hasNextLine()) {
            x2 = sc2.nextFloat();
            y2 = sc2.nextFloat();
            l = (float) Math.sqrt((x2 - x1) * (x2 - x1) + (y2 - y1) * (y2 - y1));
            if (l == r) {
                System.out.println(0);
            }
            if (l < r) {
                System.out.println(1);
            }
            if (l > r) {
                System.out.println(2);
            }
        }
        fr1.close();
        fr2.close();
        sc1.close();
        sc2.close();
    }
}