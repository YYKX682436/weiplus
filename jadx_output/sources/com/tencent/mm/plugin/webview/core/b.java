package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class b implements com.tencent.mm.plugin.webview.core.y0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f181760a;

    public b(java.lang.ref.WeakReference weakController) {
        kotlin.jvm.internal.o.g(weakController, "weakController");
        this.f181760a = weakController;
    }

    @Override // com.tencent.mm.plugin.webview.core.y0
    public void a(com.tencent.mm.plugin.webview.core.x0 conn) {
        kotlin.jvm.internal.o.g(conn, "conn");
        com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f181760a.get();
        if (r0Var == null) {
            return;
        }
        if (r0Var.v0()) {
            com.tencent.mars.xlog.Log.i(r0Var.T(), "WebView-Trace onConnected when destroyCalled");
            return;
        }
        zw4.n.f476934a.b(zw4.a.f476885m, r0Var.f181928g);
        r0Var.G0 = conn;
        com.tencent.mm.plugin.webview.stub.v0 v0Var = ((com.tencent.mm.plugin.webview.core.k3) conn).f181864d.f181880g;
        kotlin.jvm.internal.o.d(v0Var);
        r0Var.A = v0Var;
        r0Var.g0().f340899m = r0Var.e0();
        com.tencent.mm.plugin.webview.stub.v0 e07 = r0Var.e0();
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) r0Var;
        com.tencent.mars.xlog.Log.i(e3Var.o1(), "onServiceConnected, invoker == null ? %b", java.lang.Boolean.FALSE);
        try {
            e07.rg(e3Var.j1(), e3Var.j1().e());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e(e3Var.o1(), "addCallback fail, ex = %s", e17.getMessage());
        }
        com.tencent.mars.xlog.Log.i(r0Var.T(), "WebView-Trace tryBindService#" + r0Var.U() + " checkStatus CONTROLLER_INVOKER_READY");
        hy4.l0 l0Var = r0Var.f181934j;
        if (l0Var != null) {
            l0Var.f286159i = java.lang.System.currentTimeMillis();
        }
        if (r0Var.E0.contains(kotlin.jvm.internal.i0.a(com.tencent.mm.plugin.webview.core.BaseWebViewController$Bind.class).g())) {
            r0Var.C0();
        } else {
            r0Var.I(r0Var.f181931h0);
        }
    }

    @Override // com.tencent.mm.plugin.webview.core.y0
    public boolean b() {
        boolean z17;
        boolean z18;
        com.tencent.mm.plugin.webview.core.r0 r0Var = (com.tencent.mm.plugin.webview.core.r0) this.f181760a.get();
        if (r0Var == null) {
            return false;
        }
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) r0Var;
        com.tencent.mars.xlog.Log.i(e3Var.o1(), "edw onServiceDisconnected");
        java.util.Iterator it = e3Var.X.iterator();
        while (true) {
            if (!it.hasNext()) {
                z17 = false;
                break;
            }
            if (((com.tencent.mm.plugin.webview.core.i3) it.next()).u()) {
                z17 = true;
                break;
            }
        }
        if (z17) {
            z18 = false;
        } else {
            com.tencent.mars.xlog.Log.i(e3Var.o1(), "maybe mm process crash, try rebind service");
            z18 = true;
        }
        return z18;
    }
}
