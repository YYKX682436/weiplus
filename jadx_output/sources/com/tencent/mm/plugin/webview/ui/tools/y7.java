package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class y7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187694d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187695e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187696f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f187697g;

    public y7(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, int i17) {
        this.f187694d = webViewUI;
        this.f187695e = nVar;
        this.f187696f = str;
        this.f187697g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187694d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f187695e) == null) {
            return;
        }
        nVar.p0(this.f187696f, this.f187697g);
    }
}
