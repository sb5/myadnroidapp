package com.example.fartgallery;

import java.io.ByteArrayInputStream;

import com.example.fartgallery.R;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.CountDownTimer;
import android.os.Handler;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.view.Menu;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends Activity {
int myClickCount = 0;
TextView score;
TextView time;
ImageView nice;
Boolean a, b, c ,d = false;

	public void countClick(){
	    myClickCount++;
			score.setText(""+ myClickCount);
			final ImageView nice = (ImageView) findViewById(R.id.niceImageView);

			if(myClickCount == 5 || myClickCount == 30  ){
				if(myClickCount == 5){	
				nice.setImageResource(R.drawable.nice);
				}
				else{	
				nice.setImageResource(R.drawable.smelly);
				}
				
				
				 new Handler().postDelayed(new Runnable() {

					    public void run() {

					 	   nice.setImageResource(R.drawable.white);

					       
					    }

					 }, 3000L);    // 2 Seconds
				
				
				
	}
			
			
			
	}

	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	
			
		 final ImageButton butt1;

		 final  ImageButton butt2;
		 final ImageButton butt3;
		 final  ImageButton butt4;
		  final  ImageButton butt5;
		  
		  final  ImageButton butt6;
		  final MediaPlayer soundOne;
		 
		super.onCreate(savedInstanceState);
	
		
		
		class MalibuCountDownTimer extends CountDownTimer
		{

			public MalibuCountDownTimer(long startTime, long interval)
				{
					super(startTime, interval);
				}

			@Override
			public void onFinish()
				{
				Intent gameOverIntent = new Intent("com.example.fartgallery.GAMEOVER");
				startActivity(gameOverIntent);
				//	time.setText("Time Elapsed: " + String.valueOf(300000));
				}

			@Override
			public void onTick(long millisUntilFinished)
				{
					time.setText(""+millisUntilFinished/1000);
				
				}
		}
		
		CountDownTimer myTimer = new MalibuCountDownTimer(10000, 1000);
		myTimer.start();
setContentView(R.layout.activity_main);
score = (TextView) findViewById(R.id.textView2);
time = (TextView) findViewById(R.id.textView4);
		 butt1 = (ImageButton) findViewById(R.id.imageButton1);
	
	       butt2 = (ImageButton) findViewById(R.id.imageButton2);
	       butt3 = (ImageButton) findViewById(R.id.imageButton3);
	      butt4 = (ImageButton) findViewById(R.id.imageButton4);
	   butt5  = (ImageButton) findViewById(R.id.imageButton5);
	   butt6   = (ImageButton) findViewById(R.id.imageButton6);


	    	soundOne = MediaPlayer.create(this, R.raw.one);
	    	final MediaPlayer soundTwo = MediaPlayer.create(this, R.raw.two);
	    	final MediaPlayer soundThree = MediaPlayer.create(this, R.raw.three);
	    	final MediaPlayer soundFour = MediaPlayer.create(this, R.raw.four);
	    	final MediaPlayer soundFive = MediaPlayer.create(this, R.raw.five);
	    	final MediaPlayer soundSix = MediaPlayer.create(this, R.raw.six);
	       
	    	

	    
	
	    	 butt1.setOnClickListener(new View.OnClickListener() {
	    	        
	 			@Override
	 			public void onClick(View v) {
	 				 countClick();
	
	 			
	 		
	 					soundOne.start();
	 				
	 				
	 		 		
	 		 		
	 		 	
	 		 		
	 		 		//switch to second img	 
	 		 			 butt1.setImageResource(R.drawable.cloud1);
	 		 //switch back to first after pause
	 		 	
	 		 new Handler().postDelayed(new Runnable() {

	 		    public void run() {

	 		 	   butt1.setImageResource(R.drawable.picone);

	 		        // Button Click Code Here
	 		    }

	 		 }, 500L);    // 0.5 Seconds

	 		 		
	 		 			
	 		
	 		}
	 	
	         
	         
	     });
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	    	 
	         //2
	         butt2.setOnClickListener(new View.OnClickListener() {
	             
	 			@Override
	 			public void onClick(View v) {
	 				
	 				countClick();
	 		soundTwo.start();
	 		
	 		//switch to second img	 
	 			 butt2.setImageResource(R.drawable.cloud2);
	 //switch back to first after pause
	 	
	 new Handler().postDelayed(new Runnable() {

	    public void run() {

	 	   butt2.setImageResource(R.drawable.pictwo);

	        // Button Click Code Here
	    }

	 }, 500L);    // 0.5 Seconds

	 		
	 			}
	 	
	         
	         
	     });
	         //3
	         
	         butt3.setOnClickListener(new View.OnClickListener() {
	             
	 			@Override
	 			public void onClick(View v) {
	 				countClick();
	 		soundThree.start();
	 		
	 		//switch to second img	 
	 			 butt3.setImageResource(R.drawable.cloud3);
	 //switch back to first after pause
	 	
	 new Handler().postDelayed(new Runnable() {

	    public void run() {

	 	   butt3.setImageResource(R.drawable.picthree);

	        // Button Click Code Here
	    }

	 }, 2000L);    // 2 Seconds

	 		
	 			}
	 	
	         
	         
	     });
	         //4
	         butt4.setOnClickListener(new View.OnClickListener() {
	             
	 			@Override
	 			public void onClick(View v) {
	 				countClick();
	 				
	 		soundFour.start();
	 		
	 		//switch to second img	 
	 			 butt4.setImageResource(R.drawable.cloud4);
	 //switch back to first after pause
	 	
	 new Handler().postDelayed(new Runnable() {

	    public void run() {

	 	   butt4.setImageResource(R.drawable.picfour);

	        // Button Click Code Here
	    }

	 }, 500L);    // 0.5 Seconds

	 		
	 			}
	 	
	         
	         
	     });
	         butt5.setOnClickListener(new View.OnClickListener() {
	             
	 			@Override
	 			public void onClick(View v) {
	 				countClick();
	 		soundFive.start();
	 		
	 		//switch to second img	 
	 			 butt5.setImageResource(R.drawable.cloud5);
	 //switch back to first after pause
	 	
	 new Handler().postDelayed(new Runnable() {

	    public void run() {

	 	   butt5.setImageResource(R.drawable.picfive);

	        // Button Click Code Here
	    }

	 }, 500L);    // 0.5 Seconds

	 		
	 			}
	 	
	         
	         
	     });
	         butt6.setOnClickListener(new View.OnClickListener() {
	             
	 			@Override
	 			public void onClick(View v) {
	 				countClick();
	 		soundSix.start();
	 		
	 		//switch to second img	 
	 			 butt6.setImageResource(R.drawable.cloud6);
	 //switch back to first after pause
	 	
	 new Handler().postDelayed(new Runnable() {

	    public void run() {

	 	   butt6.setImageResource(R.drawable.picsix);

	        // Button Click Code Here
	    }

	 }, 500L);    // 0.5 Seconds

	 		
	 			}
	 	
	         
	         
	     });
	         


	       



	

	}

}
