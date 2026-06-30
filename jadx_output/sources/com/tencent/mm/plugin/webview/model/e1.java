package com.tencent.mm.plugin.webview.model;

/* loaded from: classes2.dex */
public class e1 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f182847d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f182848e;

    public e1(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gm3();
        lVar.f70665b = new r45.hm3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_getrandomavatar";
        lVar.f70667d = 2785;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f182847d = a17;
        ((r45.gm3) a17.f70710a.f70684a).f375365d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f182848e = u0Var;
        return dispatch(sVar, this.f182847d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2785;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f182848e.onSceneEnd(i18, i19, str, this);
    }
}
