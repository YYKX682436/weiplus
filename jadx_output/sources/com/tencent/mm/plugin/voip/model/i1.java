package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class i1 {
    public com.tencent.mm.plugin.voip.model.k1 S;
    public java.nio.ByteBuffer W;

    /* renamed from: d, reason: collision with root package name */
    public final com.tencent.mm.plugin.voip.model.g1 f176649d;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.mm.sdk.platformtools.n3 f176666u;

    /* renamed from: a, reason: collision with root package name */
    public volatile com.tencent.mm.plugin.voip.model.e f176646a = null;

    /* renamed from: b, reason: collision with root package name */
    public volatile tl.w f176647b = null;

    /* renamed from: c, reason: collision with root package name */
    public int f176648c = 1;

    /* renamed from: e, reason: collision with root package name */
    public long f176650e = 0;

    /* renamed from: f, reason: collision with root package name */
    public long f176651f = 0;

    /* renamed from: g, reason: collision with root package name */
    public int f176652g = 1;

    /* renamed from: h, reason: collision with root package name */
    public final java.lang.Object f176653h = new java.lang.Object();

    /* renamed from: i, reason: collision with root package name */
    public int f176654i = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f176655j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f176656k = false;

    /* renamed from: l, reason: collision with root package name */
    public boolean f176657l = false;

    /* renamed from: m, reason: collision with root package name */
    public boolean f176658m = false;

    /* renamed from: n, reason: collision with root package name */
    public boolean f176659n = false;

    /* renamed from: o, reason: collision with root package name */
    public boolean f176660o = false;

    /* renamed from: p, reason: collision with root package name */
    public int f176661p = 0;

    /* renamed from: q, reason: collision with root package name */
    public int f176662q = 1;

    /* renamed from: r, reason: collision with root package name */
    public int f176663r = 1;

    /* renamed from: s, reason: collision with root package name */
    public long f176664s = 0;

    /* renamed from: t, reason: collision with root package name */
    public long f176665t = 0;

    /* renamed from: v, reason: collision with root package name */
    public long f176667v = 0;

    /* renamed from: w, reason: collision with root package name */
    public int f176668w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f176669x = 1;

    /* renamed from: y, reason: collision with root package name */
    public int f176670y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f176671z = 0;
    public int A = 0;
    public int B = 0;
    public int C = -1;
    public int D = -1;
    public int E = 48000;
    public int F = 256;
    public int G = 16000;
    public int H = 256;
    public int I = 16;

    /* renamed from: J, reason: collision with root package name */
    public int f176645J = 2;
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public int O = 0;
    public boolean P = vq4.b0.c();
    public final tl.v Q = new com.tencent.mm.plugin.voip.model.j1(this);
    public boolean R = false;
    public int T = 640;
    public int U = 480;
    public final int V = bm5.o1.f22719a.g(bm5.h0.RepairerConfig_VOIP_ForceHardEncode_Int, 0);

    public i1(com.tencent.mm.plugin.voip.model.g1 g1Var) {
        this.f176649d = g1Var;
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.f176666u;
        if (n3Var == null || n3Var.isQuit()) {
            this.f176666u = new com.tencent.mm.sdk.platformtools.n3("VoipDeviceHandler_stopDev");
        }
    }

    public void a() {
        com.tencent.mm.sdk.platformtools.Log.c("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord, recorder %s", this.f176647b);
        if (this.f176666u == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord failed but mDevHandler is null");
            return;
        }
        synchronized (this.f176653h) {
            if (this.f176646a != null || this.f176647b != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord process post runnable");
                com.tencent.mm.sdk.platformtools.n3 n3Var = this.f176666u;
                if (n3Var != null) {
                    n3Var.removeCallbacksAndMessages(null);
                    this.f176666u.post(new java.lang.Runnable() { // from class: com.tencent.mm.plugin.voip.model.i1$$a
                        @Override // java.lang.Runnable
                        public final void run() {
                            com.tencent.mm.plugin.voip.model.i1 i1Var = com.tencent.mm.plugin.voip.model.i1.this;
                            i1Var.getClass();
                            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord process post success and wait running");
                            if (i1Var.f176646a != null) {
                                i1Var.f176646a.e();
                                i1Var.f176646a.f();
                                i1Var.f176646a = null;
                                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord finish stopRecord and release player");
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord do stopRecord");
                            if (i1Var.f176647b != null) {
                                i1Var.f176647b.l();
                                i1Var.f176647b = null;
                                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord finish stopRecord and release recorder");
                            }
                            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "forceCleanRecord process post success and quitSafely");
                        }
                    });
                }
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x000c, code lost:
    
        if (r0 >= 0) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int b() {
        /*
            r6 = this;
            int r0 = r6.f176668w
            r1 = 0
            r2 = 1
            if (r0 != r2) goto Lf
            int r0 = r6.B
            if (r0 != r2) goto Lf
            int r0 = r6.D
            if (r0 < 0) goto L28
            goto L29
        Lf:
            com.tencent.mm.plugin.voip.model.e r0 = r6.f176646a
            if (r0 == 0) goto L28
            com.tencent.mm.plugin.voip.model.g1 r0 = r6.f176649d
            com.tencent.mm.plugin.voip.model.v2protocal r0 = r0.f176532x
            com.tencent.mm.plugin.voip.model.l1 r0 = r0.M1
            byte r0 = r0.f176723j
            if (r0 != r2) goto L28
            com.tencent.mm.plugin.voip.model.e r0 = r6.f176646a
            if (r0 == 0) goto L28
            com.tencent.mm.plugin.voip.model.e r0 = r6.f176646a
            int r0 = r0.g()
            goto L29
        L28:
            r0 = r1
        L29:
            java.lang.Class<ym1.f> r2 = ym1.f.class
            i95.m r3 = i95.n0.c(r2)
            java.lang.String r4 = "getService(...)"
            kotlin.jvm.internal.o.f(r3, r4)
            ym1.f r3 = (ym1.f) r3
            xm1.h r3 = r3.f463136e
            if (r3 != 0) goto L59
            xm1.j r3 = new xm1.j
            r3.<init>()
            i95.m r5 = i95.n0.c(r2)
            kotlin.jvm.internal.o.f(r5, r4)
            ym1.f r5 = (ym1.f) r5
            r5.f463136e = r3
            i95.m r2 = i95.n0.c(r2)
            kotlin.jvm.internal.o.f(r2, r4)
            ym1.f r2 = (ym1.f) r2
            java.lang.String r4 = "music"
            java.lang.String[] r2 = r2.f463138g
            r2[r1] = r4
        L59:
            int r1 = r3.g(r0)
            float r1 = (float) r1
            int r0 = ym1.f.Di(r0)
            float r0 = (float) r0
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.i1.b():int");
    }

    public int c() {
        if (this.f176646a == null || this.f176649d.f176532x.M1.f176723j != 1) {
            return 0;
        }
        return this.f176646a.K;
    }

    public int d() {
        int i17;
        if (this.f176647b == null || this.f176649d.f176532x.M1.f176723j != 1 || (i17 = this.f176647b.f420148a) == 6) {
            return 0;
        }
        return i17;
    }

    public final void e() {
        vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "seenli, player=" + this.f176646a);
        if (this.f176646a != null) {
            this.D = this.f176646a.h(false);
        } else {
            vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "player == null, return...");
            this.D = -1;
        }
        ym1.f.wi().f();
        this.O = ym1.f.wi().f();
        wo.c cVar = wo.v1.f447823c;
        if (!cVar.f447589a) {
            this.O = 3;
            if (fp.e0.g() && 2 == wo.v1.f447833m.f447750h) {
                this.O = 2;
            }
            int i17 = cVar.C;
            if (i17 > -1) {
                this.O = i17;
            }
        } else if (cVar.b()) {
            int i18 = cVar.f447593c;
            if (i18 >= 0) {
                this.O = i18;
            } else if (cVar.f447595d >= 0) {
                this.O = 2;
            }
        } else if (cVar.a() && cVar.d() >= 0) {
            this.O = cVar.d();
        }
        int i19 = this.O;
        if (i19 == 3) {
            if (this.D != 0) {
                this.D = -1;
            }
        } else if (i19 != 0) {
            this.D = -1;
        } else if (this.D != 3) {
            this.D = -1;
        }
    }

    public void f(int i17, int i18, int i19, int i27) {
        this.K = i17;
        this.L = i18;
        this.M = i19;
        this.N = i27;
        vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "seenli, setOpenslParamsXExpt setXOpenslNativePlayFs=" + this.K + ", setXOpenslPcmPlayFormat=" + this.L + ", setXOpenslPlayChannels=" + this.M + ", setXOpenslNativeRecFs=" + this.N);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x01cf A[Catch: all -> 0x03d2, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x0023, B:7:0x002c, B:55:0x002f, B:57:0x006f, B:58:0x0078, B:60:0x007b, B:63:0x009c, B:65:0x00a4, B:66:0x00c5, B:71:0x00eb, B:72:0x00f0, B:77:0x00f9, B:78:0x00fe, B:82:0x0108, B:86:0x0114, B:90:0x011d, B:94:0x0127, B:96:0x0135, B:98:0x013c, B:99:0x0141, B:101:0x01cf, B:102:0x01ea, B:104:0x01ed, B:106:0x0203, B:110:0x020d, B:113:0x0235, B:121:0x024b, B:123:0x024f, B:124:0x026a, B:126:0x026d, B:127:0x029d, B:130:0x02cf, B:131:0x02d7, B:133:0x02ad, B:135:0x02d9, B:136:0x02ea, B:144:0x013f, B:145:0x0138, B:146:0x0125, B:147:0x011b, B:148:0x0112, B:149:0x0106, B:150:0x00fc, B:151:0x00ee, B:152:0x00af, B:153:0x0098), top: B:3:0x001d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:104:0x01ed A[Catch: all -> 0x03d2, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x0023, B:7:0x002c, B:55:0x002f, B:57:0x006f, B:58:0x0078, B:60:0x007b, B:63:0x009c, B:65:0x00a4, B:66:0x00c5, B:71:0x00eb, B:72:0x00f0, B:77:0x00f9, B:78:0x00fe, B:82:0x0108, B:86:0x0114, B:90:0x011d, B:94:0x0127, B:96:0x0135, B:98:0x013c, B:99:0x0141, B:101:0x01cf, B:102:0x01ea, B:104:0x01ed, B:106:0x0203, B:110:0x020d, B:113:0x0235, B:121:0x024b, B:123:0x024f, B:124:0x026a, B:126:0x026d, B:127:0x029d, B:130:0x02cf, B:131:0x02d7, B:133:0x02ad, B:135:0x02d9, B:136:0x02ea, B:144:0x013f, B:145:0x0138, B:146:0x0125, B:147:0x011b, B:148:0x0112, B:149:0x0106, B:150:0x00fc, B:151:0x00ee, B:152:0x00af, B:153:0x0098), top: B:3:0x001d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0232  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x024f A[Catch: all -> 0x03d2, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x0023, B:7:0x002c, B:55:0x002f, B:57:0x006f, B:58:0x0078, B:60:0x007b, B:63:0x009c, B:65:0x00a4, B:66:0x00c5, B:71:0x00eb, B:72:0x00f0, B:77:0x00f9, B:78:0x00fe, B:82:0x0108, B:86:0x0114, B:90:0x011d, B:94:0x0127, B:96:0x0135, B:98:0x013c, B:99:0x0141, B:101:0x01cf, B:102:0x01ea, B:104:0x01ed, B:106:0x0203, B:110:0x020d, B:113:0x0235, B:121:0x024b, B:123:0x024f, B:124:0x026a, B:126:0x026d, B:127:0x029d, B:130:0x02cf, B:131:0x02d7, B:133:0x02ad, B:135:0x02d9, B:136:0x02ea, B:144:0x013f, B:145:0x0138, B:146:0x0125, B:147:0x011b, B:148:0x0112, B:149:0x0106, B:150:0x00fc, B:151:0x00ee, B:152:0x00af, B:153:0x0098), top: B:3:0x001d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x026d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:137:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:138:0x023e  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x0234  */
    /* JADX WARN: Removed duplicated region for block: B:144:0x013f A[Catch: all -> 0x03d2, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x0023, B:7:0x002c, B:55:0x002f, B:57:0x006f, B:58:0x0078, B:60:0x007b, B:63:0x009c, B:65:0x00a4, B:66:0x00c5, B:71:0x00eb, B:72:0x00f0, B:77:0x00f9, B:78:0x00fe, B:82:0x0108, B:86:0x0114, B:90:0x011d, B:94:0x0127, B:96:0x0135, B:98:0x013c, B:99:0x0141, B:101:0x01cf, B:102:0x01ea, B:104:0x01ed, B:106:0x0203, B:110:0x020d, B:113:0x0235, B:121:0x024b, B:123:0x024f, B:124:0x026a, B:126:0x026d, B:127:0x029d, B:130:0x02cf, B:131:0x02d7, B:133:0x02ad, B:135:0x02d9, B:136:0x02ea, B:144:0x013f, B:145:0x0138, B:146:0x0125, B:147:0x011b, B:148:0x0112, B:149:0x0106, B:150:0x00fc, B:151:0x00ee, B:152:0x00af, B:153:0x0098), top: B:3:0x001d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:145:0x0138 A[Catch: all -> 0x03d2, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x0023, B:7:0x002c, B:55:0x002f, B:57:0x006f, B:58:0x0078, B:60:0x007b, B:63:0x009c, B:65:0x00a4, B:66:0x00c5, B:71:0x00eb, B:72:0x00f0, B:77:0x00f9, B:78:0x00fe, B:82:0x0108, B:86:0x0114, B:90:0x011d, B:94:0x0127, B:96:0x0135, B:98:0x013c, B:99:0x0141, B:101:0x01cf, B:102:0x01ea, B:104:0x01ed, B:106:0x0203, B:110:0x020d, B:113:0x0235, B:121:0x024b, B:123:0x024f, B:124:0x026a, B:126:0x026d, B:127:0x029d, B:130:0x02cf, B:131:0x02d7, B:133:0x02ad, B:135:0x02d9, B:136:0x02ea, B:144:0x013f, B:145:0x0138, B:146:0x0125, B:147:0x011b, B:148:0x0112, B:149:0x0106, B:150:0x00fc, B:151:0x00ee, B:152:0x00af, B:153:0x0098), top: B:3:0x001d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0102 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:84:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0121 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0135 A[Catch: all -> 0x03d2, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x0023, B:7:0x002c, B:55:0x002f, B:57:0x006f, B:58:0x0078, B:60:0x007b, B:63:0x009c, B:65:0x00a4, B:66:0x00c5, B:71:0x00eb, B:72:0x00f0, B:77:0x00f9, B:78:0x00fe, B:82:0x0108, B:86:0x0114, B:90:0x011d, B:94:0x0127, B:96:0x0135, B:98:0x013c, B:99:0x0141, B:101:0x01cf, B:102:0x01ea, B:104:0x01ed, B:106:0x0203, B:110:0x020d, B:113:0x0235, B:121:0x024b, B:123:0x024f, B:124:0x026a, B:126:0x026d, B:127:0x029d, B:130:0x02cf, B:131:0x02d7, B:133:0x02ad, B:135:0x02d9, B:136:0x02ea, B:144:0x013f, B:145:0x0138, B:146:0x0125, B:147:0x011b, B:148:0x0112, B:149:0x0106, B:150:0x00fc, B:151:0x00ee, B:152:0x00af, B:153:0x0098), top: B:3:0x001d, inners: #2 }] */
    /* JADX WARN: Removed duplicated region for block: B:98:0x013c A[Catch: all -> 0x03d2, TryCatch #0 {, blocks: (B:4:0x001d, B:6:0x0023, B:7:0x002c, B:55:0x002f, B:57:0x006f, B:58:0x0078, B:60:0x007b, B:63:0x009c, B:65:0x00a4, B:66:0x00c5, B:71:0x00eb, B:72:0x00f0, B:77:0x00f9, B:78:0x00fe, B:82:0x0108, B:86:0x0114, B:90:0x011d, B:94:0x0127, B:96:0x0135, B:98:0x013c, B:99:0x0141, B:101:0x01cf, B:102:0x01ea, B:104:0x01ed, B:106:0x0203, B:110:0x020d, B:113:0x0235, B:121:0x024b, B:123:0x024f, B:124:0x026a, B:126:0x026d, B:127:0x029d, B:130:0x02cf, B:131:0x02d7, B:133:0x02ad, B:135:0x02d9, B:136:0x02ea, B:144:0x013f, B:145:0x0138, B:146:0x0125, B:147:0x011b, B:148:0x0112, B:149:0x0106, B:150:0x00fc, B:151:0x00ee, B:152:0x00af, B:153:0x0098), top: B:3:0x001d, inners: #2 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g() {
        /*
            Method dump skipped, instructions count: 981
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.i1.g():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:118:0x03e9  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void h() {
        /*
            Method dump skipped, instructions count: 1057
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.tencent.mm.plugin.voip.model.i1.h():void");
    }

    public final void i() {
        com.tencent.mm.plugin.voip.model.a aVar = new com.tencent.mm.plugin.voip.model.a();
        vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "  VoipDeivceHandler.GetAudioDeviceFmt, record samplerate:" + aVar.f176318b + ", framelen: " + aVar.f176319c + ", ret:" + this.f176649d.f176532x.b(aVar));
        this.f176647b = new tl.w(aVar.f176318b, aVar.f176317a, 1);
        this.f176647b.g(aVar.f176319c);
        this.f176647b.F = java.lang.String.valueOf(gq4.v.Bi().n());
        this.f176647b.j(true);
        this.f176647b.f(true);
        this.f176647b.f420160m = -19;
        this.f176647b.h(1, false);
        this.f176647b.i(true);
        this.f176647b.f420172y = this.Q;
        if (!this.f176647b.k() && this.f176647b.f420148a != 13) {
            this.f176654i = 1;
        }
        com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176649d.f176532x;
        android.media.AudioRecord audioRecord = this.f176647b.f420171x;
        v2protocalVar.f176842e0 = audioRecord != null ? audioRecord.getAudioSource() : -1;
        this.f176649d.f176532x.f176833b0 = (int) this.f176647b.G;
        this.f176649d.f176532x.f176836c0 = ym1.f.Bi();
        this.f176649d.f176532x.Y = aVar.f176318b;
        vq4.d0.a("MicroMsg.Voip.VoipDeviceHandler", "  VoipDeivceHandler.m_iAudioDevErr:" + this.f176654i);
        com.tencent.mm.plugin.voip.model.g1 g1Var = this.f176649d;
        int i17 = this.f176654i;
        g1Var.f176532x.L = java.lang.Math.abs(i17);
        if (i17 != 0) {
            g1Var.f176534z.u();
        }
        this.f176649d.f176532x.M1.f176723j = (byte) 1;
    }

    public synchronized void j() {
        android.media.AudioRecord audioRecord;
        com.tencent.mm.plugin.voip.model.k3 k3Var;
        int i17 = 0;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.VoipDeviceHandler", "stopDev, recorder: %s", this.f176647b);
        if (this.f176648c == 3) {
            vq4.d0.b("MicroMsg.Voip.VoipDeviceHandler", "devcie stoped already.");
            if (fp.h.c(25) && this.B == 1) {
                this.f176649d.f176532x.releaseAudioDevice();
            }
            a();
            return;
        }
        vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "stop device..");
        this.f176648c = 3;
        if (this.S != null) {
            vq4.d0.a("MicroMsg.Voip.VoipDeviceHandler", "stop videodecode thread..");
            com.tencent.mm.plugin.voip.model.k1 k1Var = this.S;
            k1Var.getClass();
            try {
                com.tencent.mm.plugin.voip.model.g1 g1Var = k1Var.f176704q.f176649d;
                if (g1Var != null && (k3Var = g1Var.f176534z) != null) {
                    k3Var.P();
                }
                k1Var.f176697g = true;
                k1Var.f176695e.open();
            } catch (java.lang.Exception unused) {
            }
            this.S.b();
            this.S = null;
        }
        this.P = vq4.b0.c();
        this.f176662q = 1;
        this.f176663r = 1;
        this.f176664s = 0L;
        this.f176665t = 0L;
        this.f176650e = 0L;
        this.f176651f = 0L;
        this.f176652g = 1;
        this.f176654i = 0;
        if (this.B == 1) {
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar = this.f176649d.f176532x;
            v2protocalVar.R = v2protocalVar.OpenslPlayCallBackNum();
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar2 = this.f176649d.f176532x;
            v2protocalVar2.Q = v2protocalVar2.OpenslRecordCallBackNum();
            this.f176649d.f176532x.f176860k0 = b();
            this.f176649d.f176532x.f176839d0 = ym1.f.Bi();
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar3 = this.f176649d.f176532x;
            int i18 = this.C;
            if (i18 >= 0) {
                r1 = i18 != 1 ? i18 != 4 ? -1 : 7 : 1;
            }
            v2protocalVar3.f176845f0 = r1;
            v2protocalVar3.f176854i0 = this.D;
            synchronized (this.f176653h) {
                this.f176649d.f176532x.releaseAudioDevice();
            }
            vq4.d0.c("MicroMsg.Voip.VoipDeviceHandler", "opensl stopDev finished");
            a();
        } else {
            this.f176649d.f176532x.M = d();
            this.f176649d.f176532x.N = c();
            this.f176649d.f176532x.Q = (this.f176647b == null || this.f176649d.f176532x.M1.f176723j != 1) ? -2 : this.f176647b.b();
            com.tencent.mm.plugin.voip.model.v2protocal v2protocalVar4 = this.f176649d.f176532x;
            if (this.f176646a != null && this.f176649d.f176532x.M1.f176723j == 1) {
                i17 = this.f176646a.L;
            }
            v2protocalVar4.R = i17;
            this.f176649d.f176532x.f176860k0 = b();
            this.f176649d.f176532x.f176839d0 = ym1.f.Bi();
            this.f176649d.f176532x.f176845f0 = (this.f176647b == null || (audioRecord = this.f176647b.f420171x) == null) ? -1 : audioRecord.getAudioSource();
            this.f176649d.f176532x.f176854i0 = this.f176646a != null ? this.f176646a.g() : -1;
            a();
        }
    }
}
