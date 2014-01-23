package shuliang.han.zoombutton_quickcontactbadge;

import android.app.Activity;
import android.os.Bundle;
import android.widget.QuickContactBadge;
import shuliang.han.zoombutton_quickcontactbadge.R;

public class QuickContactBadgeActivity extends Activity {

	private QuickContactBadge badge;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.quick_contact_badge);
		
		badge = (QuickContactBadge) findViewById(R.id.badge);
		badge.assignContactFromPhone("120", false);
		
	}
	
}
