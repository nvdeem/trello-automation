
public class mainWebsite {
	
	public static loginPage LoginPage;
	
	static {
		buildPages();
	}
	
	private static void buildPages()
	{
		LoginPage = new loginPage();
	}

}
