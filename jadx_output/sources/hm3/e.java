package hm3;

/* loaded from: classes2.dex */
public final class e extends hm3.a {

    /* renamed from: i, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f282237i;

    /* renamed from: m, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f282238m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f282239n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(java.lang.String app_name, java.lang.String entity_id, int i17) {
        super(i17);
        kotlin.jvm.internal.o.g(app_name, "app_name");
        kotlin.jvm.internal.o.g(entity_id, "entity_id");
        this.f282239n = "MicroMsg.NetSceneMusicInterAction@" + hashCode();
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 8967;
        lVar.f70666c = "/cgi-bin/micromsg-bin/musiclivegetinteractioninfo";
        lVar.f70664a = new r45.ur4();
        lVar.f70665b = new r45.vr4();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f282238m = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MusicLiveGetInteractionInfoReq");
        r45.ur4 ur4Var = (r45.ur4) fVar;
        ur4Var.f387594d = app_name;
        ur4Var.f387595e = entity_id;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f282237i = u0Var;
        return dispatch(sVar, this.f282238m, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 8967;
    }

    @Override // hm3.a, com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f282237i;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        com.tencent.mars.xlog.Log.i(this.f282239n, "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
    }
}
