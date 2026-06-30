package com.tencent.mm.plugin.finder.live.plugin;

/* loaded from: classes3.dex */
public final class f2 extends ym5.n0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ r45.q7 f112491a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.plugin.v3 f112492b;

    public f2(r45.q7 q7Var, com.tencent.mm.plugin.finder.live.plugin.v3 v3Var) {
        this.f112491a = q7Var;
        this.f112492b = v3Var;
    }

    @Override // ym5.n0
    public void onViewExposed(android.view.View view, long j17, long j18, boolean z17) {
        kotlin.jvm.internal.o.g(view, "view");
        if (z17) {
            r45.q7 q7Var = this.f112491a;
            int integer = q7Var.getInteger(0);
            ml2.u1 u1Var = integer != 1 ? integer != 2 ? null : ml2.u1.f328060l2 : ml2.u1.f328050h2;
            if (u1Var != null) {
                ml2.r0 r0Var = (ml2.r0) i95.n0.c(ml2.r0.class);
                com.tencent.mm.plugin.finder.live.plugin.v3 v3Var = this.f112492b;
                r0Var.lk(u1Var, ((mm2.c1) v3Var.P0(mm2.c1.class)).f328852o, ((mm2.e1) v3Var.P0(mm2.e1.class)).f328988r.getLong(0), q7Var.getString(1));
            }
        }
    }
}
