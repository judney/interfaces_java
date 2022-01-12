package model.applicattion;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import model.entities.Contract;
import model.interfaces.PaypalService;

public class program {

	public static void main(String[] args) throws ParseException {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in) ; 
		SimpleDateFormat dt  = new SimpleDateFormat("dd/MM/yyyy"); 
		
		System.out.println("Enter Contract Data ");
		
		System.out.print("Number : ");
		
		int number = sc.nextInt(); 
		sc.nextLine();
		System.out.print("Date (dd/MM/yyyy): ");
        Date data = dt.parse(sc.nextLine() );
        System.out.print("Contract value: ");
        Double contractValue = sc.nextDouble();
        System.out.print("Enter number of installments: ");
        int installmentsNumber = sc.nextInt(); 
        
        Contract contract = new Contract( number , data , contractValue ); 
        
        
        System.out.println(contract );
        
        model.interfaces.PaypalService.interest( contractValue , installmentsNumber ); 
        
        
	}

}
