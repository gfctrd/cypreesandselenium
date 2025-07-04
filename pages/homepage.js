class HomePage{
    login(){
        return cy.get('login-panel-link').click();

    }
    phnnumber(number){
        return cy.get('registration-basic-panel-mobile').type(number)
    }
    continuebutton(){
        return cy.get('registration-basic-panel-submit').click()
    }
    clickhomekitchenlink(){
        return cy.get('a[href="/shop-online/home-kitchen-appliances.html"]').first();
    }
}
export default HomePage;