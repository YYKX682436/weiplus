package db2;

/* loaded from: classes5.dex */
public final class z5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228263g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228264h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z5(java.util.LinkedList reqItems) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(reqItems, "reqItems");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6218;
        r45.s81 s81Var = new r45.s81();
        s81Var.set(1, db2.t4.f228171a.a(6218));
        s81Var.set(2, reqItems);
        s81Var.set(4, g92.b.f269769e.U());
        lVar.f70664a = s81Var;
        lVar.f70665b = new r45.t81();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetmsgsession";
        this.f228263g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderSessionStatus", "NetSceneFinderSessionStatus");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            java.lang.StringBuilder sb6 = new java.lang.StringBuilder();
            sb6.append(i18);
            sb6.append(',');
            sb6.append(i19);
            g0Var.d(20492, 7L, sb6.toString());
            g0Var.C(1473L, 7L, 1L);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f228264h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228264h = u0Var;
        return dispatch(sVar, this.f228263g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6218;
    }
}
