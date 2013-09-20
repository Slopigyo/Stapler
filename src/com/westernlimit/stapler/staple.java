package com.westernlimit.stapler;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;



public class staple extends Activity implements OnClickListener {
	
	private ImageButton mButton;                                 //create the button for stapler
	MediaPlayer mpStapleClick;								//create mp for click sound
	
	
	@Override
	public void onCreate(Bundle bundle) { 					//required for android activity
		super.onCreate(bundle);
		initializeLayout();
		mpStapleClick = MediaPlayer.create(this, R.raw.staple);
		
		
	}
	
	
	
	
	private void initializeLayout() {
		setContentView(R.layout.activity_stapled);           //links the layout with this activity
		mButton = (ImageButton)findViewById(R.id.staple_button);  //links Java Button with xml button id
		mButton.setOnClickListener(this);                    //listen for clicks on this button
				
	}
	
	@Override
	public void onClick(View v) {
		switch(v.getId()) {
		case R.id.staple_button :
			mpStapleClick.start();
			
			
			
			break;
		}
	}
}
