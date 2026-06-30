package com.tencent.mm.plugin.remittance.model;

/* loaded from: classes9.dex */
public class s extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f157008d;

    /* renamed from: e, reason: collision with root package name */
    public r45.gp f157009e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f157010f;

    public s(r45.k6 k6Var, java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.fp();
        lVar.f70665b = new r45.gp();
        lVar.f70667d = 2702;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busif2funlockfavor";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f157008d = a17;
        r45.fp fpVar = (r45.fp) a17.f70710a.f70684a;
        fpVar.f374498d = k6Var;
        fpVar.f374499e = str;
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(886, 0);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "NetSceneBusiF2fUnlockFavor, f2fId: %s, transId: %s, amount: %s", k6Var.f378414d, k6Var.f378415e, java.lang.Integer.valueOf(k6Var.f378423p));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f157010f = u0Var;
        return dispatch(sVar, this.f157008d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2702;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.gp gpVar = (r45.gp) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f157009e = gpVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBusiF2fUnlockFavor", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(gpVar.f375398d), this.f157009e.f375399e);
        com.tencent.mm.plugin.report.service.g0.INSTANCE.A(886, 1);
        com.tencent.mm.modelbase.u0 u0Var = this.f157010f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
