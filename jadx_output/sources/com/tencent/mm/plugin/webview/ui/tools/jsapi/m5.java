package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class m5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 f185277d;

    public m5(com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var) {
        this.f185277d = c1Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.jsapi.c1 c1Var = this.f185277d;
        i11.e eVar = c1Var.Q;
        if (eVar != null) {
            ((i11.h) eVar).m(c1Var.R);
        }
        if (c1Var.R == null) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MsgHandler", "already callback");
        } else {
            c1Var.R = null;
            c1Var.i5(c1Var.f184976e, "geo_location:fail_timeout", null);
        }
    }
}
