package sample.Model;

public class Market {

    public double applesPrice;
    public double orangesPrice;
    public double bananasPrice;
    public double grapesPrice;

    public Market(double applesPrice, double orangesPrice, double bananasPrice, double grapesPrice) {
        this.applesPrice = applesPrice;
        this.orangesPrice = orangesPrice;
        this.bananasPrice = bananasPrice;
        this.grapesPrice = grapesPrice;
    }

    public double getApplesPrice() {
        return applesPrice;
    }

    public void setApplesPrice(double applesPrice) {
        this.applesPrice = applesPrice;
    }

    public double getOrangesPrice() {
        return orangesPrice;
    }

    public void setOrangesPrice(double orangesPrice) {
        this.orangesPrice = orangesPrice;
    }

    public double getBananasPrice() {
        return bananasPrice;
    }

    public void setBananasPrice(double bananasPrice) {
        this.bananasPrice = bananasPrice;
    }

    public double getGrapesPrice() {
        return grapesPrice;
    }

    public void setGrapesPrice(double grapesPrice) {
        this.grapesPrice = grapesPrice;
    }
}
