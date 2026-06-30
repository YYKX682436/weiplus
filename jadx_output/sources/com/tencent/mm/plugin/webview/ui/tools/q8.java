package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class q8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186773d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f186774e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f186775f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f186776g;

    public q8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f186773d = webViewUI;
        this.f186774e = nVar;
        this.f186775f = wVar;
        this.f186776g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186773d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f186774e) == null || (wVar = this.f186775f) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f186776g, "download_fail");
    }
}
