import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class NetworkingProfessionalTest {

	
	NetworkingProfessional netprof = new NetworkingProfessional("Paul");
	
	Tool pliers = new Pliers("locking");
	Router router = new CiscoRouter();
	
	@Test
	public void shouldFixRouter() {
		boolean fixing = netprof.fixRouter(router, pliers);
		assertTrue("Sould be able to fix the router",fixing);
	}
}
