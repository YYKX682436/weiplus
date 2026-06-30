package ej4;

/* loaded from: classes8.dex */
public final class f extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253351d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253352e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.g1 f253353f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.Integer f253354g;

    /* renamed from: h, reason: collision with root package name */
    public final pj4.f1 f253355h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f253356i;

    public f(com.tencent.mm.protobuf.g gVar, java.lang.Long l17, java.lang.Long l18, java.lang.Long l19, java.lang.Integer num, int i17, kotlin.jvm.internal.i iVar) {
        jz5.f0 f0Var = null;
        gVar = (i17 & 1) != 0 ? null : gVar;
        l17 = (i17 & 2) != 0 ? null : l17;
        l18 = (i17 & 4) != 0 ? null : l18;
        l19 = (i17 & 8) != 0 ? null : l19;
        num = (i17 & 16) != 0 ? null : num;
        this.f253354g = -1;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4245;
        lVar.f70666c = "/cgi-bin/micromsg-bin/textstatusgetselfhistories";
        lVar.f70664a = new pj4.f1();
        lVar.f70665b = new pj4.g1();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f253352e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfHistoriesReq");
        pj4.f1 f1Var = (pj4.f1) fVar;
        this.f253355h = f1Var;
        f1Var.f355039d = gVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfHistories", "init: op=" + l17 + ", requestOp=" + num + ", startKey=" + l18 + ", limit=" + l19);
        if (l17 != null) {
            l17.longValue();
            f1Var.f355040e = l17.longValue();
            this.f253354g = java.lang.Integer.valueOf((int) l17.longValue());
            f0Var = jz5.f0.f302826a;
        }
        if (f0Var == null) {
            this.f253354g = 0;
        }
        if (num != null) {
            num.intValue();
            this.f253354g = num;
        }
        if (l18 != null) {
            l18.longValue();
            f1Var.f355041f = l18.longValue();
        }
        if (l19 != null) {
            l19.longValue();
            f1Var.f355042g = l19.longValue();
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f253351d = callback;
        return dispatch(dispatcher, this.f253352e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4245;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 rr6, byte[] bArr) {
        kotlin.jvm.internal.o.g(rr6, "rr");
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneTextStatusGetSelfHistories", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253352e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.TextStatusGetSelfHistoriesResp");
            this.f253353f = (pj4.g1) fVar;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253351d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
