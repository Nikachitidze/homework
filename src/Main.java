import java.io.FileNotFoundException;
import java.io.IOException;


public class Main {
    public static void main(String[] args) {
            try {
                method method = new method();
                method.readFile();

            } catch (IOException | InvalidNumberException e){
                e.printStackTrace();
            }

            int[] arr = {1, 1, 1, 1, 1, 1, 1, 1, 1, 1};
            method fileMethods = new method();
            System.out.println("ჯამი  : " + fileMethods.sumNumbers(arr));

        }
    }

