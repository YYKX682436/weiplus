package ow3;

/* loaded from: classes2.dex */
public class h extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349410r;

    /* renamed from: s, reason: collision with root package name */
    public r45.mp4 f349411s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349412t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f349413u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.String f349414v;

    public h(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.lp4();
        lVar.f70665b = new r45.mp4();
        lVar.f70667d = 1590;
        lVar.f70666c = "/cgi-bin/mmpay-bin/modifyexplain_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349410r = a17;
        r45.lp4 lp4Var = (r45.lp4) a17.f70710a.f70684a;
        lp4Var.f379702d = str;
        lp4Var.f379703e = str2;
        this.f349413u = str;
        this.f349414v = str2;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitModifyExplain", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.mp4 mp4Var = (r45.mp4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349411s = mp4Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitModifyExplain", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(mp4Var.f380728d), this.f349411s.f380729e);
        com.tencent.mm.modelbase.u0 u0Var = this.f349412t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.mp4 mp4Var = (r45.mp4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = mp4Var.f380728d;
        this.f214030h = mp4Var.f380729e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349412t = u0Var;
        return dispatch(sVar, this.f349410r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1590;
    }
}
