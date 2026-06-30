package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes2.dex */
public final class a0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f158804d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f158805e;

    public a0(java.lang.String url) {
        kotlin.jvm.internal.o.g(url, "url");
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nk();
        lVar.f70665b = new r45.ok();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/finder/bizfinderliveqrcode";
        lVar.f70667d = 5900;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f158805e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.BizFinderLiveQrCodeReq");
        ((r45.nk) fVar).f381456d = url;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f158804d = u0Var;
        return dispatch(sVar, this.f158805e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 5900;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBizFinderLiveQrCode", "#onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f158804d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
