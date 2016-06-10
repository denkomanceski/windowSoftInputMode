import org.apache.cordova.CordovaWebView;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.apache.cordova.CordovaInterface;
import android.util.Log;
import android.provider.Settings;
import android.widget.Toast;
import android.view.WindowManager;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class windowSoftManager extends CordovaPlugin {

public static final String TAG = "Window Soft Manager";

/**
* Constructor.
*/
public windowSoftManager() {}

/**
* Sets the context of the Command. This can then be used to do things like
* get file paths associated with the Activity.
*
* @param cordova The context of the main Activity.
* @param webView The CordovaWebView Cordova is running in.
*/

  public void initialize(CordovaInterface cordova, CordovaWebView webView) {
  super.initialize(cordova, webView);
  }

  public boolean execute(final String action, JSONArray args, CallbackContext callbackContext) throws JSONException {
  final int duration = Toast.LENGTH_SHORT;
  cordova.getActivity().runOnUiThread(new Runnable() {
    public void run() {
      if(action.equals("adjustPan"))
        cordova.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_PAN);
      else if(action.equals("adjustResize"))
        cordova.getActivity().getWindow().setSoftInputMode(WindowManager.LayoutParams.SOFT_INPUT_ADJUST_RESIZE);
    }
  });

  return true;
  }
}
