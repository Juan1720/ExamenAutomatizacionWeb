package com.nttdata.page;

import org.openqa.selenium.By;

public class InventoryPage {

    public static By productsTitle = By.cssSelector("span.title");
    public static By itemsCards = By.cssSelector("div.inventory_item");

    public static By addToCart = By.id("add-to-cart-sauce-labs-bike-light");

    public static By shoppingCart = By.cssSelector("a.shopping_cart_link");

    public static By  cartItem = By.cssSelector("div.cart_item");

    public static By nameProduct = By.cssSelector("div.inventory_item_name");


}
