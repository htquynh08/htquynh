package PracticeMaven;

import org.testng.annotations.Test;

public class Main extends Setup {
@Test
	public void run() {
		String text = "COVID-19";
		GoogleMainPage.accessSettings();
		CommonMethod.sleep(2);
		GoogleMainPage.accessAdvancedSearch();
		CommonMethod.sleep(2);
		GoogleAdvancedSearch.inputValue(text);
		GoogleAdvancedSearch.selectLanguage(Variables.LANGUAGE_TEST);
		GoogleAdvancedSearch.selectLastUpdate(Variables.LAST_UPDATE_TEST);
		GoogleAdvancedSearch.submitSearch();
		CommonMethod.sleep(2);
		GoogleAdvancedSearch.checkResults(text);

}
}