package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes.dex */
public final class r4 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f139743e = "sendPcRemindMsg";

    @Override // sd.c
    public java.lang.String b() {
        return this.f139743e;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 2;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        org.json.JSONObject e17 = com.tencent.mm.plugin.webview.luggage.util.g.e(str);
        if (context != null) {
            if (e17 == null) {
                kotlin.jvm.internal.o.d(q5Var);
                q5Var.a(this.f139743e + ":fail", null);
                return;
            }
            ((ly4.f) ((wc0.e) i95.n0.c(wc0.e.class))).getClass();
            ly4.e eVar = new ly4.e();
            eVar.f322290m = new com.tencent.mm.plugin.game.luggage.jsapi.p4(q5Var, this);
            eVar.f322291n = new com.tencent.mm.plugin.game.luggage.jsapi.q4(q5Var, this);
            xc0.a aVar = new xc0.a();
            aVar.fromJson(str);
            eVar.k(context, aVar);
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
