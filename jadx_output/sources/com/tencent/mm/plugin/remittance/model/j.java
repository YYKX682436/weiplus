package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes4.dex */
public class j extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.xx f156861r;

    public j(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.wx();
        lVar.f70665b = new r45.xx();
        lVar.f70667d = 4465;
        lVar.f70666c = "/cgi-bin/mmpay-bin/mmpayweworkuniontransferappsvr_transfer_transferbefore";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        r45.wx wxVar = (r45.wx) a17.f70710a.f70684a;
        wxVar.f389549d = str;
        if (com.tencent.mm.storage.z3.m4(str)) {
            com.tencent.mm.storage.z3 n17 = ((com.tencent.mm.plugin.messenger.foundation.h2) ((vg3.x3) gm0.j1.s(vg3.x3.class))).Bi().n(str, true);
            wxVar.f389550e = ((l41.q2) ((j41.b0) i95.n0.c(j41.b0.class))).fj(n17.Q0(), n17.G0());
        }
        wxVar.f389551f = str2;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBeforeUnionTransfer", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.xx xxVar = (r45.xx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f156861r = xxVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBeforeUnionTransfer", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(xxVar.f390567d), this.f156861r.f390568e);
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.xx xxVar = (r45.xx) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = xxVar.f390567d;
        this.f214030h = xxVar.f390568e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 4465;
    }
}
