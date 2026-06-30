package com.tencent.mm.plugin.finder.report;

/* loaded from: classes15.dex */
public final class q0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.r0 f125254d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(com.tencent.mm.plugin.finder.report.r0 r0Var) {
        super(0);
        this.f125254d = r0Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.report.r0 r0Var = this.f125254d;
        if (r0Var.f125285i != null) {
            com.tencent.mm.storage.m4 Di = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Di();
            vg3.t3 t3Var = r0Var.f125285i;
            com.tencent.mm.storage.p4 p4Var = Di.f195119f;
            p4Var.getClass();
            fm5.b bVar = new fm5.b(t3Var, p4Var);
            synchronized (p4Var) {
                p4Var.f264181d.remove(bVar);
            }
            r0Var.f125285i = null;
        }
        r0Var.f125288o.y();
        return jz5.f0.f302826a;
    }
}
