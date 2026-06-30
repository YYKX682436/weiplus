package com.tencent.mm.plugin.webview.model;

/* loaded from: classes2.dex */
public class t1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183114d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183115e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f183116f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f183117g;

    public t1(java.lang.String str, java.lang.String str2, r45.re4 re4Var) {
        this.f183116f = str;
        this.f183117g = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.we4();
        lVar.f70665b = new r45.xe4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_uploadcdninfo";
        lVar.f70667d = 1034;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183114d = a17;
        r45.we4 we4Var = (r45.we4) a17.f70710a.f70684a;
        we4Var.f389103d = str;
        we4Var.f389104e = re4Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f183115e = u0Var;
        return dispatch(sVar, this.f183114d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1034;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f183115e.onSceneEnd(i18, i19, str, this);
    }
}
