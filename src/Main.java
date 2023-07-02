import java.io.PrintWriter;

public class Main {
    public static void main(String[] args) {
        String data = "ANIL KELES";
        try {
            PrintWriter writerPrint = new PrintWriter("test.txt");
            writerPrint.print(data);
            writerPrint.close();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
    }
}
