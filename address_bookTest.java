import static org.junit.jupiter.api.Assertions.*;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;

import org.junit.jupiter.api.Test;

class address_bookTest {
	
	private final ByteArrayOutputStream out = new ByteArrayOutputStream();
	private final ByteArrayOutputStream err = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	private final PrintStream originalErr = System.err;
	
	@Before
	public void setStreams() {
	    System.setOut(new PrintStream(out));
	    System.setErr(new PrintStream(err));
	}

	@After
	public void restoreInitialStreams() {
	    System.setOut(originalOut);
	    System.setErr(originalErr);
	}

	@Test
	public void out() {
	    System.out.print("test output");
	    assertEquals("test output", out.toString());
	}

}
