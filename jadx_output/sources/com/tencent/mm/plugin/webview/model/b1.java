package com.tencent.mm.plugin.webview.model;

/* loaded from: classes2.dex */
public class b1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182783d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182784e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f182785f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f182786g;

    public b1(java.lang.String str, java.lang.String str2) {
        this.f182785f = str;
        this.f182786g = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.se4();
        lVar.f70665b = new r45.te4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_downloadcdninfo";
        lVar.f70667d = 1035;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182783d = a17;
        r45.se4 se4Var = (r45.se4) a17.f70710a.f70684a;
        se4Var.f385654d = str;
        se4Var.f385655e = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadCdnInfo", "download cdn info, appid : %s, mediaId : %s", str, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f182784e = u0Var;
        return dispatch(sVar, this.f182783d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1035;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneDownloadCdnInfo", "onGYNetEnd, errType = %d, errCode = %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f182784e.onSceneEnd(i18, i19, str, this);
    }
}
