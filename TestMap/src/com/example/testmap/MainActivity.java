package com.example.testmap;

import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.GooglePlayServicesUtil;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.Marker;
import com.google.android.gms.maps.model.MarkerOptions;

import android.os.Bundle;
import android.annotation.SuppressLint;
import android.app.Activity;
import android.support.v4.app.FragmentActivity;
import android.view.Menu;
import android.widget.Toast;

public class MainActivity extends FragmentActivity {

	static final LatLng HAMBURG = new LatLng(53.558, 9.927);
	static final LatLng KIEL = new LatLng(53.551, 9.993);

	private GoogleMap map;
	// Obtain the map from a MapFragment or MapView.

	 	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	
	@SuppressLint("NewApi")
	@Override
	  protected void onCreate(Bundle savedInstanceState) {
	    super.onCreate(savedInstanceState);
	    setContentView(R.layout.activity_main);
	    
	   /* int resultCode = GooglePlayServicesUtil.isGooglePlayServicesAvailable(getApplicationContext());

        if (resultCode == ConnectionResult.SUCCESS){
         Toast.makeText(getApplicationContext(), 
           "isGooglePlayServicesAvailable SUCCESS", 
           Toast.LENGTH_LONG).show();
        }else{

        	Toast.makeText(getApplicationContext(), 
        	           "isGooglePlayServicesAvailable failure", 
        	           Toast.LENGTH_LONG).show();
        }

	    map = ((MapFragment) getFragmentManager().findFragmentById(R.id.fragment1))
	        .getMap();
	    
	    if (map!=null){
	      Marker hamburg = map.addMarker(new MarkerOptions().position(HAMBURG)
	          .title("Hamburg"));
	      Marker kiel = map.addMarker(new MarkerOptions()
	          .position(KIEL)
	          .title("Kiel")
	          .snippet("Kiel is cool")
	          .icon(BitmapDescriptorFactory
	              .fromResource(R.drawable.ic_launcher)));
	    }
	    
	 // Move the camera instantly to hamburg with a zoom of 15.
	    map.moveCamera(CameraUpdateFactory.newLatLngZoom(HAMBURG, 15));

	    // Zoom in, animating the camera.
	    map.animateCamera(CameraUpdateFactory.zoomTo(10), 2000, null);*/
	  }

	 
	
	
}
