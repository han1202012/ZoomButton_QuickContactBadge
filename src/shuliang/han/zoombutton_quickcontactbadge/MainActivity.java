package shuliang.han.zoombutton_quickcontactbadge;

import android.app.TabActivity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;

public class MainActivity extends TabActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.tab_host);
		
		TabHost tabHost = getTabHost();
		
		TabSpec spec1 = tabHost.newTabSpec("tag1");
		spec1.setIndicator("ZoomButton");
		spec1.setContent(new Intent(this, ZoomButtonActivity.class));
		tabHost.addTab(spec1);
		
		TabSpec spec2 = tabHost.newTabSpec("tag2");
		spec2.setIndicator("QuickContactBadge");
		spec2.setContent(new Intent(this, QuickContactBadgeActivity.class));
		tabHost.addTab(spec2);
		
		
	}

}
