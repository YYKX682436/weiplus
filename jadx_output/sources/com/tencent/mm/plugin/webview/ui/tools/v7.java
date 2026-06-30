package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class v7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186964d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f186965e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f186966f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f186967g;

    public v7(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, int i17) {
        this.f186964d = webViewUI;
        this.f186965e = nVar;
        this.f186966f = str;
        this.f186967g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186964d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f186965e) == null) {
            return;
        }
        nVar.Q(this.f186966f, this.f186967g);
    }
}
