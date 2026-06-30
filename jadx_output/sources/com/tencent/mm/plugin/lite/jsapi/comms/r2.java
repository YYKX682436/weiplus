package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes7.dex */
public class r2 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        java.lang.String optString = jSONObject.optString("src");
        java.lang.String optString2 = jSONObject.optString(dm.i4.COL_LOCALID);
        if (!com.tencent.mm.sdk.platformtools.t8.K0(optString) || !com.tencent.mm.sdk.platformtools.t8.K0(optString2)) {
            s75.d.c(new com.tencent.mm.plugin.lite.jsapi.comms.q2(this, optString, optString2), java.lang.String.format(java.util.Locale.US, "JsApiGetImageInfo[%s]", optString), 10);
        } else {
            this.f143443f.a("invalid param");
            com.tencent.mars.xlog.Log.e("LiteAppJsApiGetAccountInfo", "invalid param");
        }
    }
}
