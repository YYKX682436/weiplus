package com.tencent.mm.plugin.webview.model;

/* loaded from: classes4.dex */
public class f1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182870d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182871e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f182872f;

    public f1(java.lang.String str, java.lang.String str2, int i17, int i18) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.im3();
        lVar.f70665b = new r45.jm3();
        lVar.f70666c = "/cgi-bin/micromsg-bin/getreadingmodeinfo";
        lVar.f70667d = 673;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182870d = a17;
        r45.im3 im3Var = (r45.im3) a17.f70710a.f70684a;
        im3Var.f377148d = str;
        im3Var.f377149e = str2;
        im3Var.f377150f = i17;
        im3Var.f377151g = i18;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "doScene");
        this.f182871e = u0Var;
        return dispatch(sVar, this.f182870d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 673;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + i18 + ", errCode = " + i19);
        this.f182871e.onSceneEnd(i18, i19, str, this);
        if (i18 == 0 && i19 == 0) {
            return;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneGetReadingModeInfoProxy", "errType = " + i18 + ", errCode = " + i19);
    }
}
