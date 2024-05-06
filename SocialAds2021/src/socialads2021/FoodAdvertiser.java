package socialads2021;

import java.util.Scanner;

public class FoodAdvertiser extends Advertiser{
	
    //create advertiser object 
    public FoodAdvertiser(Administration admin) {
        super(admin);
    }
    
    @Override
    public void signUp(){
        
    	super.signUp();
        sector = "Food";
        System.out.println("Sign up complete as a " + sector + "Advertiser. Your unique reference number is "+ refNum);
        System.out.println("*******************************************");
    } 
    
    @Override
    public void display(){
    	System.out.println("*******************************************\nAdvertiser detail\n*******************************************");
    	System.out.println("Name: " + name + "\nSector: " + sector + "\nRef number: " + refNum +  "\nTelephone: " + telephone + "\nHQaddress: " + HQaddress +"\nSubscription: " + sub.toString()+"\nVAT: " + VATnumber);
        System.out.println("*******************************************");
    }
   
    
}
