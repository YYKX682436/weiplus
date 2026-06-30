package n21;

/* loaded from: classes12.dex */
public class b extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f334238d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f334239e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f334240f;

    /* renamed from: g, reason: collision with root package name */
    public final java.lang.String f334241g;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f334242h;

    /* renamed from: i, reason: collision with root package name */
    public final int f334243i;

    /* renamed from: m, reason: collision with root package name */
    public final int f334244m;

    /* renamed from: n, reason: collision with root package name */
    public final int f334245n;

    /* renamed from: p, reason: collision with root package name */
    public final int f334247p;

    /* renamed from: o, reason: collision with root package name */
    public int f334246o = 0;

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f334248q = new com.tencent.mm.sdk.platformtools.b4(new n21.a(this), true);

    public b(java.lang.String str, int i17, int i18, int i19, int i27) {
        this.f334240f = null;
        this.f334241g = null;
        this.f334242h = null;
        this.f334243i = 0;
        this.f334244m = 0;
        this.f334245n = 0;
        this.f334247p = 5;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f334240f = sb6.toString();
        this.f334242h = str;
        this.f334247p = i17;
        this.f334243i = i18;
        this.f334244m = i19;
        this.f334245n = i27;
        this.f334241g = kk.k.g(com.tencent.mm.vfs.w6.N(str, 0, (int) com.tencent.mm.vfs.w6.k(str)));
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f334238d = u0Var;
        java.lang.String str = this.f334242h;
        int k17 = (int) com.tencent.mm.vfs.w6.k(str);
        fp.k.c();
        int i17 = this.f334246o;
        if (k17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadMedia", "read failed :" + str);
            return -1;
        }
        int i18 = k17 - i17;
        if (i18 > 3960) {
            i18 = 3960;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadMedia", fp.k.c() + " read file:" + str + " filelen:" + k17 + " oldoff:" + this.f334246o + "  canReadLen " + i18);
        byte[] N = com.tencent.mm.vfs.w6.N(str, this.f334246o, i18);
        if (N == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadMedia", "read data error");
            return -1;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.hu6();
        lVar.f70665b = new r45.iu6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/mmuploadmedia";
        lVar.f70667d = 240;
        lVar.f70668e = 111;
        lVar.f70669f = 1000000111;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f334239e = a17;
        r45.hu6 hu6Var = (r45.hu6) a17.f70710a.f70684a;
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = this.f334240f;
        du5Var.f372757e = true;
        hu6Var.f376454d = du5Var;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(N);
        hu6Var.f376459i = cu5Var;
        hu6Var.f376458h = N.length;
        r45.du5 du5Var2 = new r45.du5();
        du5Var2.f372756d = this.f334241g;
        du5Var2.f372757e = true;
        hu6Var.f376455e = du5Var2;
        hu6Var.f376456f = k17;
        hu6Var.f376457g = this.f334246o;
        hu6Var.f376460m = this.f334247p;
        hu6Var.f376461n = 1;
        hu6Var.f376462o = this.f334243i;
        hu6Var.f376463p = this.f334244m;
        hu6Var.f376464q = this.f334245n;
        return dispatch(sVar, this.f334239e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 240;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        updateDispatchId(i17);
        fp.k.c();
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.hu6 hu6Var = (r45.hu6) oVar.f70710a.f70684a;
        java.lang.String str2 = ((r45.iu6) oVar.f70711b.f70700a).f377347d;
        java.lang.Integer valueOf = java.lang.Integer.valueOf(hu6Var.f376456f);
        java.lang.Integer valueOf2 = java.lang.Integer.valueOf(hu6Var.f376458h);
        java.lang.Integer valueOf3 = java.lang.Integer.valueOf(hu6Var.f376457g);
        java.lang.String str3 = this.f334242h;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneUploadMedia", "fileName:%s, md5:%s, totalLen:%d, dataLen:%d, startPos:%d", str3, str2, valueOf, valueOf2, valueOf3);
        if (i18 == 0 && i19 == 0) {
            if (hu6Var.f376456f <= hu6Var.f376458h + hu6Var.f376457g && str2 != null && !str2.equals("0")) {
                this.f334238d.onSceneEnd(i18, i19, str, this);
                return;
            } else {
                this.f334246o = hu6Var.f376457g + hu6Var.f376459i.f371839d;
                this.f334248q.c(500L, 500L);
                return;
            }
        }
        com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneUploadMedia", fp.k.c() + " onGYNetEnd file:" + str3 + " errType:" + i18 + " errCode:" + i19);
        this.f334238d.onSceneEnd(i18, i19, str, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 60;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
