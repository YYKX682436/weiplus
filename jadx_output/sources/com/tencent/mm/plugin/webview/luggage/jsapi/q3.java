package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class q3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    public static org.json.JSONObject f(com.tencent.mm.plugin.webview.luggage.jsapi.q3 q3Var, java.util.Map map) {
        q3Var.getClass();
        org.json.JSONObject jSONObject = new org.json.JSONObject();
        if (map != null) {
            try {
                for (java.lang.String str : map.keySet()) {
                    jSONObject.put(str, map.get(str));
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return jSONObject;
    }

    @Override // sd.c
    public java.lang.String b() {
        return "require";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 0;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.webview.luggage.jsapi.p3(this, bVar));
    }
}
