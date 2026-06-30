package kn;

/* loaded from: classes.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f309387d;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f309389f;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f309388e = null;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f309390g = null;

    /* renamed from: h, reason: collision with root package name */
    public int f309391h = 0;

    public e0(java.lang.String str) {
        this.f309389f = null;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.mt6();
        lVar.f70665b = new r45.nt6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/upgradechatroom";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f309387d = a17;
        this.f309389f = str;
        ((r45.mt6) a17.f70710a.f70684a).f380824d = str;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f309388e = u0Var;
        return dispatch(sVar, this.f309387d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.jsapi.video.jsapi.g.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.nt6 nt6Var = (r45.nt6) this.f309387d.f70711b.f70700a;
        java.lang.String str2 = nt6Var.f381665d;
        this.f309390g = str2;
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str2)) {
            com.tencent.mm.storage.a3 z07 = ((qv1.a) ((rv1.f) gm0.j1.s(rv1.f.class))).a().z0(this.f309389f);
            if (z07 == null) {
                z07 = new com.tencent.mm.storage.a3();
            }
            z07.Y0(c01.z1.r(), this.f309390g);
            c01.v1.M(z07);
        }
        this.f309391h = nt6Var.f381671m;
        this.f309388e.onSceneEnd(i18, i19, str, this);
    }
}
