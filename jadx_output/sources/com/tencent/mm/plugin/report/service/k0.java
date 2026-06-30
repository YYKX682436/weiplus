package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class k0 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.report.service.g0 f158285d;

    public k0(com.tencent.mm.plugin.report.service.g0 g0Var) {
        this.f158285d = g0Var;
    }

    @Override // java.lang.Runnable
    public void run() {
        com.tencent.mm.plugin.report.service.g0 g0Var = this.f158285d;
        g0Var.getClass();
        com.tencent.mars.xlog.Log.i("MicroMsg.cLog", "Update CLog ratio from server.");
        com.tencent.mm.network.s sVar = gm0.j1.d().f70764d;
        if (sVar == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.ReportManagerKvCheck", "dispatcher is null, just return.");
        } else {
            new lx3.k(g0Var.f158181n, g0Var.f158182o).doScene(sVar, new com.tencent.mm.plugin.report.service.q0(g0Var));
        }
    }
}
