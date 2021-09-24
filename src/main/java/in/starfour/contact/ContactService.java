package in.starfour.contact;

public class ContactService {
	private IContactCloudAPI ic;
	
	public ContactService(IContactCloudAPI ic) {
		this.ic = ic;
	}
	public String[] getContacts() {
		return ic.getContacts();
	}

	public String getVIPContact() {
		//logic to find high value customers..
		return ic.getContacts()[0];
	}
}
