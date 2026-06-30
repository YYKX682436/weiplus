package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class o7 implements im5.a {

    /* renamed from: d, reason: collision with root package name */
    public boolean f186731d = false;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.c6 f186732e;

    public o7(com.tencent.mm.plugin.webview.ui.tools.c6 c6Var) {
        this.f186732e = c6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "<init>#OpenMaterialReleaser");
    }

    @Override // im5.a
    public void dead() {
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewMenuHelper", "dead#OpenMaterialReleaser, isKept: " + this.f186731d);
        com.tencent.mm.plugin.webview.ui.tools.c6 c6Var = this.f186732e;
        c6Var.O = null;
        c6Var.P = null;
        c6Var.Q = null;
        this.f186731d = false;
    }
}
