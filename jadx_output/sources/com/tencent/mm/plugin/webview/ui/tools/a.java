package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public abstract class a {

    /* renamed from: a, reason: collision with root package name */
    public java.lang.ref.WeakReference f183887a;

    public a(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI) {
        this.f183887a = new java.lang.ref.WeakReference(webViewUI);
    }

    public android.content.Intent b() {
        return c().getIntent();
    }

    public com.tencent.mm.plugin.webview.ui.tools.WebViewUI c() {
        return (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) this.f183887a.get();
    }

    public boolean d() {
        return c() == null || c().isFinishing();
    }
}
