package com.tencent.mm.plugin.game.luggage.liteapp;

/* loaded from: classes.dex */
public class LiteLuggageGameJsRuntimeImpl extends h53.p {
    private static final java.lang.String TAG = "LiteLuggageGameJsRuntimeImpl";
    nw4.e mCallbackHandler;

    public LiteLuggageGameJsRuntimeImpl(android.content.Context context) {
        super(context);
    }

    @Override // h53.p, od.p
    public void evaluateJavascript(java.lang.String str, android.webkit.ValueCallback<java.lang.String> valueCallback) {
        org.json.JSONObject optJSONObject;
        try {
            org.json.JSONObject optJSONObject2 = new org.json.JSONObject(str).optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA);
            new org.json.JSONObject();
            if (optJSONObject2 == null || (optJSONObject = optJSONObject2.optJSONObject(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA)) == null) {
                return;
            }
            java.util.Iterator<java.lang.String> keys = optJSONObject.keys();
            java.util.HashMap hashMap = new java.util.HashMap();
            while (keys.hasNext()) {
                java.lang.String next = keys.next();
                hashMap.put(next, optJSONObject.get(next));
            }
            this.mCallbackHandler.e(java.lang.String.valueOf(optJSONObject2.optLong("liteCallbackId", 0L)), optJSONObject2.optString("error", ""), hashMap);
        } catch (org.json.JSONException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace(TAG, e17, "JSONException", new java.lang.Object[0]);
        }
    }

    public LiteLuggageGameJsRuntimeImpl(android.content.Context context, nw4.e eVar) {
        super(context);
        this.mCallbackHandler = eVar;
    }
}
