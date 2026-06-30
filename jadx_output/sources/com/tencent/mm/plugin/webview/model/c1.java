package com.tencent.mm.plugin.webview.model;

/* loaded from: classes.dex */
public class c1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182815d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182816e;

    public c1(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.z93();
        lVar.f70665b = new r45.aa3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/getappticket";
        lVar.f70667d = 1097;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182816e = a17;
        r45.z93 z93Var = (r45.z93) a17.f70710a.f70684a;
        z93Var.f391798d = str;
        z93Var.f391799e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f182815d = u0Var;
        return dispatch(sVar, this.f182816e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1097;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetAppTicket", "errType = " + i18 + ", errCode = " + i19);
        this.f182815d.onSceneEnd(i18, i19, str, this);
    }
}
