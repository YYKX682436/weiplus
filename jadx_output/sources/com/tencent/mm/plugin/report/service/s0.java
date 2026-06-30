package com.tencent.mm.plugin.report.service;

/* loaded from: classes2.dex */
public final class s0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public static final com.tencent.mm.plugin.report.service.s0 f158307d = new com.tencent.mm.plugin.report.service.s0();

    @Override // java.lang.Runnable
    public final void run() {
        try {
            com.tencent.mm.plugin.report.service.b1 b1Var = com.tencent.mm.plugin.report.service.b1.f158148a;
            com.tencent.mm.plugin.report.service.b1.b(b1Var, b1Var.e());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.UserDataOperationReporter", e17, null, new java.lang.Object[0]);
        }
    }
}
