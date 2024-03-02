package com.pos.pages;

import com.framework.selenium.api.design.Locators;
import com.framework.testng.api.base.ProjectSpecificMethods;
import com.github.javafaker.Faker;

public class NewVendorsPage  extends ProjectSpecificMethods{

	public NewVendorsPage enterVendorId(String vendorId) {
		Faker fk = new Faker();
		String custid = fk.number().digits(8);
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Vendor Id']/following::input"), custid);
		reportStep(custid+"Vendor Id entered successfully", "pass");
		return this;
	}
	public NewVendorsPage enterVendorName(String vendorName) {
		Faker fk = new Faker();
		String fname = fk.name().firstName();
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Vendor Name']/following::input"),fname );
		reportStep(fname+" VendorName entered successfully", "pass");
		return this;
	}
	public NewVendorsPage enterVendorDescription(String vendorDescription) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Description']/following::input"), vendorDescription);
		reportStep(vendorDescription+" VendorDescription entered successfully", "pass");
		return this;
	}
	public NewVendorsPage enterVendorAddress(String vendorAddress) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Address']/following::input"), vendorAddress);
		reportStep(vendorAddress+" VendorAddress entered successfully", "pass");
		return this;
	}
	public NewVendorsPage enterVendorMobile(String vendorMobile) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Mobile']/following::input"), vendorMobile);
		reportStep(vendorMobile+" VendorMobile entered successfully", "pass");
		return this;
	}
	public NewVendorsPage enterVendorEmailId(String vendorEmailId) {
		clearAndType(locateElement(Locators.XPATH, "//label[text()='Email Id']/following::input"), vendorEmailId);
		reportStep(vendorEmailId+" Vendor EmailId entered successfully", "pass");
		return this;
	}
	public NewVendorsPage clickSubmitButton() {
		click(locateElement(Locators.XPATH,"//span[text()='Submit']"));
		reportStep("Submit button clicked successfully", "pass");
	    return this;
	}
	public VendorsPage clickVendorsMenu() {
		click(locateElement(Locators.XPATH,"//h3[text()='Vendors']"));
		reportStep("Customer menu clicked  successfully", "pass");
	    return new VendorsPage();
	}
}
