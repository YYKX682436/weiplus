package hm3;

/* loaded from: classes9.dex */
public final class o extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282273i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282274m;

    /* renamed from: n, reason: collision with root package name */
    public r45.yr4 f282275n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(b21.r wrapper, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(wrapper, "wrapper");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6448;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivegetjoinmembershipinfo";
        lVar.f70664a = new r45.wr4();
        lVar.f70665b = new r45.yr4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282274m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetJoinMembershipInfoReq");
        r45.xr4 xr4Var = new r45.xr4();
        xr4Var.f390359d = wrapper.f17358t;
        xr4Var.f390360e = wrapper.P;
        ((r45.wr4) fVar).f389401d = xr4Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f282273i = callback;
        return dispatch(dispatcher, this.f282274m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6448;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i("MicroMsg.Mv.NetSceneMusicMvGetJoinMemberShip", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282273i;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.protobuf.f fVar = this.f282274m.f70711b.f70700a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetJoinMembershipInfoResp");
        this.f282275n = (r45.yr4) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282273i;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
