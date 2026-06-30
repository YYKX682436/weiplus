package hm3;

/* loaded from: classes.dex */
public final class l extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282260i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282261m;

    /* renamed from: n, reason: collision with root package name */
    public r45.x51 f282262n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(java.lang.String finderUserName, com.tencent.mm.protobuf.g gVar) {
        super(0, 1, null);
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3966;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetfavlist";
        lVar.f70664a = new r45.w51();
        lVar.f70665b = new r45.x51();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282261m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListRequest");
        r45.w51 w51Var = (r45.w51) fVar;
        w51Var.set(2, finderUserName);
        w51Var.set(3, gVar);
        w51Var.set(4, 0);
        r45.kv0 kv0Var = new r45.kv0();
        kv0Var.set(1, 93);
        w51Var.set(1, kv0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282260i = callback;
        return dispatch(dispatcher, this.f282261m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3966;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvGetFinderFavFeed", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282260i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282261m.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetFavListResponse");
        this.f282262n = (r45.x51) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282260i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
