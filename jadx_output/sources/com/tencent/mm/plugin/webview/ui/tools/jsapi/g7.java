package com.tencent.mm.plugin.webview.ui.tools.jsapi;

/* loaded from: classes.dex */
public class g7 implements gm5.a {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ java.lang.Runnable f185138a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 f185139b;

    public g7(com.tencent.mm.plugin.webview.ui.tools.jsapi.h7 h7Var, java.lang.Runnable runnable) {
        this.f185139b = h7Var;
        this.f185138a = runnable;
    }

    @Override // gm5.a
    public java.lang.Object call(java.lang.Object obj) {
        ((ku5.t0) ku5.t0.f312615d).E(this.f185138a, 500L);
        java.util.concurrent.CountDownLatch countDownLatch = new java.util.concurrent.CountDownLatch(1);
        k70.v vVar = (k70.v) i95.n0.c(k70.v.class);
        java.lang.String str = this.f185139b.f185168a;
        com.tencent.mm.plugin.webview.ui.tools.jsapi.f7 f7Var = new com.tencent.mm.plugin.webview.ui.tools.jsapi.f7(this, countDownLatch);
        ((j70.e) vVar).getClass();
        m11.b1.wi().a(str, false, f7Var);
        try {
            try {
                countDownLatch.await(2000L, java.util.concurrent.TimeUnit.MILLISECONDS);
            } catch (java.lang.InterruptedException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MsgHandler", e17, "", new java.lang.Object[0]);
            }
        } catch (java.lang.Throwable unused) {
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MsgHandler", "count down end");
        return null;
    }
}
