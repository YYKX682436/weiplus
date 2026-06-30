package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class s1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183097d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183098e;

    public s1(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mo6();
        lVar.f70665b = new r45.no6();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/transid";
        lVar.f70667d = cg1.c.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183098e = a17;
        r45.mo6 mo6Var = (r45.mo6) a17.f70710a.f70684a;
        mo6Var.f380719d = str;
        mo6Var.f380721f = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgToSpecifiedContact", "doScene");
        this.f183097d = u0Var;
        return dispatch(sVar, this.f183098e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return cg1.c.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSendAppMsgToSpecifiedContact", "errType = %d, errCode = %d, errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f183097d.onSceneEnd(i18, i19, str, this);
    }
}
