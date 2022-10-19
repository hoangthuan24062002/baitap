class KiemThu {
    public static void main(String[] args) {
        Time t = new Time(1, 1, 1);
        t.display();
        t.setTime(20, 50, 59);
        t.display();
        t.nextSecond();
        t.display();
        t.nextSecond();
        t.display();
        t.setTime(2, 0, 0);
        t.display();
        t.previousSecond();
        t.display();
    }
}