package com.tencent.mm.plugin.finder.webview;

/* loaded from: classes8.dex */
public final class b0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.webview.FinderWebViewHelper f136848d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f136849e;

    public b0(com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper, java.lang.String str) {
        this.f136848d = finderWebViewHelper;
        this.f136849e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        r45.sn snVar;
        zg0.q2 q2Var;
        com.tencent.mm.plugin.finder.webview.FinderWebViewHelper finderWebViewHelper = this.f136848d;
        snVar = finderWebViewHelper.homeContext;
        java.lang.String str = this.f136849e;
        if (snVar != null) {
            snVar.f385852f = str;
        }
        q2Var = finderWebViewHelper.webViewController;
        if (q2Var != null) {
            ((com.tencent.mm.plugin.webview.core.e3) q2Var).x1(str, null, false);
        }
    }
}
