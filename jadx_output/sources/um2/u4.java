package um2;

/* loaded from: classes3.dex */
public final class u4 extends kotlin.jvm.internal.q implements yz5.a {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ um2.x5 f428980d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ boolean f428981e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u4(um2.x5 x5Var, boolean z17) {
        super(0);
        this.f428980d = x5Var;
        this.f428981e = z17;
    }

    @Override // yz5.a
    public java.lang.Object invoke() {
        com.tencent.mm.plugin.finder.live.plugin.ga0 ga0Var;
        st2.h1 h1Var;
        te2.a aVar;
        r45.qz1 qz1Var;
        hn0.r rVar;
        hn0.r rVar2;
        kn0.g gVar;
        hn0.r rVar3;
        kn0.g gVar2;
        um2.x5 x5Var = this.f428980d;
        com.tencent.mm.plugin.finder.live.plugin.de0 de0Var = x5Var.V;
        if (de0Var != null) {
            java.util.List list = ((mm2.x4) x5Var.c(mm2.x4.class)).f329531i;
            kotlin.jvm.internal.o.f(list, "<get-topMsgList>(...)");
            de0Var.z1(list);
        }
        um2.x5 x5Var2 = this.f428980d;
        com.tencent.mm.plugin.finder.live.plugin.mg mgVar = x5Var2.f429071s;
        if (mgVar != null) {
            java.util.List list2 = ((mm2.x4) x5Var2.c(mm2.x4.class)).f329528f;
            kotlin.jvm.internal.o.f(list2, "<get-msgList>(...)");
            com.tencent.mm.plugin.finder.live.plugin.mg.U1(mgVar, list2, false, false, java.lang.Boolean.valueOf(!this.f428981e), 6, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.ag0 ag0Var = this.f428980d.f429075t0;
        if (ag0Var != null) {
            ag0Var.C1(false);
        }
        pn2.f fVar = this.f428980d.f429028d0;
        if (fVar != null) {
            fVar.z1();
        }
        my2.e eVar = this.f428980d.f429033f0;
        if (eVar != null) {
            eVar.w1();
        }
        um2.x5 x5Var3 = this.f428980d;
        if (((mm2.c1) x5Var3.c(mm2.c1.class)).J3) {
            co0.s E = x5Var3.E();
            if (((E == null || (rVar3 = E.R1) == null || (gVar2 = rVar3.f282410b) == null) ? -1 : gVar2.f309543j) < 0 && ((mm2.c1) x5Var3.c(mm2.c1.class)).P6() == 1 && (qz1Var = (r45.qz1) ((mm2.e1) x5Var3.c(mm2.e1.class)).f328988r.getCustom(8)) != null) {
                kn0.i iVar = ((mm2.e1) x5Var3.c(mm2.e1.class)).f328990t;
                java.lang.String e17 = (iVar == null || (gVar = iVar.f309558b) == null) ? null : gVar.e(qz1Var.getInteger(2));
                com.tencent.mars.xlog.Log.i(x5Var3.f429032f, "trySwitchCdnStream QosControl cfg: " + qz1Var.getInteger(2));
                if (com.tencent.mm.sdk.platformtools.t8.K0(e17)) {
                    co0.s E2 = x5Var3.E();
                    if (E2 != null && (rVar2 = E2.R1) != null) {
                        hn0.r.m(rVar2, qz1Var.getInteger(2), qz1Var.getString(3), false, ((je2.z) x5Var3.c(je2.z.class)).P6(), 4, null);
                    }
                } else {
                    co0.s E3 = x5Var3.E();
                    if (E3 != null && (rVar = E3.R1) != null) {
                        hn0.r.m(rVar, qz1Var.getInteger(2), null, false, ((je2.z) x5Var3.c(je2.z.class)).P6(), 6, null);
                    }
                }
            }
        }
        um2.x5 x5Var4 = this.f428980d;
        com.tencent.mm.plugin.finder.live.plugin.ow owVar = x5Var4.A;
        if (owVar != null) {
            java.util.List list3 = ((mm2.x4) x5Var4.c(mm2.x4.class)).f329532m;
            kotlin.jvm.internal.o.f(list3, "<get-highLightCheerList>(...)");
            pm0.v.X(new com.tencent.mm.plugin.finder.live.plugin.nw(owVar, list3));
        }
        com.tencent.mm.plugin.finder.live.plugin.ww wwVar = this.f428980d.f429091z0;
        if (wwVar != null) {
            wwVar.y1();
        }
        boolean z17 = ((mm2.c1) this.f428980d.c(mm2.c1.class)).T;
        boolean z18 = ((mm2.n0) this.f428980d.c(mm2.n0.class)).f329273r;
        if ((z17 || z18) && (ga0Var = this.f428980d.f429021J) != null && (h1Var = ga0Var.f112668r) != null) {
            h1Var.f();
        }
        fm2.c cVar = this.f428980d.f19606c;
        if (cVar != null) {
            qo0.c.a(cVar, qo0.b.S2, null, 2, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.ow owVar2 = this.f428980d.A;
        if (owVar2 != null) {
            owVar2.J1();
        }
        com.tencent.mm.plugin.finder.live.plugin.d1 d1Var = this.f428980d.f429039h0;
        if (d1Var != null && (aVar = d1Var.f112219p) != null) {
            ((te2.l) aVar).g();
        }
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var = this.f428980d.f429062p;
        if (nd0Var != null) {
            com.tencent.mm.plugin.finder.live.plugin.nd0.P1(nd0Var, null, false, 3, null);
        }
        com.tencent.mm.plugin.finder.live.plugin.nd0 nd0Var2 = this.f428980d.f429062p;
        if (nd0Var2 != null) {
            nd0Var2.u1();
        }
        return jz5.f0.f302826a;
    }
}
