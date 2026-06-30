package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public class p2 extends com.tencent.xweb.s0 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.ui.widget.MMWebView f187491b;

    /* renamed from: a, reason: collision with root package name */
    public int f187490a = 0;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.modeltools.o0 f187492c = new com.tencent.mm.plugin.webview.modeltools.o0();

    /* renamed from: d, reason: collision with root package name */
    public final java.util.concurrent.ConcurrentSkipListSet f187493d = new java.util.concurrent.ConcurrentSkipListSet(new com.tencent.mm.plugin.webview.ui.tools.widget.g2(this));

    public p2(com.tencent.mm.ui.widget.MMWebView mMWebView) {
        this.f187491b = mMWebView;
    }

    @Override // com.tencent.xweb.s0
    public void g(java.lang.String str, android.webkit.GeolocationPermissions.Callback callback) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187491b;
        android.app.Activity a17 = q75.a.a(mMWebView.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.MMWebChromeClient", "onGeolocationPermissionsShowPrompt with origin(%s) NULL activity, return denial", str);
            callback.invoke(str, false, false);
        } else {
            this.f187492c.g(a17, mMWebView.getUrl(), "", mMWebView.f211373v, "", str, callback);
        }
    }

    @Override // com.tencent.xweb.s0
    public boolean i(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        android.app.Activity a17 = q75.a.a(this.f187491b.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.MMWebChromeClient", "onJsAlert with url(%s) message(%s), NULL activity, return cancel", str, str2);
            zVar.a();
            return true;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.h2 h2Var = new com.tencent.mm.plugin.webview.ui.tools.widget.h2(this, zVar);
        int i17 = this.f187490a + 1;
        this.f187490a = i17;
        com.tencent.mm.ui.widget.dialog.j0 B = i17 > 2 ? db5.e1.B(a17, str2, "", a17.getString(com.tencent.mm.R.string.lao), a17.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.widget.i2(this, h2Var), new com.tencent.mm.plugin.webview.ui.tools.widget.j2(this, h2Var), com.tencent.mm.R.color.f479308vo) : db5.e1.y(a17, str2, "", a17.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.widget.k2(this, h2Var));
        if (B == null) {
            return false;
        }
        B.setCanceledOnTouchOutside(false);
        B.o(false);
        return true;
    }

    @Override // com.tencent.xweb.s0
    public boolean j(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, com.tencent.xweb.z zVar) {
        android.app.Activity a17 = q75.a.a(this.f187491b.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.MMWebChromeClient", "onJsConfirm with url(%s) message(%s), NULL activity, return cancel", str, str2);
            zVar.a();
            return true;
        }
        com.tencent.mm.plugin.webview.ui.tools.widget.h2 h2Var = new com.tencent.mm.plugin.webview.ui.tools.widget.h2(this, zVar);
        int i17 = this.f187490a + 1;
        this.f187490a = i17;
        com.tencent.mm.ui.widget.dialog.j0 B = i17 > 2 ? db5.e1.B(a17, str2, "", a17.getString(com.tencent.mm.R.string.lao), a17.getString(com.tencent.mm.R.string.f490507x1), new com.tencent.mm.plugin.webview.ui.tools.widget.l2(this, h2Var), new com.tencent.mm.plugin.webview.ui.tools.widget.m2(this, h2Var), com.tencent.mm.R.color.f478749g4) : db5.e1.K(a17, false, str2, "", a17.getString(com.tencent.mm.R.string.f490507x1), a17.getString(com.tencent.mm.R.string.f490347sg), new com.tencent.mm.plugin.webview.ui.tools.widget.n2(this, h2Var), new com.tencent.mm.plugin.webview.ui.tools.widget.o2(this, h2Var));
        if (B == null) {
            return false;
        }
        B.setCancelable(false);
        B.setCanceledOnTouchOutside(false);
        return true;
    }

    @Override // com.tencent.xweb.s0
    public boolean k(com.tencent.xweb.WebView webView, java.lang.String str, java.lang.String str2, java.lang.String str3, com.tencent.xweb.y yVar) {
        android.app.Activity a17 = q75.a.a(this.f187491b.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.MMWebChromeClient", "onJsPrompt with url(%s) message(%s), NULL activity, return cancel", str, str2);
            yVar.a();
            return true;
        }
        new com.tencent.mm.plugin.webview.ui.tools.widget.h2(this, yVar);
        com.tencent.mm.ui.widget.dialog.j0 N = db5.e1.N(a17, str2, str3, "", Integer.MAX_VALUE, new com.tencent.mm.plugin.webview.ui.tools.widget.f2(this, yVar));
        if (N == null) {
            return false;
        }
        N.setCancelable(false);
        N.setCanceledOnTouchOutside(false);
        return true;
    }

    @Override // com.tencent.xweb.s0
    public void l(android.webkit.PermissionRequest permissionRequest) {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f187491b;
        android.app.Activity a17 = q75.a.a(mMWebView.getContext());
        if (a17 == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.WebView.MMWebChromeClient", "onPermissionRequest NULL activity");
        } else {
            this.f187492c.h(permissionRequest, a17, mMWebView.getUrl());
        }
    }

    @Override // com.tencent.xweb.s0
    public void o(com.tencent.xweb.WebView webView, java.lang.String str) {
    }

    public void s() {
        android.app.Activity a17 = q75.a.a(this.f187491b.getContext());
        if (a17 == null) {
            return;
        }
        a17.finish();
    }
}
