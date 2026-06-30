package com.tencent.mm.plugin.webview.core;

/* loaded from: classes8.dex */
public final class o2 implements com.tencent.mm.plugin.webview.model.l2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f181901a;

    /* renamed from: b, reason: collision with root package name */
    public com.tencent.mm.ui.widget.dialog.u3 f181902b;

    /* renamed from: c, reason: collision with root package name */
    public com.tencent.mm.plugin.webview.model.f3 f181903c;

    public o2(java.lang.ref.WeakReference weakController) {
        kotlin.jvm.internal.o.g(weakController, "weakController");
        this.f181901a = weakController;
    }

    public void a() {
        com.tencent.mm.ui.widget.dialog.u3 u3Var = this.f181902b;
        if (u3Var != null && u3Var.isShowing()) {
            u3Var.dismiss();
        }
        if (u3Var != null) {
            u3Var.setCancelMessage(null);
        }
        if (u3Var != null) {
            u3Var.setDismissMessage(null);
        }
        this.f181902b = null;
    }

    public void b(java.lang.String url, int i17) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) this.f181901a.get();
        if (e3Var == null) {
            return;
        }
        e3Var.V0(url, true, i17);
        ex4.a aVar = e3Var.f181800b1;
        if (!(aVar != null && ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) aVar).E.f257227c) || aVar == null) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) aVar;
        ex4.o oVar = webViewUI.E;
        oVar.getClass();
        if (!oVar.f257227c) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewSnapshotHelper", "exitSnapshotMode not in snap shot mode now");
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewSnapshotHelper", "exitSnapshotMode");
        oVar.f257227c = false;
        webViewUI.getController().D0(0);
        com.tencent.mm.ui.widget.MMWebView mMWebView = webViewUI.f183815f;
        if (mMWebView != null) {
            mMWebView.setVisibility(0);
        }
        android.view.ViewGroup viewGroup = oVar.f257228d;
        if (viewGroup != null) {
            viewGroup.setVisibility(8);
        }
        oVar.b();
    }

    public java.lang.String c() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) this.f181901a.get();
        if (e3Var == null) {
            return "";
        }
        java.lang.String Z = e3Var.Z();
        return !(Z == null || r26.n0.N(Z)) ? e3Var.Z() : e3Var.i();
    }

    public void d() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) this.f181901a.get();
        if (e3Var == null) {
            return;
        }
        java.util.Iterator it = e3Var.Z.iterator();
        while (it.hasNext()) {
            ((com.tencent.mm.plugin.webview.core.f3) it.next()).i();
        }
    }

    public boolean e() {
        com.tencent.mm.plugin.webview.core.e3 e3Var = (com.tencent.mm.plugin.webview.core.e3) this.f181901a.get();
        if (e3Var == null || e3Var.f181800b1 == null) {
            return false;
        }
        com.tencent.mm.plugin.webview.core.q1 q1Var = com.tencent.mm.plugin.webview.core.s1.f181972a;
        boolean z17 = com.tencent.mm.plugin.webview.core.t1.a().getInt("openSnapOauth", 1) == 1;
        com.tencent.mars.xlog.Log.i("WebViewCommand", "openSnapOauth = " + z17);
        return z17;
    }
}
