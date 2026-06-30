package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public final class n implements su4.j1 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.websearch.n f181571a = new com.tencent.mm.plugin.websearch.n();

    @Override // su4.j1
    public final void a(su4.d2 d2Var) {
        java.lang.Object obj = d2Var.f412855d;
        if ((obj instanceof su4.r1) && (d2Var.f412856e instanceof java.lang.String)) {
            kotlin.jvm.internal.o.e(obj, "null cannot be cast to non-null type com.tencent.mm.plugin.websearch.api.NetSceneRequestModel");
            su4.r1 r1Var = (su4.r1) obj;
            zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
            int i17 = r1Var.f413077q;
            java.lang.Object obj2 = d2Var.f412856e;
            kotlin.jvm.internal.o.e(obj2, "null cannot be cast to non-null type kotlin.String");
            java.lang.String str = r1Var.f413085y;
            ((jw4.e) l3Var).getClass();
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(i17);
            a17.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("fts_key_json_data", (java.lang.String) obj2);
            bundle.putString("fts_key_req_id", str);
            try {
                com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
                if (z0Var != null) {
                    z0Var.callback(127, bundle);
                }
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onChatSearchDataReady exception" + e17.getMessage());
            }
        }
    }
}
