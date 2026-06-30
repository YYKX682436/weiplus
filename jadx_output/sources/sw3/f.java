package sw3;

/* loaded from: classes9.dex */
public class f extends sw3.a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f413466u = 0;

    /* renamed from: t, reason: collision with root package name */
    public r45.hp6 f413467t;

    public f(java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.gp6();
        lVar.f70665b = new r45.hp6();
        lVar.f70667d = 2993;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonegethisrcvrs";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413459r = a17;
        r45.gp6 gp6Var = (r45.gp6) a17.f70710a.f70684a;
        gp6Var.f375460d = str;
        gp6Var.f375461e = str2;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "[doScene] last_id:%s homepage_ext:%s", str, str2);
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.hp6 hp6Var = (r45.hp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f413467t = hp6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(hp6Var.f376378d), this.f413467t.f376379e);
        com.tencent.mm.modelbase.u0 u0Var = this.f413460s;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.hp6 hp6Var = (r45.hp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = hp6Var.f376378d;
        this.f214030h = hp6Var.f376379e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2993;
    }
}
