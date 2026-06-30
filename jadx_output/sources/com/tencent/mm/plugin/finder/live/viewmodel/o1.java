package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes9.dex */
public final class o1 extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.s1 f117292d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o1(com.tencent.mm.plugin.finder.live.viewmodel.s1 s1Var) {
        super(1);
        this.f117292d = s1Var;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        cm2.k it = (cm2.k) obj;
        kotlin.jvm.internal.o.g(it, "it");
        com.tencent.mm.plugin.finder.assist.x2 x2Var = com.tencent.mm.plugin.finder.assist.x2.f102672a;
        r45.b73 b73Var = (r45.b73) it.f43358d.getCustom(1);
        x2Var.f(5, b73Var != null ? b73Var.getString(0) : null);
        com.tencent.mm.plugin.finder.live.viewmodel.e2 e2Var = this.f117292d.f117382q;
        if (e2Var != null) {
            e2Var.b(it, true);
        }
        return jz5.f0.f302826a;
    }
}
