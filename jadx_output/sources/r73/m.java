package r73;

/* loaded from: classes9.dex */
public class m extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public r45.tg5 f393178r;

    public m(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.sg5();
        lVar.f70665b = new r45.tg5();
        lVar.f70667d = 2613;
        lVar.f70666c = "/cgi-bin/mmpay-bin/qryhpusererdetail";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f214033n = a17;
        ((r45.sg5) a17.f70710a.f70684a).f385708d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryHoneyUserDetail", "card no: %s", str);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryHoneyUserDetail", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.tg5 tg5Var = (r45.tg5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f393178r = tg5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryHoneyUserDetail", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(tg5Var.f386405d), this.f393178r.f386406e);
        r45.bs bsVar = this.f393178r.f386410i;
        if (bsVar != null) {
            u73.h.k(bsVar.f371018f, bsVar.f371016d, bsVar.f371017e, null);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f214034o;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.tg5 tg5Var = (r45.tg5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = tg5Var.f386405d;
        this.f214030h = tg5Var.f386406e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2613;
    }
}
