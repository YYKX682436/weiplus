package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class d4 extends com.tencent.mm.app.s2 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h4 f182842d;

    public d4(com.tencent.mm.plugin.webview.model.h4 h4Var) {
        this.f182842d = h4Var;
    }

    @Override // com.tencent.mm.app.t2
    public void onAppBackground(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.a4 a4Var = new com.tencent.mm.plugin.webview.model.a4(this.f182842d, this);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.model.c4(a4Var), "MicroMsg.WebViewEventReporter");
    }

    @Override // com.tencent.mm.app.t2
    public void onAppForeground(java.lang.String str) {
        com.tencent.mm.plugin.webview.model.b4 b4Var = new com.tencent.mm.plugin.webview.model.b4(this.f182842d, this);
        ((ku5.t0) ku5.t0.f312615d).h(new com.tencent.mm.plugin.webview.model.c4(b4Var), "MicroMsg.WebViewEventReporter");
    }
}
