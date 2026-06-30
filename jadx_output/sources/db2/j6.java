package db2;

/* loaded from: classes2.dex */
public final class j6 extends az2.u {

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f228034g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f228035h;

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f228036i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public j6(java.lang.String query) {
        super(null, 1, 0 == true ? 1 : 0);
        kotlin.jvm.internal.o.g(query, "query");
        this.f228034g = "Finder.NetSceneRingtoneSuggestion";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8968;
        lVar.f70666c = "/cgi-bin/micromsg-bin/ringbacksearchwordsuggest";
        t45.s0 s0Var = new t45.s0();
        s0Var.f415641d = query;
        lVar.f70664a = s0Var;
        lVar.f70665b = new t45.t0();
        this.f228035h = lVar.a();
    }

    @Override // az2.u
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f228034g, "errType " + i18 + ", errCode " + i19 + ", errMsg " + str);
        com.tencent.mm.modelbase.u0 u0Var = this.f228036i;
        if (u0Var != null) {
            kotlin.jvm.internal.o.d(u0Var);
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f228036i = u0Var;
        return dispatch(sVar, this.f228035h, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 8968;
    }
}
