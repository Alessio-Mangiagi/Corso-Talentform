package com.oop.abstracts.classes;

public class MainAppMobile extends PreventivoAppMobile {

	private String MockUp;

	private String GooglePlay;

	private String AppleStore;

	private String ResponsiveApp;

	private String Apiservice;

	private String WaitingTimes;

	private String MultiLanguages;

	private String WatingTimesTest;

	private int GiornateMockUp;

	private int GiornateResponsiveApp;

	private int GioornaatePublicazioneApp;

	private int GiornateFunzioniGeneriche;

	private int GiornateDati;

	private int TariffaGiornaliera;

	public int getGiornateMockUp() {
		return GiornateMockUp * TariffaGiornaliera;
	}

	public int getGiornateResponsiveApp() {
		return GiornateResponsiveApp * TariffaGiornaliera;
	}

	public int getGioornaatePublicazioneApp() {
		return GioornaatePublicazioneApp * TariffaGiornaliera;
	}

	public int getGiornateFunzioniGeneriche() {
		return GiornateFunzioniGeneriche *TariffaGiornaliera;
	}

	public int getGiornateDati() {
		return GiornateDati * TariffaGiornaliera;
	}

	public int getTariffaGiornaliera() {
		return getprezzoGrafiche() + getprezzoResponsiveApp() + getprezzoPublicazioneApp() + getprezzoFunzioniGeneriche()  ;
	}

	@Override
	public int getprezzoGrafiche() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getprezzoResponsiveApp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getprezzoPublicazioneApp() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int getprezzoFunzioniGeneriche() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public String getMockUp() {
		// TODO Auto-generated method stub
		return MockUp;
	}

	@Override
	public String getGooglePlay() {
		// TODO Auto-generated method stub
		return GooglePlay;
	}

	@Override
	public String getAppleStore() {
		// TODO Auto-generated method stub
		return AppleStore;
	}

	@Override
	public String getResponsiveApp() {
		// TODO Auto-generated method stub
		return ResponsiveApp;
	}

	@Override
	public String getApiservice() {
		// TODO Auto-generated method stub
		return Apiservice;
	}

	@Override
	public String getWaitingTimes() {
		// TODO Auto-generated method stub

		return WaitingTimes;
	}

	@Override
	public String getMultiLanguages() {
		// TODO Auto-generated method stub

		return MultiLanguages;
	}

	@Override
	public String getWatingTimesTest() {
		// TODO Auto-generated method stub
		return WatingTimesTest;
	}

	public void setTariffaGiornaliera(int tariffaGiornaliera) {
		TariffaGiornaliera = tariffaGiornaliera;
	}

	public void setGiornateDati(int giornateDati) {
		GiornateDati = giornateDati;
	}

	public void setGiornateFunzioniGeneriche(int giornateFunzioniGeneriche) {
		GiornateFunzioniGeneriche = giornateFunzioniGeneriche;
	}

	public void setGioornaatePublicazioneApp(int gioornaatePublicazioneApp) {
		GioornaatePublicazioneApp = gioornaatePublicazioneApp;
	}

	public void setGiornateResponsiveApp(int giornateResponsiveApp) {
		GiornateResponsiveApp = giornateResponsiveApp;
	}

	public void setGiornateMockUp(int giornateMockUp) {
		GiornateMockUp = giornateMockUp;
	}

	public void setMockUp(String mockUp) {
		MockUp = mockUp;
	}

	public void setGooglePlay(String googlePlay) {
		GooglePlay = googlePlay;
	}

	public void setAppleStore(String appleStore) {
		AppleStore = appleStore;
	}

	public void setResponsiveApp(String responsiveApp) {
		ResponsiveApp = responsiveApp;
	}

	public void setApiservice(String apiservice) {
		Apiservice = apiservice;
	}

	public void setWaitingTimes(String waitingTimes) {
		WaitingTimes = waitingTimes;
	}

	public void setMultiLanguages(String multiLanguages) {
		MultiLanguages = multiLanguages;
	}

	public void setWatingTimesTest(String watingTimesTest) {
		WatingTimesTest = watingTimesTest;
	}

	
	public int getTotalePreventivo () {
		return 0;
	}
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MainAppMobile mobile = new MainAppMobile();

		mobile.setMockUp("grafiche per lo sviluppo");
		mobile.setGooglePlay("account Aziendale per google play publication");
		mobile.setAppleStore("dati per la publicazione dell'app su apple store");
		mobile.setResponsiveApp("dovrà essere rilasciata per più dispositivi mobili");
		mobile.setMultiLanguages("sono previste più lingue");
		mobile.setApiservice("servizio web principale dell'app è https://api.service.mobile");
		mobile.setWatingTimesTest("previsione per la fase di test si svolgerà in 5 gg");
		mobile.setWaitingTimes("app mobile verrà rilasciata sugli store dopo la fase di test nei tempi stabiliti dagli stores");
		mobile.setGiornateMockUp(7);
		mobile.setGiornateResponsiveApp(8);
		mobile.setGioornaatePublicazioneApp(2);
		mobile.setGiornateFunzioniGeneriche(3);
		mobile.setGiornateDati(6);
		mobile.setTariffaGiornaliera(250);
		

		System.out.println(mobile.getMockUp());
		System.out.println(mobile.getGooglePlay());
		System.out.println(mobile.getAppleStore());
		System.out.println(mobile.getResponsiveApp());
		System.out.println(mobile.getMultiLanguages());
		System.out.println(mobile.getApiservice());
		System.out.println(mobile.getWatingTimesTest());
		System.out.println(mobile.getWaitingTimes());
		System.out.println(mobile.getGiornateResponsiveApp());
		System.out.println(mobile.getGiornateFunzioniGeneriche());
		System.out.println(mobile.getGiornateDati());
		System.out.println(mobile.getTariffaGiornaliera());
		System.out.println(mobile.getGiornateMockUp());
		System.out.println(mobile.getGioornaatePublicazioneApp());
		System.out.println("Totale preventivo app : " + mobile.getTotalePreventivo() + "€");
		
		
	}

}
