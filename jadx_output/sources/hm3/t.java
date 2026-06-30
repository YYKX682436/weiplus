package hm3;

/* loaded from: classes4.dex */
public final class t extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282290i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282291m;

    /* renamed from: n, reason: collision with root package name */
    public r45.qs4 f282292n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(r45.ns4 msg, r45.hf2 songInfo, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(msg, "msg");
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6672;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivepostlivemsg";
        lVar.f70664a = new r45.ps4();
        lVar.f70665b = new r45.qs4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282291m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLivePostLiveMsgReq");
        r45.ps4 ps4Var = (r45.ps4) fVar;
        ps4Var.f383388d = msg;
        ps4Var.f383389e = songInfo;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282290i = callback;
        return dispatch(dispatcher, this.f282291m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6672;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvPostLiveMsg", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282290i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282291m.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLivePostLiveMsgResp");
        this.f282292n = (r45.qs4) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282290i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
