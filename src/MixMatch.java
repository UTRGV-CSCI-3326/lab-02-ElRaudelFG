public class MixMatch {

    public static void main (String[] args){ //work space
        
        //examples
        //System.out.println("must have a string " + 5 + " " + true + " " + 7.2);

        //Initalize the data types
        String varString = "Hello";
        char varChar = 'A';
        short varShort = 12000;
        int varInt = 7;
        long varLong = 2200000L;
        float varFloat = 3.14f;
        double varDouble = 2.384610923337;
        boolean varBoolean = true;

        //definitions of data types along with a variable for each
        System.out.println();
        System.out.println(varString + " <- String, stores a sequence of characters.");
        System.out.println(varChar + " <- char, stores a single character.");
        System.out.println(varShort + " <- short, stores whole numbers from -32,768 to 32,767 ");
        System.out.println(varInt + " <- Integer, stores whole numbers from -2,147,483,648 to 2,147,483,647");
        System.out.println(varLong + " <- long, stores whole numbers from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807");
        System.out.println(varFloat + " <- float, stores fractional numbers with 6-7 decimal digits");
        System.out.println(varDouble + " <- double, stores fractional numbers with 15 decimal digits");
        System.out.println(varBoolean + " <- boolean, stores true or false values");
 
        System.out.println();
        System.out.println(varString + " I just bought a 199" + varInt + " Ford Mustang" + " for " + varShort + "$");
    }
}