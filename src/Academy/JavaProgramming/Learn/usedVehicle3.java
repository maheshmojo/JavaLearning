package Academy.JavaProgramming.Learn;

class usedVehicle {
    static String brandName;
    String modelName1;
    String modelName2;
    String colour;
    int EngineCC = 2400;
    int yearMake = 2021;


    public usedVehicle(){
     brandName = "Ford MotoCrop.";
     modelName1 ="SUV";
     modelName2 ="MUV";

    }
    public void methodVehicle(){
        System.out.println(brandName);
    }
}

class suvModel extends usedVehicle{

    String modelName;
    String modelNumber;
    String paintScheme="Red";
    int year=2014;
    int yearOfMake;


    suvModel(){
        modelName ="Land Cruiser";
        modelNumber="LC001";
        colour =this.paintScheme;
        yearOfMake = yearMake-year;
    }

    public void suvMethod(){
        System.out.println("Model Name: "+modelName+":"+modelNumber);
        System.out.println("Engine Capacity: "+EngineCC);
        System.out.println("Car colour: "+paintScheme);
        System.out.println("Total run: "+yearOfMake);
        System.out.println("*----------------------------------------------*");
    }
}
     class muvModel extends usedVehicle {
         String modelName2;
         String modelNumber;
         String paintScheme = "blue";
         int year;
         int yearOfMake2;
         muvModel() {
             modelName2="Verna";
             modelNumber = "V001";
             colour = this.paintScheme;
             year =2012;
             yearOfMake2= yearMake-year;
         }

         public void muvMethod() {
             System.out.println("Model Name: " + modelName2 + ":" + modelNumber);
             System.out.println("Engine Capacity: " + EngineCC);
             System.out.println("Car colour: " + paintScheme);
             System.out.println("Total run: "+yearOfMake2);
             System.out.println("*----------------------------------------------*");

         }

     }

public class usedVehicle3{
    public static void main(String[] args){

        muvModel ob3= new muvModel();
        suvModel ob2= new suvModel();
        ob2.methodVehicle();    // Accessing the parent class from suvModel class
        ob2.suvMethod();
        ob3.methodVehicle();    //Accessing the parent class from muvModel class
        ob3.muvMethod();

     }
    }

