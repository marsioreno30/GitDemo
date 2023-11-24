package steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApiCRED {
	
	
		@Given("Check test")
		public void check_test() {
		   System.out.println("Given sdf");
		}

		@When("Test does not exist")
		public void test_does_not_exist() {
			 System.out.println("When");
		}

		@Then("Create test")
		public void create_test() {
			 System.out.println("Then");
		}

		@Then("Delete Test")
		public void delete_test() {
			 System.out.println("And");
		}
	}

