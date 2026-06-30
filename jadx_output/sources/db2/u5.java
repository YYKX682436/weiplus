package db2;

/* loaded from: classes.dex */
public final class u5 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f228189d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228190e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228191f;

    /* renamed from: g, reason: collision with root package name */
    public final java.util.List f228192g;

    public u5(java.util.List urlList) {
        kotlin.jvm.internal.o.g(urlList, "urlList");
        this.f228189d = "Finder.NetSceneFinderGetUser";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.ta1 ta1Var = new r45.ta1();
        ta1Var.getList(1).addAll(urlList);
        r45.ua1 ua1Var = new r45.ua1();
        lVar.f70664a = ta1Var;
        lVar.f70665b = ua1Var;
        lVar.f70667d = 3512;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetuser";
        this.f228190e = lVar.a();
        this.f228192g = urlList;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228191f = u0Var;
        return dispatch(sVar, this.f228190e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3512;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228189d, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f228191f;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
