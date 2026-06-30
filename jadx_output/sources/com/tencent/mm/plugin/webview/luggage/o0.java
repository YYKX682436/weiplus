package com.tencent.mm.plugin.webview.luggage;

/* loaded from: classes8.dex */
public class o0 extends sd.e {
    public o0(com.tencent.mm.plugin.webview.luggage.p0 p0Var) {
    }

    @Override // sd.e
    public org.json.JSONObject a() {
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        try {
            jSONObject.put("height", 0);
        } catch (java.lang.Exception unused) {
        }
        return jSONObject;
    }

    @Override // sd.e
    public java.lang.String b() {
        return "onGetKeyboardHeight";
    }
}
