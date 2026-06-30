package h53;

/* loaded from: classes8.dex */
public class l {
    @android.webkit.JavascriptInterface
    public void error(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.GameV8JsInterface", "js console error : %s", str);
    }

    @android.webkit.JavascriptInterface
    public void log(java.lang.String str) {
        if (str == null) {
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.GameV8JsInterface", "js console log : %s", str);
    }

    @android.webkit.JavascriptInterface
    public void postMessage(java.lang.String str) {
        if (str == null) {
            return;
        }
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            java.lang.String optString = jSONObject.optString("pageId");
            org.json.JSONObject optJSONObject = jSONObject.optJSONObject("params");
            sd.u0 u0Var = (sd.u0) com.tencent.mm.plugin.webview.luggage.u1.f182629d.get(optString);
            if (u0Var == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.GameV8JsInterface", "page is null, pageId : %s", optString);
                return;
            }
            java.lang.String format = java.lang.String.format("javascript:WxGameJsCoreBridge.invokeEvent(%s)", optJSONObject.toString());
            com.tencent.mars.xlog.Log.i("MicroMsg.GameV8JsInterface", "postMessage, js = %s", format);
            u0Var.f406655i.f406633i.evaluateJavascript(format, null);
        } catch (org.json.JSONException unused) {
        }
    }
}
