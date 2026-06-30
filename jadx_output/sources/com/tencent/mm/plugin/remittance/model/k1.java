package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class k1 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.fy f156876r;

    /* renamed from: s, reason: collision with root package name */
    public final int f156877s;

    public k1(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, java.lang.String str4, java.lang.String str5) {
        this.f156877s = 1;
        this.f156877s = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ey();
        lVar.f70665b = new r45.fy();
        lVar.f70667d = 2717;
        lVar.f70666c = "/cgi-bin/mmpay-bin/uniontransfer_operation";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.ey eyVar = (r45.ey) a17.f70710a.f70684a;
        eyVar.f373795e = str;
        eyVar.f373794d = str2;
        eyVar.f373796f = str3;
        eyVar.f373797g = i17;
        eyVar.f373798h = str4;
        eyVar.f373799i = str5;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferConfirm", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.fy fyVar = (r45.fy) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156876r = fyVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferConfirm", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(fyVar.f374720d), this.f156876r.f374721e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.fy fyVar = (r45.fy) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = fyVar.f374720d;
        this.f214030h = fyVar.f374721e;
    }

    public r45.lj5 P() {
        if (this.f156876r.f374722f == null) {
            return null;
        }
        r45.lj5 lj5Var = new r45.lj5();
        r45.yr6 yr6Var = this.f156876r.f374722f;
        lj5Var.f379523d = yr6Var.f391328d;
        lj5Var.f379524e = yr6Var.f391329e;
        lj5Var.f379525f = yr6Var.f391330f;
        lj5Var.f379526g = yr6Var.f391331g;
        lj5Var.f379527h = yr6Var.f391332h;
        return lj5Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2717;
    }
}
