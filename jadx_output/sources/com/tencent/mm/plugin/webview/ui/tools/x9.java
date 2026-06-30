package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class x9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187677d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187678e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f187679f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f187680g;

    public x9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f187677d = webViewUI;
        this.f187678e = nVar;
        this.f187679f = wVar;
        this.f187680g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187677d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f187678e) == null || (wVar = this.f187679f) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f187680g, "download_resumed");
    }
}
