package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class rb implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ int f186818d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ int f186819e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f186820f;

    public rb(com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, int i17, int i18) {
        this.f186820f = webViewUI;
        this.f186818d = i17;
        this.f186819e = i18;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f186820f;
        nw4.n nVar = webViewUI.f183844p0;
        if (nVar != null) {
            nVar.L(this.f186818d, this.f186819e);
        }
        com.tencent.mm.plugin.webview.ui.tools.c4 c4Var = webViewUI.f183851r;
        if (c4Var != null) {
            c4Var.f184036g = false;
            c4Var.b();
        }
    }
}
