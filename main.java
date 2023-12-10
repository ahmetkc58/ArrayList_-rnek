package ders3__generics;


/*
<> işaretleri içine bir tip yazarsak bu o yazdığımız tiple çalışan class generic bir class olur 
 */

import java.util.ArrayList;

public class main {

    public static void main(String[] args) {
        ArrayList<Customer> list = new ArrayList<Customer>();//arraylist artık String ile çalışan bir generic classtır  generic parametrelendirilimş anlamına gelmektedi 
        Customer cr = new Customer();
        cr.sayı = 23;
        cr.metin = "merhaba";
        list.add(cr);
        Customer cr1 = new Customer();
        cr1.sayı = 32;
        cr1.metin = "hello";
        list.add(cr1);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).sayı);
        }

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).metin);
        }
    }

}
