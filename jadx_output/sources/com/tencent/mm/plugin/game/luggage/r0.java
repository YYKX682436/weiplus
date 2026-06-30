package com.tencent.mm.plugin.game.luggage;

/* loaded from: classes8.dex */
public class r0 implements com.tencent.mm.plugin.webview.permission.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.game.report.api.GameWebPerformanceInfo f139963a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ sd.o0 f139964b;

    public r0(com.tencent.mm.game.report.api.GameWebPerformanceInfo gameWebPerformanceInfo, sd.o0 o0Var) {
        this.f139963a = gameWebPerformanceInfo;
        this.f139964b = o0Var;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void a(int i17, java.lang.String str, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void c(int i17, java.lang.String str, int i18, int i19, java.lang.String str2) {
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void d(int i17, java.lang.String str) {
        this.f139963a.G = java.lang.System.currentTimeMillis();
        sx4.d0.h(str, java.lang.System.currentTimeMillis());
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public /* bridge */ /* synthetic */ void e(int i17, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void f(int i17, java.lang.String str) {
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public /* bridge */ /* synthetic */ boolean g(int i17, java.lang.String str, java.lang.Object obj) {
        return false;
    }

    @Override // com.tencent.mm.plugin.webview.permission.a
    public void h(int i17, boolean z17, java.lang.String str, java.lang.String str2, java.lang.Object obj) {
        com.tencent.mars.xlog.Log.i("MicroMsg.LuggageGetA8KeyUtil", "getA8Key end, time: %d", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        java.util.Map g17 = com.tencent.mm.plugin.webview.permission.d.g(((r45.s83) obj).f385562x);
        this.f139963a.H = java.lang.System.currentTimeMillis();
        sx4.d0.g(str, java.lang.System.currentTimeMillis());
        sd.o0 o0Var = this.f139964b;
        com.tencent.mm.ui.widget.MMWebView mMWebView = (com.tencent.mm.ui.widget.MMWebView) o0Var.h();
        if (com.tencent.mm.sdk.platformtools.t8.K0(str2) || mMWebView == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.LuggageGetA8KeyUtil", "url is null");
        } else {
            com.tencent.mm.ipcinvoker.w0.c(true, new com.tencent.mm.plugin.game.luggage.u0(str2, g17, mMWebView));
        }
        com.tencent.mm.plugin.game.luggage.v0.a(o0Var, str2);
    }
}
