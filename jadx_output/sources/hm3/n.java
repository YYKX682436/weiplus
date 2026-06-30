package hm3;

/* loaded from: classes.dex */
public final class n extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282270i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282271m;

    /* renamed from: n, reason: collision with root package name */
    public r45.d71 f282272n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(java.lang.String finderUserName, com.tencent.mm.protobuf.g gVar) {
        super(0, 1, null);
        kotlin.jvm.internal.o.g(finderUserName, "finderUserName");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 3965;
        lVar.f70666c = "/cgi-bin/micromsg-bin/findergetlikedlist";
        lVar.f70664a = new r45.c71();
        lVar.f70665b = new r45.d71();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282271m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListRequest");
        r45.c71 c71Var = (r45.c71) fVar;
        c71Var.set(1, 0L);
        c71Var.set(2, finderUserName);
        c71Var.set(3, gVar);
        c71Var.set(5, "");
        c71Var.set(6, 0);
        r45.kv0 kv0Var = new r45.kv0();
        kv0Var.set(1, 93);
        c71Var.set(4, kv0Var);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282270i = callback;
        return dispatch(dispatcher, this.f282271m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3965;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvGetFinderLikeFeed", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282270i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282271m.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.FinderGetLikedListResponse");
        this.f282272n = (r45.d71) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282270i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
