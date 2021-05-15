import java.util.Scanner;

public class FullNameChar {


    static void init(String name)
    {
        if (name.length() == 0)
            return;

        System.out.print(Character.toUpperCase(
                name.charAt(0)));

        for (int i = 1; i < name.length() - 1; i++)
            if (name.charAt(i) == ' ')
                System.out.print(" " + Character.toUpperCase(name.charAt(i + 1)));
    }
    public static void main(String args[])
    {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your Full Name with whitespace between every name");
        String fullname = input.nextLine();
        init(fullname);
    }

}