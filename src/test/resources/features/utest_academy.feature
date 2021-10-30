#
# Autor: Jennifer Gomez
# 29/10/2021
#
  @stories
  Feature: uTest
  As a user, I want to learn how to testing at uTest with the testing basics course
  @scenario1
  Scenario: Search for a testing basics course
    Given than Jennifer wants to learn at the uTest academy
      | strFirstName | strLastName | strEmail           | strMonth | intDay | intYear | strMobileDevice | strModel | strOS       | strClave      |
      | Jennifer     | Gomez       | jennifer@gmail.com | January  | 1      | 1995    | Alcatel         | MD01     | Android 2.0 | Passutest2021 |
    When she search for the course testing basics on the uTest academy platform
      | strCourse      |
      | Testing Basics |
    Then she finds the course called testing basics
      | strCourse      |
      | Testing Basics |