package com.tencent.mm.wallet_core.model;

/* loaded from: classes8.dex */
public class a1 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f213853d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f213854e;

    public a1(java.lang.String str) {
        this(str, null, null, -1, -1, -1);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f213853d = u0Var;
        return dispatch(sVar, this.f213854e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOff;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        this.f213853d.onSceneEnd(i18, i19, str, this);
    }

    public a1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.z65();
        lVar.f70665b = new r45.a75();
        lVar.f70666c = "/cgi-bin/mmpay-bin/paysubscribe";
        lVar.f70667d = com.tencent.wxmm.v2helper.EMethodSetPlayerPreCorrectCofOff;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.wallet_core.ui.r1.J(str2);
        lVar.f70671h = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f213854e = a17;
        r45.z65 z65Var = (r45.z65) a17.f70710a.f70684a;
        z65Var.f391746d = str;
        z65Var.f391752m = at4.g0.c();
        z65Var.f391747e = str3;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            z65Var.f391748f = new com.tencent.mm.protobuf.g(str2.getBytes());
        }
        if (i17 >= 0) {
            z65Var.f391749g = i17;
        }
        if (i18 >= 0) {
            z65Var.f391750h = i18;
        }
        if (i19 >= 0) {
            z65Var.f391751i = i19;
        }
    }
}
