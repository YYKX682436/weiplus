package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class g0 extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182211a;

    public g0(com.tencent.mm.plugin.webview.luggage.h0 h0Var, java.lang.String str) {
        this.f182211a = str;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("smiley", this.f182211a);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return hc1.d.NAME;
    }
}
