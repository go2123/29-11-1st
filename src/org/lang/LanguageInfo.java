package org.lang;

public class LanguageInfo extends StateDetails {
	private void tamilLanguage() {
		System.out.println("1st");
	}
	private void englishLanguage() {
		System.out.println("2nd");
	}
	private void hindiLanguage() {
		System.out.println("3rd");
	}
	public static void main(String[] args) {
		LanguageInfo l = new LanguageInfo();
		l.tamilLanguage();
		l.englishLanguage();
		l.hindiLanguage();
		
		l.southIndia();
		l.northIndia();	
	}
}
