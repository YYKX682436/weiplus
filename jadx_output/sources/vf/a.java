package vf;

/* loaded from: classes7.dex */
public abstract class a {
    public static android.os.Bundle a(org.json.JSONObject jSONObject) {
        android.os.Bundle a17 = sc1.n1.a(jSONObject);
        try {
            if (jSONObject.has("referrer")) {
                a17.putString("referrer", jSONObject.getString("referrer"));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", "referrer", e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY)) {
                a17.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY));
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.PLAYER_KEY_CAN_AUTO_PLAY, e18.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP)) {
                a17.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP));
            }
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePlayerParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP, e19.getLocalizedMessage());
        }
        return a17;
    }

    public static android.os.Bundle b(org.json.JSONObject jSONObject) {
        android.os.Bundle b17 = sc1.n1.b(jSONObject);
        try {
            if (jSONObject.has("customEffect")) {
                b17.putBoolean("customEffect", jSONObject.getBoolean("customEffect"));
            }
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "customEffect", e17.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("skinWhiteness")) {
                b17.putFloat("skinWhiteness", java.math.BigDecimal.valueOf(jSONObject.getDouble("skinWhiteness")).floatValue());
            }
        } catch (org.json.JSONException e18) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "skinWhiteness", e18.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("skinSmoothness")) {
                b17.putFloat("skinSmoothness", java.math.BigDecimal.valueOf(jSONObject.getDouble("skinSmoothness")).floatValue());
            }
        } catch (org.json.JSONException e19) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "skinSmoothness", e19.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("faceThinness")) {
                b17.putFloat("faceThinness", java.math.BigDecimal.valueOf(jSONObject.getDouble("faceThinness")).floatValue());
            }
        } catch (org.json.JSONException e27) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "faceThinness", e27.getLocalizedMessage());
        }
        try {
            if (jSONObject.has("eyeBigness")) {
                b17.putFloat("eyeBigness", java.math.BigDecimal.valueOf(jSONObject.getDouble("eyeBigness")).floatValue());
            }
        } catch (org.json.JSONException e28) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", "eyeBigness", e28.getLocalizedMessage());
        }
        try {
            if (jSONObject.has(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP)) {
                b17.putBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP, jSONObject.getBoolean(com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP));
            }
        } catch (org.json.JSONException e29) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TXLiveParamUtil", "convertLivePusherParams param=%s exp=%s", com.tencent.live2.jsplugin.V2TXJSAdapterConstants.IS_VOIP, e29.getLocalizedMessage());
        }
        return b17;
    }
}
