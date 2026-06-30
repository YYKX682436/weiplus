package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class u implements su4.j1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.websearch.a0 f181627a;

    public u(com.tencent.mm.plugin.websearch.a0 a0Var) {
        this.f181627a = a0Var;
    }

    @Override // su4.j1
    public void a(su4.d2 d2Var) {
        com.tencent.mm.plugin.websearch.w wVar;
        com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "handleCallback %s", d2Var);
        if (d2Var == null || (wVar = (com.tencent.mm.plugin.websearch.w) d2Var.f412856e) == null) {
            return;
        }
        int intValue = ((java.lang.Integer) d2Var.f412855d).intValue();
        com.tencent.mars.xlog.Log.i("FTSWebSearchLogic", "calling back to webview, id %d, reqId %s,  %s", java.lang.Integer.valueOf(intValue), wVar.f181693d, this.f181627a.f181428h);
        zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
        java.lang.String str = wVar.f181691b;
        boolean z17 = wVar.f181692c;
        java.lang.String str2 = wVar.f181693d;
        android.os.Bundle bundle = wVar.f181694e;
        ((jw4.e) l3Var).getClass();
        qx4.d0 a17 = qx4.d0.f367392m.a(intValue);
        if (a17 != null) {
            pm0.v.X(new qx4.u(bundle, str, a17, str2, z17));
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a18 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(intValue);
        a18.getClass();
        android.os.Bundle bundle2 = new android.os.Bundle();
        bundle2.putString("fts_key_req_id", str2);
        bundle2.putString("fts_key_json_data", str);
        bundle2.putBoolean("fts_key_new_query", z17);
        if (bundle != null) {
            bundle2.putBundle("fts_key_data", bundle);
        }
        try {
            com.tencent.mm.plugin.webview.stub.z0 z0Var = a18.f184998y;
            if (z0Var != null) {
                z0Var.callback(119, bundle2);
            }
        } catch (android.os.RemoteException e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + e17.getMessage());
        }
    }
}
