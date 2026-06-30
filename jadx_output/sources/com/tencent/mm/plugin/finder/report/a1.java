package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class a1 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.c1 f124937d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a1(com.tencent.mm.plugin.finder.report.c1 c1Var) {
        super(0);
        this.f124937d = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.report.c1 c1Var = this.f124937d;
        c1Var.V0();
        com.tencent.mm.plugin.finder.report.n4 n4Var = c1Var.f124972v;
        if (n4Var != null) {
            n4Var.K(c1Var.f125288o);
            c1Var.S0(n4Var);
            r45.vd6 d17 = com.tencent.mm.plugin.finder.report.n4.f125151r0.d(n4Var, c1Var.f125284h);
            linkedList.add(d17);
            c1Var.U0(n4Var, d17, false);
        }
        c1Var.f124972v = null;
        if (!linkedList.isEmpty()) {
            c1Var.f124971u.addAll(linkedList);
            c1Var.R0();
        }
        return jz5.f0.f302826a;
    }
}
