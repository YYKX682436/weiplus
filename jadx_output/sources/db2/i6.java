package db2;

/* loaded from: classes2.dex */
public final class i6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final int f228018g;

    /* renamed from: h, reason: collision with root package name */
    public final java.util.List f228019h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f228020i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228021m;

    /* renamed from: n, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228022n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i6(int i17, java.util.List extStats, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(extStats, "extStats");
        this.f228018g = i17;
        this.f228019h = extStats;
        this.f228020i = "Finder.NetSceneReportScreenShot";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6681;
        r45.m21 m21Var = new r45.m21();
        db2.t4 t4Var = db2.t4.f228171a;
        m21Var.set(4, t4Var.a(6681));
        m21Var.set(1, xy2.c.f(qt2Var));
        m21Var.set(2, java.lang.Integer.valueOf(i17));
        m21Var.getList(3).addAll(extStats);
        r45.kv0 kv0Var = (r45.kv0) m21Var.getCustom(4);
        java.util.ArrayList arrayList = new java.util.ArrayList(kz5.d0.q(extStats, 10));
        java.util.Iterator it = extStats.iterator();
        while (it.hasNext()) {
            r45.jn0 jn0Var = (r45.jn0) it.next();
            arrayList.add(new jz5.o(java.lang.Integer.valueOf(qt2Var != null ? qt2Var.getInteger(5) : 0), java.lang.Long.valueOf(jn0Var.getLong(0)), jn0Var.getString(12)));
        }
        t4Var.h(kv0Var, null, arrayList);
        lVar.f70664a = m21Var;
        r45.n21 n21Var = new r45.n21();
        n21Var.set(0, new r45.ie());
        lVar.f70665b = n21Var;
        lVar.f70666c = "/cgi-bin/micromsg-bin/finderextstatsreport";
        this.f228021m = lVar.a();
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        java.util.Iterator it6 = this.f228019h.iterator();
        while (it6.hasNext()) {
            sb6.append(pm0.v.u(((r45.jn0) it6.next()).getLong(0)));
            sb6.append(",");
        }
        com.tencent.mars.xlog.Log.i(this.f228020i, "NetSceneReportScreenShot start " + this.f228018g + ", " + ((java.lang.Object) sb6));
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228020i, "onGYNetEnd " + i17 + ' ' + i18 + ' ' + i19 + ' ' + str + ' ');
        com.tencent.mm.modelbase.u0 u0Var = this.f228022n;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228022n = u0Var;
        return dispatch(sVar, this.f228021m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6681;
    }
}
