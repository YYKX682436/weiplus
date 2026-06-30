package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes8.dex */
public final class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.o4 f187214d;

    public f4(com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var) {
        this.f187214d = o4Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.o4 o4Var = this.f187214d;
        android.widget.ScrollView scrollView = o4Var.L;
        if (scrollView != null) {
            scrollView.scrollTo(o4Var.d().getWebScrollX(), o4Var.d().getWebScrollY());
        }
    }
}
