package exercises_8.constructoroverloading;

public class Time1Test {
    public static void main(String... args){

        //create and initialize a Time1 object
        Time1 time = new Time1();

        //output string representaiton of the time
        displayTime("Afer time object is created", time);
        System.out.println();


        //change time and output updated time
        time.seTime(13,27,6);
        displayTime("After calling setTime", time);
        System.out.println();

        //attempt to set with invalid values
        try {
            time.seTime(99,99,99); //all values out of range
        }
        catch (IllegalArgumentException e){
            System.out.printf("Exception: %s%n%n", e.getMessage());
        }

        //display time after attempt to set invalid values
        displayTime("After calling setTime with invalid values", time);
    }

    //displays a Time1 object in 24-hour and 12-hour formats
    private static void displayTime(String header, Time1 t){
        System.out.printf("%s%nUniversal time: %s%nStandard time: %s%n",
                header, t.toUniversalString(), t.toString());
    }
    //end class Time1Test
}
