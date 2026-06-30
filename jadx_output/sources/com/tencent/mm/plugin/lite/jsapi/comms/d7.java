package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes8.dex */
public class d7 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        int parseInt;
        try {
            org.json.JSONObject jSONObject2 = new org.json.JSONObject(jSONObject.getString(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA));
            org.json.JSONObject jSONObject3 = jSONObject.getJSONObject("target");
            java.lang.String string = jSONObject3.getString("type");
            org.json.JSONObject jSONObject4 = new org.json.JSONObject();
            jSONObject4.put(ya.b.SOURCE, jSONObject.getJSONObject(ya.b.SOURCE));
            jSONObject4.put(com.tencent.thumbplayer.tplayer.plugins.report.TPReportParams.PROP_KEY_DATA, jSONObject2);
            android.os.Bundle extraData = com.tencent.mm.plugin.lite.LiteAppCenter.getUICallback(this.f143442e.f299024a).getExtraData();
            if (string.equals(ya.b.SOURCE)) {
                parseInt = extraData.getInt("webviewId", -1);
            } else {
                if (!string.equals("webview") && !string.equals("gameWebview")) {
                    com.tencent.mars.xlog.Log.i("LiteAppJsApiSendMessageToSource", "Invalid target type");
                    this.f143443f.a("json exception");
                    return;
                }
                java.lang.String optString = jSONObject3.optString(dm.i4.COL_ID);
                parseInt = !optString.isEmpty() ? java.lang.Integer.parseInt(optString) : -1;
            }
            if (parseInt == -1) {
                com.tencent.mars.xlog.Log.e("LiteAppJsApiSendMessageToSource", "Invalid target id");
                this.f143443f.a("Invalid target id");
                return;
            }
            com.tencent.mm.plugin.webview.model.SendDataToH5Event sendDataToH5Event = new com.tencent.mm.plugin.webview.model.SendDataToH5Event(parseInt, "onLiteAppMessage", jSONObject4);
            com.tencent.liteapp.gen.LiteAppOpenScene fromValue = com.tencent.liteapp.gen.LiteAppOpenScene.fromValue(extraData.getInt("openScene", -1));
            if (fromValue != com.tencent.liteapp.gen.LiteAppOpenScene.WEB_VIEW && !string.equals("webview")) {
                if (fromValue != com.tencent.liteapp.gen.LiteAppOpenScene.GAME && !string.equals("gameWebview")) {
                    com.tencent.mars.xlog.Log.e("LiteAppJsApiSendMessageToSource", "Invalid open scene");
                    this.f143443f.a("Invalid open scene");
                    return;
                }
                com.tencent.mm.plugin.webview.model.SendDataToH5Event.f(sendDataToH5Event);
                this.f143443f.d(false);
            }
            com.tencent.mm.plugin.webview.model.SendDataToH5Event.g(sendDataToH5Event);
            this.f143443f.d(false);
        } catch (org.json.JSONException unused) {
            this.f143443f.a("json exception");
            com.tencent.mars.xlog.Log.e("LiteAppJsApiSendMessageToSource", "json exception");
        }
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
