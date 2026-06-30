package nt4;

/* loaded from: classes9.dex */
public class l extends com.tencent.mm.wallet_core.model.d1 implements com.tencent.mm.wallet_core.model.t {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f339836d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f339837e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f339838f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f339839g;

    /* renamed from: h, reason: collision with root package name */
    public r45.v67 f339840h;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f339841i;

    public l(java.lang.String str, java.lang.String str2, java.lang.String str3, java.lang.String str4, java.lang.String str5, java.lang.String str6, java.lang.String str7, java.lang.String str8, int i17, int i18, int i19, java.lang.String str9) {
        this.f339841i = "";
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.w73();
        lVar.f70665b = new r45.x73();
        lVar.f70666c = getUri();
        lVar.f70667d = getType();
        lVar.f70668e = 189;
        lVar.f70669f = 1000000189;
        com.tencent.mm.wallet_core.ui.r1.J(str4);
        lVar.f70671h = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f339837e = a17;
        this.f339841i = str7;
        re4.v a18 = re4.u.a();
        r45.w73 w73Var = (r45.w73) a17.f70710a.f70684a;
        w73Var.f388928d = str;
        w73Var.f388931g = str4;
        w73Var.f388929e = str3;
        w73Var.f388932h = str5;
        w73Var.f388933i = str2;
        w73Var.f388930f = str6;
        w73Var.f388934m = str7;
        w73Var.f388935n = str8;
        w73Var.f388936o = i17;
        w73Var.f388939r = a18.f394553a;
        w73Var.f388938q = a18.f394554b;
        w73Var.f388940s = at4.g0.c();
        if (i18 > 0) {
            w73Var.f388941t = i18;
        }
        w73Var.f388942u = i19;
        w73Var.f388943v = str9;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f339836d = u0Var;
        return dispatch(sVar, this.f339837e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 398;
    }

    public java.lang.String getUri() {
        return "/cgi-bin/mmpay-bin/genprepay";
    }

    @Override // com.tencent.mm.wallet_core.model.d1
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr, long j17) {
        r45.x73 x73Var = (r45.x73) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneGenPrepay", "hy: errCode and errMsg in proto: errCode: %d, errMsg:%s", java.lang.Integer.valueOf(x73Var.f389842f), x73Var.f389843g);
        if (i18 == 0 && i19 == 0) {
            this.f339838f = x73Var.f389840d;
            this.f339839g = x73Var.f389841e;
            this.f339840h = x73Var.f389844h;
        }
        java.lang.String str2 = x73Var.f389843g;
        this.f339836d.onSceneEnd(i18, x73Var.f389842f, str2, this);
    }
}
