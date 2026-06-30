package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class m extends com.tencent.mm.plugin.webview.core.i3 {

    /* renamed from: b, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.k f187391b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.plugin.webview.ui.tools.widget.l f187392c;

    public m(java.lang.ref.WeakReference commWebView) {
        kotlin.jvm.internal.o.g(commWebView, "commWebView");
        this.f187391b = new com.tencent.mm.plugin.webview.ui.tools.widget.k(commWebView);
        this.f187392c = new com.tencent.mm.plugin.webview.ui.tools.widget.l(commWebView);
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.o1 b() {
        return this.f187391b;
    }

    @Override // com.tencent.mm.plugin.webview.core.i3
    public com.tencent.mm.plugin.webview.core.f3 d() {
        return this.f187392c;
    }
}
