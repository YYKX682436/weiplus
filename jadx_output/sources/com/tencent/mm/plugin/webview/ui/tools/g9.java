package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class g9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f184759d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.u7 f184760e;

    public g9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, java.lang.String str) {
        this.f184760e = u7Var;
        this.f184759d = str;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.u7 u7Var = this.f184760e;
        if (u7Var.f186929e.get() == null || ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).isFinishing()) {
            return;
        }
        if (com.tencent.mm.sdk.platformtools.t8.K0(((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f.getUrl())) {
            com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", "setPageOwner, null url");
            return;
        }
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("setPageOwner, userName = ");
        java.lang.String str = this.f184759d;
        sb6.append(str);
        com.tencent.mars.xlog.Log.i("MicroMsg.WebViewStubCallbackAIDLStub", sb6.toString());
        ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).O1.put(((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) u7Var.f186929e.get()).f183815f.getUrl(), str);
    }
}
