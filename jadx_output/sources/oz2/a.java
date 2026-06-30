package oz2;

/* loaded from: classes9.dex */
public class a extends oe4.g implements d50.l {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f350237d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f350238e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f350239f = "";

    /* renamed from: g, reason: collision with root package name */
    public boolean f350240g = false;

    public a(int i17) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.jc6();
        lVar.f70665b = new r45.kc6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/sotergetchallenge";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f350238e = a17;
        r45.jc6 jc6Var = (r45.jc6) a17.f70710a.f70684a;
        re4.v a18 = re4.u.a();
        java.lang.String str = a18.f394553a;
        java.lang.String str2 = a18.f394554b;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: cpu_id: %s, uid: %s", str, str2);
        jc6Var.f377703e = str;
        jc6Var.f377704f = str2;
        jc6Var.f377702d = 0;
        jc6Var.f377705g = i17;
        jc6Var.f377706h = 1;
    }

    @Override // oe4.g
    public void H() {
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSoterGetPayChallenge", "hy: auth key expired");
        com.tencent.mm.modelbase.u0 u0Var = this.f350237d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.tencent.mm.modelbase.u0 u0Var = this.f350237d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        if (i18 == 0 && i19 == 0) {
            r45.kc6 kc6Var = (r45.kc6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
            java.lang.String str2 = kc6Var.f378589d;
            this.f350239f = str2;
            mz2.d2 d2Var = mz2.d2.IML;
            d2Var.f333111d = str2;
            this.f350240g = 1 == kc6Var.f378590e;
            boolean z17 = this.f350240g;
            d2Var.f333113f = z17;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterGetPayChallenge", "hy: challenge: %s, need auth key: %b", this.f350239f, java.lang.Boolean.valueOf(z17));
        }
        this.f350237d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f350237d = u0Var;
        return dispatch(sVar, this.f350238e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.media.r6.CTRL_INDEX;
    }
}
