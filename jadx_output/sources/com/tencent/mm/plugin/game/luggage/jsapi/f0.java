package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes8.dex */
public class f0 extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "getGameChatRedInfo";
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public int c() {
        return 1;
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void d(android.content.Context context, java.lang.String str, com.tencent.mm.plugin.webview.luggage.jsapi.q5 q5Var) {
        int Ri = ((z53.q) ((u53.a0) i95.n0.c(u53.a0.class))).Ri();
        cl0.g gVar = new cl0.g();
        try {
            gVar.o("conversationTotalUnreadCount", Ri);
        } catch (cl0.f unused) {
        }
        if (Ri <= 0) {
            q5Var.a(null, gVar);
            return;
        }
        z53.i D0 = ((t53.m0) i95.n0.c(t53.m0.class)).Ui().D0();
        if (D0 != null) {
            java.util.ArrayList arrayList = new java.util.ArrayList();
            arrayList.add(D0.field_talker);
            ((y53.x) ((u53.y) i95.n0.c(u53.y.class))).Bi(arrayList, new com.tencent.mm.plugin.game.luggage.jsapi.e0(this, D0, q5Var, gVar));
        }
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
