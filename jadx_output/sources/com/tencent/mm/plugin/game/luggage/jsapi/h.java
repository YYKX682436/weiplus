package com.tencent.mm.plugin.game.luggage.jsapi;

/* loaded from: classes5.dex */
public final class h extends com.tencent.mm.plugin.webview.luggage.jsapi.r5 {
    @Override // sd.c
    public java.lang.String b() {
        return "chatRoomAtMember";
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
            q5Var.a("invalid_params", null);
            return;
        }
        java.lang.String optString = e17.optString("chatRoomName");
        java.lang.String optString2 = e17.optString("userName");
        java.lang.String optString3 = e17.optString("nickName");
        if (com.tencent.mm.sdk.platformtools.t8.K0(optString) || com.tencent.mm.sdk.platformtools.t8.K0(optString2) || com.tencent.mm.sdk.platformtools.t8.K0(optString3)) {
            kotlin.jvm.internal.o.d(q5Var);
            q5Var.a("invalid_params", null);
            return;
        }
        s33.j0 j0Var = (s33.j0) ((t33.f) i95.n0.c(t33.f.class));
        j0Var.getClass();
        ((s33.d) ((u33.g) i95.n0.c(u33.g.class))).wi(optString2, new s33.i0(j0Var, optString2, optString));
        kotlin.jvm.internal.o.d(q5Var);
        q5Var.a(null, null);
    }

    @Override // com.tencent.mm.plugin.webview.luggage.jsapi.r5
    public void e(sd.b bVar) {
    }
}
