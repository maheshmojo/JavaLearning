package Academy.JavaProgramming.Learn;
//Single Inheritance Using Vehicle
//Created a First parent class
class vehicle {
    String brand;
    String modelType;
//    Creating a Constructor and storing the variable
    public vehicle(){
        brand = "Ford";
        modelType = "SUV";
    }
    /*Creating method for vehicle class to display the data */
    public void methodVehicle(){
        System.out.println("Company Name :- "+brand+"  Segment:- "+modelType);
    }
}
//Creating a Segment as subclass extends vehicle
//Created SubClass
class segments extends vehicle{
    String model1;
    String model2;
    String model3;
    segments(){
        this.model1 ="Urban cursier";
        this.model2 ="Fortuner";
        this.model3 ="Land Cursier";
    }

    //    Creation of suv method to display the data
    void suv2(){

        System.out.println("SUV Segment and models in :-"+brand);
        System.out.println("Model-1 :- "+this.model1+" Brand Name:- "+brand);
        System.out.println("Model-2 :- "+this.model2+" Brand Name:- "+brand);
        System.out.println("Model-3 :- "+this.model3+" Brand Name:- "+brand);

    }


    public static void main(String[] args){
        //Creating a object for Segments.
        segments obj = new segments();
        //the segment can access the parent method class.
        obj.methodVehicle();
        //Printing the suv() method.
        obj.suv2();



    }
    
}
