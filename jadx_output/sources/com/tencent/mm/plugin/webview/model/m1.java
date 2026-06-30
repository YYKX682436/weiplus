package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class m1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183006d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183007e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f183008f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f183009g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.String f183010h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f183011i;

    /* renamed from: m, reason: collision with root package name */
    public int f183012m;

    public m1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ue4();
        lVar.f70665b = new r45.ve4();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/mmbizjsapi_getuseropenid";
        lVar.f70667d = 1177;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183007e = a17;
        r45.ue4 ue4Var = (r45.ue4) a17.f70710a.f70684a;
        ue4Var.f387299d = str;
        ue4Var.f387300e = str2;
        ue4Var.f387301f = str3;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f183006d = u0Var;
        return dispatch(sVar, this.f183007e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1177;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMMBizGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.ve4 ve4Var = (r45.ve4) this.f183007e.f70711b.f70700a;
            this.f183008f = ve4Var.f388161d;
            this.f183009g = ve4Var.f388164g;
            this.f183010h = ve4Var.f388163f;
            this.f183011i = ve4Var.f388162e;
            this.f183012m = ve4Var.f388165h;
        }
        this.f183006d.onSceneEnd(i18, i19, str, this);
    }
}
