package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes4.dex */
public class i extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.rx f156852r;

    public i(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.qx();
        lVar.f70665b = new r45.rx();
        lVar.f70667d = 2783;
        lVar.f70666c = "/cgi-bin/mmpay-bin/beforetransfer";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.qx qxVar = (r45.qx) a17.f70710a.f70684a;
        qxVar.f384323d = str;
        if (!h45.y.c()) {
            qxVar.f384324e = h45.y.f278968a;
        }
        qxVar.f384325f = str2;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBeforeTransfer", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.rx rxVar = (r45.rx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156852r = rxVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBeforeTransfer", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(rxVar.f385255d), this.f156852r.f385256e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.rx rxVar = (r45.rx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = rxVar.f385255d;
        this.f214030h = rxVar.f385256e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2783;
    }
}
