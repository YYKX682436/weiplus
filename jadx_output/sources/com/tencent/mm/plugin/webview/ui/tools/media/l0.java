package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes8.dex */
public final class l0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ android.app.Activity f185800d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.media.n0 f185801e;

    public l0(android.app.Activity activity, com.tencent.mm.plugin.webview.ui.tools.media.n0 n0Var) {
        this.f185800d = activity;
        this.f185801e = n0Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        com.tencent.mm.plugin.webview.ui.tools.WebViewUI webViewUI;
        nw4.n nVar;
        android.app.Activity activity = this.f185800d;
        if (!(activity instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI) || (webViewUI = (com.tencent.mm.plugin.webview.ui.tools.WebViewUI) activity) == null || (nVar = webViewUI.f183844p0) == null) {
            return;
        }
        ot0.m1 m1Var = this.f185801e.f185807a;
        kotlin.jvm.internal.o.d(m1Var);
        nVar.E(m1Var.f373341f, com.tencent.youtu.sdkkitframework.common.StateEvent.ProcessResult.FAILED);
    }
}
