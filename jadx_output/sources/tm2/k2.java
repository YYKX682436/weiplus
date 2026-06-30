package tm2;

/* loaded from: classes3.dex */
public final class k2 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ tm2.s2 f420539d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k2(tm2.s2 s2Var) {
        super(0);
        this.f420539d = s2Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        te2.a aVar;
        st2.h1 h1Var;
        tm2.s2 s2Var = this.f420539d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = s2Var.f420603o;
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) s2Var.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list, false, false, null, 14, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = s2Var.f420613x;
        if (de0Var != null) {
            java.util.List list2 = ((mm2.x4) s2Var.c(mm2.x4.class)).f329531i;
            kotlin.jvm.internal.o.f(list2, "<get-topMsgList>(...)");
            de0Var.z1(list2);
        }
        pn2.f fVar = s2Var.H;
        if (fVar != null) {
            fVar.z1();
        }
        my2.e eVar = s2Var.f420580J;
        if (eVar != null) {
            eVar.w1();
        }
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = s2Var.f420610u;
        if (owVar != null) {
            java.util.List list3 = ((mm2.x4) s2Var.c(mm2.x4.class)).f329532m;
            kotlin.jvm.internal.o.f(list3, "<get-highLightCheerList>(...)");
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.nw(owVar, list3));
        }
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = s2Var.V;
        if (c4Var != null) {
            c4Var.f112106z.o();
        }
        ((ws2.j2) s2Var.c(ws2.j2.class)).N6();
        com.tencent.mm.plugin.finder.live.plugin.ww wwVar = s2Var.X;
        if (wwVar != null) {
            wwVar.y1();
        }
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var = s2Var.f420612w;
        if (ga0Var != null && (h1Var = ga0Var.f112668r) != null) {
            h1Var.f();
        }
        fm2.b bVar = s2Var.f19601c;
        if (bVar != null) {
            qo0.c.a(bVar, qo0.b.S2, null, 2, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = s2Var.f420614y;
        if (v6Var != null) {
            v6Var.u1(((mm2.c1) s2Var.c(mm2.c1.class)).E3.f329470c);
        }
        com.tencent.mm.plugin.finder.live.plugin.ow owVar2 = s2Var.f420610u;
        if (owVar2 != null) {
            owVar2.J1();
        }
        com.tencent.mm.plugin.finder.live.plugin.d1 d1Var = s2Var.L;
        if (d1Var != null && (aVar = d1Var.f112219p) != null) {
            ((te2.l) aVar).g();
        }
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var2 = s2Var.V;
        if (c4Var2 != null) {
            c4Var2.G1();
        }
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var3 = s2Var.V;
        if (c4Var3 != null) {
            c4Var3.C1();
        }
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = s2Var.f420595k;
        if (nd0Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.nd0.P1(nd0Var, null, false, 3, null);
        }
        return jz5.f0.f302826a;
    }
}
