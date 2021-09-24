package starfour;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import in.starfour.contact.ContactCloudAPI;
import in.starfour.contact.ContactService;

public class TestContactService {
	
	
	@Test
	public void mx() {
		ContactCloudAPI  ci = new ContactCloudAPI();
		ContactService cs = new ContactService(ci);
		assertEquals(cs.getVIPContact(),"John");
	}

}
