import HomePage from "../../support/pages/homepage";
import Kitchenpage from "../../support/pages/Kitchen";

describe('naaptol - POM',()=>{
    const homePage=new HomePage();
    const kitchenPage= new Kitchenpage();

  it(completeorder,()=>{
    cy.visit('https://www.naaptol.com/')

    homePage.login();
    homePage.phnnumber('9951120448');
    homePage.continuebutton();
    cy.wait(1500);
    homePage.clickhomekitchenlink();


    kitchenPage.clickhomekitchen();
    kitchenPage.clickonproduct();
    kitchenPage.addtocart();


    kitchenPage.fname('mahesh')
    kitchenPage.lname('reddy')
    kitchenPage.mobnumber('9951120448');
    kitchenPage.addressbar('123 moosapet')
    kitchenPage.enterlandmark('near metro')
    kitchenPage.enterpincode('500085')


    kitchenPage.selectstate('TELANGANA')
    kitchenPage.selectcity('HYDERABAD')

    kitchenPage.clickoncomleteorder();

   cy.contains('Thank you for shopping with Naaptol.').should('be.visible')


  })

    
})