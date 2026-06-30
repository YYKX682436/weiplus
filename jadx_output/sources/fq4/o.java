package fq4;

/* loaded from: classes9.dex */
public class o extends com.tencent.mm.modelbase.m1 implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f265621d;

    /* renamed from: e, reason: collision with root package name */
    public final java.lang.String f265622e;

    /* renamed from: f, reason: collision with root package name */
    public int f265623f;

    /* renamed from: g, reason: collision with root package name */
    public final com.tencent.mm.network.v0 f265624g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f265625h;

    /* renamed from: m, reason: collision with root package name */
    public int f265627m;

    /* renamed from: i, reason: collision with root package name */
    public boolean f265626i = false;

    /* renamed from: n, reason: collision with root package name */
    public int f265628n = 0;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.String f265629o = "";

    public o(java.lang.String str, int i17, int i18, java.lang.String str2) {
        this.f265623f = 0;
        this.f265625h = false;
        this.f265627m = 0;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        fq4.d dVar = new fq4.d();
        this.f265624g = dVar;
        c01.n9 n9Var = (c01.n9) dVar.getReqObj();
        this.f265622e = str;
        this.f265623f = 0;
        r45.ry6 ry6Var = n9Var.f37349a;
        ry6Var.f385307f = i17;
        ry6Var.f385308g = str2;
        this.f265627m = i18;
        ry6Var.f385306e = i18;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voiceRegist %d %d", java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18));
        this.f265625h = true;
        H();
    }

    public final int H() {
        c01.n9 n9Var = (c01.n9) this.f265624g.getReqObj();
        r45.i17 i17Var = new r45.i17();
        n9Var.f37349a.f385305d = i17Var;
        java.lang.String str = this.f265622e;
        w21.l0 l0Var = new w21.l0(fq4.u.a(str, false));
        int k17 = (int) com.tencent.mm.vfs.w6.k(fq4.u.a(str, false));
        int i17 = this.f265623f;
        w21.t d17 = k17 - i17 >= 6000 ? l0Var.d(i17, 6000) : l0Var.d(i17, k17 - i17);
        if (d17.f442465b == 0) {
            return -2;
        }
        int i18 = d17.f442467d;
        if (i18 < 0) {
            com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneRsaVertifyVoicePrint", "readerror %d", java.lang.Integer.valueOf(i18));
            return -1;
        }
        int i19 = this.f265623f;
        if (i19 >= 469000) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "moffset > maxfile %d", java.lang.Integer.valueOf(i19));
            return -1;
        }
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(d17.f442464a);
        i17Var.f376671g = cu5Var;
        i17Var.f376668d = this.f265623f;
        i17Var.f376669e = d17.f442465b;
        i17Var.f376670f = 0;
        int i27 = this.f265627m;
        r45.ry6 ry6Var = n9Var.f37349a;
        ry6Var.f385306e = i27;
        if (this.f265625h) {
            if (d17.f442466c >= ((int) com.tencent.mm.vfs.w6.k(fq4.u.a(str, false)))) {
                i17Var.f376670f = 1;
                this.f265626i = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "the last one pack for uploading totallen %d", java.lang.Integer.valueOf(k17));
            }
        }
        this.f265623f = d17.f442466c;
        ry6Var.f385305d = i17Var;
        return 0;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f265621d = u0Var;
        return dispatch(sVar, this.f265624g, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 617;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        c01.o9 o9Var = (c01.o9) v0Var.getRespObj();
        if (i18 == 4 && i19 == -102) {
            gm0.j1.e().j(new fq4.n(this, v0Var.getReqObj().getRsaInfo().f342999c));
            return;
        }
        if (i18 != 0 && i19 != 0) {
            this.f265621d.onSceneEnd(i18, i19, str, this);
            return;
        }
        r45.sy6 sy6Var = o9Var.f37366a;
        int i27 = sy6Var.f386022f;
        this.f265627m = i27;
        this.f265628n = sy6Var.f386021e;
        this.f265629o = sy6Var.f386023g;
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Integer.valueOf(i27);
        objArr[1] = java.lang.Integer.valueOf(this.f265628n);
        objArr[2] = java.lang.Boolean.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.f265629o));
        objArr[3] = java.lang.Integer.valueOf(com.tencent.mm.sdk.platformtools.t8.K0(this.f265629o) ? 0 : this.f265629o.length());
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "voice VoiceTicket %d mResult %d mAuthPwd is null: %b, mAuthPwd.len: %d", objArr);
        if (this.f265626i) {
            this.f265621d.onSceneEnd(i18, i19, str, this);
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "tryDoScene ret %d", java.lang.Integer.valueOf(H()));
        doScene(dispatcher(), this.f265621d);
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneRsaVertifyVoicePrint", "loop doscene");
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
