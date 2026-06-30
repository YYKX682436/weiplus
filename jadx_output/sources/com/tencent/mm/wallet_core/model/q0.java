package com.tencent.mm.wallet_core.model;

/* loaded from: classes8.dex */
public class q0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f213983d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f213984e;

    public q0(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.et();
        lVar.f70665b = new r45.ft();
        lVar.f70666c = "/cgi-bin/mmpay-bin/cancelqrpay";
        lVar.f70667d = 410;
        lVar.f70668e = nd1.d1.CTRL_INDEX;
        lVar.f70669f = 1000000198;
        com.tencent.mm.wallet_core.ui.r1.J(str2);
        lVar.f70671h = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f213984e = a17;
        r45.et etVar = (r45.et) a17.f70710a.f70684a;
        etVar.f373716d = str;
        etVar.f373717e = str2;
        etVar.f373718f = at4.g0.c();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f213983d = u0Var;
        return dispatch(sVar, this.f213984e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 410;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        this.f213983d.onSceneEnd(i18, i19, str, this);
    }
}
