package atm;

public class Handler20 extends Handler{
    @Override
    public void process(int price) {
        Handler next = getNext();
        if(next == null && price % 20 > 0){
            throw  new IllegalArgumentException("There are no banknotes of such denomination");
        }
        else if(next!=null){
            next.process(price % 20);
            System.out.println(price /20 + " * 20");
        }
    }
}
