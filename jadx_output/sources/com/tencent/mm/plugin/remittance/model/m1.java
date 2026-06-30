package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class m1 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.dy f156900r;

    public m1(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cy();
        lVar.f70665b = new r45.dy();
        lVar.f70667d = 4808;
        lVar.f70666c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_notify";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.cy cyVar = (r45.cy) a17.f70710a.f70684a;
        cyVar.f371918d = str;
        cyVar.f371919e = i17;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferNotify", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.dy dyVar = (r45.dy) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156900r = dyVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferNotify", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(dyVar.f372842d), this.f156900r.f372843e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.dy dyVar = (r45.dy) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = dyVar.f372842d;
        this.f214030h = dyVar.f372843e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4808;
    }
}
