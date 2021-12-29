package Intopost;

import java.util.Scanner;


public class driver {
    static Scanner obj=new Scanner(System.in);
	public static void main(String [] args)
	{
		
		String infix=obj.nextLine();
		String postfix=InfixTopostfix.infixTopostfixcon(infix);
		System.out.println(postfix);
		}

}
