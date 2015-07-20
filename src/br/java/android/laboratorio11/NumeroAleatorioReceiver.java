package br.java.android.laboratorio11;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class NumeroAleatorioReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context contextParam, Intent intentParam) {
		// A fun��o desse Receiver nada mais � do que um inicializador
		// do servi�o
		
		Intent intent = new Intent(contextParam,NumeroAleatorioReceiver.class);
		contextParam.startService(intent);
	}
}
