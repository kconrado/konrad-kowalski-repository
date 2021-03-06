package com.kodilla.good.patterns.challenges;

public class ShipmentService {
    private SaleDatabase saleDatabase;

    public ShipmentService(SaleDatabase saleDatabase) {
        this.saleDatabase = saleDatabase;
    }

    public void shippingProduct(User user){
        System.out.println("Sending " + saleDatabase.getFromDatabase(user.boughtProducts.get(user.boughtProducts.size()-1)) + " to " + user.getName() + " " +
        user.getSurname() + ", adress: " + user.getStreet() + " " + user.getBuildingNumber() + ", " +
                user.getCity() + " " + user.getPostNumber());
    }

}
