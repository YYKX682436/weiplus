package ow3;

/* loaded from: classes2.dex */
public class e extends ow3.b {

    /* renamed from: r, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f349399r;

    /* renamed from: s, reason: collision with root package name */
    public r45.md0 f349400s;

    /* renamed from: t, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f349401t;

    /* renamed from: u, reason: collision with root package name */
    public final java.lang.String f349402u;

    public e(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ld0();
        lVar.f70665b = new r45.md0();
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.finder.g0.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmpay-bin/deleterecord_tsbc";
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f349399r = a17;
        ((r45.ld0) a17.f70710a.f70684a).f379324d = str;
        this.f349402u = str;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitDeleteRecord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.md0 md0Var = (r45.md0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f349400s = md0Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneBankRemitDeleteRecord", "retcode: %s, retmsg: %s", java.lang.Integer.valueOf(md0Var.f380376d), this.f349400s.f380377e);
        com.tencent.mm.modelbase.u0 u0Var = this.f349401t;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.md0 md0Var = (r45.md0) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = md0Var.f380376d;
        this.f214030h = md0Var.f380377e;
    }

    @Override // com.tencent.mm.wallet_core.model.y0, com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f349401t = u0Var;
        return dispatch(sVar, this.f349399r, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.g0.CTRL_INDEX;
    }
}
