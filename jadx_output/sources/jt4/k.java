package jt4;

/* loaded from: classes2.dex */
public class k extends com.tencent.mm.wallet_core.model.y0 {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f301665r;

    /* renamed from: s, reason: collision with root package name */
    public r45.ng5 f301666s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f301667t;

    public k(long j17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mg5();
        lVar.f70665b = new r45.ng5();
        lVar.f70667d = 2931;
        lVar.f70666c = "/cgi-bin/mmpay-bin/qrycancelecarddesc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f301665r = a17;
        ((r45.mg5) a17.f70710a.f70684a).f380496d = j17;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryECardLogout", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.ng5 ng5Var = (r45.ng5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f301666s = ng5Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneQryECardLogout", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(ng5Var.f381385d), this.f301666s.f381386e);
        com.tencent.mm.modelbase.u0 u0Var = this.f301667t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.ng5 ng5Var = (r45.ng5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = ng5Var.f381385d;
        this.f214030h = ng5Var.f381386e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f301667t = u0Var;
        return dispatch(sVar, this.f301665r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2931;
    }
}
