package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f185792d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.n0 f185793e;

    public k0(android.app.Activity activity, com.tencent.mm.plugin.webview.ui.tools.media.n0 n0Var) {
        this.f185792d = activity;
        this.f185793e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        nw4.n nVar;
        android.app.Activity activity = this.f185792d;
        db5.e1.T(activity, activity.getString(com.tencent.mm.R.string.anq));
        boolean z17 = activity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI;
        com.tencent.mm.plugin.webview.ui.tools.media.n0 n0Var = this.f185793e;
        if (z17 && (nVar = ((com.tencent.mm.plugin.webview.ui.tools.WebViewUI) activity).f183844p0) != null) {
            ot0.m1 m1Var = n0Var.f185807a;
            kotlin.jvm.internal.o.d(m1Var);
            nVar.E(m1Var.f373341f, ya.b.SUCCESS);
        }
        com.tencent.mm.plugin.webview.ui.tools.media.x0 x0Var = com.tencent.mm.plugin.webview.ui.tools.media.y0.f185834k;
        ot0.m1 m1Var2 = n0Var.f185807a;
        kotlin.jvm.internal.o.d(m1Var2);
        java.lang.String videoVid = m1Var2.f373341f;
        kotlin.jvm.internal.o.f(videoVid, "videoVid");
        ot0.m1 m1Var3 = n0Var.f185807a;
        kotlin.jvm.internal.o.d(m1Var3);
        java.lang.String mpUrl = m1Var3.f373339d;
        kotlin.jvm.internal.o.f(mpUrl, "mpUrl");
        ot0.m1 m1Var4 = n0Var.f185807a;
        kotlin.jvm.internal.o.d(m1Var4);
        x0Var.d(1, 101, videoVid, mpUrl, 0, m1Var4.f348587y);
    }
}
