package com.tencent.mm.plugin.webview.ui.tools.media;

/* loaded from: classes3.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.ui.tools.media.v0 f185829a = new com.tencent.mm.plugin.webview.ui.tools.media.v0();

    public final void a(android.content.Context ui6, ot0.m1 mpShareVideoInfo, int i17) {
        kotlin.jvm.internal.o.g(ui6, "ui");
        kotlin.jvm.internal.o.g(mpShareVideoInfo, "mpShareVideoInfo");
        com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
        int i18 = 2;
        java.lang.Object[] objArr = new java.lang.Object[2];
        if (i17 == 1) {
            i18 = 10;
        } else if (i17 != 3) {
            i18 = 6;
        }
        objArr[0] = java.lang.Integer.valueOf(i18);
        objArr[1] = 3;
        g0Var.d(18589, objArr);
        if (!(ui6 instanceof com.tencent.mm.plugin.webview.ui.tools.WebViewUI)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.JsApiHandleMPPageAction", "not in WebViewUI now!");
            return;
        }
        com.tencent.mm.ui.widget.dialog.k0 k0Var = new com.tencent.mm.ui.widget.dialog.k0(ui6, 1, false);
        k0Var.f211872n = new com.tencent.mm.plugin.webview.ui.tools.media.s0(ui6, i17);
        k0Var.f211881s = new com.tencent.mm.plugin.webview.ui.tools.media.t0(ui6, mpShareVideoInfo, i17);
        k0Var.C = new com.tencent.mm.plugin.webview.ui.tools.media.u0(i17);
        k0Var.q(" ", 1);
        k0Var.X1 = true;
        k0Var.v();
    }
}
