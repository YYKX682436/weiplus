package gs4;

/* loaded from: classes2.dex */
public class l extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public r45.uh5 f275117d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f275118e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f275119f;

    public l() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.th5 th5Var = new r45.th5();
        th5Var.f386441d = java.lang.System.currentTimeMillis();
        lVar.f70664a = th5Var;
        lVar.f70665b = new r45.uh5();
        lVar.f70666c = "/cgi-bin/mmpay-bin/querywalletentrancebalanceswitchstate";
        lVar.f70667d = 2635;
        this.f275118e = lVar.a();
    }

    public r45.uh5 H() {
        r45.uh5 uh5Var = this.f275117d;
        return uh5Var == null ? new r45.uh5() : uh5Var;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f275119f = u0Var;
        return dispatch(sVar, this.f275118e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2635;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneQueryWalletEntranceBalanceSwitchState", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f275117d = (r45.uh5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        this.f275119f.onSceneEnd(i18, i19, str, this);
    }
}
