package transport;

public abstract class Transport {
    String brand;
    String model;
    private int productionYear;
    private String productionCountry;
    String color;
    int maxSpeed;

    public Transport(String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        if(brand == null){
            this.brand = "default";
        }else{
            this.brand = brand;
        }
        if(model == null){
            this.model = "default";
        }else{
            this.model = model;
        }
        if(productionYear < 2000){
            this.productionYear = 2000;
        }else{
            this.productionYear = productionYear;
        }
        if(productionCountry == null){
            this.productionCountry = "default";
        }else{
            this.productionCountry = productionCountry;
        }
        if(color == null){
            this.color = "белый";
        }else{
            this.color = color;
        }
        if(this.maxSpeed<0){
            this.maxSpeed = 180;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getProductionYear() {
        return productionYear;
    }

    public String getProductionCountry() {
        return productionCountry;
    }

    public String getColor() {
        return color;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setBrand(String brand) {
        if(brand == null){
            this.brand = "default";
        }else{
            this.brand = brand;
        }
    }

    public void setModel(String model) {
        if(model == null){
            this.model = "default";
        }else{
            this.model = model;
        }
    }

    public void setColor(String color) {
        if(color == null){
            this.color = "белый";
        }else{
            this.color = color;
        }
    }

    public void setMaxSpeed(int maxSpeed) {
        if(this.maxSpeed<0){
            this.maxSpeed = 180;
        }else{
            this.maxSpeed = maxSpeed;
        }
    }
    public abstract void refill();


    @Override
    public String toString() {
        return "Брэнд " + brand +
                "\nмодель " + model +
                "\nгод производства " + productionYear +
                "\nстрана изготовитель " + productionCountry + '\'' +
                "\nцвет " + color + '\'' +
                "\nмаксимальная скорость " + maxSpeed;
    }
}
