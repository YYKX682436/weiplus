package i61;

/* loaded from: classes8.dex */
public class j extends com.tencent.mm.wallet_core.model.d1 implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f288926d;

    /* renamed from: e, reason: collision with root package name */
    public r45.v f288927e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f288928f;

    public j(java.lang.String str, long j17, int i17, java.lang.String str2, java.lang.String str3, java.lang.String str4) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.u();
        lVar.f70665b = new r45.v();
        lVar.f70667d = 1629;
        lVar.f70666c = "/cgi-bin/mmpay-bin/newaapay";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f288926d = a17;
        r45.u uVar = (r45.u) a17.f70710a.f70684a;
        uVar.f386894d = str;
        uVar.f386895e = j17;
        uVar.f386896f = i17;
        uVar.f386897g = str2;
        uVar.f386898h = str3;
        uVar.f386899i = str4;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAPay", "NetSceneAAPay, bill_no: %s, pay_amount: %s, scene: %s, groupid: %s", str, java.lang.Long.valueOf(j17), java.lang.Integer.valueOf(uVar.f386896f), uVar.f386897g);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f288928f = u0Var;
        return dispatch(sVar, this.f288926d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1629;
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAPay", "onGYNetEnd, errType: %s, errCode: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        r45.v vVar = (r45.v) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f288927e = vVar;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(vVar.f387771d);
        r45.v vVar2 = this.f288927e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneAAPay", "retcode: %s, retmsg: %s, paymsgid:%s", valueOf, vVar2.f387772e, vVar2.f387774g);
        com.tencent.mm.modelbase.u0 u0Var = this.f288928f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
