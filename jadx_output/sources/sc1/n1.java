package sc1;

/* loaded from: classes7.dex */
public abstract class n1 {
    public static android.os.Bundle a(org.json.JSONObject jSONObject) {
        java.util.Objects.toString(jSONObject);
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_PLAY_URL, e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("mode")) {
                bundle.putInt("mode", jSONObject.getInt("mode"));
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "mode", e18.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY));
            }
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_AUTO_PLAY, e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("muted")) {
                bundle.putBoolean("muted", jSONObject.getBoolean("muted"));
            }
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "muted", e27.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO));
            }
        } catch (org.json.JSONException e28) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_AUDIO, e28.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO));
            }
        } catch (org.json.JSONException e29) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MUTE_VIDEO, e29.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("orientation")) {
                bundle.putString("orientation", jSONObject.getString("orientation"));
            }
        } catch (org.json.JSONException e37) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "orientation", e37.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT));
            }
        } catch (org.json.JSONException e38) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_OBJECTFIT, e38.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE)) {
                bundle.putFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE)).floatValue());
            }
        } catch (org.json.JSONException e39) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MIN_CACHE, e39.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE)) {
                bundle.putFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE)).floatValue());
            }
        } catch (org.json.JSONException e47) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_MAX_CACHE, e47.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE));
            }
        } catch (org.json.JSONException e48) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_ENABLE_RECV_MESSAGE, e48.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("needAudioVolume")) {
                bundle.putBoolean("needAudioVolume", jSONObject.getBoolean("needAudioVolume"));
            }
        } catch (org.json.JSONException e49) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "needAudioVolume", e49.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("debug")) {
                bundle.putBoolean("debug", jSONObject.getBoolean("debug"));
            }
        } catch (org.json.JSONException e57) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "debug", e57.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE));
            }
        } catch (org.json.JSONException e58) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_SOUND_MODE, e58.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("needEvent")) {
                bundle.putBoolean("needEvent", jSONObject.getBoolean("needEvent"));
            }
        } catch (org.json.JSONException e59) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "needEvent", e59.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("autoPauseIfNavigate")) {
                bundle.putBoolean("autoPauseIfNavigate", jSONObject.getBoolean("autoPauseIfNavigate"));
            }
        } catch (org.json.JSONException e66) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "autoPauseIfNavigate", e66.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("autoPauseIfOpenNative")) {
                bundle.putBoolean("autoPauseIfOpenNative", jSONObject.getBoolean("autoPauseIfOpenNative"));
            }
        } catch (org.json.JSONException e67) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "autoPauseIfOpenNative", e67.getLocalizedMessage());
        }
        return bundle;
    }

    public static android.os.Bundle b(org.json.JSONObject jSONObject) {
        java.util.Objects.toString(jSONObject);
        android.os.Bundle bundle = new android.os.Bundle();
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_PUSH_URL, e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("mode")) {
                bundle.putInt("mode", jSONObject.getInt("mode"));
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "mode", e18.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH));
            }
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUTO_PUSH, e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY));
            }
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_QUALITY, e27.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("muted")) {
                bundle.putBoolean("muted", jSONObject.getBoolean("muted"));
            }
        } catch (org.json.JSONException e28) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "muted", e28.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA));
            }
        } catch (org.json.JSONException e29) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_CAMERA, e29.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC));
            }
        } catch (org.json.JSONException e37) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_MIC, e37.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("enableAGC")) {
                bundle.putBoolean("enableAGC", jSONObject.getBoolean("enableAGC"));
            }
        } catch (org.json.JSONException e38) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "enableAGC", e38.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("enableANS")) {
                bundle.putBoolean("enableANS", jSONObject.getBoolean("enableANS"));
            }
        } catch (org.json.JSONException e39) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "enableANS", e39.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR));
            }
        } catch (org.json.JSONException e47) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ENABLE_EAR_MONITOR, e47.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE));
            }
        } catch (org.json.JSONException e48) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_VOLUME_TYPE, e48.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE));
            }
        } catch (org.json.JSONException e49) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_AUDIO_REVERB_TYPE, e49.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH));
            }
        } catch (org.json.JSONException e57) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_WIDTH, e57.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT));
            }
        } catch (org.json.JSONException e58) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_RESOLUTION_HEIGHT, e58.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE));
            }
        } catch (org.json.JSONException e59) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FOCUS_MODE, e59.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("orientation")) {
                bundle.putString("orientation", jSONObject.getString("orientation"));
            }
        } catch (org.json.JSONException e66) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "orientation", e66.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY));
            }
        } catch (org.json.JSONException e67) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY, e67.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE));
            }
        } catch (org.json.JSONException e68) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_BEAUTY_STYLE, e68.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE));
            }
        } catch (org.json.JSONException e69) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FILTER_IMAGE, e69.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS));
            }
        } catch (org.json.JSONException e76) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WHITENESS, e76.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ASPECT)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ASPECT, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ASPECT));
            }
        } catch (org.json.JSONException e77) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ASPECT, e77.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE));
            }
        } catch (org.json.JSONException e78) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIN_BITRATE, e78.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE));
            }
        } catch (org.json.JSONException e79) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MAX_BITRATE, e79.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM));
            }
        } catch (org.json.JSONException e86) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_ZOOM, e86.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("debug")) {
                bundle.putBoolean("debug", jSONObject.getBoolean("debug"));
            }
        } catch (org.json.JSONException e87) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "debug", e87.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIRROR)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIRROR, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIRROR));
            }
        } catch (org.json.JSONException e88) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_MIRROR, e88.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR));
            }
        } catch (org.json.JSONException e89) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_REMOTE_MIRROR, e89.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR));
            }
        } catch (org.json.JSONException e96) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_LOCAL_MIRROR, e96.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT)) {
                bundle.putFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT)).floatValue());
            }
        } catch (org.json.JSONException e97) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_LEFT, e97.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP)) {
                bundle.putFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP)).floatValue());
            }
        } catch (org.json.JSONException e98) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_TOP, e98.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH)) {
                bundle.putFloat(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH, java.math.BigDecimal.valueOf(jSONObject.getDouble(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH)).floatValue());
            }
        } catch (org.json.JSONException e99) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_WATERMARK_WIDTH, e99.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION)) {
                bundle.putString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, jSONObject.getString(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION));
            }
        } catch (org.json.JSONException e100) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_DEVICE_POSITION, e100.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT)) {
                bundle.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT));
            }
        } catch (org.json.JSONException e101) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_NEED_BGM_EVENT, e101.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("needAudioVolume")) {
                bundle.putBoolean("needAudioVolume", jSONObject.getBoolean("needAudioVolume"));
            }
        } catch (org.json.JSONException e102) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "needAudioVolume", e102.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE));
            }
        } catch (org.json.JSONException e103) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_VOICE_CHANGER_TYPE, e103.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS)) {
                bundle.putInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, jSONObject.getInt(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS));
            }
        } catch (org.json.JSONException e104) {
            com.tencent.mars.xlog.Log.i("TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PUSHER_KEY_FPS, e104.getLocalizedMessage());
        }
        return bundle;
    }
}
