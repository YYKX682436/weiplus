package xt1;

/* loaded from: classes9.dex */
public class n0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f456530d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f456531e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f456532f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f456533g;

    /* renamed from: h, reason: collision with root package name */
    public int f456534h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f456535i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f456536m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f456537n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f456538o;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String f456539p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f456540q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f456541r;

    public n0(int i17, java.lang.String str, java.lang.String str2) {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.eb5();
        lVar.f70665b = new r45.fb5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/preacceptgiftcard";
        lVar.f70667d = com.tencent.mm.plugin.appbrand.ad.jsapi.c.CTRL_INDEX;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        lVar.f70678o = 2;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f456530d = a17;
        r45.eb5 eb5Var = (r45.eb5) a17.f70710a.f70684a;
        eb5Var.f373236d = i17;
        eb5Var.f373237e = str;
        eb5Var.f373238f = str2;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f456531e = u0Var;
        return dispatch(sVar, this.f456530d, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return com.tencent.mm.plugin.appbrand.ad.jsapi.c.CTRL_INDEX;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mars.xlog.Log.i("MicroMsg.NetScenePreAcceptGiftCard", "onGYNetEnd, errType = %d, errCode = %d ,errMsg:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19), str);
        if (i18 == 0 && i19 == 0) {
            r45.fb5 fb5Var = (r45.fb5) this.f456530d.f70711b.f70700a;
            this.f456532f = fb5Var.f374170d;
            this.f456533g = fb5Var.f374171e;
            this.f456534h = fb5Var.f374172f;
            this.f456535i = fb5Var.f374173g;
            this.f456536m = fb5Var.f374174h;
            this.f456537n = fb5Var.f374176m;
            this.f456538o = fb5Var.f374177n;
            this.f456539p = fb5Var.f374178o;
            this.f456540q = fb5Var.f374179p;
            this.f456541r = fb5Var.f374180q;
        }
        this.f456531e.onSceneEnd(i18, i19, str, this);
    }
}
