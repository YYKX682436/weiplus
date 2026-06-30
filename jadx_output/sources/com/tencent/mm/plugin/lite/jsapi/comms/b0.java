package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class b0 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        android.content.Intent intent = new android.content.Intent();
        org.json.JSONObject optJSONObject = jSONObject.has(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA) ? jSONObject.optJSONObject(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA) : null;
        if (optJSONObject != null) {
            intent.putExtra(com.tencent.liteapp.storage.WxaLiteAppInfo.KEY_EXTRA_DATA, optJSONObject.toString());
        }
        if (jSONObject.optBoolean("onlySetData")) {
            intent.putExtra("onlySetData", true);
        }
        intent.putExtra("animated", jSONObject.optBoolean("animated", true));
        com.tencent.mm.plugin.lite.LiteAppCenter.closeWindow(this.f143442e.f299024a, intent);
        this.f143443f.d(false);
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
