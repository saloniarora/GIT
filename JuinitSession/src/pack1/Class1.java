package pack1;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class Class1 {

	@BeforeClass
	public static void Method1() throws Exception {
		System.out.println("Launch browser");
	}

	@AfterClass
	public static void Method5() throws Exception {
		System.out.println("quit browser");
	}

	@Before
	public void Method2() throws Exception {
		System.out.println("Access the application ");
	}

	@After
	public void method4() throws Exception {
		System.out.println("user logout");
	}

	
	public void c() {
		System.out.println("Ente userName1");
		System.out.println("Ente userPassword1");
		System.out.println("click on ok button");
		System.out.println("if logout link is present thent he test is passed");
	}
	
	
	public void b() {
		System.out.println("Ente userName2");
		System.out.println("Ente userPassword2");
		System.out.println("click on ok button");
		System.out.println("if logout link is present thent he test is passed");
	}
	
	
	public void a() {
		System.out.println("Ente userName3");
		System.out.println("Ente userPassword3");
		System.out.println("click on ok button");
		System.out.println("if logout link is present thent he test is passed");
	}
	
	
	
	@Test
	public void mySequence(){
		a();
		b();
		c();
	}

}
