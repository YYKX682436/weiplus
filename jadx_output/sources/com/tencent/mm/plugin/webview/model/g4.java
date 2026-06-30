package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class g4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h4 f182897d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy4.a0 f182898e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ r45.n54 f182899f;

    public g4(com.tencent.mm.plugin.webview.model.h4 h4Var, hy4.a0 a0Var, r45.n54 n54Var) {
        this.f182897d = h4Var;
        this.f182898e = a0Var;
        this.f182899f = n54Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.ui.widget.MMWebView mMWebView = this.f182897d.f182918c;
        java.lang.String url = mMWebView != null ? mMWebView.getUrl() : null;
        if (url == null) {
            url = "";
        }
        ((ku5.t0) ku5.t0.f312615d).q(new com.tencent.mm.plugin.webview.model.f4(this.f182897d, this.f182898e, url, this.f182899f));
    }
}
