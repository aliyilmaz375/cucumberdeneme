Feature: urun secme

  Background: TC_001 GlobalTrader Login Positive Test
    Given kullanici anasayfaya gider
    And Sign In butonuna tiklar
    And email textbox ina email girer
    And password textbox ina password girer
    Then Login butonuna tiklar

  Scenario: TC002 Urun secme
    Then kullanici All Categories dropDown indan Computer&Office kategorisini secer
    Then kullanici arama butonuna tiklar
    Then kullanici ilk urune tiklar