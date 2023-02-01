package com.example.gelensms_broadcast;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsMessage;
import android.widget.Toast;

public class GelenSms extends BroadcastReceiver {
    @Override
    public void onReceive(Context context, Intent intent)
    {
        Bundle bundle = intent.getExtras();
        if (bundle != null)
        {
            Object[]pdus= (Object[]) bundle.get("pdus");
            for (int i=0; i<pdus.length; i++) {
                SmsMessage mesaj=SmsMessage.createFromPdu((byte[]) pdus[i]);
                String gonNumara=mesaj.getDisplayOriginatingAddress();
                String msj =   mesaj.getDisplayMessageBody();
                Toast.makeText(context, "Gönderici No:" +gonNumara+ "\nMesaj : "+msj, Toast.LENGTH_LONG).show();

            }


        }
    }
}
