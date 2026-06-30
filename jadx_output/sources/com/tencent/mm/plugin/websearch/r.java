package com.tencent.mm.plugin.websearch;

/* loaded from: classes.dex */
public class r implements com.tencent.mm.modelbase.e3 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f181606d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181607e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f181608f;

    public r(com.tencent.mm.plugin.websearch.a0 a0Var, int i17, java.lang.String str, java.lang.String str2) {
        this.f181606d = i17;
        this.f181607e = str;
        this.f181608f = str2;
    }

    @Override // com.tencent.mm.modelbase.e3
    public int callback(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.o oVar, com.tencent.mm.modelbase.m1 m1Var) {
        if (m1Var.getType() != 2608) {
            return 0;
        }
        if (i17 != 0 || i18 != 0) {
            com.tencent.mars.xlog.Log.e("FTSWebSearchLogic", "getPoiInfo onSceneEnd errType:" + i17 + " errCode:" + i18 + " will retry");
            return 0;
        }
        if (oVar != null) {
            r45.ix5 ix5Var = (r45.ix5) oVar.f70711b.f70700a;
            zg0.l3 l3Var = (zg0.l3) i95.n0.c(zg0.l3.class);
            java.lang.String str2 = ix5Var.f377396d;
            ((jw4.e) l3Var).getClass();
            com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 a17 = com.tencent.mm.plugin.webview.ui.tools.jsapi.k8.a(this.f181606d);
            a17.getClass();
            android.os.Bundle bundle = new android.os.Bundle();
            bundle.putString("searchId", this.f181607e);
            bundle.putString("poiId", this.f181608f);
            bundle.putString("json", str2);
            try {
                com.tencent.mm.plugin.webview.stub.z0 z0Var = a17.f184998y;
                if (z0Var != null) {
                    z0Var.callback(145, bundle);
                }
            } catch (android.os.RemoteException e17) {
                com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "onGetPoiReady exception" + e17.getMessage());
            }
        }
        return 0;
    }
}
