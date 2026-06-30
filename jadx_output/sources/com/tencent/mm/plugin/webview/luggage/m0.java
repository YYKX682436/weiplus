package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class m0 extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.luggage.n0 f182555a;

    public m0(com.tencent.mm.plugin.webview.luggage.n0 n0Var) {
        this.f182555a = n0Var;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("height", this.f182555a.f182577d);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onGetKeyboardHeight";
    }
}
