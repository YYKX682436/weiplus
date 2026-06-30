package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class x7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187671d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187672e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187673f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f187674g;

    public x7(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, int i17) {
        this.f187671d = webViewUI;
        this.f187672e = nVar;
        this.f187673f = str;
        this.f187674g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187671d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f187672e) == null) {
            return;
        }
        nVar.s0(this.f187673f, this.f187674g);
    }
}
