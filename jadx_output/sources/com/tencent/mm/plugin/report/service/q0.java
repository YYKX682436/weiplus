package com.tencent.mm.plugin.report.service;

/* loaded from: classes8.dex */
public class q0 implements com.tencent.mm.modelbase.u0 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.report.service.g0 f158304d;

    public q0(com.tencent.mm.plugin.report.service.g0 g0Var) {
        this.f158304d = g0Var;
    }

    @Override // com.tencent.mm.modelbase.u0
    public void onSceneEnd(int i17, int i18, java.lang.String str, com.tencent.mm.modelbase.m1 m1Var) {
        m1Var.setHasCallbackToQueue(true);
        if (i17 == 0) {
            gm0.j1.e().j(new com.tencent.mm.plugin.report.service.p0(this, ((lx3.k) m1Var).f322099g));
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.cLog", "NetScene failed, code=" + i18 + ", msg=" + str);
    }
}
