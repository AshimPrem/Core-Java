import java.io.*;
class College{
    static String COLLEGE_NAME="Vinoba Bhave Universtiy";
    public static void main(String [] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        // create an instance of Student
        Student s1 = new Student();
        
        // Initializing s1 with AP object values
        System.out.print("Enter SNO\t:\t");
        s1.sNo=Integer.parseInt(br.readLine());
        System.out.print("Enter SNAME\t:\t");
        s1.sName=br.readLine();
        System.out.print("Enter Email\t:\t");
        s1.email=br.readLine();
        System.out.print("Enter Phone\t:\t");
        s1.phone = Long.parseLong(br.readLine());
        System.out.print("Enter Courese\t:\t");
        s1.course = br.readLine();
        System.out.print("Enter Fee\t:\t");
        s1.fee = Double.parseDouble(br.readLine());
        System.out.print("is Course completed ?\t:");
        s1.courseCompleted=Boolean.parseBoolean(br.readLine());

        
        // reading values from s1 object
        System.out.println();
        System.out.println();
        System.out.println("STUDENT AP INFORMATION");
        System.out.println("Student SNO\t:\t"    +s1.sNo);
        System.out.println("Student SNAME\t:\t"  +s1.sName);
        System.out.println("Student EMAIL\t:\t"  +s1.email);
        System.out.println("Student PHONE\t:\t"  +s1.phone);
        System.out.println("Student COURSE\t:\t" +s1.course);
        System.out.println("Student FEE\t:\t"    +s1.fee);

        if(s1.courseCompleted==true){
            System.out.println("Student COURSE COMPLETED");
        }else{
            System.out.println("Student COURSE NOT COMPLETED");
    
        }
    }
}