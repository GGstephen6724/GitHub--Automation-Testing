package org.example;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class SearchTest extends BaseTest {

    @Test
    public void test1_NonExistentRepoSearch() throws InterruptedException {
        WebElement searchButton = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[1]/qbsearch-input/div[1]/div[1]/div/div/button"));
        searchButton.click();

        WebElement textBox = driver.findElement(By.id("query-builder-test"));
        textBox.click();
        textBox.sendKeys("hfuieoshauif");
        Thread.sleep(1000);
        textBox.submit();
        Thread.sleep(3000);
    }

    @Test
    public void test2_ExistingRepoSearch() throws InterruptedException {
        Thread.sleep(2000);
        WebElement searchButton2 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[1]/qbsearch-input/div[1]/div[1]/div/div/button"));
        searchButton2.click();
        WebElement textBox = driver.findElement(By.id("query-builder-test"));
        textBox.clear();
        textBox.sendKeys("weight-Conversion");
        textBox.submit();
        Thread.sleep(3000);
    }

    @Test
    public void test3_FilterByLanguage() throws InterruptedException {
        Thread.sleep(2000);
        WebElement C_plusplusButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/main/react-app/div/div/div[1]/div/div/div[1]/div[2]/div/div/div/div/ul/li[3]/ul/li[6]"));
        C_plusplusButton.click();
        Thread.sleep(2000);
    }

    @Test
    public void test4_SortByStars() throws InterruptedException {
        Thread.sleep(2000);
        WebElement sortButton = driver.findElement(By.xpath("/html/body/div[1]/div[5]/main/react-app/div/div/div[1]/div/div/div[2]/div[2]/div/div[1]/div[1]/div/div/div[1]"));
        sortButton.click();
        WebElement mostStars = driver.findElement(By.xpath("//*[@id=\":r38:\"]/div"));
        mostStars.click();
        Thread.sleep(2000);
    }

    @Test
    public void test5_EmptySearch() throws InterruptedException {
        WebElement searchButton3 = driver.findElement(By.xpath("/html/body/div[1]/div[1]/header/div/div[2]/div[1]/qbsearch-input/div[1]/div[1]/div/div/button"));
        searchButton3.click();
        WebElement textBox = driver.findElement(By.id("query-builder-test"));
        textBox.click();
        textBox.clear();
        textBox.sendKeys(" ");
        textBox.submit();
        Thread.sleep(2000);
    }
}
