package hm3;

/* loaded from: classes2.dex */
public final class s extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282287i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282288m;

    /* renamed from: n, reason: collision with root package name */
    public r45.ks4 f282289n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s(r45.hf2 songInfo, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6893;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivejoin";
        lVar.f70664a = new r45.js4();
        lVar.f70665b = new r45.ks4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282288m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveJoinReq");
        ((r45.js4) fVar).f378091e = songInfo;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvJoin", "create NetSceneMusicMvJoin: " + songInfo.getString(5) + ' ' + songInfo.getString(0));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282287i = callback;
        return dispatch(dispatcher, this.f282288m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6893;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvJoin", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282287i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282288m.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveJoinResp");
        this.f282289n = (r45.ks4) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282287i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
