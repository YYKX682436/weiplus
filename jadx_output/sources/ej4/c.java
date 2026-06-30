package ej4;

/* loaded from: classes2.dex */
public final class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f253332d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f253333e;

    /* renamed from: f, reason: collision with root package name */
    public pj4.f f253334f;

    public c(java.lang.String iconId, int i17) {
        kotlin.jvm.internal.o.g(iconId, "iconId");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70667d = 4301;
        lVar.f70666c = "/cgi-bin/mmbiz-bin/rank/getcheerssignatureforwerun";
        lVar.f70664a = new pj4.e();
        lVar.f70665b = new pj4.f();
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f253333e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.GetCheersSignatureForWerunReq");
        pj4.e eVar = (pj4.e) fVar;
        eVar.f355025d = iconId;
        eVar.f355026e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneSportTextStatus", "iconId:" + iconId + " source:" + i17);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f253332d = u0Var;
        return dispatch(sVar, this.f253333e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4301;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TextStatus.NetSceneSportTextStatus", "netId %d | errType %d | errCode %d | errMsg %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            com.tencent.mm.protobuf.f fVar = this.f253333e.f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.plugin.textstatus.proto.GetCheersSignatureForWerunResp");
            this.f253334f = (pj4.f) fVar;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f253332d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
