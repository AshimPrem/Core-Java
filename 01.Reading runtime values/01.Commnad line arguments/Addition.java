/*
 1.Understanding what's command line  ?
 2.What's command line argument ? 
 3.How can we specify command line values ?
 4.How these command line argument are passed into the program and by whom ? 
        C:\programs\core java\ java Addition 10 20 .. by the devloper of user
 5. how can we convert the passed primitive values string to their PDT's ?
     - when we pass arguments through the command line , or every input passing through the keyboard is by default String
     - We use typecasting - a process of converting one type to another type .
 6 Understanding what happens when we pass less arguments and try to access more values ?
 7.Problems with command line arguments 
    - not convenience for end user - he don't know what type , how many and in which order he must enter the values
    - and we cannot enter any value in the middle of the program execution
    - we can't even display a message for the end user
 8.Solution for command line arguments 
    - we must use BufferedReader class .. there are more but for now the solution is _____________________
 */
class Addition {
    public static void main(String [] args){
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);
        int c = a+b;
        System.out.println("Result : " +c);

    }
}