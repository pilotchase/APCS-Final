public class BuildAircraft {
    public static void main(String args[])
    {
        Aircraft B737 = new Aircraft("Boeing", 423.0);
        Aircraft A320 = new Aircraft("Airbus", 415.0);

        /**
         * Calls toString
         */
        System.out.println(A320);

        /**
         * Calls toString
         */
        System.out.println(B737);

        changeIt(B737, A320);

        /**
         * Calls toString again
         */
        System.out.println(A320);

        /**
         * Calls toString again
         */
        System.out.println(B737);


    }

    public static void changeIt(Aircraft B737, Aircraft A320)
    {
        B737.setType("Boeing");
        Aircraft E135 = new Aircraft("Embraer", 240.0);
        A320 = E135;
        A320.setMaxSpd(415.0);
    }
}
