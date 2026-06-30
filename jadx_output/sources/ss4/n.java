package ss4;

/* loaded from: classes8.dex */
public class n extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.ha3 f412101d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412102e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412103f;

    /* renamed from: g, reason: collision with root package name */
    public final long f412104g;

    public n(java.lang.String str, long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ga3();
        lVar.f70665b = new r45.ha3();
        lVar.f70666c = "/cgi-bin/mmpay-bin/mktgetaward";
        lVar.f70667d = 2948;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412102e = a17;
        ((r45.ga3) a17.f70710a.f70684a).f375036d = str;
        this.f412104g = j17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMktGetAward", "NetSceneMktGetAward, get_award_params: %s, activityId: %s", str, java.lang.Long.valueOf(j17));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412103f = u0Var;
        return dispatch(sVar, this.f412102e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2948;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMktGetAward", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ha3 ha3Var = (r45.ha3) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f412101d = ha3Var;
        if (i18 == 0 || i19 == 0) {
            java.lang.Integer valueOf = java.lang.Integer.valueOf(ha3Var.f375975d);
            r45.ha3 ha3Var2 = this.f412101d;
            java.lang.String str2 = ha3Var2.f375976e;
            java.lang.Integer valueOf2 = java.lang.Integer.valueOf(ha3Var2.f375977f);
            r45.ha3 ha3Var3 = this.f412101d;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMktGetAward", "ret_code: %s, ret_msg: %s, result_code: %s, alert_wording: %s, btn_wording: %s", valueOf, str2, valueOf2, ha3Var3.f375978g, ha3Var3.f375979h);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f412103f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
