package ss4;

/* loaded from: classes2.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public r45.fh5 f412126d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f412127e;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f412128f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f412129g;

    public q(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.eh5();
        lVar.f70665b = new r45.fh5();
        lVar.f70667d = 2710;
        lVar.f70666c = "/cgi-bin/mmpay-bin/mktqueryawardstatus";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f412127e = a17;
        ((r45.eh5) a17.f70710a.f70684a).f373500d = str;
        this.f412129g = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMtkQueryAwardStatus", "NetSceneMtkQueryAwardStatus, query_award_status_params: %s, activityId: %s", str, str2);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f412128f = u0Var;
        return dispatch(sVar, this.f412127e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2710;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMtkQueryAwardStatus", "onGYNetEnd, netId: %s, errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.fh5 fh5Var = (r45.fh5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f412126d = fh5Var;
        if (i18 == 0 || i19 == 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneMtkQueryAwardStatus", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(fh5Var.f374357d), this.f412126d.f374358e);
        }
        com.tencent.mm.modelbase.u0 u0Var = this.f412128f;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }
}
