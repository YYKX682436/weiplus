package z21;

/* loaded from: classes9.dex */
public class j extends z21.a implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469606d;

    /* renamed from: e, reason: collision with root package name */
    public com.tencent.mm.modelbase.o f469607e;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.String f469610h;

    /* renamed from: i, reason: collision with root package name */
    public final long f469611i;

    /* renamed from: o, reason: collision with root package name */
    public final int f469614o;

    /* renamed from: f, reason: collision with root package name */
    public int f469608f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f469609g = 0;

    /* renamed from: m, reason: collision with root package name */
    public boolean f469612m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f469613n = false;

    /* renamed from: p, reason: collision with root package name */
    public java.lang.String[] f469615p = new java.lang.String[0];

    /* renamed from: q, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.b4 f469616q = new com.tencent.mm.sdk.platformtools.b4(new z21.i(this), true);

    public j(java.lang.String str, int i17) {
        this.f469610h = null;
        this.f469611i = -1L;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f469611i = java.lang.System.currentTimeMillis();
        this.f469610h = str;
        this.f469614o = i17;
    }

    @Override // z21.a
    public int H() {
        return 0;
    }

    @Override // z21.a
    public int I() {
        return this.f469608f;
    }

    @Override // z21.a
    public java.lang.String[] J() {
        return this.f469615p;
    }

    @Override // z21.a
    public long K() {
        return this.f469611i;
    }

    @Override // z21.a
    public java.util.List L() {
        return null;
    }

    @Override // z21.a
    public void M() {
        this.f469613n = true;
    }

    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469606d = u0Var;
        java.lang.String str = this.f469610h;
        long k17 = com.tencent.mm.vfs.w6.k(str);
        fp.k.c();
        int i17 = this.f469609g;
        boolean z17 = this.f469613n;
        if (k17 <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVoiceAddr", "read failed :" + str);
            this.f469608f = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        }
        int i18 = (int) (k17 - i17);
        if (i18 > 3960) {
            i18 = 3960;
        } else {
            if (i18 < 3300 && !z17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVoiceAddr", fp.k.c() + " read failed :" + str + "can read:" + i18 + " isfinish:" + this.f469613n);
                this.f469608f = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
                return -1;
            }
            if (z17) {
                this.f469612m = true;
            }
        }
        fp.k.c();
        byte[] N = com.tencent.mm.vfs.w6.N(str, this.f469609g, i18);
        if (N == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVoiceAddr", fp.k.c() + " read failed :" + str + " read:" + i18);
            this.f469608f = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            return -1;
        }
        com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
        lVar.f70664a = new r45.c17();
        lVar.f70665b = new r45.d17();
        lVar.f70666c = "/cgi-bin/micromsg-bin/voiceaddr";
        lVar.f70667d = 206;
        lVar.f70668e = 94;
        lVar.f70669f = 1000000094;
        com.tencent.mm.modelbase.o a17 = lVar.a();
        this.f469607e = a17;
        r45.c17 c17Var = (r45.c17) a17.f70710a.f70684a;
        r45.cu5 cu5Var = new r45.cu5();
        cu5Var.d(N);
        c17Var.f371224e = cu5Var;
        fp.k.c();
        c17Var.f371224e.f371841f.g();
        int i19 = c17Var.f371224e.f371839d;
        kk.k.g(N);
        kk.k.g(c17Var.f371224e.f371841f.g());
        c17Var.f371223d = (java.lang.String) gm0.j1.u().c().l(2, "");
        c17Var.f371225f = this.f469609g;
        c17Var.f371226g = "" + this.f469611i;
        c17Var.f371227h = this.f469612m ? 1 : 0;
        c17Var.f371228i = 0;
        c17Var.f371229m = 0;
        c17Var.f371230n = 0;
        c17Var.f371231o = 0;
        c17Var.f371232p = this.f469614o;
        return dispatch(sVar, this.f469607e, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return 206;
    }

    @Override // com.tencent.mm.network.l0
    public void onGYNetEnd(int i17, int i18, int i19, java.lang.String str, com.tencent.mm.network.v0 v0Var, byte[] bArr) {
        fp.k.c();
        updateDispatchId(i17);
        com.tencent.mm.modelbase.o oVar = (com.tencent.mm.modelbase.o) v0Var;
        r45.c17 c17Var = (r45.c17) oVar.f70710a.f70684a;
        r45.d17 d17Var = (r45.d17) oVar.f70711b.f70700a;
        if (i18 != 0 || i19 != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneVoiceAddr", fp.k.c() + " onGYNetEnd file:" + this.f469610h + " errType:" + i18 + " errCode:" + i19);
            this.f469606d.onSceneEnd(i18, i19, str, this);
            return;
        }
        fp.k.c();
        int i27 = d17Var.f371994d;
        java.util.LinkedList linkedList = d17Var.f371996f;
        java.util.Objects.toString(linkedList);
        if (c17Var.f371227h != 1) {
            this.f469609g = c17Var.f371225f + c17Var.f371224e.f371839d;
            long j17 = this.f469613n ? 0L : 500L;
            this.f469616q.c(j17, j17);
        } else {
            this.f469615p = new java.lang.String[linkedList.size()];
            for (int i28 = 0; i28 < linkedList.size(); i28++) {
                this.f469615p[i28] = ((r45.du5) linkedList.get(i28)).f372756d;
            }
            this.f469606d.onSceneEnd(i18, i19, str, this);
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
        this.f469606d.onSceneEnd(3, fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL, "ecurityCheckError", this);
    }
}
