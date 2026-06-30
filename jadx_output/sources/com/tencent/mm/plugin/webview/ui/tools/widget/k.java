package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class k extends com.tencent.mm.plugin.webview.core.o1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.ref.WeakReference f187358a;

    public k(java.lang.ref.WeakReference commWebView) {
        kotlin.jvm.internal.o.g(commWebView, "commWebView");
        this.f187358a = commWebView;
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void c(com.tencent.xweb.WebView webView, java.lang.String str, boolean z17) {
        com.tencent.mm.plugin.webview.ui.tools.widget.o1 o1Var;
        java.lang.ref.WeakReference weakReference = this.f187358a;
        if (weakReference == null || (o1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o1) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) o1Var).i(webView, str, z17);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void f(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.o1 o1Var;
        java.lang.ref.WeakReference weakReference = this.f187358a;
        if (weakReference == null || (o1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o1) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) o1Var).t(webView, str);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void g(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.o1 o1Var;
        java.lang.ref.WeakReference weakReference = this.f187358a;
        if (weakReference == null || (o1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o1) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) o1Var).w(webView, str);
    }

    @Override // com.tencent.mm.plugin.webview.core.o1
    public void h(com.tencent.xweb.WebView webView, java.lang.String str) {
        com.tencent.mm.plugin.webview.ui.tools.widget.o1 o1Var;
        java.lang.ref.WeakReference weakReference = this.f187358a;
        if (weakReference == null || (o1Var = (com.tencent.mm.plugin.webview.ui.tools.widget.o1) weakReference.get()) == null) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.widget.o4) o1Var).x(webView, str);
    }
}
