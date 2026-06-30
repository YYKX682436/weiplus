package hm3;

/* loaded from: classes4.dex */
public final class r extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282284i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282285m;

    /* renamed from: n, reason: collision with root package name */
    public r45.is4 f282286n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(java.lang.String songId, com.tencent.mm.protobuf.g cookie, boolean z17, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(songId, "songId");
        kotlin.jvm.internal.o.g(cookie, "cookie");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6820;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musicliveheartbeat";
        lVar.f70664a = new r45.hs4();
        lVar.f70665b = new r45.is4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282285m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveHeartbeatReq");
        r45.hs4 hs4Var = (r45.hs4) fVar;
        hs4Var.f376426d = songId;
        hs4Var.f376427e = cookie;
        hs4Var.f376428f = z17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282284i = callback;
        return dispatch(dispatcher, this.f282285m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6820;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvHeartbeat", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282284i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282285m.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveHeartbeatResp");
        this.f282286n = (r45.is4) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282284i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
