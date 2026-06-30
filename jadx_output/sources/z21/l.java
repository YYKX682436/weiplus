package z21;

/* loaded from: classes9.dex */
public class l extends z21.a implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469645d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f469646e;

    /* renamed from: i, reason: collision with root package name */
    public final java.lang.String f469650i;

    /* renamed from: m, reason: collision with root package name */
    public final long f469651m;

    /* renamed from: o, reason: collision with root package name */
    public final int f469653o;

    /* renamed from: f, reason: collision with root package name */
    public int f469647f = 0;

    /* renamed from: g, reason: collision with root package name */
    public boolean f469648g = false;

    /* renamed from: h, reason: collision with root package name */
    public int f469649h = 0;

    /* renamed from: n, reason: collision with root package name */
    public boolean f469652n = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f469654p = new java.lang.String[0];

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f469655q = new com.tencent.mm.sdk.platformtools.b4(new z21.k(this), true);

    public l(java.lang.String str, int i17) {
        this.f469650i = null;
        this.f469651m = -1L;
        this.f469653o = 0;
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("");
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        sb6.append(java.lang.System.currentTimeMillis());
        this.f469651m = sb6.toString().hashCode();
        this.f469650i = str;
        this.f469653o = i17;
    }

    @Override // z21.a
    public int H() {
        return 0;
    }

    @Override // z21.a
    public int I() {
        return this.f469647f;
    }

    @Override // z21.a
    public java.lang.String[] J() {
        return this.f469654p;
    }

    @Override // z21.a
    public long K() {
        return this.f469651m;
    }

    @Override // z21.a
    public java.util.List L() {
        return null;
    }

    @Override // z21.a
    public void M() {
        this.f469648g = true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469645d = u0Var;
        java.lang.String str = this.f469650i;
        int k17 = (int) com.tencent.mm.vfs.w6.k(str);
        if (k17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVoiceInput", "read failed :" + str);
            this.f469647f = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        }
        int i17 = k17 - this.f469649h;
        if (i17 > 3960) {
            i17 = 3960;
        } else {
            if (i17 < 3300 && !this.f469648g) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVoiceInput", fp.k.c() + " read failed :" + str + "can read:" + i17 + " isfinish:" + this.f469648g);
                this.f469647f = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
                return -1;
            }
            if (this.f469648g) {
                this.f469652n = true;
            }
        }
        byte[] N = com.tencent.mm.vfs.w6.N(str, this.f469649h, i17);
        if (N == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVoiceInput", fp.k.c() + " read failed :" + str + " read:" + i17);
            this.f469647f = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.du6();
        lVar.f70665b = new r45.eu6();
        lVar.f70666c = "/cgi-bin/micromsg-bin/uploadinputvoice";
        lVar.f70667d = 349;
        lVar.f70668e = 158;
        lVar.f70669f = 1000000158;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f469646e = a17;
        r45.du6 du6Var = (r45.du6) a17.f70710a.f70684a;
        du6Var.f372758d = (java.lang.String) gm0.j1.u().c().l(2, "");
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(N);
        du6Var.f372759e = cu5Var;
        fp.k.c();
        du6Var.f372759e.f371841f.g();
        int i18 = du6Var.f372759e.f371839d;
        kk.k.g(N);
        kk.k.g(du6Var.f372759e.f371841f.g());
        du6Var.f372760f = this.f469649h;
        du6Var.f372761g = "" + this.f469651m;
        du6Var.f372762h = this.f469652n ? 1 : 0;
        du6Var.f372763i = 0;
        du6Var.f372764m = 0;
        du6Var.f372765n = this.f469653o;
        du6Var.f372766o = 0;
        return dispatch(sVar, this.f469646e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 349;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        com.tencent.mm.protobuf.g gVar;
        updateDispatchId(i17);
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.du6 du6Var = (r45.du6) oVar.f70710a.f70684a;
        r45.eu6 eu6Var = (r45.eu6) oVar.f70711b.f70700a;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVoiceInput", fp.k.c() + " onGYNetEnd file:" + this.f469650i + " errType:" + i18 + " errCode:" + i19);
            this.f469645d.onSceneEnd(i18, i19, str, this);
            return;
        }
        fp.k.c();
        int i27 = eu6Var.f373735d;
        if (du6Var.f372762h != 1) {
            this.f469649h = du6Var.f372760f + du6Var.f372759e.f371839d;
            long j17 = this.f469648g ? 0L : 500L;
            this.f469655q.c(j17, j17);
        } else {
            r45.cu5 cu5Var = eu6Var.f373736e;
            if (cu5Var != null && (gVar = cu5Var.f371841f) != null) {
                this.f469654p = new java.lang.String[]{gVar.i()};
            }
            this.f469645d.onSceneEnd(i18, i19, str, this);
        }
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 20;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        this.f469645d.onSceneEnd(3, fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL, "ecurityCheckError", this);
    }
}
