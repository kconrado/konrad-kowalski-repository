package com.kodilla.stream.invoice.simple;

import org.junit.Assert;
import org.junit.Test;

public class SimpleInvoiceTestSuite {

    @Test
    public void testGetValueToPay(){
        //given
        SimpleInvoice invoice = new SimpleInvoice();
        //when
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 1", 17.28), 2.0));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 2", 11.99), 3.5));
        invoice.addItem(new SimpleItem(new SimpleProduct("Product 3",  6.49), 5.0));
        //then
        Assert.assertEquals(108.975, invoice.getValueToPay(), 0.001);
    }
}
