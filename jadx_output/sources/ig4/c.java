package ig4;

/* loaded from: classes9.dex */
public class c extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f291452d;

    /* renamed from: e, reason: collision with root package name */
    public r45.e17 f291453e;

    /* renamed from: f, reason: collision with root package name */
    public r45.zu6 f291454f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f291455g;

    /* renamed from: h, reason: collision with root package name */
    public int f291456h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f291457i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.String f291458m;

    /* renamed from: n, reason: collision with root package name */
    public long f291459n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f291460o;

    /* renamed from: p, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f291461p;

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f291462q;

    public c(ig4.c cVar) {
        this.f291452d = cVar.f291452d;
        this.f291453e = cVar.f291453e;
        this.f291454f = cVar.f291454f;
        this.f291455g = cVar.f291455g;
        this.f291456h = cVar.f291456h;
        this.f291457i = cVar.f291457i;
        this.f291458m = cVar.f291458m;
        H();
    }

    public final void H() {
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.av6();
        lVar.f70665b = new r45.bv6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadvoicefortrans";
        lVar.f70667d = 547;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        this.f291461p = lVar.a();
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f291462q = u0Var;
        if (!((com.tencent.mm.sdk.platformtools.t8.K0(this.f291455g) || com.tencent.mm.sdk.platformtools.t8.K0(this.f291452d) || this.f291454f == null || this.f291453e == null) ? false : true)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadVoiceForTrans", "doScene: Value not Valid, so, do nothing.");
            return -1;
        }
        r45.av6 av6Var = (r45.av6) this.f291461p.f70710a.f70684a;
        av6Var.f370281d = this.f291452d;
        av6Var.f370282e = this.f291453e;
        r45.zu6 zu6Var = this.f291454f;
        av6Var.f370283f = zu6Var;
        java.lang.String str = this.f291455g;
        int i17 = zu6Var.f392379e;
        int i18 = zu6Var.f392380f;
        r45.cu5 cu5Var = new r45.cu5();
        w21.t d17 = ((bv.p0) ((cv.h1) i95.n0.c(cv.h1.class))).Bi(pt0.f0.f2(this.f291460o, this.f291459n), str).d(i17, i18);
        if (d17 != null) {
            cu5Var = x51.j1.a(d17.f442464a);
        }
        av6Var.f370284g = cu5Var;
        av6Var.f370285h = this.f291456h;
        av6Var.f370286i = this.f291457i;
        av6Var.f370287m = this.f291458m;
        return dispatch(sVar, this.f291461p, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 547;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.zu6 zu6Var = this.f291454f;
        if (zu6Var != null) {
            int i27 = zu6Var.f392380f;
        }
        if (i18 == 0 && i19 == 0) {
            this.f291454f = ((r45.bv6) this.f291461p.f70711b.f70700a).f371087d;
        }
        this.f291462q.onSceneEnd(i18, i19, str, this);
        r45.zu6 zu6Var2 = this.f291454f;
        if (zu6Var2 == null || zu6Var2.f392380f <= 0) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(zu6Var2 != null);
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadVoiceForTrans", "succeeed finish: %B", objArr);
        }
    }

    public c(java.lang.String str, r45.zu6 zu6Var, int i17, java.lang.String str2, int i18, java.lang.String str3, java.lang.String str4, long j17, java.lang.String str5) {
        iz5.a.g(null, str2 != null);
        this.f291452d = str;
        this.f291454f = zu6Var;
        this.f291453e = ig4.d.a(i17, str2, j17, str5);
        this.f291455g = str2;
        this.f291456h = i18;
        this.f291457i = str3;
        this.f291458m = str4;
        this.f291459n = j17;
        this.f291460o = str5;
        H();
    }
}
