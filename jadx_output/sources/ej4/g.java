package ej4;

/* loaded from: classes2.dex */
public final class g extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253357d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253358e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.k1 f253359f;

    public g(java.lang.String statusId, com.tencent.mm.protobuf.g gVar) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 6621;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusgetselflikeds";
        lVar.f70664a = new pj4.j1();
        lVar.f70665b = new pj4.k1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f253358e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfLikedsReq");
        pj4.j1 j1Var = (pj4.j1) fVar;
        j1Var.f355143d = statusId;
        j1Var.f355144e = gVar;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253357d = callback;
        return dispatch(dispatcher, this.f253358e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 6621;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfLikeds", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253358e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfLikedsResp");
            this.f253359f = (pj4.k1) fVar;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253357d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
