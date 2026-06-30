package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public final class u extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "delMiniGameVideo";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        if (q5Var == null) {
            return;
        }
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (e17 == null) {
            q5Var.a("input data is invalidate", null);
            return;
        }
        java.lang.String optString = e17.optString("videoId");
        if (optString == null || optString.length() == 0) {
            q5Var.a("input data is invalidate", null);
            return;
        }
        ((com.tencent.mm.plugin.game.p0) ((m33.l1) i95.n0.c(m33.l1.class))).getClass();
        java.util.ArrayList arrayList = new java.util.ArrayList();
        arrayList.add(optString);
        ((p43.d) ((com.tencent.mm.plugin.game.s1) ((m33.s1) i95.n0.c(m33.s1.class))).Bi()).z0(arrayList);
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
