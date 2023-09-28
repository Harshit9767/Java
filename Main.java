import javax.swing.*;

public class Main {
    public static void main(String[] arg){

        int age = 20;
        if(age>18)
            System.out.println("Age is greater than 18");// print output
        String location = "paris";
        if(location == "london"){
            System.out.print("true");}
            else{
                System.out.println("false");}

            if(location.equals("paris"))   {
            System.out.print("true");

            double myfirstvalue = 20.00d;
            double mysecondvalue = 80.00d;

            double thirdvalue= (myfirstvalue + mysecondvalue ) * 100.00;
                System.out.println("MyvalueTotal ="+ thirdvalue);
            double theanswer =  thirdvalue % 40.00 ;
                System.out.println(" theanswer ="+ theanswer);
            boolean isnoanswer = (theanswer== 0)    ? true : false ;
                System.out.println(" isnoanswer ="+ isnoanswer);
                if(isnoanswer!=  true )
                    System.out.print("true");


        }



    }
}