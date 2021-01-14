package Academy.JavaProgramming.Learn;

//Multilevel Inheritance

public class vehicle2 {
    String brand;
    String modelType;

    public vehicle2(){
        brand = "Ford";
        modelType = "SUV";
    }

    public void methodVehicle(){
        System.out.println("Company Name :- "+brand+"  Segment:- "+modelType);
    }
}
//Subclass "segments" inherit attributes with vehicle class
class segments2 extends vehicle2 {
    String model1;
    String model2;
    String model3;

    segments2() {
        model1 = "Urban cursier.";
        model2 = "Fortuner.";
        model3 = "Land Cursier.";
    }

    public void suv() {
        System.out.println(modelType + " Segment and models in :-" + brand);
        System.out.println(model1 + " Brand Name:- " + brand);
        System.out.println(model2 + " Brand Name:- " + brand);
        System.out.println(model3 + " Brand Name:- " + brand);
        System.out.println("*-----------------------------*");
    }
}

//    3rd Subclass "variants" inherit segments class attribute's
    class variants extends segments2{
        String variant1,variant2,variant3,variant4;

        variants(){
            variant1 ="-LXI-";
            variant2 ="-VXI-";
            variant3 ="-LDI-";
            variant4 ="-VDI-";
        }

        public void ub(){
            System.out.println(model1+""+variant1+"It is base variant for petrol");
            System.out.println(model1+""+variant2+"It is Top variant fot diesel");
            System.out.println(model1+""+variant3+"It is base variant for petrol");
            System.out.println(model1+""+variant4+"It is Top variant fot diesel");
            System.out.println("*----------------------------------------------*");

        }
        void ub2(){
            System.out.println(model2+""+variant1+"It is base variant for petrol");
            System.out.println(model2+""+variant2+"It is Top variant fot diesel");
            System.out.println(model2+""+variant3+"It is base variant for petrol");
            System.out.println(model2+""+variant4+"It is Top variant fot diesel");
            System.out.println("*----------------------------------------------*");
        }
        void ub3(){
            System.out.println(model3+" "+variant1+" It is base variant for petrol");
            System.out.println(model3+" "+variant2+" It is Top variant fot diesel");
            System.out.println(model3+" "+variant3+" It is base variant for petrol");
            System.out.println(model3+" "+variant4+" It is Top variant fot diesel");
            System.out.println("*----------------------------------------------*");

        }


//Displaying the data by creating a object
    public static void main(String[] args){
        variants obj1= new variants();
        obj1.methodVehicle();
        obj1.suv();
        obj1.ub();
        obj1.ub2();
        obj1.ub3();



    }

}
