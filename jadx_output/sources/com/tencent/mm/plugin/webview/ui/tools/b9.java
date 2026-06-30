package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class b9 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183956d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f183957e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f183958f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f183959g;

    public b9(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f183956d = webViewUI;
        this.f183957e = nVar;
        this.f183958f = wVar;
        this.f183959g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183956d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f183957e) == null || (wVar = this.f183958f) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f183959g, "download_removed");
    }
}
