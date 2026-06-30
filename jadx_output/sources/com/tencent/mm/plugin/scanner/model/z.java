package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes4.dex */
public final class z extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f159107d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f159108e;

    public z(java.util.List reqKeyList, boolean z17, r45.vi viVar, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 2) != 0 ? true : z17;
        kotlin.jvm.internal.o.g(reqKeyList, "reqKeyList");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.bv5();
        lVar.f70665b = new r45.cv5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/mmbizscan_v2_retrieval_lite";
        lVar.f70667d = 5057;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.sdk.platformtools.o4 o4Var = com.tencent.mm.plugin.scanner.model.d1.f158851i;
        lVar.f70672i = o4Var != null ? o4Var.getInt("scan_config_retrieval_timeout", 5000) : 5000;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f159108e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.ScanV2RetrievalLiteRequest");
        r45.bv5 bv5Var = (r45.bv5) fVar;
        bv5Var.f371084d.addAll(reqKeyList);
        bv5Var.f371085e = z17;
        kz5.n0.g0(reqKeyList, ",", null, null, 0, null, null, 62, null);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f159107d = u0Var;
        return dispatch(sVar, this.f159108e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5057;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizAiScanImageRetrieval", "AiScanImageRetrieval onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f159107d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
