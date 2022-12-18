package atm;

public class Handler5 extends Handler{
    @Override
    public void process(int price) {
        Handler next = getNext();
        if(next == null && price % 5 > 0){
            throw  new IllegalArgumentException("There are no banknotes of such denomination");
        }
        else {
            System.out.println(price / 5 + " * 5");
        }
    }
}
