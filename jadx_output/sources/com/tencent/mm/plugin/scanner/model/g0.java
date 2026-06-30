package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes4.dex */
public final class g0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f158907d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f158908e;

    /* renamed from: f, reason: collision with root package name */
    public final int f158909f;

    public g0(int i17) {
        this.f158909f = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.df4();
        lVar.f70665b = new r45.ef4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizscan_confsync";
        lVar.f70667d = 1812;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f158908e = a17;
        com.tencent.mm.protobuf.f fVar = a17.f70710a.f70684a;
        kotlin.jvm.internal.o.e(fVar, "null cannot be cast to non-null type com.tencent.mm.protocal.protobuf.MMBizScanConfSyncReq");
        ((r45.df4) fVar).f372379d = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneScanConfigSync", "scanConfigSync type: %d", java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s dispatcher, com.tencent.mm.modelbase.u0 callback) {
        kotlin.jvm.internal.o.g(dispatcher, "dispatcher");
        kotlin.jvm.internal.o.g(callback, "callback");
        this.f158907d = callback;
        return dispatch(dispatcher, this.f158908e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1812;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneScanConfigSync", "onGYNetEnd errType: %d, errCode: %d, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f158907d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
