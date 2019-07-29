package money;

public class Money implements IMoney {

    protected double amount;

    public Money(double amount){
        this.amount = amount;
    }

    public double getAmount() {
        return amount;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj instanceof Money){
            Money value = (Money)obj;
            return value.amount == amount;
        }
        return false;
    }
}
