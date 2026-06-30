package com.tencent.mm.plugin.finder.viewmodel.component;

/* loaded from: classes2.dex */
public final class z8 extends fc2.d {

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.viewmodel.component.e9 f136665g;

    public z8(com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var) {
        this.f136665g = e9Var;
    }

    @Override // fc2.d
    public void G0(fc2.a ev6) {
        java.lang.ref.WeakReference weakReference;
        in5.s0 s0Var;
        kotlin.jvm.internal.o.g(ev6, "ev");
        if (ev6 instanceof ec2.f) {
            ec2.f fVar = (ec2.f) ev6;
            if (fVar.f250959d == 11) {
                long j17 = fVar.f250965j;
                com.tencent.mm.plugin.finder.viewmodel.component.e9 e9Var = this.f136665g;
                if (j17 != e9Var.f134221h || (weakReference = e9Var.f134224n) == null || (s0Var = (in5.s0) weakReference.get()) == null) {
                    return;
                }
                pm0.v.X(new com.tencent.mm.plugin.finder.viewmodel.component.y8(e9Var, s0Var));
            }
        }
    }
}
