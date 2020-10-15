package PracticeMaven;



public class GoogleAdvancedSearch extends CommonMethod {
	public static void inputValue(String value) {
		CommonMethod.typeText(Variables.VALUE_INPUT, value);

			}
	public static void selectLanguage(String xpath) {
		CommonMethod.clickElement(Variables.LANGUAGE);
		CommonMethod.clickElement(xpath);
			}
	public static void selectLastUpdate(String xpath) {
		CommonMethod.clickElement(Variables.LAST_UPDATE);
		CommonMethod.clickElement(xpath);
			}
	public static void submitSearch() {
		CommonMethod.clickElement(Variables.ADVANCED_SEARCH_SUBMIT);
			}
	public static void checkResults(String text) {
		CommonMethod.visibilityElement("//*[@id='tvcap']//*[@role='heading']//span[contains(text(),'"+ text +"')]");
			}

}
