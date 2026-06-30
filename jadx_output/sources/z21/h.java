package z21;

/* loaded from: classes12.dex */
public class h extends z21.a implements com.tencent.mm.network.l0 {

    /* renamed from: d, reason: collision with root package name */
    public com.tencent.mm.modelbase.u0 f469576d;

    /* renamed from: h, reason: collision with root package name */
    public final z21.a0 f469580h;

    /* renamed from: t, reason: collision with root package name */
    public final java.lang.String f469589t;

    /* renamed from: u, reason: collision with root package name */
    public final r45.du5 f469590u;

    /* renamed from: v, reason: collision with root package name */
    public final int f469591v;

    /* renamed from: w, reason: collision with root package name */
    public final int f469592w;

    /* renamed from: x, reason: collision with root package name */
    public final int f469593x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f469594y;

    /* renamed from: e, reason: collision with root package name */
    public int f469577e = 0;

    /* renamed from: f, reason: collision with root package name */
    public int f469578f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f469579g = 120;

    /* renamed from: i, reason: collision with root package name */
    public final java.util.Map f469581i = new java.util.HashMap();

    /* renamed from: m, reason: collision with root package name */
    public boolean f469582m = false;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Long f469583n = 0L;

    /* renamed from: o, reason: collision with root package name */
    public boolean f469584o = false;

    /* renamed from: p, reason: collision with root package name */
    public boolean f469585p = false;

    /* renamed from: q, reason: collision with root package name */
    public boolean f469586q = true;

    /* renamed from: r, reason: collision with root package name */
    public int f469587r = 0;

    /* renamed from: s, reason: collision with root package name */
    public int f469588s = 0;

    /* renamed from: z, reason: collision with root package name */
    public java.lang.String[] f469595z = new java.lang.String[0];
    public int A = 0;
    public java.util.LinkedList B = new java.util.LinkedList();
    public int C = 3960;
    public final com.tencent.mm.sdk.platformtools.n3 D = new z21.g(this, gm0.j1.e().a());

    public h(java.lang.String str, java.lang.String str2, java.lang.String str3, int i17, int i18, int i19, boolean z17) {
        this.f469589t = null;
        this.f469590u = null;
        this.f469592w = 0;
        this.f469593x = 0;
        this.f469594y = false;
        this.f469589t = str;
        this.f469580h = new z21.a0(str2);
        r45.du5 du5Var = new r45.du5();
        du5Var.f372756d = str3;
        du5Var.f372757e = true;
        this.f469590u = du5Var;
        this.f469591v = i17;
        this.f469592w = i18;
        this.f469593x = i19;
        this.f469594y = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "NetSceneNewVoiceInput filename:%s,session:%s,vadVersion:%s, langType:%d, scene:%s, removeVad:%s", str, str2, str3, java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(i18), java.lang.Boolean.valueOf(z17));
    }

    @Override // z21.a
    public int H() {
        return this.f469578f;
    }

    @Override // z21.a
    public int I() {
        return this.f469577e;
    }

    @Override // z21.a
    public java.lang.String[] J() {
        return this.f469595z;
    }

    @Override // z21.a
    public long K() {
        return 0L;
    }

    @Override // z21.a
    public java.util.List L() {
        return this.f469580h.e();
    }

    @Override // z21.a
    public void M() {
        this.f469582m = true;
    }

    public void N() {
        fp.k.c();
        if (this.f469585p) {
            return;
        }
        this.f469585p = true;
        Q();
        com.tencent.mm.modelbase.r1 d17 = gm0.j1.d();
        int hashCode = hashCode();
        d17.getClass();
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.NetSceneQueue", "cancelAllImp sceneHashCode:%d", java.lang.Integer.valueOf(hashCode));
        com.tencent.mm.modelbase.e2 e2Var = new com.tencent.mm.modelbase.e2(d17, hashCode);
        x51.q1 q1Var = d17.f70775r;
        q1Var.getClass();
        q1Var.a(e2Var, 0L, true);
        z21.z h17 = this.f469580h.h(this.f469587r);
        if (h17 != null) {
            this.f469588s = 0;
            gm0.j1.e().j(new z21.f(this, h17));
        }
    }

    public boolean O() {
        return this.f469580h.g() || this.f469578f != 0;
    }

    public boolean P() {
        this.D.removeMessages(291);
        if ((O() && this.f469582m) || this.f469584o) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "preDoScene return");
            return false;
        }
        z21.z h17 = this.f469580h.h(this.f469587r);
        if (h17 == null) {
            this.D.sendEmptyMessageDelayed(291, this.f469579g * 2);
            return true;
        }
        long min = java.lang.Math.min(com.tencent.mm.vfs.w6.k(this.f469589t), h17.f469705d);
        if (min <= 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.NetSceneNewVoiceInput", "nowMarkLen <= 0 read failed :%s", this.f469589t);
            this.f469577e = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            this.f469588s = 0;
            N();
            com.tencent.mm.modelbase.u0 u0Var = this.f469576d;
            if (u0Var != null) {
                u0Var.onSceneEnd(3, -1, "ReadFileLengthError", this);
            }
            return false;
        }
        int i17 = (int) (min - this.f469587r);
        this.f469588s = i17;
        if (i17 < 0) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "canReadLen < 0 length:%s ", java.lang.Integer.valueOf(i17));
            this.f469577e = fp.k.a() + com.tencent.thumbplayer.tmediacodec.codec.CodecError.DEQUEUEINPUTBUFFER_ILLEGAL;
            this.D.sendEmptyMessageDelayed(291, this.f469579g * 2);
            return false;
        }
        if (this.f469588s >= 500 || h17.f469706e <= 5) {
            this.D.sendEmptyMessageDelayed(291, this.f469579g);
        } else {
            this.D.sendEmptyMessageDelayed(291, this.f469579g * 2);
        }
        return true;
    }

    public final void Q() {
        fp.k.c();
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.D;
        if (n3Var != null) {
            n3Var.removeMessages(291);
        }
        this.f469584o = true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.tencent.mm.modelbase.m1
    public int doScene(com.tencent.mm.network.s sVar, com.tencent.mm.modelbase.u0 u0Var) {
        this.f469576d = u0Var;
        if ((this.f469592w >= 15) == true) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "doScene MM_VOICE_TRANSSCENE_INPUTBOX  goNewCgi!  fileName:%s", this.f469589t);
            com.tencent.mm.modelbase.l lVar = new com.tencent.mm.modelbase.l();
            lVar.f70664a = new r45.p17();
            lVar.f70665b = new r45.r17();
            lVar.f70666c = "/cgi-bin/micromsg-bin/voice_recognize";
            lVar.f70667d = 12220;
            int i17 = this.A;
            if (i17 > 0) {
                lVar.f70672i = i17 * 1000;
            }
            com.tencent.mm.modelbase.o a17 = lVar.a();
            a17.getReqObj().setShortSupport(false);
            r45.p17 p17Var = (r45.p17) a17.f70710a.f70684a;
            z21.z h17 = this.f469580h.h(this.f469587r);
            p17Var.f382669e = this.f469592w;
            if (h17 == null) {
                p17Var.f382668d = "0";
                p17Var.f382670f = com.tencent.mm.protobuf.g.b(new byte[0]);
                p17Var.f382671g = 2;
                p17Var.f382672h = true;
                p17Var.f382673i = 0;
                p17Var.f382674m = com.tencent.mm.protobuf.g.b(new byte[0]);
                ((java.util.HashMap) this.f469581i).put(java.lang.Integer.valueOf(p17Var.f382673i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
                java.lang.System.currentTimeMillis();
                return dispatch(sVar, a17, this);
            }
            h17.f469703b = true;
            if (this.f469585p) {
                h17.f469704c = true;
                p17Var.f382670f = com.tencent.mm.protobuf.g.b(new byte[0]);
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "send last packet");
            } else {
                int i18 = this.f469588s;
                int i19 = this.C;
                if (i18 > i19) {
                    this.f469588s = i19;
                    h17.f469704c = false;
                } else if (i18 <= i19 && (h17.f469705d != Integer.MAX_VALUE || this.f469582m)) {
                    h17.f469704c = true;
                }
                p17Var.f382670f = com.tencent.mm.protobuf.g.b(com.tencent.mm.vfs.w6.N(this.f469589t, this.f469587r, this.f469588s));
            }
            p17Var.f382668d = h17.f469702a;
            p17Var.f382672h = h17.f469704c;
            p17Var.f382671g = 2;
            int i27 = h17.f469706e + 1;
            h17.f469706e = i27;
            p17Var.f382673i = i27;
            com.tencent.mm.protobuf.g gVar = this.f469580h.f469551b;
            if (gVar == null) {
                gVar = com.tencent.mm.protobuf.g.b(new byte[0]);
            }
            p17Var.f382674m = gVar;
            ((java.util.HashMap) this.f469581i).put(java.lang.Integer.valueOf(p17Var.f382673i), java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", " goNewCgi voice_id: %s, is_end:%s", p17Var.f382668d, java.lang.Boolean.valueOf(p17Var.f382672h));
            int length = this.f469587r + p17Var.f382670f.f192156a.length;
            this.f469587r = length;
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "clientId %s oldReadOffset %s", h17.f469702a, java.lang.Integer.valueOf(length));
            if (h17.f469706e == 1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "time flee send seq 1 time = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
            }
            java.lang.System.currentTimeMillis();
            return dispatch(sVar, a17, this);
        }
        com.tencent.mm.modelbase.l lVar2 = new com.tencent.mm.modelbase.l();
        lVar2.f70664a = new r45.w17();
        lVar2.f70665b = new r45.y17();
        lVar2.f70666c = "/cgi-bin/micromsg-bin/voicetrans";
        lVar2.f70667d = 235;
        lVar2.f70668e = 381;
        lVar2.f70669f = 1000000381;
        com.tencent.mm.modelbase.o a18 = lVar2.a();
        a18.getReqObj().setShortSupport(false);
        r45.w17 w17Var = (r45.w17) a18.f70710a.f70684a;
        z21.z h18 = this.f469580h.h(this.f469587r);
        w17Var.f388796q = this.f469592w;
        if (h18 == null) {
            w17Var.f388786d = new r45.cu5();
            w17Var.f388787e = this.f469587r;
            w17Var.f388788f = "0";
            w17Var.f388789g = 1;
            w17Var.f388790h = 2;
            w17Var.f388791i = 0;
            java.util.LinkedList d17 = this.f469580h.d();
            w17Var.f388793n = d17;
            w17Var.f388792m = d17.size();
            w17Var.f388794o = this.f469590u;
            w17Var.f388795p = this.f469591v;
            w17Var.f388797r = this.f469594y ? 1 : 0;
            java.util.Iterator it = w17Var.f388793n.iterator();
            while (it.hasNext()) {
                java.lang.String str = ((r45.du5) it.next()).f372756d;
            }
            java.lang.System.currentTimeMillis();
            return dispatch(sVar, a18, this);
        }
        h18.f469703b = true;
        if (this.f469585p) {
            h18.f469704c = true;
            w17Var.f388786d = new r45.cu5();
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "send last packet");
        } else {
            int i28 = this.f469588s;
            int i29 = this.C;
            if (i28 > i29) {
                this.f469588s = i29;
                h18.f469704c = false;
            } else if (i28 <= i29 && (h18.f469705d != Integer.MAX_VALUE || this.f469582m)) {
                h18.f469704c = true;
            }
            byte[] N = com.tencent.mm.vfs.w6.N(this.f469589t, this.f469587r, this.f469588s);
            r45.cu5 cu5Var = new r45.cu5();
            cu5Var.d(N);
            w17Var.f388786d = cu5Var;
        }
        w17Var.f388787e = this.f469587r;
        w17Var.f388788f = h18.f469702a;
        w17Var.f388789g = h18.f469704c ? 1 : 0;
        w17Var.f388790h = 2;
        int i37 = h18.f469706e + 1;
        h18.f469706e = i37;
        w17Var.f388791i = i37;
        java.util.LinkedList d18 = this.f469580h.d();
        w17Var.f388793n = d18;
        w17Var.f388792m = d18.size();
        w17Var.f388794o = this.f469590u;
        w17Var.f388795p = this.f469591v;
        w17Var.f388797r = this.f469594y ? 1 : 0;
        fp.k.c();
        int i38 = this.f469587r + w17Var.f388786d.f371839d;
        this.f469587r = i38;
        com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "clientId %s oldReadOffset %s", h18.f469702a, java.lang.Integer.valueOf(i38));
        if (h18.f469706e == 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.NetSceneNewVoiceInput", "time flee send seq 1 time = %s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis()));
        }
        java.lang.System.currentTimeMillis();
        return dispatch(sVar, a18, this);
    }

    @Override // com.tencent.mm.modelbase.m1
    public int getType() {
        return this.f469592w >= 15 ? 12220 : 235;
    }

    @Override // com.tencent.mm.modelbase.m1
    public boolean isSupportConcurrent() {
        return true;
    }

    /* JADX WARN: Removed duplicated region for block: B:87:0x02b9  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x02dc  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x02de  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02bb  */
    @Override // com.tencent.mm.network.l0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onGYNetEnd(int r26, int r27, int r28, java.lang.String r29, com.tencent.mm.network.v0 r30, byte[] r31) {
        /*
            Method dump skipped, instructions count: 944
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: z21.h.onGYNetEnd(int, int, int, java.lang.String, com.tencent.mm.network.v0, byte[]):void");
    }

    @Override // com.tencent.mm.modelbase.m1
    public int securityLimitCount() {
        return 2000;
    }

    @Override // com.tencent.mm.modelbase.m1
    public com.tencent.mm.modelbase.o1 securityVerificationChecked(com.tencent.mm.network.v0 v0Var) {
        return com.tencent.mm.modelbase.o1.EOk;
    }

    @Override // com.tencent.mm.modelbase.m1
    public void setSecurityCheckError(com.tencent.mm.modelbase.n1 n1Var) {
        com.tencent.mars.xlog.Log.w("MicroMsg.NetSceneNewVoiceInput", fp.k.c() + " setSecurityCheckError e: %s", n1Var);
        if (n1Var == com.tencent.mm.modelbase.n1.EReachMaxLimit) {
            N();
            this.f469576d.onSceneEnd(3, -1, "SecurityCheckError", this);
        }
    }
}
