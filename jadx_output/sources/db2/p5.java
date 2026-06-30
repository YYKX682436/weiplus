package db2;

/* loaded from: classes.dex */
public final class p5 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228119g;

    /* renamed from: h, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228120h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f228121i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p5(com.tencent.mm.protobuf.g gVar, java.lang.String userName) {
        super(null, 1, null);
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f228121i = "Finder.NetSceneFinderGetFollowTopicList";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 712;
        r45.m61 m61Var = new r45.m61();
        m61Var.set(1, gVar);
        m61Var.set(3, db2.t4.f228171a.a(712));
        m61Var.set(2, userName);
        lVar.f70664a = m61Var;
        lVar.f70665b = new r45.n61();
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfollowtopiclist";
        this.f228119g = lVar.a();
        com.tencent.mars.xlog.Log.i("Finder.NetSceneFinderGetFollowTopicList", "NetSceneFinderGetFollowList init ");
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228121i, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        if (i18 == 0 && i19 == 0) {
            jx3.f.INSTANCE.idkeyStat(1279L, 7L, 1L, false);
        } else {
            jx3.f.INSTANCE.idkeyStat(1279L, 8L, 1L, false);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f228120h;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228120h = u0Var;
        return dispatch(sVar, this.f228119g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 712;
    }
}
