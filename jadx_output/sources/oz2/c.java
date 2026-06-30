package oz2;

/* loaded from: classes9.dex */
public class c extends oe4.g implements iu5.e {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f350244d;

    /* renamed from: e, reason: collision with root package name */
    public iu5.b f350245e = null;

    /* renamed from: f, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f350246f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f350247g;

    /* renamed from: h, reason: collision with root package name */
    public final int f350248h;

    /* renamed from: i, reason: collision with root package name */
    public final int f350249i;

    public c(java.lang.String str, int i17) {
        this.f350247g = null;
        this.f350247g = str;
        this.f350248h = i17;
        this.f350249i = i17;
    }

    @Override // iu5.a
    public void B(iu5.b bVar) {
        this.f350245e = bVar;
    }

    @Override // oe4.g
    public void H() {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: authkey required");
        com.tencent.mm.modelbase.u0 u0Var = this.f350244d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
        if (this.f350245e != null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "pay auth key expired when upload pay auth key");
            this.f350245e.a(new iu5.d(false));
        }
    }

    @Override // oe4.g
    public void I(int i17, int i18, java.lang.String str) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "hy: onError: errType: %d, errcode: %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        com.tencent.mm.modelbase.u0 u0Var = this.f350244d;
        if (u0Var != null) {
            u0Var.onSceneEnd(4, -1, "", this);
        }
    }

    @Override // oe4.g
    public void J(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.modelbase.u0 u0Var = this.f350244d;
        if (u0Var != null) {
            u0Var.onSceneEnd(i18, i19, str, this);
        }
        re4.g0.f394537c = str;
        iu5.b bVar = this.f350245e;
        if (bVar != null) {
            if (i18 == 0 && i19 == 0) {
                bVar.a(new iu5.d(true));
            } else {
                bVar.a(new iu5.d(false));
            }
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f350244d = u0Var;
        return dispatch(sVar, this.f350246f, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 1665;
    }

    @Override // iu5.a
    public void j(java.lang.Object obj) {
        iu5.c cVar = (iu5.c) obj;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.nc6();
        lVar.f70665b = new r45.oc6();
        lVar.f70666c = "/cgi-bin/mmpay-bin/soterupdateauthkey";
        lVar.f70667d = 1665;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f350246f = a17;
        r45.nc6 nc6Var = (r45.nc6) a17.f70710a.f70684a;
        nc6Var.f381248e = this.f350247g;
        java.lang.String str = cVar.f295051a;
        nc6Var.f381247d = str;
        java.lang.String str2 = cVar.f295052b;
        nc6Var.f381249f = str2;
        nc6Var.f381250g = com.tenpay.android.wechat.TenpayUtil.signWith3Des("passwd=" + nc6Var.f381248e);
        nc6Var.f381251h = this.f350248h;
        nc6Var.f381252i = this.f350249i;
        try {
            org.json.JSONObject jSONObject = new org.json.JSONObject(str);
            re4.u.b(jSONObject.getString("cpu_id"), jSONObject.getString("uid"));
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", e17, "save device info exception", new java.lang.Object[0]);
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneSoterPayUploadAuthKeyManually", "json: %s, sign: %s", str, str2);
    }

    @Override // iu5.a
    public void x() {
        gm0.j1.d().g(this);
    }
}
