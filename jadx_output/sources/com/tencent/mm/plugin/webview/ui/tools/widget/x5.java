package com.tencent.mm.plugin.webview.ui.tools.widget;

/* loaded from: classes3.dex */
public final class x5 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.widget.z5 f187600d;

    public x5(com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var) {
        this.f187600d = z5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.widget.z5 z5Var = this.f187600d;
        com.tencent.mm.plugin.webview.ui.tools.widget.z5.j(z5Var);
        java.lang.Object systemService = z5Var.getContext().getSystemService("input_method");
        kotlin.jvm.internal.o.e(systemService, "null cannot be cast to non-null type android.view.inputmethod.InputMethodManager");
        ((android.view.inputmethod.InputMethodManager) systemService).showSoftInput(z5Var.B, 0);
    }
}
