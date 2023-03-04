Feature: Asian Paints Services
 	As a homeoWner,
  I Want to use Asian Paints services
  
  Scenario: Browse  services
    Given I am on the Asian Paints Website
    When I click on the Services tab
    Then I should see a list of available services
    
  Scenario: Navigate to Painting page
    Given I am on the Asian Paints Website
    When I click on the Painting Services
    Then I should be taken to the painting page
    
  Scenario: Navigate to Modular Kitchens 
    Given I am on the Asian Paints Website
    When I click on Modular Page
    Then I should be taken to the Modular Kitchen page
    
  Scenario: Navigate to Interior Design Services 
    Given I am on the Asian Paints Website
    When I click on the Interior Design Services
    Then I should be taken to the Interior Design Services
    
 	Scenario Outline: User using different pin codes
    Given I am on the Asian Paints Website
    When I select Find a Contractor 
    And I should enter valid "<pincode>"
    And I click on search
    Then I should see a list of Contractors
		
		Examples:
  		|pincode|
 	 	  |533248|
      |574201|
  		|500013|