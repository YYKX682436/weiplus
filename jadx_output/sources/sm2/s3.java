package sm2;

/* loaded from: classes3.dex */
public final class s3 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ sm2.o4 f409693d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s3(sm2.o4 o4Var) {
        super(0);
        this.f409693d = o4Var;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        te2.a aVar;
        st2.h1 h1Var;
        sm2.o4 o4Var = this.f409693d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = o4Var.f409628o;
        if (mgVar != null) {
            java.util.List list = ((mm2.x4) o4Var.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list, false, false, null, 14, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = o4Var.f409638x;
        if (de0Var != null) {
            java.util.List list2 = ((mm2.x4) o4Var.c(mm2.x4.class)).f329531i;
            kotlin.jvm.internal.o.f(list2, "<get-topMsgList>(...)");
            de0Var.z1(list2);
        }
        pn2.f fVar = o4Var.B;
        if (fVar != null) {
            fVar.z1();
        }
        my2.e eVar = o4Var.D;
        if (eVar != null) {
            eVar.w1();
        }
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = o4Var.f409635u;
        if (owVar != null) {
            java.util.List list3 = ((mm2.x4) o4Var.c(mm2.x4.class)).f329532m;
            kotlin.jvm.internal.o.f(list3, "<get-highLightCheerList>(...)");
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.nw(owVar, list3));
        }
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var = o4Var.N;
        if (c4Var != null) {
            c4Var.f112106z.o();
        }
        ((ws2.j2) o4Var.c(ws2.j2.class)).N6();
        com.tencent.mm.plugin.finder.live.plugin.ww wwVar = o4Var.O;
        if (wwVar != null) {
            wwVar.y1();
        }
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var = o4Var.f409637w;
        if (ga0Var != null && (h1Var = ga0Var.f112668r) != null) {
            h1Var.f();
        }
        fm2.a aVar2 = o4Var.f19595c;
        if (aVar2 != null) {
            qo0.c.a(aVar2, qo0.b.S2, null, 2, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.v6 v6Var = o4Var.f409639y;
        if (v6Var != null) {
            v6Var.u1(((mm2.c1) o4Var.c(mm2.c1.class)).E3.f329470c);
        }
        com.tencent.mm.plugin.finder.live.plugin.ow owVar2 = o4Var.f409635u;
        if (owVar2 != null) {
            owVar2.J1();
        }
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = o4Var.f409620k;
        if (nd0Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.nd0.P1(nd0Var, null, false, 3, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var2 = o4Var.f409620k;
        if (nd0Var2 != null) {
            nd0Var2.u1();
        }
        com.tencent.mm.plugin.finder.live.plugin.d1 d1Var = o4Var.F;
        if (d1Var != null && (aVar = d1Var.f112219p) != null) {
            ((te2.l) aVar).g();
        }
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var2 = o4Var.N;
        if (c4Var2 != null) {
            c4Var2.G1();
        }
        com.tencent.mm.plugin.finder.live.plugin.c4 c4Var3 = o4Var.N;
        if (c4Var3 != null) {
            c4Var3.C1();
        }
        return jz5.f0.f302826a;
    }
}
