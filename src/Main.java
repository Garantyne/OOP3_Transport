import transport.Bus;
import transport.Train;

public class Main {
    public static void main(String[] args) {
        Train train = new Train(3500,"2:15","Барнаул","Бийск",5,
                "Ласточка", "Та самая модель что и в задании", 2015,"Россия",
                "Голубой вагон",100500 );
        System.out.println(train);
        Bus ikar = new Bus("Икарус","колхозный",2020,"РОссия","БЕлый",100);
        System.out.println();
        System.out.println(ikar);
        train.refill();
        ikar.refill();
    }
}