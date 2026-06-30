package com.tencent.mm.plugin.multitalk.model;

/* loaded from: classes14.dex */
public class q1 implements com.tencent.mm.sdk.platformtools.a4 {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitalk.model.v0 f150081d;

    public q1(com.tencent.mm.plugin.multitalk.model.v0 v0Var) {
        this.f150081d = v0Var;
    }

    @Override // com.tencent.mm.sdk.platformtools.a4
    public boolean onTimerExpired() {
        com.tencent.mm.plugin.multitalk.model.v0 v0Var = this.f150081d;
        if (v0Var.F == null) {
            v0Var.G = 0L;
            v0Var.f150182x0.d();
            return false;
        }
        if (com.tencent.mm.plugin.multitalk.model.v0.u(com.tencent.mm.sdk.platformtools.x2.f193071a)) {
            v0Var.G(v0Var.F);
            v0Var.F = null;
            v0Var.G = 0L;
            v0Var.f150182x0.d();
            com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(500L, 7L, 1L, false);
            return false;
        }
        if (java.lang.System.currentTimeMillis() - v0Var.G < 60000) {
            return true;
        }
        v0Var.F = null;
        v0Var.G = 0L;
        v0Var.f150182x0.d();
        return false;
    }
}
