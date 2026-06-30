package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class x extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.q0 f115006d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ mm2.j f115007e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(com.tencent.mm.plugin.finder.live.plugin.q0 q0Var, mm2.j jVar) {
        super(0);
        this.f115006d = q0Var;
        this.f115007e = jVar;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.q0 q0Var = this.f115006d;
        mm2.h v17 = q0Var.v1();
        if (v17 != null) {
            v17.setOnProgressChange(new com.tencent.mm.plugin.finder.live.plugin.t(q0Var));
        }
        mm2.h v18 = q0Var.v1();
        if (v18 != null) {
            v18.setOnFirstFrameRendered(new com.tencent.mm.plugin.finder.live.plugin.u(q0Var));
        }
        mm2.h v19 = q0Var.v1();
        mm2.j jVar = this.f115007e;
        if (v19 != null) {
            v19.setOnVideoError(new com.tencent.mm.plugin.finder.live.plugin.v(q0Var, jVar));
        }
        mm2.h v110 = q0Var.v1();
        if (v110 != null) {
            v110.setOnVideoComplete(new com.tencent.mm.plugin.finder.live.plugin.w(q0Var, jVar));
        }
        return jz5.f0.f302826a;
    }
}
