package console.application;

import java.util.Scanner;

import org.springframework.context.support.ClassPathXmlApplicationContext;


public class ConsoleApplication {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
    Table longTable = (Table)context.getBean("longTable");
    Table shortTable = (Table)context.getBean("shortTable");
    System.out.println("Enter the table type");
    Scanner sc = new Scanner(System.in);
    String tableType = sc.nextLine();
    if(tableType.equals("long")) {
    	System.out.println(longTable.showDetails());
    }
    else
    	System.out.println(shortTable.showDetails());
	}

}
