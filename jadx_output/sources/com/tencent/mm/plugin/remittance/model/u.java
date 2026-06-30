package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class u extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f157026d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f157027e;

    /* renamed from: f, reason: collision with root package name */
    public r45.xv f157028f;

    public u(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wv();
        lVar.f70665b = new r45.xv();
        lVar.f70667d = 2850;
        lVar.f70666c = "/cgi-bin/mmpay-bin/f2fminiprogramconfirmrcvr";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f157026d = a17;
        r45.wv wvVar = (r45.wv) a17.f70710a.f70684a;
        wvVar.f389479d = str;
        wvVar.f389480e = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f157027e = u0Var;
        return dispatch(sVar, this.f157026d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2850;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneF2FMinniProgramConfirm", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f157028f = (r45.xv) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f157027e;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
