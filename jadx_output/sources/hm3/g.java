package hm3;

/* loaded from: classes2.dex */
public final class g extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f282242i;

    /* renamed from: m, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282243m;

    /* renamed from: n, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282244n;

    /* renamed from: o, reason: collision with root package name */
    public r45.pr4 f282245o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(r45.hf2 songInfo, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(songInfo, "songInfo");
        this.f282242i = "MicroMsg.Mv.NetSceneMusicMvCheckPermission";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5286;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivecheckpermission";
        lVar.f70664a = new r45.or4();
        lVar.f70665b = new r45.pr4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveCheckPermissionReq");
        ((r45.or4) fVar).f382463e = songInfo;
        this.f282244n = a17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f282243m = u0Var;
        return dispatch(sVar, this.f282244n, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5286;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        super.onGYNetEnd(i17, i18, i19, str, v0Var, bArr);
        com.tencent.mars.xlog.Log.i(this.f282242i, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 != 0 || i19 != 0) {
            com.tencent.mm.modelbase.u0 u0Var = this.f282243m;
            if (u0Var != null) {
                u0Var.onSceneEnd(i18, i19, str, this);
                return;
            }
            return;
        }
        com.tencent.mm.modelbase.o oVar = this.f282244n;
        com.tencent.mm.protobuf.f fVar = oVar != null ? oVar.f70711b.f70700a : null;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveCheckPermissionResp");
        this.f282245o = (r45.pr4) fVar;
        com.tencent.mm.modelbase.u0 u0Var2 = this.f282243m;
        if (u0Var2 != null) {
            u0Var2.onSceneEnd(i18, i19, str, this);
        }
    }
}
