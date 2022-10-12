/**
 * tinh ti le gia/dien tich cua mot chiec pizza de mo hinh hoa khai niem

 * so sanh giao dich giua hai pizza

 */

public class PizzaDeal {

    /**

     * tinh ti le gia/dien tich cua mot chiec pizza

     * @param p != null

     * @returns ti le gia/dien tich cua p.

     */



    public double deal(Pizza p) {

        return p.getPrice() / p.getShape().getArea();

    }
    /**

     * so sanh ty le gia/dien tich cua hai pizza

     * @param p1 != null

     * @param p2 != null

     * @returns true neu p1 tot hon p2, false neu nhu nguoc lai

     */

    public boolean betterDeal(Pizza p1, Pizza p2) {

        return deal(p1) < deal(p2);

    }



}

 