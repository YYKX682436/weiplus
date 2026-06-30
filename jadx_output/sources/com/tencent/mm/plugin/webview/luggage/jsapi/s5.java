package com.tencent.mm.plugin.webview.luggage.jsapi;

/* loaded from: classes.dex */
public abstract class s5 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5, sd.c
    public void a(sd.b bVar) {
        org.json.JSONObject jSONObject = bVar.f406597b.f344506c;
        if (jSONObject.optLong("liteCallbackId", 0L) != 0) {
            super.a(bVar);
            return;
        }
        java.lang.String u17 = ((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).u();
        sd.d dVar = bVar.f406596a;
        sd.o0 o0Var = ((com.tencent.mm.plugin.webview.luggage.e0) dVar).f406655i;
        int i17 = o0Var != null ? o0Var.f406639r : 0;
        com.tencent.mm.plugin.webview.permission.d dVar2 = ((com.tencent.mm.plugin.webview.luggage.e0) dVar).f182178J;
        java.lang.String p17 = dVar2 != null ? dVar2.p(u17) : null;
        if (com.tencent.mm.sdk.platformtools.t8.K0(p17)) {
            p17 = u17;
        }
        com.tencent.mm.game.report.api.GameWebPerformanceInfo b17 = com.tencent.mm.game.report.api.GameWebPerformanceInfo.b(((com.tencent.mm.plugin.webview.luggage.e0) bVar.f406596a).s());
        if (b17 != null) {
            b17.f68182o = 1;
        }
        try {
            jSONObject.put("currentUrl", u17);
            jSONObject.put("shareUrl", p17);
            jSONObject.put("webviewId", i17);
            sd.d dVar3 = bVar.f406596a;
            if (((com.tencent.mm.plugin.webview.luggage.e0) dVar3).K != null) {
                jSONObject.put("preVerifyAppId", ((com.tencent.mm.plugin.webview.luggage.e0) dVar3).K.b());
            }
            if (getClass().getName().equals(com.tencent.mm.plugin.webview.luggage.jsapi.w3.class.getName())) {
                jSONObject.put("sendAppMessageScene", com.tencent.mm.plugin.webview.luggage.jsapi.w3.f182494f);
                jSONObject.put("sourceUserName", com.tencent.mm.plugin.webview.luggage.jsapi.w3.f182493e);
                com.tencent.mm.plugin.webview.luggage.jsapi.w3.f182494f = 0;
            }
        } catch (org.json.JSONException unused) {
        }
        super.a(bVar);
    }
}
