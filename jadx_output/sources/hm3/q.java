package hm3;

/* loaded from: classes4.dex */
public final class q extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f282280i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282281m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282282n;

    /* renamed from: o, reason: collision with root package name */
    public r45.gs4 f282283o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(r45.hf2 songInfo, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        this.f282280i = "MicroMsg.Mv.NetSceneMusicMvGetSongStatus";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5292;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivegetsongstatus";
        lVar.f70664a = new r45.fs4();
        lVar.f70665b = new r45.gs4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetSongStatusReq");
        r45.fs4 fs4Var = (r45.fs4) fVar;
        fs4Var.f374587d = songInfo.getString(5);
        fs4Var.f374588e = songInfo.getString(3);
        fs4Var.f374589f = songInfo.getString(4);
        fs4Var.f374590g = songInfo;
        this.f282282n = a17;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvGetSongStatus", "create NetSceneMusicMvGetSongStatus " + songInfo.getString(5) + ' ' + songInfo.getString(0) + ' ' + songInfo.getString(1));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f282281m = u0Var;
        return dispatch(sVar, this.f282282n, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5292;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i(this.f282280i, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282281m;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.modelbase.o oVar = this.f282282n;
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetSongStatusResp");
        this.f282283o = (r45.gs4) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282281m;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
