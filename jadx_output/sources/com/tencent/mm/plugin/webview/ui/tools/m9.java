package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class m9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f185695d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f185696e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f185697f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f185698g;

    public m9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f185695d = webViewUI;
        this.f185696e = nVar;
        this.f185697f = wVar;
        this.f185698g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f185695d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f185696e) == null || (wVar = this.f185697f) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f185698g, "download_pause");
    }
}
