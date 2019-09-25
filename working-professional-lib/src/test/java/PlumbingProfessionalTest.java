import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class PlumbingProfessionalTest {

	PlumbingProfessional plumbprof = new PlumbingProfessional("Mike");
	
	Tool Wrench = new Wrench("Adjustable");
	Pipe pipe = new Pipe();
	
	@Test
	public void shouldFixPipe() {
		boolean fixing = plumbprof.fixpipe(pipe, Wrench);
		assertTrue("Sould be able to fix a pipe",fixing);
	}
}
