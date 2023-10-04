package org.example;

import org.junit.Assert;
import org.junit.Test;

public class CabInvoiceTest {
    CabInvoiceGenerator cabInvoiceGenerator = new CabInvoiceGenerator();

    @Test
    public void givenDistanceAndTime_ShouldReturn(){
        double distance = 2;
        int time = 5;
        double result = cabInvoiceGenerator.calculateFare(distance,time);
        Assert.assertEquals(25,result,0);
    }
}
