package gameOfLive;

import static org.junit.Assert.*;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.zip.CheckedInputStream;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyInterfaceTest {
	
	static Scanner inputString = new Scanner(System.in);
	static Pattern numberPattern = Pattern.compile("\\d+\0");
//	static Pattern numberPattern = Pattern.compile("\\d+");
	boolean condition = false;

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Test
	public final void testStartGame() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void testAreaChoosing() {
		fail("Not yet implemented"); // TODO
	}

	@Test
	public final void schouldReturnTrueOnlyForNumbers() {
		MyInterface zeroChecker = new MyInterface();
		assertTrue(zeroChecker.checkIsNumber("0"));	
	}

}
