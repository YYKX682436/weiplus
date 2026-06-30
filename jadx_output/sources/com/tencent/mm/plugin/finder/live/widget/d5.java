package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class d5 extends kotlin.jvm.internal.q implements yz5.p {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.cf f118056d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.e5 f118057e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d5(com.tencent.mm.plugin.finder.live.widget.cf cfVar, com.tencent.mm.plugin.finder.live.widget.e5 e5Var) {
        super(2);
        this.f118056d = cfVar;
        this.f118057e = e5Var;
    }

    @Override // yz5.p
    public java.lang.Object invoke(java.lang.Object obj, java.lang.Object obj2) {
        jz5.f0 f0Var;
        mm2.n2 n2Var;
        r45.eq1 eq1Var;
        df2.od odVar;
        boolean booleanValue = ((java.lang.Boolean) obj).booleanValue();
        java.lang.String fansClubName = (java.lang.String) obj2;
        kotlin.jvm.internal.o.g(fansClubName, "fansClubName");
        jz5.f0 f0Var2 = jz5.f0.f302826a;
        if (booleanValue) {
            dk2.ef efVar = dk2.ef.f233372a;
            com.tencent.mm.plugin.finder.live.controller.base.LiveRoomControllerStore liveRoomControllerStore = dk2.ef.f233371J;
            if (liveRoomControllerStore != null && (odVar = (df2.od) liveRoomControllerStore.controller(df2.od.class)) != null) {
                odVar.e7(r45.n72.kActionType_CreateFansClub);
            }
            com.tencent.mm.plugin.finder.live.widget.cf cfVar = this.f118056d;
            cfVar.e0();
            mm2.n2 n2Var2 = (mm2.n2) efVar.i(mm2.n2.class);
            if (n2Var2 == null || (eq1Var = n2Var2.f329279g) == null) {
                f0Var = null;
            } else {
                eq1Var.set(0, fansClubName);
                eq1Var.set(1, java.lang.Boolean.TRUE);
                f0Var = f0Var2;
            }
            if (f0Var == null && (n2Var = (mm2.n2) efVar.i(mm2.n2.class)) != null) {
                r45.eq1 eq1Var2 = new r45.eq1();
                eq1Var2.set(0, fansClubName);
                java.lang.Boolean bool = java.lang.Boolean.TRUE;
                eq1Var2.set(1, bool);
                eq1Var2.set(4, bool);
                n2Var.f329279g = eq1Var2;
            }
            gk2.e eVar = dk2.ef.I;
            if (eVar != null) {
                new ek2.z(((mm2.e1) eVar.a(mm2.e1.class)).f328988r.getLong(0), ((mm2.e1) eVar.a(mm2.e1.class)).f328983m, ((mm2.e1) eVar.a(mm2.e1.class)).f328992v, xy2.c.e(cfVar.f118183e), 1, ((mm2.e1) eVar.a(mm2.e1.class)).f328985o, zl2.r4.f473950a.b0(eVar), 1, null, null, null, 1792, null).l();
            }
            this.f118057e.f118226a.h(null, true);
        }
        return f0Var2;
    }
}
