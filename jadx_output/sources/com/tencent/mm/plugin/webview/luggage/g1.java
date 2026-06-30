package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class g1 extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ boolean f182212a;

    public g1(com.tencent.mm.plugin.webview.luggage.h1 h1Var, boolean z17) {
        this.f182212a = z17;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("isAccessibilityMode", this.f182212a);
        } catch (org.json.JSONException unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onAccessibilityStateChange";
    }
}
