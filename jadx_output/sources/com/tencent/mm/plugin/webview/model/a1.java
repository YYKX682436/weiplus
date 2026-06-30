package com.tencent.mm.plugin.webview.model;

/* loaded from: classes2.dex */
public class a1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182756d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182757e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f182758f;

    public a1(java.lang.String str, java.lang.String str2, java.lang.String str3) {
        this.f182758f = str3;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s3();
        lVar.f70665b = new r45.t3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_addavatarheadimg";
        lVar.f70667d = 2667;
        lVar.f70668e = 2667;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182756d = a17;
        r45.s3 s3Var = (r45.s3) a17.f70710a.f70684a;
        s3Var.f385456d = str;
        s3Var.f385457e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f182757e = u0Var;
        return dispatch(sVar, this.f182756d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2667;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneCreateAvatar", "NetSceneCreateAvatar:  netId = %d, errType = %d,errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        com.tencent.mm.modelbase.u0 u0Var = this.f182757e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
