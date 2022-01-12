package model.interfaces;

import java.util.ArrayList;
import java.util.List;

import model.entities.Installment;

public interface PaypalService {
	
	public default Double paymentFee( Double amount ) { 
		
		return amount ; 
		
	}
	
	public static  Double interest ( Double amount , int months ) { 
		
		double pmtValue = amount / months ; 
		System.out.println(pmtValue);
		//List  installment =  (List) new Installment () ;
		Double pmtJur ; 
		Double pmtTax ; 
		for ( int i=1 ; i <= months ; i++ ) { 
			 pmtJur  = (  pmtValue * ( 0.01 * i )  + pmtValue  );  
			 //System.out.println("PMTJUR : " + pmtJur );  
			 pmtTax = (( pmtJur * 0.02 ) + pmtJur )   ; 
			 
			 System.out.println(i + " : "+ pmtTax );
			 
			// installment.add(installment); 
			 
			 
		}
		
		
		  //   System.out.println(installment );
		
		     return pmtValue ; 
	}

}
