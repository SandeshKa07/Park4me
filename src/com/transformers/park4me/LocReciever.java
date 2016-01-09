package com.transformers.park4me;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;

import com.littlefluffytoys.littlefluffylocationlibrary.LocationInfo;
import com.littlefluffytoys.littlefluffylocationlibrary.LocationLibraryConstants;

public class LocReciever extends BroadcastReceiver {
	
	private float lat,lon;
	@Override
	public void onReceive(Context context, Intent intent) {
		Log.d("FluffyBroadcastReceiver",
				"onReceive(): received location update");

		final LocationInfo locationInfo = (LocationInfo) intent
				.getSerializableExtra(LocationLibraryConstants.LOCATION_BROADCAST_EXTRA_LOCATIONINFO);
		lat = locationInfo.lastLat;
		
		// do something whit the new location
		// doSomething(String.valueOf(locationInfo.lastLong),String.valueOf(locationInfo.lastLat),String.valueOf(locationInfo.lastAccuracy));
	}
	
	public float getLat(){
		return lat;
	}
	public float getLon(){
		return lon;
	}
}