import java.io.File;
import java.io.FileWriter;
import java.util.Scanner;

public class AlgEx {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(new File("input.txt"));
        FileWriter writer = new FileWriter("output.txt");
        int vertexNum = scanner.nextInt();
        int[] parents = new int[vertexNum];
        for (int i = 0; i < vertexNum; i++) {
            for (int j = 0; j < vertexNum; j++) {
                if(scanner.nextInt() == 1) {
                    parents[j] = i + 1;
                }
            }
        }
        for(int i = 0; i < vertexNum - 1; i++){
            writer.write(parents[i] + " ");
        }
        writer.write(parents[vertexNum - 1] + "");
        writer.close();
        scanner.close();
    }
}
