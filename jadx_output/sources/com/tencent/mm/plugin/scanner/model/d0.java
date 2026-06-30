package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes4.dex */
public class d0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f158838d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f158839e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f158840f;

    /* renamed from: g, reason: collision with root package name */
    public final int f158841g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f158842h;

    public d0(java.lang.String str, int i17, java.lang.String str2) {
        this.f158840f = str;
        this.f158841g = i17;
        this.f158842h = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f158838d = u0Var;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.tk();
        lVar.f70665b = new r45.uk();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/usrmsg/bizscangetproductinfo";
        lVar.f70667d = 1063;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f158839e = a17;
        r45.tk tkVar = (r45.tk) a17.f70710a.f70684a;
        tkVar.f386511d = this.f158840f;
        tkVar.f386512e = this.f158841g;
        tkVar.f386513f = this.f158842h;
        return dispatch(sVar, a17, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1063;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f158838d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        java.lang.String str;
        r45.tk tkVar = (r45.tk) ((com.tencent.mm.modelbase.o) v0Var).f70710a.f70684a;
        if (tkVar.f386512e >= 0 && (str = tkVar.f386511d) != null && str.length() > 0) {
            return com.tencent.mm.modelbase.o1.EOk;
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.scanner.NetSceneGetProductInfo", "ERR: Security Check Failed, Scene = %s", java.lang.Integer.valueOf(tkVar.f386512e));
        return com.tencent.mm.modelbase.o1.EFailed;
    }
}
