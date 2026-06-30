package gs4;

/* loaded from: classes4.dex */
public class n extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final r45.f36 f275120d;

    /* renamed from: e, reason: collision with root package name */
    public r45.g36 f275121e;

    /* renamed from: f, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f275122f;

    /* renamed from: g, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f275123g;

    public n(boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.f36 f36Var = new r45.f36();
        f36Var.f373996e = java.lang.System.currentTimeMillis();
        if (z17) {
            f36Var.f373995d = 1;
        } else {
            f36Var.f373995d = 0;
        }
        this.f275120d = f36Var;
        lVar.f70664a = f36Var;
        lVar.f70665b = new r45.g36();
        lVar.f70666c = "/cgi-bin/mmpay-bin/setwalletentrancebalanceswitchstate";
        lVar.f70667d = 2554;
        this.f275122f = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f275123g = u0Var;
        return dispatch(sVar, this.f275122f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2554;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneSetWalletEntranceBalanceSwitchState", "errType = %s errCode = %s errMsg = %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            this.f275121e = (r45.g36) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        }
        this.f275123g.onSceneEnd(i18, i19, str, this);
    }
}
