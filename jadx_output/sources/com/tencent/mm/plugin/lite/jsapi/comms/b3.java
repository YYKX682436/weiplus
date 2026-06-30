package com.tencent.mm.plugin.lite.jsapi.comms;

/* loaded from: classes4.dex */
public class b3 extends com.tencent.mm.plugin.lite.api.p {
    @Override // jd.b
    public void a(java.lang.String str, org.json.JSONObject jSONObject, boolean z17) {
        com.tencent.mm.autogen.events.DealQBarStrEvent dealQBarStrEvent = new com.tencent.mm.autogen.events.DealQBarStrEvent();
        java.lang.String optString = jSONObject.optString("codeString");
        int optInt = jSONObject.optInt("codeType");
        int optInt2 = jSONObject.optInt("codeVersion");
        android.app.Activity activity = (android.app.Activity) c();
        am.r3 r3Var = dealQBarStrEvent.f54079g;
        r3Var.f7781b = activity;
        r3Var.f7788i = 40;
        r3Var.f7782c = optInt;
        r3Var.f7783d = optInt2;
        r3Var.f7780a = optString;
        dealQBarStrEvent.e();
    }

    @Override // com.tencent.mm.plugin.lite.api.p
    public int z() {
        return 1;
    }
}
