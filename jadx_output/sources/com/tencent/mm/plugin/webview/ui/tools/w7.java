package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class w7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187011d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187012e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187013f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f187014g;

    public w7(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, int i17) {
        this.f187011d = webViewUI;
        this.f187012e = nVar;
        this.f187013f = str;
        this.f187014g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187011d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f187012e) == null) {
            return;
        }
        nVar.P(this.f187013f, this.f187014g);
    }
}
