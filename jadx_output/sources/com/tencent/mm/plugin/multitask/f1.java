package com.tencent.mm.plugin.multitask;

/* loaded from: classes8.dex */
public final class f1 implements java.lang.Runnable {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.multitask.i1 f150432d;

    public f1(com.tencent.mm.plugin.multitask.i1 i1Var) {
        this.f150432d = i1Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        j75.f Ai;
        int i17 = com.tencent.mm.plugin.multitask.l0.f150465z0;
        com.tencent.mm.plugin.multitask.k0 k0Var = ((com.tencent.mm.plugin.multitask.p1) ((com.tencent.mm.plugin.multitask.l0) i95.n0.c(com.tencent.mm.plugin.multitask.l0.class))).Ai() ? (com.tencent.mm.plugin.multitask.k0) i95.n0.c(com.tencent.mm.plugin.multitask.k0.class) : null;
        if (k0Var != null && (Ai = ((com.tencent.mm.plugin.multitask.j1) k0Var).Ai()) != null) {
            Ai.B3(new ik3.f());
        }
        com.tencent.mm.plugin.multitask.i1 i1Var = this.f150432d;
        com.tencent.mm.sdk.platformtools.o4.M(i1Var.f150452n).putBoolean(i1Var.f150451m, false);
    }
}
