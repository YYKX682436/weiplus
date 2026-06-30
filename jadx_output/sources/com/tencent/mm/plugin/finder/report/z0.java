package com.tencent.mm.plugin.finder.report;

/* loaded from: classes2.dex */
public final class z0 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.report.c1 f125482d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(com.tencent.mm.plugin.finder.report.c1 c1Var) {
        super(0);
        this.f125482d = c1Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        java.util.LinkedList linkedList = new java.util.LinkedList();
        com.tencent.mm.plugin.finder.report.c1 c1Var = this.f125482d;
        linkedList.addAll(c1Var.f124974x);
        c1Var.f124974x.clear();
        if (!linkedList.isEmpty()) {
            com.tencent.mm.plugin.finder.report.k4.E.a(c1Var.f125284h, linkedList);
        }
        return jz5.f0.f302826a;
    }
}
