package db2;

/* loaded from: classes.dex */
public final class n5 extends az2.u implements zy2.kc {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228100g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228101h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f228102i;

    public n5(com.tencent.mm.protobuf.g gVar, long j17, int i17, r45.qt2 qt2Var) {
        super(null, 1, null);
        this.f228102i = "Finder.NetSceneFinderGetFansList";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3531;
        r45.u51 u51Var = new r45.u51();
        u51Var.set(1, xy2.c.f(qt2Var));
        u51Var.set(3, gVar);
        u51Var.set(4, db2.t4.f228171a.a(3531));
        u51Var.set(5, java.lang.Long.valueOf(j17));
        u51Var.set(6, java.lang.Integer.valueOf(i17));
        lVar.f70664a = u51Var;
        lVar.f70665b = new r45.v51();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfanslist";
        this.f228100g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetFansList", "NetSceneFinderGetFansList,liveId:" + j17 + ",scene:" + i17);
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228102i, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 9L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 10L, 1L, false);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f228101h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228101h = u0Var;
        return dispatch(sVar, this.f228100g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3531;
    }
}
