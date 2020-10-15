package PracticeMaven;

public class GoogleMainPage extends CommonMethod {

	public static void accessSettings() {
		CommonMethod.clickElement(Variables.SETTING);
	}

	public static void accessAdvancedSearch() {
		CommonMethod.clickElement(Variables.ADVANCED_SEARCH_LINK);
	}

}
