package fq4;

/* loaded from: classes9.dex */
public class i extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f265602d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f265603e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f265604f;

    /* renamed from: g, reason: collision with root package name */
    public int f265605g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f265606h;

    /* renamed from: m, reason: collision with root package name */
    public int f265608m;

    /* renamed from: n, reason: collision with root package name */
    public final int f265609n;

    /* renamed from: i, reason: collision with root package name */
    public boolean f265607i = false;

    /* renamed from: o, reason: collision with root package name */
    public int f265610o = 0;

    public i(java.lang.String str, int i17, int i18, int i19) {
        this.f265605g = 0;
        this.f265606h = false;
        this.f265608m = 0;
        this.f265609n = 0;
        this.f265609n = i17;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.pn5();
        lVar.f70665b = new r45.qn5();
        lVar.f70666c = "/cgi-bin/micromsg-bin/registervoiceprint";
        lVar.f70667d = 612;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f265603e = a17;
        r45.pn5 pn5Var = (r45.pn5) a17.f70710a.f70684a;
        this.f265604f = str;
        this.f265605g = 0;
        pn5Var.f383235g = i18;
        pn5Var.f383232d = i17;
        this.f265608m = i19;
        pn5Var.f383233e = i19;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "voiceRegist %d %d", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i19));
        this.f265606h = true;
        H();
    }

    public final int H() {
        r45.pn5 pn5Var = (r45.pn5) this.f265603e.f70710a.f70684a;
        r45.i17 i17Var = new r45.i17();
        pn5Var.f383234f = i17Var;
        java.lang.String str = this.f265604f;
        w21.l0 l0Var = new w21.l0(fq4.u.a(str, false));
        int k17 = (int) com.tencent.mm.vfs.w6.k(fq4.u.a(str, false));
        int i17 = this.f265605g;
        w21.t d17 = k17 - i17 >= 6000 ? l0Var.d(i17, 6000) : l0Var.d(i17, k17 - i17);
        if (d17.f442465b == 0) {
            return -2;
        }
        int i18 = d17.f442467d;
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneRegisterVoicePrint", "readerror %d", java.lang.Integer.valueOf(i18));
            return -1;
        }
        int i19 = this.f265605g;
        if (i19 >= 469000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "moffset > maxfile %d", java.lang.Integer.valueOf(i19));
            return -1;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(d17.f442464a);
        i17Var.f376671g = cu5Var;
        i17Var.f376668d = this.f265605g;
        i17Var.f376669e = d17.f442465b;
        i17Var.f376670f = 0;
        pn5Var.f383233e = this.f265608m;
        if (this.f265606h) {
            if (d17.f442466c >= ((int) com.tencent.mm.vfs.w6.k(fq4.u.a(str, false)))) {
                i17Var.f376670f = 1;
                this.f265607i = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "the last one pack for uploading totallen %d", java.lang.Integer.valueOf(k17));
            }
        }
        this.f265605g = d17.f442466c;
        pn5Var.f383234f = i17Var;
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f265602d = u0Var;
        return dispatch(sVar, this.f265603e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 612;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.qn5 qn5Var = (r45.qn5) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 != 0 && i19 != 0) {
            this.f265602d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "voice ticket %d ret %d nextstep %d %d ", java.lang.Integer.valueOf(qn5Var.f384112g), java.lang.Integer.valueOf(qn5Var.f384109d), java.lang.Integer.valueOf(qn5Var.f384110e), java.lang.Integer.valueOf(qn5Var.f384109d));
        this.f265608m = qn5Var.f384112g;
        this.f265610o = qn5Var.f384109d;
        if (this.f265607i) {
            this.f265602d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "tryDoScene ret %d", java.lang.Integer.valueOf(H()));
        doScene(dispatcher(), this.f265602d);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRegisterVoicePrint", "loop doscene");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 240;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }
}
