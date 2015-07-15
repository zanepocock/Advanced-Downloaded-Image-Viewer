package vandy.mooc;

import android.net.Uri;
import android.util.Log;

public class FilterImageActivity extends GenericImageActivity{

    protected final String TAG = getClass().getSimpleName();

    @Override
    public Uri doInBackGroundHook(Uri url) {
        Log.i(TAG, "Filtering image ...");
        return Utils.grayScaleFilter(this, url);
    }
}
