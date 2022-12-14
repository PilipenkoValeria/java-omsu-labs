package ru.omsu.lab3.product;

import org.testng.annotations.Test;

public class ProductPackagingTest {

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testConstructorNullName() {
        ProductPackaging productPack = new ProductPackaging(null, 90.0);
    }

    @Test(expectedExceptions = IllegalArgumentException.class)
    public static void testConstructorNegativeWeight() {
        ProductPackaging productPack = new ProductPackaging("Name", -90.0);
    }
}
