package money;

public class Franc extends Money {

    public Franc(double amount) {
        super(amount);
    }

    public void add(Franc franc){
        amount += franc.getAmount();
    }

    public  void add(Dollar dollar, Exchange exchange){
        Franc franc = exchange.dollarToFranc(dollar);
        amount += franc.getAmount();
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Franc){
            Money value = (Money)obj;
            return value.amount == amount;
        }
        return false;
    }
}
