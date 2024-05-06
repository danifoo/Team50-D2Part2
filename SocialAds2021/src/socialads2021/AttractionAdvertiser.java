package socialads2021;

public class AttractionAdvertiser extends Advertiser{
    //create advertiser object 
    public AttractionAdvertiser(Administration admin) {
        super(admin);
    }
    
    @Override
    public void signUp(){
        
    	super.signUp();
        sector = "Attraction";
        System.out.println("Sign up complete as a/an " + sector + "Advertiser. Your unique reference number is "+ refNum);
        System.out.println("*******************************************");
    } 
    
    @Override
    public void display(){
    	System.out.println("*******************************************\nAdvertiser detail\n*******************************************");
    	System.out.println("Name: " + name + "\nSector: " + sector + "\nRef number: " + refNum +  "\nTelephone: " + telephone + "\nHQaddress: " + HQaddress +"\nSubscription: " + sub.toString()+"\nVAT: " + VATnumber);
        System.out.println("*******************************************");
    }
    
}
