package com.example.fartgallery;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;

public class splash extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		
		setContentView(R.layout.splash);
		Thread logotimer = new Thread(){
			public void run(){
				try{
					sleep(3000);
					Intent galleryIntent = new Intent("com.example.fartgallery.GAMEOVER");
				//	Intent galleryIntent = new Intent("com.example.fartgallery.GALLERY");
					startActivity(galleryIntent);
					
				}
				catch(InterruptedException e){
				e.printStackTrace();
				}
				
				finally{
					
					finish();
				}
			}
			
		};
		logotimer.start();
		
		
		
	}
	
	

}
