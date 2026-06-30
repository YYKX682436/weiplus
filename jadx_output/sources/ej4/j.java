package ej4;

/* loaded from: classes8.dex */
public final class j extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f253365d;

    /* renamed from: e, reason: collision with root package name */
    public final int f253366e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253367f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253368g;

    public j(java.lang.String topicId, java.lang.String statusId, java.lang.String userName, int i17, int i18) {
        kotlin.jvm.internal.o.g(topicId, "topicId");
        kotlin.jvm.internal.o.g(statusId, "statusId");
        kotlin.jvm.internal.o.g(userName, "userName");
        this.f253365d = statusId;
        this.f253366e = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4099;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatuslike";
        lVar.f70664a = new pj4.z1();
        lVar.f70665b = new pj4.a2();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f253368g = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusLikeReq");
        pj4.z1 z1Var = (pj4.z1) fVar;
        z1Var.f355361d = topicId;
        z1Var.f355362e = statusId;
        z1Var.f355363f = userName;
        z1Var.f355364g = i17;
        z1Var.f355365h = i18;
        z1Var.f355366i = statusId + c01.id.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusLike", "topicId:" + topicId + ", statusId:" + statusId + ", username:" + userName + ", action:" + i17 + ", type:" + i18);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253367f = callback;
        return dispatch(dispatcher, this.f253368g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4099;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusLike", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253368g.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusLikeResp");
            ai4.m0.f5173a.v(this.f253365d, this.f253366e != 1);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253367f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
