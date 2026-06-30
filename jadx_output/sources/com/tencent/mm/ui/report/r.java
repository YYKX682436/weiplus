package com.tencent.mm.ui.report;

/* loaded from: classes12.dex */
public final class r extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.report.p f209732d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.ui.report.o f209733e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(com.tencent.mm.ui.report.p pVar, com.tencent.mm.ui.report.o oVar) {
        super(0);
        this.f209732d = pVar;
        this.f209733e = oVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        jz5.f0 f0Var;
        java.util.concurrent.ConcurrentHashMap concurrentHashMap = (java.util.concurrent.ConcurrentHashMap) com.tencent.mm.ui.report.d0.f209627b;
        com.tencent.mm.ui.report.p pVar = this.f209732d;
        yz5.l lVar = (yz5.l) concurrentHashMap.get(pVar);
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (lVar != null) {
            lVar.invoke(this.f209733e);
            f0Var = f0Var2;
        } else {
            f0Var = null;
        }
        if (f0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.File.FilePreviewReporter", "report type: " + pVar + " not found");
        }
        return f0Var2;
    }
}
