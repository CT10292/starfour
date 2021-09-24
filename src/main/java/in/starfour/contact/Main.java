package in.starfour.contact;

public class Main {

	public static void main(String[] args) {
	
		ContactCloudAPI  ci = new ContactCloudAPI();
		ContactService cs = new ContactService(ci);

		for(String s : cs.getContacts()) {
			System.out.println(s);
		}
		
	}
}
