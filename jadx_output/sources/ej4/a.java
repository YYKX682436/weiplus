package ej4;

/* loaded from: classes10.dex */
public final class a extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f253320d;

    /* renamed from: e, reason: collision with root package name */
    public final int f253321e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253322f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253323g;

    public a(java.lang.String statusId, int i17) {
        kotlin.jvm.internal.o.g(statusId, "statusId");
        this.f253320d = statusId;
        this.f253321e = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 5967;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusdeleteselfhistory";
        lVar.f70664a = new pj4.z0();
        lVar.f70665b = new pj4.a1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f253323g = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusDeleteSelfHistoryReq");
        pj4.z0 z0Var = (pj4.z0) fVar;
        z0Var.f355359d = statusId;
        z0Var.f355360e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneDeleteSelfHistory", "statusId:" + statusId);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253322f = callback;
        return dispatch(dispatcher, this.f253323g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5967;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneDeleteSelfHistory", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            ai4.m0.f5173a.G().u(bk4.k1.a(), this.f253320d);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253322f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
