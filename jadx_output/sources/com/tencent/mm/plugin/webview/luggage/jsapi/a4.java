package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public class a4 extends com.tencent.mm.plugin.webview.luggage.jsapi.s5 {
    @Override // sd.c
    public java.lang.String b() {
        return "setBounceBackground";
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
        com.tencent.mars.xlog.Log.i("MicroMsg.JsApiSetBounceBackground", "invokeInOwn");
        java.lang.String optString = bVar.f406597b.f344506c.optString("backgroundColor");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            bVar.c("invalid_data", null);
            return;
        }
        com.tencent.mm.plugin.webview.luggage.e0 e0Var = (com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a;
        e0Var.M.post(new com.tencent.mm.plugin.webview.luggage.v0(e0Var, optString));
        bVar.a();
    }
}
