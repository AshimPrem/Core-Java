// Reading runtime value using BufferedReader class 

// done with Mathematical application , let's try to build for business application
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
class Addition{
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        //Method to read runtime value is readLine() which returns by default every value as string from buffer
        // we need to typecaste
        System.out.print("Enter FNO\t:\t");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter SNO\t:\t" );
        int b = Integer.parseInt(br.readLine());
        int c =a+b;
        System.out.println("Result\t\t:\t"+c);
    }
}