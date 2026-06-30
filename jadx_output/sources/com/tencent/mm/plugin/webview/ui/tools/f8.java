package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class f8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f184173d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f184174e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f184175f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ android.os.Bundle f184176g;

    public f8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, android.os.Bundle bundle) {
        this.f184173d = webViewUI;
        this.f184174e = nVar;
        this.f184175f = wVar;
        this.f184176g = bundle;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f184173d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f184174e) == null || (wVar = this.f184175f) == null || !wVar.c().f(42)) {
            return;
        }
        nVar.D(this.f184176g, "download_succ");
    }
}
