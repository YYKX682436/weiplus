package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class z7 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f187715d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f187716e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f187717f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ int f187718g;

    public z7(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.lang.String str, int i17) {
        this.f187715d = webViewUI;
        this.f187716e = nVar;
        this.f187717f = str;
        this.f187718g = i17;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f187715d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f187716e) == null) {
            return;
        }
        nVar.o0(this.f187717f, this.f187718g);
    }
}
