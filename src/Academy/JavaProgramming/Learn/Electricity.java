package Academy.JavaProgramming.Learn;


import java.util.Scanner;
//Parent abstract class
abstract class CustomerDetails implements Details { //implementations to show customer data
void disPlay(){
       String Name =this.Name;
       String consumerNo= this.consumerNo;
       String region =this.region;
       int number = this.number;
    System.out.println("Customer Name: "+Name);
    System.out.println("Customer No: "+consumerNo);
    System.out.println("Customer region: "+region);
    System.out.println("Customer number: "+number);
    }
    
}

abstract class previousConsumed extends CustomerDetails{ //Second child abstract class
    public void billData(){

        int consumedUnits = 1000;
        int paidAmt = 0;
        if(consumedUnits<100)
            paidAmt= (int) (consumedUnits*1.20);
        else if(consumedUnits<=300)
            paidAmt= (int) (100*1.20+(consumedUnits-100)*2);
        else if(consumedUnits>300)
            paidAmt= (int) (100*1.20+200*2+(consumedUnits-300)*3);

        System.out.println("Previous consumed unit: "+consumedUnits+" Units.");
        System.out.println("Previous Paid amount is :- "+paidAmt);
    }
    public void previousBill(){
        this.billData();

    }
}

abstract class CalculateBill extends previousConsumed{  //third child abstract class

    @Override
    void disPlay() {
        super.disPlay();
    }
        double billpay;
        void Bill(long units) {

            if(units<100)
                billpay=units*1.20;
            else if(units<=300)
                billpay=100*1.20+(units-100)*2;
            else if(units>300)
                billpay=100*1.20+200*2+(units-300)*3;

        }
    
}

public class Electricity extends CalculateBill implements Details { //Main Parent class.

        public static void main(String args[]) {
            Scanner scanner=new Scanner(System.in);
            long units;

            Electricity b=new Electricity(); //Create object
               b.disPlay();     //inherit data from display
               b.previousBill();
                    System.out.println("Enter number of units consumed");
                    units=scanner.nextLong();
               b.Bill(units);

            System.out.println("Bill to pay : " + b.billpay);


        }


}

