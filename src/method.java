import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class method {
    public void readFile() throws IOException, InvalidNumberException {
        File file = new File("file");
        FileReader fileReader = new FileReader(file);
        BufferedReader read = new BufferedReader(fileReader);
        int[] arr = new int[10];
        String line = read.readLine();


        while (line != null) {
            int i = 0;
            arr[i] = Integer.parseInt(line);
            if (arr[i] < 0) {
                throw new InvalidNumberException();
            }
            System.out.println(arr[i]);
            line = read.readLine();
        }
        read.close();

    }

    public int sumNumbers(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum+=array[i];
        }
        return sum;
    }
}


