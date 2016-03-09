package prob2;

public class Money {
	private int amount;
	
    public Money(int amount) {
        this.amount = amount;
    }
    
    public void setMoney(int amount){
    	this.amount = amount;
    }
    
    public int getMoney(){
    	return amount;
    }
    
    public Money add( Money money ) {
    	
        Money newMoney = new Money(this.amount + money.getMoney());
        
        return newMoney;
    }
    public Money minus( Money money ) {
        Money newMoney = new Money(this.amount - money.getMoney());
        
        return newMoney;
    }
    public Money multiply( Money money ) {
        Money newMoney = new Money(this.amount * money.getMoney());
        
        return newMoney;
    }
    public Money devide( Money money ) {
        Money newMoney = new Money(this.amount / money.getMoney());
        
        return newMoney;
    }
    
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + amount;
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Money other = (Money) obj;
		if (amount != other.amount)
			return false;
		return true;
	}

    
    

}
