package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class sb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f186871d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186872e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186873f;

    public sb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, int i17, int i18) {
        this.f186873f = webViewUI;
        this.f186871d = i17;
        this.f186872e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186873f;
        nw4.n nVar = webViewUI.f183844p0;
        if (nVar != null) {
            nVar.L(this.f186871d, this.f186872e);
        }
        if (webViewUI.f183851r == null || !webViewUI.t8()) {
            return;
        }
        com.tencent.mm.plugin.webview.ui.tools.c4 c4Var = webViewUI.f183851r;
        c4Var.f184036g = true;
        c4Var.c();
    }
}
