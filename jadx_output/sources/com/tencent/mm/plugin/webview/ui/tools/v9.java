package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class v9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f186970d;

    public v9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var) {
        this.f186970d = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f186970d;
        if (u7Var.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).isFinishing()) {
            return;
        }
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).R1 = null;
    }
}
