package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes2.dex */
public final class y extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final java.lang.String f159099d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f159100e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f159101f;

    public y(java.lang.String str, java.lang.String str2, int i17) {
        this.f159099d = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wi();
        lVar.f70665b = new r45.xi();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/aiscan_image_retrieval";
        lVar.f70667d = 1532;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f159101f = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizAiScanImageRetrievalRequest");
        r45.wi wiVar = (r45.wi) fVar;
        wiVar.f389189d = str2;
        wiVar.f389190e = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f159100e = u0Var;
        return dispatch(sVar, this.f159101f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1532;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizAiScanImageRetrieval", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f159100e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
