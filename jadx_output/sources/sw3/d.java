package sw3;

/* loaded from: classes9.dex */
public class d extends sw3.a {

    /* renamed from: u, reason: collision with root package name */
    public static final /* synthetic */ int f413464u = 0;

    /* renamed from: t, reason: collision with root package name */
    public r45.np6 f413465t;

    public d(boolean z17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mp6();
        lVar.f70665b = new r45.np6();
        lVar.f70667d = 2952;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonehomepage";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413459r = a17;
        ((r45.mp6) a17.f70710a.f70684a).f380734d = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "do scene NetSceneMobileRemitGetHomePage, is signed：%s", java.lang.Boolean.valueOf(z17));
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.np6 np6Var = (r45.np6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f413465t = np6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetHomePage", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(np6Var.f381577d), this.f413465t.f381578e);
        com.tencent.mm.modelbase.u0 u0Var = this.f413460s;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.np6 np6Var = (r45.np6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = np6Var.f381577d;
        this.f214030h = np6Var.f381578e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2952;
    }
}
