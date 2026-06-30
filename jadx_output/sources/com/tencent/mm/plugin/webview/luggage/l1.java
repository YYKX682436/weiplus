package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class l1 extends sd.e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182552a;

    public l1(com.tencent.mm.plugin.webview.luggage.e0 e0Var, java.lang.String str) {
        this.f182552a = str;
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("state", this.f182552a);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "activity:state_change";
    }
}
