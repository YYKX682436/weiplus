package com.tencent.mm.plugin.webview.webcompt;

/* loaded from: classes8.dex */
public final class n0 extends oz5.a implements kotlinx.coroutines.r0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.webview.webcompt.f1 f187864d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f187865e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n0(kotlinx.coroutines.q0 q0Var, com.tencent.mm.plugin.webview.webcompt.f1 f1Var, kotlin.jvm.internal.h0 h0Var) {
        super(q0Var);
        this.f187864d = f1Var;
        this.f187865e = h0Var;
    }

    @Override // kotlinx.coroutines.r0
    public void handleException(oz5.l lVar, java.lang.Throwable th6) {
        this.f187864d.f187812b.a(com.tencent.mm.plugin.webview.webcompt.b.f187757u);
        if (th6 instanceof com.tencent.mm.plugin.webview.webcompt.i0) {
            ((yz5.l) this.f187865e.f310123d).invoke(th6);
            return;
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(1653L, 12L, 1L, false);
        com.tencent.mm.plugin.webview.webcompt.h0 h0Var = com.tencent.mm.plugin.webview.webcompt.f1.f187797e;
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.WebComponent", th6, "createJsContext", new java.lang.Object[0]);
    }
}
