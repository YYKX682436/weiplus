package com.tencent.mm.plugin.performance.watchdogs;

/* loaded from: classes8.dex */
public final class o implements com.tencent.matrix.lifecycle.k {

    /* renamed from: d, reason: collision with root package name */
    public wu5.c f153107d;

    @Override // com.tencent.matrix.lifecycle.k
    public void off() {
        wu5.c cVar = this.f153107d;
        if (cVar != null) {
            cVar.cancel(false);
        }
    }

    @Override // com.tencent.matrix.lifecycle.k
    public void on() {
        ku5.u0 u0Var = ku5.t0.f312615d;
        com.tencent.mm.plugin.performance.watchdogs.n nVar = com.tencent.mm.plugin.performance.watchdogs.n.f153103d;
        ku5.t0 t0Var = (ku5.t0) u0Var;
        t0Var.getClass();
        this.f153107d = t0Var.t(nVar, 5000L, null);
    }
}
