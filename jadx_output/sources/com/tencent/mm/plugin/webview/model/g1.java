package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class g1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182886d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182887e;

    public g1(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.s14();
        lVar.f70665b = new r45.t14();
        lVar.f70666c = "/cgi-bin/mmpay-bin/payibggetuseropenid";
        lVar.f70667d = 1566;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182887e = a17;
        r45.s14 s14Var = (r45.s14) a17.f70710a.f70684a;
        s14Var.f385399d = str2;
        s14Var.f385400e = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUserOpenId", "doScene");
        this.f182886d = u0Var;
        return dispatch(sVar, this.f182887e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1566;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetUserOpenId", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f182886d.onSceneEnd(i18, i19, str, this);
    }
}
