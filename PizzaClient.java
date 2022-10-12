public class PizzaClient {



    /**

     * in ket qua

     */



    public void run() {



        Pizza round = new Pizza (3.00, new Circle (1.0));

        Pizza rect =  new Pizza (9.00, new Rectangle (6, 4));

        PizzaDeal pd = new PizzaDeal();

        System.out.println(round + " is a better deal than " + rect

                + ": " + pd.betterDeal(round, rect));



    }







    /**

     * khoi tao ham main de chay

     * khoi tao mot phien cua PizzaClient va de no chay

     */



    public static void main (String[] nu) {

        new PizzaClient().run();

    }



}