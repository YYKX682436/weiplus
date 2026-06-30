package com.tencent.mm.plugin.webview.model;

/* loaded from: classes2.dex */
public class o1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183046d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183047e;

    public o1(java.lang.String str, r45.u15 u15Var) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cg5();
        lVar.f70665b = new r45.dg5();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/qrconnect_authorize";
        lVar.f70667d = 2543;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183046d = a17;
        r45.cg5 cg5Var = (r45.cg5) a17.f70710a.f70684a;
        cg5Var.f371543d = str;
        try {
            cg5Var.f371544e = new com.tencent.mm.protobuf.g(u15Var.toByteArray());
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneQRCodeOauthAuthorize", "toByteArray ex %s", e17.getMessage());
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f183047e = u0Var;
        return dispatch(sVar, this.f183046d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2543;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f183047e.onSceneEnd(i18, i19, str, this);
    }
}
