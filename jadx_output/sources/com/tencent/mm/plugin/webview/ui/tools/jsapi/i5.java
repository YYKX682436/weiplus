package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class i5 implements d85.k0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185192a;

    public i5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185192a = c1Var;
    }

    @Override // d85.k0
    public void onOp(java.lang.Boolean bool) {
        boolean booleanValue = bool.booleanValue();
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185192a;
        if (booleanValue) {
            c1Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onBusinessPermissionGranted!");
            ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
            c1Var.E5();
            return;
        }
        c1Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "onBusinessPermissionDenied");
        ((d85.d1) ((d85.m0) i95.n0.c(d85.m0.class))).pj(d85.f0.S);
        c1Var.i5(c1Var.f184976e, "geo_location:fail_business_permission", null);
    }
}
