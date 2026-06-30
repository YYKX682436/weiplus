package com.tencent.mm.plugin.webview.ui.tools;

/* loaded from: classes8.dex */
public class ba implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.WebViewUI f183960d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nw4.n f183961e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.permission.w f183962f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f183963g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ long f183964h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ int f183965i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ float f183966m;

    public ba(com.tencent.mm.plugin.webview.ui.tools.u7 u7Var, com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI, nw4.n nVar, com.tencent.mm.plugin.webview.permission.w wVar, java.lang.String str, long j17, int i17, float f17) {
        this.f183960d = webViewUI;
        this.f183961e = nVar;
        this.f183962f = wVar;
        this.f183963g = str;
        this.f183964h = j17;
        this.f183965i = i17;
        this.f183966m = f17;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.webview.permission.w wVar;
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI = this.f183960d;
        if (webViewUI == null || webViewUI.isFinishing() || this.f183961e == null || (wVar = this.f183962f) == null || !wVar.c().f(42)) {
            return;
        }
        this.f183961e.C(this.f183963g, this.f183964h, this.f183965i, this.f183966m);
    }
}
