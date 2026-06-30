package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187232d;

    public g4(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187232d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187232d;
        com.tencent.mm.ui.widget.MMWebView d17 = o4Var.d();
        android.widget.ScrollView scrollView = o4Var.L;
        kotlin.jvm.internal.o.d(scrollView);
        com.tencent.mm.plugin.webview.core.x3 x3Var = com.tencent.mm.plugin.webview.core.x3.f182012a;
        scrollView.getViewTreeObserver().addOnScrollChangedListener(new com.tencent.mm.plugin.webview.core.w3(scrollView, d17, d17.getScale()));
    }
}
