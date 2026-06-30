package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class a8 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183901d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f183902e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.util.Map f183903f;

    public a8(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, java.util.Map map) {
        this.f183901d = webViewUI;
        this.f183902e = nVar;
        this.f183903f = map;
    }

    @Override // java.lang.Runnable
    public void run() {
        nw4.n nVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183901d;
        if (webViewUI == null || webViewUI.isFinishing() || (nVar = this.f183902e) == null) {
            return;
        }
        nVar.q0(this.f183903f);
    }
}
