package db2;

/* loaded from: classes.dex */
public final class x5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228236g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228237h;

    /* renamed from: i, reason: collision with root package name */
    public int f228238i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x5(java.lang.String friendUsername, com.tencent.mm.protobuf.g gVar, r45.qt2 qt2Var) {
        super(qt2Var);
        kotlin.jvm.internal.o.g(friendUsername, "friendUsername");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6208;
        r45.xf3 xf3Var = new r45.xf3();
        xf3Var.set(1, db2.t4.f228171a.b(6208, qt2Var));
        xf3Var.set(2, gVar);
        xf3Var.set(3, friendUsername);
        jz5.l P6 = ((ey2.k0) pf5.u.f353936a.e(c61.l7.class).a(ey2.k0.class)).P6();
        xf3Var.set(4, java.lang.Float.valueOf(((java.lang.Number) P6.f302833d).floatValue()));
        xf3Var.set(5, java.lang.Float.valueOf(((java.lang.Number) P6.f302834e).floatValue()));
        lVar.f70664a = xf3Var;
        lVar.f70665b = new r45.yf3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getfinderrelativepoilist";
        this.f228236g = lVar.a();
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderPoiRelateStream", "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f228237h;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228237h = u0Var;
        return dispatch(sVar, this.f228236g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6208;
    }
}
