package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class aa implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183906d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f183907e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f183908f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f183909g;

    public aa(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f183906d = webViewUI;
        this.f183907e = nVar;
        this.f183908f = wVar;
        this.f183909g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183906d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f183907e) == null || (wVar = this.f183908f) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f183909g, "download_start");
    }
}
