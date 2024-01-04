package adamasmacaoyunu;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class AdamAsmacaOyunu {

    public static void adamAsmaca () {

        List<String> renkler = List.of("beyaz","siyah","yeşil","kırmızı","mor","sarı");

        Scanner input = new Scanner(System.in);
        Random rdm = new Random();
        int randomIdx= rdm.nextInt(renkler.size());
        String rastgeleRenk = renkler.get(randomIdx);

        //System.out.println(rastgeleRenk);

        ArrayList<String> bos = new ArrayList<>();

        for (int i = 0; i < rastgeleRenk.length(); i++) {
            bos.add("_");
        }

        System.out.println(String.join("",bos));

        int can=5;
        String yanlisTahminler ="";

        System.out.println("Adam asmaca oyununa hoşgeldiniz!");

        do {
            System.out.println("Lütfen bir harf tahmin ediniz");

            String tahmin = input.next().substring(0,1).toLowerCase();

            if (rastgeleRenk.contains(tahmin)){

                System.out.println("Doğru tahmin!!");

                for (int i = 0; i <rastgeleRenk.length(); i++) {

                    if (rastgeleRenk.substring(i,i+1).equals(tahmin)){
                        bos.set(i,tahmin);
                    }

                }
                System.out.println(String.join("",bos));

                if (String.join("",bos).equals(rastgeleRenk)){
                    System.out.println("Oyunu kazandınız tebrikler!!!");break;
                }

            } else {
                can--;
                System.out.println("Üzgünüz yanlış tahmin "+ can + " hakkınız kaldı.");
                yanlisTahminler += tahmin;
                System.out.println("Yanlış tahminleriniz : " + yanlisTahminler);

            }



        }while (can>0);

        if (can==0){
            System.out.println("Cevap : "+rastgeleRenk+  " Oyunu kaybettiniz :(");
        }

    }

}