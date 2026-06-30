package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes2.dex */
public class l1 extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.zx f156880r;

    /* renamed from: s, reason: collision with root package name */
    public final java.lang.String f156881s;

    public l1(java.lang.String str, long j17, java.lang.String str2) {
        this.f156881s = str;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.yx();
        lVar.f70665b = new r45.zx();
        lVar.f70667d = 4895;
        lVar.f70666c = "/cgi-bin/mmpay-bin/uniontransfer_msgcheck";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.yx yxVar = (r45.yx) a17.f70710a.f70684a;
        yxVar.f391453d = str;
        yxVar.f391455f = str2;
        yxVar.f391454e = j17;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferMsgCheck", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.zx zxVar = (r45.zx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156880r = zxVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUnionTransferMsgCheck", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(zxVar.f392449d), this.f156880r.f392450e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.zx zxVar = (r45.zx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = zxVar.f392449d;
        this.f214030h = zxVar.f392450e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4895;
    }
}
