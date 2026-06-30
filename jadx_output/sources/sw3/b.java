package sw3;

/* loaded from: classes9.dex */
public class b extends sw3.a {

    /* renamed from: t, reason: collision with root package name */
    public r45.dp6 f413461t;

    /* renamed from: u, reason: collision with root package name */
    public final int f413462u;

    public b(int i17, java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.cp6();
        lVar.f70665b = new r45.dp6();
        lVar.f70667d = 2694;
        lVar.f70666c = "/cgi-bin/mmpay-bin/transferphonecheckname";
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f413459r = a17;
        r45.cp6 cp6Var = (r45.cp6) a17.f70710a.f70684a;
        cp6Var.f371771d = i17;
        cp6Var.f371772e = str;
        cp6Var.f371773f = str2;
        cp6Var.f371774g = str3;
        cp6Var.f371775h = str4;
        cp6Var.f371776i = str5;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "do scene NetSceneMobileRemitCheckName reason:%s rcvrOpenid:%s rcvrToken:%s inputName:%s getRcvrExt:%s", java.lang.Integer.valueOf(i17), str, str2, str3, str4);
        this.f413462u = i17;
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void H(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "errType: %s, errCode: %s, errMsg: %s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        r45.dp6 dp6Var = (r45.dp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f413461t = dp6Var;
        com.tencent.mars.xlog.Log.i("MicroMsg.mobileRemit.NetSceneMobileRemitGetRecord", "ret_code: %s, ret_msg: %s", java.lang.Integer.valueOf(dp6Var.f372648d), this.f413461t.f372649e);
        com.tencent.mm.modelbase.u0 u0Var = this.f413460s;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.wallet_core.model.y0
    public void I(com.tencent.mm.network.v0 v0Var) {
        r45.dp6 dp6Var = (r45.dp6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f214028f = dp6Var.f372648d;
        this.f214030h = dp6Var.f372649e;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 2694;
    }
}
