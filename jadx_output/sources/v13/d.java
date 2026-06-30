package v13;

/* loaded from: classes12.dex */
public final class d extends p13.c {

    /* renamed from: n, reason: collision with root package name */
    public long f432523n;

    /* renamed from: o, reason: collision with root package name */
    public long f432524o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f432525p = "";

    /* renamed from: q, reason: collision with root package name */
    public long f432526q;

    /* renamed from: r, reason: collision with root package name */
    public long f432527r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ v13.e f432528s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r45.wc4 f432529t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ r45.st4 f432530u;

    public d(v13.e eVar, r45.wc4 wc4Var, r45.st4 st4Var) {
        this.f432528s = eVar;
        this.f432529t = wc4Var;
        this.f432530u = st4Var;
    }

    @Override // p13.c
    public boolean i() {
        com.tencent.mm.plugin.fts.o oVar = ((com.tencent.mm.plugin.fts.d0) i95.n0.c(com.tencent.mm.plugin.fts.d0.class)).f137381f;
        r45.wc4 wc4Var = this.f432529t;
        if (wc4Var != null) {
            int i17 = wc4Var.f389068f;
            if (i17 <= 0) {
                i17 = 31536000;
            }
            p75.n0 n0Var = dm.i3.f237554g;
            n0Var.getClass();
            p75.m c17 = dm.i3.f237557m.x(java.lang.Long.valueOf(c01.id.c() - (i17 * 1000))).c(dm.i3.f237558n.i(0L));
            if (n0Var instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            this.f432523n = new p75.i(n0Var.b(), c17.b(), c17.e()).f(oVar.l());
            java.util.LinkedList items = wc4Var.f389066d;
            kotlin.jvm.internal.o.f(items, "items");
            for (java.util.List<r45.re0> list : d75.b.c(items, 50)) {
                oVar.a();
                for (r45.re0 re0Var : list) {
                    java.lang.String str = re0Var.f384758d;
                    if (str != null && (r26.n0.N(str) ^ true)) {
                        dm.i3 i3Var = new dm.i3();
                        i3Var.y0(re0Var.f384758d);
                        i3Var.w0(0L);
                        i3Var.z0(re0Var.f384759e * 1000);
                        i3Var.replaceToDB(oVar.l(), false);
                    }
                }
                oVar.d();
            }
            this.f432525p = wc4Var.f389067e + ' ' + k35.m1.d(com.tencent.tav.coremedia.TimeUtil.YYYY2MM2DD_HH1MM1SS, wc4Var.f389067e);
            this.f432526q = (long) wc4Var.f389066d.size();
        }
        r45.st4 st4Var = this.f432530u;
        if (st4Var != null) {
            p75.n0 n0Var2 = dm.i3.f237554g;
            n0Var2.getClass();
            p75.m0 i18 = dm.i3.f237558n.i(1L);
            if (n0Var2 instanceof p75.z) {
                throw new java.lang.IllegalArgumentException("Not support multi table delete");
            }
            this.f432524o = new p75.i(n0Var2.b(), i18.b(), i18.e()).f(oVar.l());
            java.util.LinkedList items2 = st4Var.f385974d;
            kotlin.jvm.internal.o.f(items2, "items");
            for (java.util.List<r45.re0> list2 : d75.b.c(items2, 50)) {
                oVar.a();
                for (r45.re0 re0Var2 : list2) {
                    java.lang.String str2 = re0Var2.f384758d;
                    if (str2 != null && (r26.n0.N(str2) ^ true)) {
                        dm.i3 i3Var2 = new dm.i3();
                        i3Var2.y0("net@" + re0Var2.f384758d);
                        i3Var2.w0(1L);
                        i3Var2.z0(c01.id.c());
                        i3Var2.replaceToDB(oVar.l(), false);
                    }
                }
                oVar.d();
            }
            this.f432527r = st4Var.f385974d.size();
        }
        this.f432528s.f432531f = dm.i3.f237554g.h(dm.i3.f237555h.h()).a().n(oVar.l());
        return true;
    }

    @Override // p13.c
    public java.lang.String j() {
        return "deleteLocalResult:" + this.f432523n + " deleteNetWorkResult:" + this.f432524o + " localUpdateTime:" + this.f432525p + " localDictCount:" + this.f432526q + " netWorkCount:" + this.f432527r + " currentDictCount:" + this.f432528s.f432531f;
    }
}
