package wn4;

/* loaded from: classes11.dex */
public final class y extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0, rf0.n {

    /* renamed from: d, reason: collision with root package name */
    public final int f447576d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f447577e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f447578f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f447579g;

    /* renamed from: h, reason: collision with root package name */
    public oq1.n f447580h;

    public y(java.lang.String baseId, java.lang.String patchId, java.util.LinkedList targets, int i17) {
        kotlin.jvm.internal.o.g(baseId, "baseId");
        kotlin.jvm.internal.o.g(patchId, "patchId");
        kotlin.jvm.internal.o.g(targets, "targets");
        this.f447576d = i17;
        this.f447577e = "MicroMsg.Updater.NetSceneManualCheckWxUpdate";
        r45.f35 f35Var = new r45.f35();
        f35Var.f373987d = baseId;
        f35Var.f373988e = patchId;
        f35Var.f373989f = targets;
        f35Var.f373994n = 1;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = f35Var;
        lVar.f70665b = new r45.g35();
        lVar.f70666c = "/cgi-bin/micromsg-bin/prconfig";
        lVar.f70667d = 3899;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f447578f = lVar.a();
        com.tencent.mars.xlog.Log.i("MicroMsg.Updater.NetSceneManualCheckWxUpdate", "Create NetSceneManualCheckWxUpdate baseId:" + baseId + " patchId:" + patchId);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f447579g = u0Var;
        return dispatch(sVar, this.f447578f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 3899;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i(this.f447577e, "errType:" + i18 + ", errCode:" + i19 + ", errMsg:" + str);
        if (i18 == 0 && i19 == 0) {
            kotlin.jvm.internal.o.e(v0Var, "null cannot be cast to non-null type com.tencent.mm.modelbase.CommReqResp");
            com.tencent.mm.protobuf.f fVar = ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.PRConfigResponse");
            r45.j35 j35Var = ((r45.g35) fVar).f374853d;
            if (j35Var != null) {
                this.f447580h = new com.tencent.mm.plugin.hp.util.TinkerSyncResponse(j35Var);
            }
        }
        oq1.n nVar = this.f447580h;
        if (nVar != null) {
            kotlin.jvm.internal.o.e(nVar, "null cannot be cast to non-null type com.tencent.mm.plugin.hp.util.TinkerSyncResponse");
            y73.p.c((com.tencent.mm.plugin.hp.util.TinkerSyncResponse) nVar);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f447579g;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
