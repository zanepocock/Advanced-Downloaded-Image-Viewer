package vandy.mooc;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.util.Log;

/**
 * This abstract class extends the Activity class and overrides
 * lifecycle callbacks for logging various lifecycle events.
 */
public abstract class LifecycleLoggingActivity extends Activity {
    /**
     * Debugging tag used by the Android logger.
     */
    private final String TAG = getClass().getSimpleName();

    /**
     * Hook method called when a new instance of Activity is created.
     * One time initialization code should go here e.g. UI layout,
     * some class scope variable initialization.  if finish() is
     * called from onCreate no other lifecycle callbacks are called
     * except for onDestroy().
     *
     * @param savedInstanceState object that contains saved state information.
     */
    @Override
    public void onCreate(Bundle savedInstanceState){
        // Always call super class for necessary
        // initialization/implementation.
        super.onCreate(savedInstanceState);
		
        if(savedInstanceState != null) {
            // The activity is being re-created. Use the
            // savedInstanceState bundle for initializations either
            // during onCreate or onRestoreInstanceState().
            Log.d(TAG,
                  "onCreate(): Activity created from savedInstanceState.");
						
        } else {
            // Activity is being created anew.  No prior saved
            // instance state information available in Bundle object.
            Log.d(TAG,
                  "onCreate(): Activity created.");
        }

    }
	
    /**
     * Hook method called after onCreate() or after onRestart() (when
     * the activity is being restarted from stopped state).  Should
     * re-acquire resources relinquished when activity was stopped
     * (onStop()) or acquire those resources for the first time after
     * onCreate().
     */	
    @Override
    public void onStart(){
        // Always call super class for necessary
        // initialization/implementation.
        // DONE - you fill in here.
    	super.onStart();
    }
	
    /**
     * Hook method called after onRestoreStateInstance(Bundle) only if
     * there is a prior saved instance state in Bundle object.
     * onResume() is called immediately after onStart().  onResume()
     * is called when user resumes activity from paused state
     * (onPause()) User can begin interacting with activity.  Place to
     * start animations, acquire exclusive resources, such as the
     * camera.
     */
    @Override
    public void onResume(){
        // Always call super class for necessary
        // initialization/implementation and then log which lifecycle
        // hook method is being called.
        // DONE - you fill in here.
    	super.onResume();
    }
	
    /**
     * Hook method called when an Activity loses focus but is still
     * visible in background. May be followed by onStop() or
     * onResume().  Delegate more CPU intensive operation to onStop
     * for seamless transition to next activity.  Save persistent
     * state (onSaveInstanceState()) in case app is killed.  Often
     * used to release exclusive resources.
     */
    @Override
    public void onPause(){
        // Always call super class for necessary
        // initialization/implementation and then log which lifecycle
        // hook method is being called.
        // DONE - you fill in here.
    	super.onPause();
    }
	
    /**
     * Called when Activity is no longer visible.  Release resources
     * that may cause memory leak. Save instance state
     * (onSaveInstanceState()) in case activity is killed.
     */
    @Override
    public void onStop(){
        // Always call super class for necessary
        // initialization/implementation and then log which lifecycle
        // hook method is being called.
        // DONE - you fill in here.
    	super.onStop();
        Log.d(TAG,
                "onStop(): Activity stopped.");
    
    }
	
    /**
     * Hook method that gives a final chance to release resources and
     * stop spawned threads.  onDestroy() may not always be
     * called-when system kills hosting process
     */
    @Override
    public void onDestroy(){
        // Always call super class for necessary
        // initialization/implementation and then log which lifecycle
        // hook method is being called.
    	Log.i(TAG,"Destroying ...");
        super.onDestroy();
    }
}
