package com.tencent.mm.plugin.scanner.model;

/* loaded from: classes11.dex */
public class e0 extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f158875d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f158876e;

    /* renamed from: f, reason: collision with root package name */
    public float f158877f;

    /* renamed from: g, reason: collision with root package name */
    public java.util.List f158878g;

    /* renamed from: h, reason: collision with root package name */
    public final int f158879h;

    /* renamed from: i, reason: collision with root package name */
    public long f158880i;

    /* renamed from: m, reason: collision with root package name */
    public final int f158881m;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.String f158882n;

    /* renamed from: o, reason: collision with root package name */
    public final java.lang.String f158883o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f158884p;

    /* renamed from: q, reason: collision with root package name */
    public java.lang.String f158885q;

    /* renamed from: r, reason: collision with root package name */
    public java.lang.String f158886r;

    /* renamed from: s, reason: collision with root package name */
    public int f158887s;

    /* renamed from: t, reason: collision with root package name */
    public float f158888t;

    /* renamed from: u, reason: collision with root package name */
    public java.lang.String f158889u;

    /* renamed from: v, reason: collision with root package name */
    public java.lang.String f158890v;

    /* renamed from: w, reason: collision with root package name */
    public java.lang.String f158891w;

    public e0(int i17, int i18, java.lang.String str, java.lang.String str2, int i19, int i27) {
        this(0, i17, i18, str, str2, i19, i27);
    }

    public float H() {
        return this.f158884p ? this.f158888t : this.f158877f;
    }

    public java.lang.String I() {
        return this.f158884p ? this.f158890v : ((r45.xv4) this.f158876e.f70711b.f70700a).f390502i;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f158875d = u0Var;
        this.f158880i = java.lang.System.currentTimeMillis();
        return dispatch(sVar, this.f158876e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        if (this.f158881m == 0) {
            return com.tencent.mm.plugin.appbrand.jsapi.audio.k1.CTRL_INDEX;
        }
        return 294;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.xv4 xv4Var = (r45.xv4) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        this.f158877f = xv4Var.f390500g;
        this.f158878g = xv4Var.f390498e;
        boolean z17 = xv4Var.f390504n;
        this.f158884p = z17;
        if (z17) {
            this.f158885q = xv4Var.f390505o.i();
            this.f158886r = xv4Var.f390506p.i();
            this.f158887s = xv4Var.f390507q;
            this.f158888t = xv4Var.f390508r;
            this.f158889u = xv4Var.f390509s.i();
            this.f158890v = xv4Var.f390510t.i();
            this.f158891w = xv4Var.f390511u.i();
        }
        this.f158875d.onSceneEnd(i18, i19, str, this);
    }

    public e0(int i17, int i18, int i19, java.lang.String str, java.lang.String str2, int i27, int i28) {
        this.f158881m = -1;
        this.f158884p = false;
        this.f158885q = "";
        this.f158886r = "";
        this.f158887s = 0;
        this.f158888t = 0.0f;
        this.f158889u = "";
        this.f158890v = "";
        this.f158891w = "";
        this.f158881m = i17;
        this.f158882n = str;
        this.f158883o = str2;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        r45.wv4 wv4Var = new r45.wv4();
        wv4Var.f389518d = i18;
        wv4Var.f389519e = i19;
        wv4Var.f389524m = str;
        wv4Var.f389525n = str2;
        wv4Var.f389526o = i17;
        wv4Var.f389527p = i27;
        wv4Var.f389528q = i28;
        lVar.f70664a = wv4Var;
        lVar.f70665b = new r45.xv4();
        lVar.f70666c = "/cgi-bin/micromsg-bin/newocrtranslation";
        lVar.f70667d = getType();
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f158876e = lVar.a();
        this.f158879h = i18;
    }
}
