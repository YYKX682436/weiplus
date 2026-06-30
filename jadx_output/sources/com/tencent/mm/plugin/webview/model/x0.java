package com.tencent.mm.plugin.webview.model;

/* loaded from: classes4.dex */
public class x0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f183175d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f183176e;

    public x0(java.lang.String str, java.lang.String str2, byte[] bArr, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u3();
        lVar.f70665b = new r45.v3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_addavatar";
        lVar.f70667d = 2500;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183175d = a17;
        r45.u3 u3Var = (r45.u3) a17.f70710a.f70684a;
        u3Var.f386977h = str;
        u3Var.f386973d = str2;
        u3Var.f386974e = new com.tencent.mm.protobuf.g(bArr, 0, bArr.length);
        u3Var.f386976g = i17;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f183176e = u0Var;
        return dispatch(sVar, this.f183175d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2500;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        this.f183176e.onSceneEnd(i18, i19, str, this);
    }

    public x0(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u3();
        lVar.f70665b = new r45.v3();
        lVar.f70666c = "/cgi-bin/mmbiz-bin/oauth_addavatar";
        lVar.f70667d = 2500;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f183175d = a17;
        r45.u3 u3Var = (r45.u3) a17.f70710a.f70684a;
        u3Var.f386977h = str;
        u3Var.f386973d = str2;
        u3Var.f386975f = str3;
        u3Var.f386976g = i17;
    }
}
