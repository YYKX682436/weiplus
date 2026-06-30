package com.tencent.mm.plugin.webview.model;

/* loaded from: classes8.dex */
public final class f4 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.model.h4 f182878d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ hy4.a0 f182879e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ java.lang.String f182880f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ r45.n54 f182881g;

    public f4(com.tencent.mm.plugin.webview.model.h4 h4Var, hy4.a0 a0Var, java.lang.String str, r45.n54 n54Var) {
        this.f182878d = h4Var;
        this.f182879e = a0Var;
        this.f182880f = str;
        this.f182881g = n54Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.plugin.webview.model.h4 h4Var = this.f182878d;
            com.tencent.mm.plugin.webview.model.v3 v3Var = h4Var.f182919d;
            if (v3Var != null) {
                hy4.a0 a0Var = this.f182879e;
                java.lang.String str = this.f182880f;
                r45.n54 n54Var = this.f182881g;
                v3Var.f183141a = a0Var.f286083d;
                v3Var.f183151k = str;
                v3Var.f183148h = n54Var;
                v3Var.f183150j = (int) (java.lang.System.currentTimeMillis() - v3Var.f183149i);
                com.tencent.mars.xlog.Log.i("MicroMsg.WebViewEventReporter", "reportWebViewEvent eventType: " + a0Var + ", %s", h4Var.f182919d);
                com.tencent.mm.plugin.webview.model.v3 v3Var2 = h4Var.f182919d;
                kotlin.jvm.internal.o.d(v3Var2);
                ((h80.i) ((com.tencent.mm.ipcinvoker.wx_extension.x) i95.n0.c(com.tencent.mm.ipcinvoker.wx_extension.x.class))).wi(new com.tencent.mm.plugin.webview.model.u3(v3Var2).f70646f, com.tencent.mm.plugin.webview.model.e4.f182861a);
            }
        } catch (java.lang.Throwable th6) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebViewEventReporter", th6, "reportEvent exception", new java.lang.Object[0]);
        }
    }
}
