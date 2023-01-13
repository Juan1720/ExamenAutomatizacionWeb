package com.nttdata.steps;

import com.nttdata.page.InventoryPage;
import com.nttdata.page.LoginPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class InventorySteps {

    private WebDriver driver;

    public InventorySteps(WebDriver driver){
        this.driver = driver;
    }

    /**
     * Obtener el título de la pantalla de productos
     * @return el valor del título de la pantalla de productos
     */

    public String getTitle(){
        return this.driver.findElement(InventoryPage.productsTitle).getText();
    }

    /**
     * Retorna la cantidad de items
     * @return la cantidad de items
     */

    public int getItemSize(){
        List<WebElement> items = this.driver.findElements(InventoryPage.itemsCards);
        return items.size();
    }

    /**
     * Hacer click en el botón add to cart
     */
    public void addToCart(){
        this.driver.findElement(InventoryPage.addToCart).click();
    }
    /**
     * Hacer click en el shopping  cart
     */
    public void shoppingCart(){
        this.driver.findElement(InventoryPage.shoppingCart).click();
    }

    public int itemCartSize(){
        List<WebElement> items = this.driver.findElements(InventoryPage.cartItem);
        return items.size();
    }

    /**
     * Obtener el nombre del producto
     */


    public String nameProduct(){
        return this.driver.findElement(InventoryPage.nameProduct).getText();
    }



}
