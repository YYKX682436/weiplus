package com.tencent.mm.pluginsdk.ui;

/* loaded from: classes8.dex */
public final class p2 implements com.tencent.mm.ui.widget.dialog.p3 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.pluginsdk.ui.q2 f191051a;

    public p2(com.tencent.mm.pluginsdk.ui.q2 q2Var) {
        this.f191051a = q2Var;
    }

    @Override // com.tencent.mm.ui.widget.dialog.p3
    public final void a() {
        ty.m0 m0Var = (ty.m0) i95.n0.c(ty.m0.class);
        com.tencent.mm.pluginsdk.ui.q2 q2Var = this.f191051a;
        ((sy.x) m0Var).wi(java.lang.Integer.toString(q2Var.hashCode()), q2Var.f191086d, com.tencent.mm.sdk.platformtools.w2.a(q2Var.f191085c), 317L, null, q2Var.f191089g.i5());
        q2Var.f191090h.B();
        com.tencent.mm.pluginsdk.model.t3.r(q2Var.f191083a, q2Var.f191084b, q2Var.f191085c, q2Var.f191086d, q2Var.f191087e, "FROM_SCENE_HALF_DIALOG", q2Var.f191088f);
    }
}
