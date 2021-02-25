Feature: Global Trader Login

  Scenario: TC_001 GlobalTrader Login Positive Test
    Given kullanici anasayfaya gider
    And Sign In butonuna tiklar
    And email textbox ina email girer
    And password textbox ina password girer
    Then Login butonuna tiklar
    Then hesabina basariyla girdigini test eder

  Scenario: TC_002 GlobalTrader Logout Test
    When GlobalTrader Login
    Given kullanici hesabina giris yaptiktan sonra LogOut butonuna tiklayarak cikar
    And hesaptan ciktigini test eder

    Scenario: TC_003 dropdown
      When GlobalTrader Login
      And dropDown