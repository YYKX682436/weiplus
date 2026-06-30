package sw3;

/* loaded from: classes9.dex */
public class c extends sw3.a {

    /* renamed from: t, reason: collision with root package name */
    public r45.fp6 f413463t;

    public c(java.lang.String str) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.ep6();
        lVar.f70665b = new r45.fp6();
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonedelhisrcvr";
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413459r = a17;
        ((r45.ep6) a17.f70710a.f70684a).f373660d = str;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "do scene NetSceneMobileRemitDeleteRecord rcvr_id:%s ", str);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.fp6 fp6Var = (r45.fp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f413463t = fp6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(fp6Var.f374537d), this.f413463t.f374538e);
        com.tencent.mm.modelbase.u0 u0Var = this.f413460s;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.fp6 fp6Var = (r45.fp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = fp6Var.f374537d;
        this.f214030h = fp6Var.f374538e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.finder.f1.CTRL_INDEX;
    }
}
