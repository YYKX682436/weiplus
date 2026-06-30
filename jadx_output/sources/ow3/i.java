package ow3;

/* loaded from: classes9.dex */
public class i extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349415r;

    /* renamed from: s, reason: collision with root package name */
    public r45.f25 f349416s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349417t;

    public i() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.e25();
        lVar.f70665b = new r45.f25();
        lVar.f70667d = 1280;
        lVar.f70666c = "/cgi-bin/mmpay-bin/operation_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f349415r = lVar.a();
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitOperation", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.f25 f25Var = (r45.f25) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349416s = f25Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitOperation", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(f25Var.f373943d), this.f349416s.f373944e);
        if (!this.f214031i && !this.f214032m) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitOperation", "min_poundage: %s, max_amount: %s", java.lang.Integer.valueOf(this.f349416s.f373945f), java.lang.Integer.valueOf(this.f349416s.f373946g));
            if (this.f349416s.f373945f >= 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BANK_REMIT_MIN_POUNDAGE_INT_SYNC, java.lang.Integer.valueOf(this.f349416s.f373945f));
            }
            if (this.f349416s.f373946g > 0) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BANK_REMIT_MAX_TRANSFER_AMOUNT_INT_SYNC, java.lang.Integer.valueOf(this.f349416s.f373946g));
            }
            if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f349416s.f373949m)) {
                gm0.j1.u().c().x(com.tencent.mm.storage.u3.USERINFO_WALLET_BANK_REMIT_PAYLIST_STRING_SYNC, this.f349416s.f373949m);
            }
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f349417t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.f25 f25Var = (r45.f25) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = f25Var.f373943d;
        this.f214030h = f25Var.f373944e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349417t = u0Var;
        return dispatch(sVar, this.f349415r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1280;
    }
}
