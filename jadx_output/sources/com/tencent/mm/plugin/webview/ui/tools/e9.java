package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class e9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f184142d;

    public e9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, java.lang.String str, int i17, int i18) {
        this.f184142d = u7Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f184142d;
        if (u7Var.f186929e.get() != null) {
            java.lang.ref.WeakReference weakReference = u7Var.f186929e;
            if (((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).isFinishing() || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183815f == null) {
                return;
            }
            com.tencent.mm.plugin.webview.ui.tools.b5 b5Var = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) weakReference.get()).f183846p2;
            b5Var.getClass();
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewLongClickHelper", "onGetQRCodeResult");
            com.tencent.mm.sdk.platformtools.u3.h(new com.tencent.mm.plugin.webview.ui.tools.l5(b5Var));
            b5Var.v();
        }
    }
}
