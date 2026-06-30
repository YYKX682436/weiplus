package tg3;

/* loaded from: classes11.dex */
public class r1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, l90.l {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f419213d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f419214e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f419215f;

    /* renamed from: g, reason: collision with root package name */
    public final int f419216g;

    public r1(java.lang.String str, int i17) {
        this(str, 1, i17, false);
    }

    public r45.iw5 H() {
        r45.iw5 iw5Var = (r45.iw5) this.f419214e.f70711b.f70700a;
        if (iw5Var != null) {
            java.util.Iterator it = iw5Var.E.iterator();
            while (it.hasNext()) {
                r45.gw5 gw5Var = (r45.gw5) it.next();
                ((us.a) ((vs.e) i95.n0.c(vs.e.class))).Bi(gw5Var.f375561d.f372756d, 0, gw5Var.F);
            }
        }
        return iw5Var;
    }

    public boolean I() {
        return this.f419215f;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f419213d = u0Var;
        return dispatch(sVar, this.f419214e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 106;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.iw5 iw5Var = (r45.iw5) this.f419214e.f70711b.f70700a;
        if (iw5Var != null && iw5Var.D > 0) {
            java.util.Iterator it = iw5Var.E.iterator();
            while (it.hasNext()) {
                r45.gw5 gw5Var = (r45.gw5) it.next();
                r45.du5 du5Var = gw5Var.f375561d;
                com.tencent.mm.modelavatar.r0 r0Var = new com.tencent.mm.modelavatar.r0();
                r0Var.f70529a = x51.j1.g(du5Var);
                r0Var.f70533e = gw5Var.D;
                r0Var.f70532d = gw5Var.E;
                r0Var.f70537i = -1;
                r0Var.f70530b = 3;
                r0Var.f70534f = 1;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var);
                vs.e eVar = (vs.e) i95.n0.c(vs.e.class);
                ((us.a) eVar).Bi(x51.j1.g(gw5Var.f375561d), this.f419216g, gw5Var.F);
            }
        } else if (iw5Var != null && !com.tencent.mm.sdk.platformtools.t8.K0(x51.j1.g(iw5Var.f377356d))) {
            java.lang.String g17 = x51.j1.g(iw5Var.f377356d);
            com.tencent.mm.modelavatar.r0 r0Var2 = new com.tencent.mm.modelavatar.r0();
            r0Var2.f70529a = g17;
            r0Var2.f70533e = iw5Var.F;
            r0Var2.f70532d = iw5Var.G;
            r0Var2.f70537i = -1;
            r0Var2.f70530b = 3;
            r0Var2.f70534f = 1;
            ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
            com.tencent.mm.modelavatar.d1.Ni().y0(r0Var2);
        }
        if (iw5Var != null) {
            java.util.Iterator it6 = iw5Var.N.iterator();
            while (it6.hasNext()) {
                r45.cx5 cx5Var = (r45.cx5) it6.next();
                com.tencent.mm.modelavatar.r0 r0Var3 = new com.tencent.mm.modelavatar.r0();
                r0Var3.f70529a = cx5Var.f371900d;
                r0Var3.f70533e = cx5Var.f371905i;
                r0Var3.f70532d = cx5Var.f371906m;
                r0Var3.f70537i = -1;
                r0Var3.f70530b = 3;
                r0Var3.f70534f = 1;
                ((com.tencent.mm.feature.avatar.w) ((kv.a0) i95.n0.c(kv.a0.class))).getClass();
                com.tencent.mm.modelavatar.d1.Ni().y0(r0Var3);
            }
        }
        this.f419213d.onSceneEnd(i18, i19, str, this);
    }

    public r1(java.lang.String str, int i17, int i18, boolean z17) {
        this(str, i17, i18, z17, 1);
    }

    public r1(java.lang.String str, int i17, int i18, boolean z17, int i19) {
        this.f419215f = z17;
        this.f419216g = i18;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hw5();
        lVar.f70665b = new r45.iw5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/searchcontact";
        lVar.f70667d = 106;
        lVar.f70668e = 34;
        lVar.f70669f = 1000000034;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f419214e = a17;
        r45.hw5 hw5Var = (r45.hw5) a17.f70710a.f70684a;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str;
        du5Var.f372757e = true;
        hw5Var.f376516d = du5Var;
        hw5Var.f376519g = i17;
        hw5Var.f376520h = i18;
        hw5Var.f376521i = i19;
    }
}
