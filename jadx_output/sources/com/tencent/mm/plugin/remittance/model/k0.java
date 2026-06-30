package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class k0 extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f156873d;

    /* renamed from: e, reason: collision with root package name */
    public r45.tx f156874e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f156875f;

    public k0(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sx();
        lVar.f70665b = new r45.tx();
        lVar.f70667d = 1779;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferoldpaycheck";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f156873d = a17;
        r45.sx sxVar = (r45.sx) a17.f70710a.f70684a;
        sxVar.f385997d = str;
        sxVar.f385998e = str2;
        sxVar.f385999f = str3;
        sxVar.f386000g = str4;
        sxVar.f386001h = j17;
        sxVar.f386002i = str5;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRemittancePayCheck", "reqKey: %s, transfer: %s, fee: %s", str, str2, java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f156875f = u0Var;
        return dispatch(sVar, this.f156873d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1779;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRemittancePayCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.tx txVar = (r45.tx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156874e = txVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRemittancePayCheck", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(txVar.f386840d), this.f156874e.f386841e);
        com.tencent.mm.modelbase.u0 u0Var = this.f156875f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
