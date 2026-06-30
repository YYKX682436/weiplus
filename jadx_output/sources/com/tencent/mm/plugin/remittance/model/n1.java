package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class n1 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.hy f156918r;

    public n1(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gy();
        lVar.f70665b = new r45.hy();
        lVar.f70667d = 2548;
        lVar.f70666c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_paycheck";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.gy gyVar = (r45.gy) a17.f70710a.f70684a;
        gyVar.f375633d = str;
        gyVar.f375634e = str2;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferPayCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.hy hyVar = (r45.hy) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156918r = hyVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferPayCheck", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(hyVar.f376549d), this.f156918r.f376550e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.hy hyVar = (r45.hy) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = hyVar.f376549d;
        this.f214030h = hyVar.f376550e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2548;
    }
}
