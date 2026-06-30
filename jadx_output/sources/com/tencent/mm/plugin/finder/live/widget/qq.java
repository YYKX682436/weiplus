package com.tencent.mm.plugin.finder.live.widget;

/* loaded from: classes3.dex */
public final class qq extends kotlin.jvm.internal.q implements yz5.l {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ com.tencent.mm.plugin.finder.live.widget.rq f119543d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qq(com.tencent.mm.plugin.finder.live.widget.rq rqVar) {
        super(1);
        this.f119543d = rqVar;
    }

    @Override // yz5.l
    public java.lang.Object invoke(java.lang.Object obj) {
        r45.n73 gameAppInfo = (r45.n73) obj;
        kotlin.jvm.internal.o.g(gameAppInfo, "gameAppInfo");
        r45.z53 z53Var = (r45.z53) gameAppInfo.getCustom(1);
        java.lang.String string = z53Var != null ? z53Var.getString(0) : null;
        cl0.g gVar = new cl0.g();
        gVar.o("type", 13);
        gVar.h("game_id", string);
        i95.m c17 = i95.n0.c(ml2.j0.class);
        kotlin.jvm.internal.o.f(c17, "getService(...)");
        zy2.zb zbVar = (zy2.zb) c17;
        ml2.c1 c1Var = ml2.c1.f327325e;
        zy2.zb.j5(zbVar, 47L, gVar.toString(), null, 4, null);
        dk2.ef efVar = dk2.ef.f233372a;
        mm2.o2 o2Var = (mm2.o2) efVar.i(mm2.o2.class);
        if (o2Var != null) {
            o2Var.N6(gameAppInfo);
        }
        r45.q12 q12Var = new r45.q12();
        q12Var.set(0, 3);
        mm2.g1 g1Var = (mm2.g1) efVar.i(mm2.g1.class);
        kotlinx.coroutines.flow.j2 j2Var = g1Var != null ? g1Var.f329068f : null;
        if (j2Var != null) {
            ((kotlinx.coroutines.flow.h3) j2Var).k(q12Var);
        }
        mm2.g1 g1Var2 = (mm2.g1) efVar.i(mm2.g1.class);
        kotlinx.coroutines.flow.j2 j2Var2 = g1Var2 != null ? g1Var2.f329071i : null;
        if (j2Var2 != null) {
            ((kotlinx.coroutines.flow.h3) j2Var2).k(gameAppInfo);
        }
        mm2.s1 s1Var = (mm2.s1) efVar.i(mm2.s1.class);
        if (s1Var != null) {
            s1Var.S6(q12Var);
        }
        com.tencent.mm.plugin.finder.live.widget.e0 e0Var = this.f119543d;
        com.tencent.mm.plugin.finder.live.widget.e0 F = e0Var.F(e0Var);
        if (F != null) {
            com.tencent.mm.plugin.finder.live.widget.e0.t(F, false, 1, null);
        }
        return jz5.f0.f302826a;
    }
}
