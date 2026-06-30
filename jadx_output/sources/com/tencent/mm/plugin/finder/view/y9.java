package com.tencent.mm.plugin.finder.view;

/* loaded from: classes3.dex */
public final class y9 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ r45.h32 f133387d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y9(r45.h32 h32Var) {
        super(1);
        this.f133387d = h32Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        com.tencent.mm.plugin.finder.view.dd couponCallback = (com.tencent.mm.plugin.finder.view.dd) obj;
        kotlin.jvm.internal.o.g(couponCallback, "couponCallback");
        r45.ov2 ov2Var = couponCallback.f131889a;
        r45.l1 l1Var = (r45.l1) ov2Var.getCustom(19);
        if (l1Var != null) {
            com.tencent.mm.plugin.finder.assist.a.b(l1Var);
        }
        zl2.t.f(this.f133387d, ov2Var);
        return jz5.f0.f302826a;
    }
}
