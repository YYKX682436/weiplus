package jt4;

/* loaded from: classes2.dex */
public class j extends com.tencent.mm.wallet_core.model.d1 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f301662d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f301663e;

    /* renamed from: f, reason: collision with root package name */
    public r45.lg5 f301664f;

    public j(java.lang.String str, int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.kg5();
        lVar.f70665b = new r45.lg5();
        lVar.f70667d = 1988;
        lVar.f70666c = "/cgi-bin/mmpay-bin/qryecardbanklist4bind";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f301663e = a17;
        r45.kg5 kg5Var = (r45.kg5) a17.f70710a.f70684a;
        kg5Var.f378687d = str;
        kg5Var.f378688e = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryBankList4Bind", "cardType: %s, openScene: %s", str, java.lang.Integer.valueOf(i17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f301662d = u0Var;
        return dispatch(sVar, this.f301663e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1988;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryBankList4Bind", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.lg5 lg5Var = (r45.lg5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f301664f = lg5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryBankList4Bind", "ret_code: %d, ret_msg: %s", java.lang.Integer.valueOf(lg5Var.f379457d), this.f301664f.f379458e);
        com.tencent.mm.modelbase.u0 u0Var = this.f301662d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
