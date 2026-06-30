package ow3;

/* loaded from: classes2.dex */
public class j extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349418r;

    /* renamed from: s, reason: collision with root package name */
    public r45.hh5 f349419s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349420t;

    public j(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gh5();
        lVar.f70665b = new r45.hh5();
        lVar.f70667d = fe1.t.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmpay-bin/querydetail_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349418r = a17;
        ((r45.gh5) a17.f70710a.f70684a).f375252d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitQueryDetail", "bill id: %s", str);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitQueryDetail", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        this.f349419s = (r45.hh5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mm.modelbase.u0 u0Var = this.f349420t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.hh5 hh5Var = (r45.hh5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = hh5Var.f376161d;
        this.f214030h = hh5Var.f376162e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349420t = u0Var;
        return dispatch(sVar, this.f349418r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return fe1.t.CTRL_INDEX;
    }
}
