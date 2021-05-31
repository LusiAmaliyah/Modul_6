package modul_6;
public class TumpukanApp {
    
     public static void main(String[] args) {
        Tumpukan tumpuk=new Tumpukan(10);
        tumpuk.push(50);
        tumpuk.printData();
        tumpuk.push(100);
        tumpuk.printData();
        tumpuk.pop();
        tumpuk.printData();
        tumpuk.push(60);
        tumpuk.printData();
        tumpuk.push(80);
        tumpuk.printData();
        tumpuk.pop();
        tumpuk.printData();
        long bacaTop = tumpuk.peek();
        System.out.println("nilai top = "+ bacaTop);
    }
}
