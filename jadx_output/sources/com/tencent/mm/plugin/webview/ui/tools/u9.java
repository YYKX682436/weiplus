package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class u9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f186947d;

    public u9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var) {
        this.f186947d = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f186947d;
        if (u7Var.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).isFinishing() || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).S1 == null || !((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).S1.isShowing()) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).S1.dismiss();
    }
}
