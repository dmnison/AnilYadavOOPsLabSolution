import java.util.Random;
import java.util.Scanner;

public class Emailapp {
				   

	public static void main(String[] args) {
		  Scanner sc = new Scanner(System.in);
		  System.out.println("Enter name : ");
		  String str = sc.nextLine();
		  //sc.close();
		  System.out.println("Pease enter the department from following  \n"+"1. Technical  \n"+"2. Admin  \n"+"3. Human Resource  \n"+"4. Legal \n");
		  Scanner newsc = new Scanner(System.in);
		  int depint = newsc.nextInt();
		  //newsc.close();
		  department(depint);
		  //System.out.println("Email -->  " +str+"@rooster.com");
		  System.out.println("Dear "+str+" your generated credentials are as follows");
		  System.out.println("Email -->  " +str+"@"+department(depint)+".rooster.com");
	      System.out.println("Password -->  " +String.valueOf(generatePassword(10)));
	   }
	   
	   public static String department(int depint) {
		   int number = depint;
		   String companystring = "";
		   switch(number) {
		   case 1:
			   companystring = "tech";
			   break;
		   case 2:
			   companystring = "adm";
			   break;
		   case 3:
			   companystring = "hr";
			   break;
		   case 4:
			   companystring = "lgl";
			   break;
		   default:
			   System.out.println("Invalid Input" );
			   break;
			   
		   }
		   return companystring;
	   }
	   
	   private static char[] generatePassword(int length) {
	      String capitalCaseLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
	      String lowerCaseLetters = "abcdefghijklmnopqrstuvwxyz";
	      String specialCharacters = "!@#$";
	      String numbers = "1234567890";
	      String combinedChars = capitalCaseLetters + lowerCaseLetters + specialCharacters + numbers;
	      Random random = new Random();
	      char[] password = new char[length];
	      //String[] password = new String[length];
	      
	      password[0] = lowerCaseLetters.charAt(random.nextInt(lowerCaseLetters.length()));
	      password[1] = capitalCaseLetters.charAt(random.nextInt(capitalCaseLetters.length()));
	      password[2] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));
	      password[3] = numbers.charAt(random.nextInt(numbers.length()));
	   
	      for(int i = 4; i< length ; i++) {
	         password[i] = combinedChars.charAt(random.nextInt(combinedChars.length()));
	      }
	      return password;
	   }
}


