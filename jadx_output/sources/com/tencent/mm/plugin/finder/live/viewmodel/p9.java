package com.tencent.mm.plugin.finder.live.viewmodel;

/* loaded from: classes.dex */
public final class p9 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.viewmodel.v9 f117331d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p9(com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var) {
        super(0);
        this.f117331d = v9Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.viewmodel.v9 v9Var = this.f117331d;
        v9Var.R6();
        r45.of1 of1Var = (r45.of1) kz5.n0.Z(v9Var.f117496r);
        if (of1Var != null) {
            v9Var.f117497s = of1Var.getInteger(2);
        }
        v9Var.Q6(v9Var.f117497s);
        i95.m c17 = i95.n0.c(zy2.b6.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.b6.Pd((zy2.b6) c17, "FinderLiveVisitorRoleUIC.MENU_ID_DELETE_ROLE", null, 2, null);
        ((c61.l7) ((zy2.b6) i95.n0.c(zy2.b6.class))).P.e(65536, 9);
        return jz5.f0.f302826a;
    }
}
