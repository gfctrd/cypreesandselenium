class Kitchenpage{


    clickhomekitchen() {
        return cy.get('a[href="/shop-online/home-kitchen-appliances.html]').first().click();

    }
    clickonproduct(){

        return cy.get('a[href="/cookware/5-ltr-3-ltr-2-ltr-1-5-ltr-pressure-cooker-combo-4pc3/p/12614170.html?ntzoneid=9282&nts=Cat_Now_Trending&ntz=Cat_Now_Trending"]').click()
    }
   addtocart(){
    return cy.get('a[href="javascript:void(0)"]').click();

   }

   fname(fname){
    return cy.get('#firstName').type(fname)
   }

   lname(lname){
    return cy.get('#lasttName').type(lname)
   }

   mobnumber(number){
    return  cy.get('#mobile').type(number)
   }

    addressbar(address){
    return  cy.get('#address').type(address)
   }


   enterlandmark(landmark){
    return cy.get('#landmark').type(landmark)
    
   }

   enterpincode(pincode){
    return cy.get('#pincode').type(pincode)
    
   }

   selectstate(state){
    return cy.get('#state').select(state)
   }
   selectcity(city){
    return cy.get('#city').select(city)
   }

   clickoncomleteorder(){
    return cy.get('.shake-button').click()
   }






}
export  default Kitchenpage;
