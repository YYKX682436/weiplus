package ow3;

/* loaded from: classes2.dex */
public class c extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349393r;

    /* renamed from: s, reason: collision with root package name */
    public r45.np f349394s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349395t;

    public c(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mp();
        lVar.f70665b = new r45.np();
        lVar.f70667d = 1340;
        lVar.f70666c = "/cgi-bin/mmpay-bin/busscb_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349393r = a17;
        r45.mp mpVar = (r45.mp) a17.f70710a.f70684a;
        mpVar.f380722d = str;
        mpVar.f380723e = str2;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitBusinessCallback", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.np npVar = (r45.np) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349394s = npVar;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitBusinessCallback", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(npVar.f381562d), this.f349394s.f381563e);
        com.tencent.mm.modelbase.u0 u0Var = this.f349395t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.np npVar = (r45.np) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = npVar.f381562d;
        this.f214030h = npVar.f381563e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349395t = u0Var;
        return dispatch(sVar, this.f349393r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1340;
    }
}
