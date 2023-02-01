import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

import java.util.Scanner;

import static java.lang.System.in;
import static java.lang.System.out;

public class sifre extends BroadcastReceiver
{

    @Override
    public void onReceive(Context context, Intent intent) {


            Scanner input = new Scanner (in);
            String username="brc",password="123456";

            String kullanici_adi, sifre;
            out.println("Kullanıcı adını giriniz:");
            kullanici_adi=input.next();
            out.println("Şifrenizi giriniz:");
            sifre=input.next();

            if (username.equals(kullanici_adi) && password.equals(sifre))
                out.println("Sisteme başarıyla girildi!");
            else
                out.println("Kullanıcı adı veya şifre yanlış!\nKontrol ederek tekarar deneyiniz.");
        }
    }

