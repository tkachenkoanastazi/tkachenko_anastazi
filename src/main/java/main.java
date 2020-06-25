import java.util.Scanner;

public class main {

    public static void main (String[] args)
    {
        Scanner in = new Scanner(System.in);
        Parser parser = new Parser();
        int result = 0;
        String expression, str;
        System.out.println("Enter a regular expression: ");
        expression=in.nextLine();
        System.out.println("Enter a string: ");
        str = in.nextLine();
        result = parser.parse(expression,str);
        System.out.printf("Result: %d", result);

    }
}
