package vandy.mooc;

import android.net.Uri;
import android.util.Log;

public class DownloadImageActivity extends GenericImageActivity {

    protected final String TAG = getClass().getSimpleName();

    @Override
    public Uri doInBackGroundHook(Uri url) {
        Log.i(TAG, "Downloading image ...");
        return Utils.downloadImage(this, url);
    }
}