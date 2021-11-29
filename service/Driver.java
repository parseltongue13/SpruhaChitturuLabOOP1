package service;
import java.util.Scanner;
import model.Employee;

public class Driver {
	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter first name: ");
		String firstName = in.nextLine();
		
		System.out.println("Enter last name: ");
		String lastName = in.nextLine();
		
		Employee employee = new Employee(firstName, lastName);
		
		System.out.println("Enter your department.");
		System.out.println("1) Technical");
		System.out.println("2) Admin");
		System.out.println("3) Human Resources");
		System.out.println("4) Legal");
		
		int option = in.nextInt();		
		
		CredentialService cs = new CredentialService();
		
		if(option == 1) {
			String generatedEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "technical");
			char[] generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}else if(option == 2) {
			String generatedEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "admin");
			char[] generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}else if(option == 3) {
			String generatedEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "hr");
			char[] generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}else if(option == 4) {
			String generatedEmail = cs.generateEmail(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(), "legal");
			char[] generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail, generatedPassword);
		}else {
			System.out.println("Enter a valid option.");
		}
		
	}

}
