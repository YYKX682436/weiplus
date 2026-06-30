package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class x5 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "uploadMiniGameVideoToShare";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null || context == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("videoId");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString)) {
            q5Var.a("videoId is null", null);
            return;
        }
        ((ku5.t0) ku5.t0.f312615d).g(new com.tencent.mm.plugin.game.luggage.jsapi.w5(optString, q5Var, this, context));
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
