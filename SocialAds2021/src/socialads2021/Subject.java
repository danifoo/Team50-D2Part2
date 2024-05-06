package socialads2021;

public interface Subject {
	
	public void attach(Observer observer);
	public void detach();
	public boolean notify(Advertisement advertisement);	
}
