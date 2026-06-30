package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class r3 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "recordOperateUserData";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            kotlin.jvm.internal.o.d(q5Var);
            q5Var.a("fail", null);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiRecordOperateUserData", "data: " + e17);
        java.lang.String optString = e17.optString("datalist");
        if (optString != null) {
            cf.f.b(new cl0.e(optString), com.tencent.mm.plugin.game.luggage.jsapi.q3.f139738d);
        }
        kotlin.jvm.internal.o.d(q5Var);
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
