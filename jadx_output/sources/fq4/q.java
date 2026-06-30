package fq4;

/* loaded from: classes9.dex */
public class q extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f265634d;

    /* renamed from: e, reason: collision with root package name */
    public final com.tencent.mm.modelbase.o f265635e;

    /* renamed from: f, reason: collision with root package name */
    public final java.lang.String f265636f;

    /* renamed from: g, reason: collision with root package name */
    public int f265637g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f265638h;

    /* renamed from: m, reason: collision with root package name */
    public int f265640m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f265639i = false;

    /* renamed from: n, reason: collision with root package name */
    public int f265641n = 0;

    public q(java.lang.String str, int i17, int i18) {
        this.f265637g = 0;
        this.f265638h = false;
        this.f265640m = 0;
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.py6();
        lVar.f70665b = new r45.qy6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/verifyvoiceprint";
        lVar.f70667d = 613;
        lVar.f70668e = 0;
        lVar.f70669f = 0;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f265635e = a17;
        r45.py6 py6Var = (r45.py6) a17.f70710a.f70684a;
        this.f265636f = str;
        this.f265637g = 0;
        py6Var.f383483f = i17;
        this.f265640m = i18;
        py6Var.f383482e = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "voiceRegist %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f265638h = true;
        H();
    }

    public final int H() {
        r45.py6 py6Var = (r45.py6) this.f265635e.f70710a.f70684a;
        r45.i17 i17Var = new r45.i17();
        py6Var.f383481d = i17Var;
        java.lang.String str = this.f265636f;
        w21.l0 l0Var = new w21.l0(fq4.u.a(str, false));
        int k17 = (int) com.tencent.mm.vfs.w6.k(fq4.u.a(str, false));
        int i17 = this.f265637g;
        w21.t d17 = k17 - i17 >= 6000 ? l0Var.d(i17, 6000) : l0Var.d(i17, k17 - i17);
        if (d17.f442465b == 0) {
            return -2;
        }
        int i18 = d17.f442467d;
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneVerifyVoicePrint", "readerror %d", java.lang.Integer.valueOf(i18));
            return -1;
        }
        int i19 = this.f265637g;
        if (i19 >= 469000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "moffset > maxfile %d", java.lang.Integer.valueOf(i19));
            return -1;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(d17.f442464a);
        i17Var.f376671g = cu5Var;
        i17Var.f376668d = this.f265637g;
        i17Var.f376669e = d17.f442465b;
        i17Var.f376670f = 0;
        py6Var.f383482e = this.f265640m;
        if (this.f265638h) {
            if (d17.f442466c >= ((int) com.tencent.mm.vfs.w6.k(fq4.u.a(str, false)))) {
                i17Var.f376670f = 1;
                this.f265639i = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "the last one pack for uploading totallen %d", java.lang.Integer.valueOf(k17));
            }
        }
        this.f265637g = d17.f442466c;
        py6Var.f383481d = i17Var;
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f265634d = u0Var;
        return dispatch(sVar, this.f265635e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 613;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        r45.qy6 qy6Var = (r45.qy6) ((com.tencent.mm.modelbase.o) v0Var).f70711b.f70700a;
        if (i18 != 0 && i19 != 0) {
            this.f265634d.onSceneEnd(i18, i19, str, this);
            return;
        }
        int i27 = qy6Var.f384358f;
        this.f265640m = i27;
        this.f265641n = qy6Var.f384357e;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "voice VoiceTicket %d mResult %d", java.lang.Integer.valueOf(i27), java.lang.Integer.valueOf(this.f265641n));
        if (this.f265639i) {
            this.f265634d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "tryDoScene ret %d", java.lang.Integer.valueOf(H()));
        doScene(dispatcher(), this.f265634d);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneVerifyVoicePrint", "loop doscene");
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
