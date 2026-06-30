package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes.dex */
public class j4 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenWeClawChatPage", "invoke sendTextMessage, appId=%s, data=%s", str, jSONObject);
        if (jSONObject == null) {
            this.f143443f.a("param is null");
            return;
        }
        java.lang.String optString = jSONObject.optString(dm.i4.COL_USERNAME);
        if (android.text.TextUtils.isEmpty(optString)) {
            com.tencent.mars.xlog.Log.e("LiteAppJsApiOpenWeClawChatPage", "LiteAppJsApiOpenWeClawChatPage fail, username is empty");
            this.f143443f.a("username is empty");
        } else {
            ((c01.k7) c01.n8.a()).b(optString, 12, new com.tencent.mm.plugin.lite.jsapi.comms.i4(this));
            com.tencent.mars.xlog.Log.i("LiteAppJsApiOpenWeClawChatPage", "get contact");
        }
    }
}
