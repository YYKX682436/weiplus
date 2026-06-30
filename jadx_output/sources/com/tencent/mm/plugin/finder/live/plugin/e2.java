package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class e2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.q7 f112360a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112361b;

    public e2(r45.q7 q7Var, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f112360a = q7Var;
        this.f112361b = v3Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            r45.q7 q7Var = this.f112360a;
            int integer = q7Var.getInteger(0);
            ml2.u1 u1Var = integer != 1 ? integer != 2 ? null : ml2.u1.f328047g2 : ml2.u1.f328044f2;
            if (u1Var != null) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f112361b;
                r0Var.lk(u1Var, ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o, ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0), q7Var.getString(1));
            }
        }
    }
}
