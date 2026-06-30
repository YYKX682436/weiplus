package com.tencent.mm.plugin.webview.core;

/* loaded from: classes4.dex */
public final class g1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.webview.core.g1 f181836d = new com.tencent.mm.plugin.webview.core.g1();

    public g1() {
        super(0);
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        e42.e0 e0Var = (e42.e0) i95.n0.c(e42.e0.class);
        long j17 = 2;
        if (e0Var != null) {
            j17 = ((h62.d) e0Var).Ui(e42.d0.clicfg_webview_page_error_report_rate_v2, 2L);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.WebPageErrorMonitor", "WebPageErrorMonitor sample rate= " + j17);
        return java.lang.Long.valueOf(j17);
    }
}
