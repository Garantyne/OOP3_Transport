package transport;

public class Train extends Transport {
    double coastOfTravel;
    String time;
    String nameOfStantion;
    String nameOfFinish;
    int numberOfWagons;

    public Train(double coastOfTravel, String time, String nameOfStantion, String nameOfFinish, int numberOfWagons,
                 String brand, String model, int productionYear, String productionCountry, String color, int maxSpeed) {
        super(brand, model, productionYear, productionCountry, color, maxSpeed);
        if(coastOfTravel<0){
            this.coastOfTravel = 3500;
        }else{
            this.coastOfTravel = coastOfTravel;
        }
        if(time == null){
            this.time = "10:00";
        }else{
            this.time = time;
        }
        if(nameOfStantion == null){
            this.nameOfStantion = "default";
        }else{
            this.nameOfStantion = nameOfStantion;
        }
        if(nameOfFinish == null){
            this.nameOfFinish = "default";
        }else{
            this.nameOfFinish = nameOfFinish;
        }
        if(numberOfWagons<1){
            this.numberOfWagons = 1;
        }else{
            this.numberOfWagons = numberOfWagons;
        }
    }

    public double getCoastOfTravel() {
        return coastOfTravel;
    }

    public void setCoastOfTravel(double coastOfTravel) {
        if(coastOfTravel<0){
            this.coastOfTravel = 3500;
        }else{
            this.coastOfTravel = coastOfTravel;
        }
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        if(time == null){
            this.time = "10:00";
        }else{
            this.time = time;
        }
    }

    public String getNameOfStantion() {
        return nameOfStantion;
    }

    public void setNameOfStantion(String nameOfStantion) {
        if(nameOfStantion == null){
            this.nameOfStantion = "default";
        }else{
            this.nameOfStantion = nameOfStantion;
        }
    }

    public String getNameOfFinish() {
        return nameOfFinish;
    }

    public void setNameOfFinish(String nameOfFinish) {
        if(nameOfFinish == null){
            this.nameOfFinish = "default";
        }else{
            this.nameOfFinish = nameOfFinish;
        }
    }

    public int getNumberOfWagons() {
        return numberOfWagons;
    }

    public void setNumberOfWagons(int numberOfWagons) {
        if(numberOfWagons<1){
            this.numberOfWagons = 1;
        }else{
            this.numberOfWagons = numberOfWagons;
        }
    }

    @Override
    public void refill() {
        System.out.println("Поезда нужно заправлять дизелем");
    }

    @Override
    public String toString() {
        return super.toString() + "\nПроезд стоит " + coastOfTravel +" рублео " +
                "\nПоездка занимает по вермени " + time +
                "\nНазвание станции отправления " + nameOfStantion +
                "\nНазвание конечной станции " + nameOfFinish +
                "\nколичество вагонов " + numberOfWagons;
    }
}
