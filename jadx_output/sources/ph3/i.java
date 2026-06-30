package ph3;

/* loaded from: classes14.dex */
public abstract class i {

    /* renamed from: v, reason: collision with root package name */
    public static final boolean f354400v;

    /* renamed from: b, reason: collision with root package name */
    public final ph3.h f354402b;

    /* renamed from: c, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f354403c;

    /* renamed from: d, reason: collision with root package name */
    public java.lang.String f354404d;

    /* renamed from: e, reason: collision with root package name */
    public java.io.FileDescriptor f354405e;

    /* renamed from: i, reason: collision with root package name */
    public android.media.MediaFormat f354409i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f354410j;

    /* renamed from: k, reason: collision with root package name */
    public long f354411k;

    /* renamed from: l, reason: collision with root package name */
    public int f354412l;

    /* renamed from: n, reason: collision with root package name */
    public gp.c f354414n;

    /* renamed from: o, reason: collision with root package name */
    public wo.i1 f354415o;

    /* renamed from: f, reason: collision with root package name */
    public volatile boolean f354406f = false;

    /* renamed from: g, reason: collision with root package name */
    public ph3.b f354407g = null;

    /* renamed from: h, reason: collision with root package name */
    public long f354408h = 0;

    /* renamed from: m, reason: collision with root package name */
    public final android.media.MediaCodec.BufferInfo f354413m = new android.media.MediaCodec.BufferInfo();

    /* renamed from: q, reason: collision with root package name */
    public final java.lang.Object f354417q = new java.lang.Object();

    /* renamed from: r, reason: collision with root package name */
    public boolean f354418r = false;

    /* renamed from: s, reason: collision with root package name */
    public boolean f354419s = false;

    /* renamed from: t, reason: collision with root package name */
    public long f354420t = 0;

    /* renamed from: u, reason: collision with root package name */
    public long f354421u = 0;

    /* renamed from: a, reason: collision with root package name */
    public volatile int f354401a = 0;

    /* renamed from: p, reason: collision with root package name */
    public volatile int f354416p = -1;

    static {
        f354400v = j62.e.g().i("clicfg_mediacodec_double_release_switch", 1, true, true) == 1;
    }

    public i(ph3.h hVar, com.tencent.mm.sdk.platformtools.n3 n3Var) {
        this.f354402b = hVar;
        this.f354403c = n3Var;
    }

    public boolean a(long j17, long j18) {
        long j19;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        try {
            if ((j17 / 1000) + 1000 < this.f354411k && j18 == -1) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "checkExtractor");
                com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("TrackDataSource");
                if (this instanceof ph3.p) {
                    java.lang.String str = this.f354404d;
                    if (str == null) {
                        str = "";
                    }
                    M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
                    M.putInt("type", 1);
                    j19 = elapsedRealtime;
                    M.putLong("ts", java.lang.System.currentTimeMillis());
                } else {
                    j19 = elapsedRealtime;
                }
                try {
                    this.f354402b.f354394i = true;
                    this.f354406f = false;
                    this.f354414n.g();
                    this.f354414n = new gp.c();
                    if (com.tencent.mm.sdk.platformtools.t8.K0(this.f354404d)) {
                        java.io.FileDescriptor fileDescriptor = this.f354405e;
                        if (fileDescriptor != null && fileDescriptor.valid()) {
                            this.f354414n.j(this.f354405e, 0L, 0L);
                        }
                    } else {
                        java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(this.f354404d, false);
                        java.io.FileDescriptor fd6 = B.getFD();
                        if (wo.v1.f447824d.f447770a == 1) {
                            this.f354414n.j(fd6, 0L, com.tencent.mm.vfs.w6.k(this.f354404d));
                        } else {
                            this.f354414n.f274162a.setDataSource(fd6);
                        }
                        B.close();
                    }
                } catch (java.lang.Throwable th6) {
                    try {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", th6, "checkExtractor", new java.lang.Object[0]);
                        if (M.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "").equals(this.f354404d) && (this instanceof ph3.p)) {
                            M.putInt("type", 0);
                        }
                    } catch (java.lang.Throwable th7) {
                        if (M.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "").equals(this.f354404d) && (this instanceof ph3.p)) {
                            M.putInt("type", 0);
                            M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                            M.putLong("ts", 0L);
                        }
                        throw th7;
                    }
                }
                if (M.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "").equals(this.f354404d) && (this instanceof ph3.p)) {
                    M.putInt("type", 0);
                    M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                    M.putLong("ts", 0L);
                }
                this.f354414n.i(this.f354412l);
                this.f354414n.h(j17, 2);
                long b17 = this.f354414n.b();
                q(j17, b17);
                com.tencent.mars.xlog.Log.w("MicroMsg.TrackDataSource", "%s it don't play end. currTime[%d] afterSeek[%d] nextSampleTime[%d] onlineCacheMs[%d] cost[%d]", i(), java.lang.Long.valueOf(j17), java.lang.Long.valueOf(b17), java.lang.Long.valueOf(j18), java.lang.Long.valueOf(this.f354408h), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - j19));
                return true;
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "%s reset extractor error %s", i(), e17.toString());
        }
        return false;
    }

    public ph3.g b(java.lang.String str) {
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x00b6, code lost:
    
        e();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x00bb, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x00bf, code lost:
    
        if (r19.f354419s != false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x00c1, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "%s do some work feed input buffer error %s", i(), r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00e8, code lost:
    
        if (ph3.e.a(r19.f354401a) == false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00ea, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00ed, code lost:
    
        r0 = r19.f354402b;
        r9 = u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00f5, code lost:
    
        if (r0.f354398m == false) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00f8, code lost:
    
        r10 = com.tencent.mm.sdk.platformtools.z.f193105a;
        r10 = jx3.f.INSTANCE;
        r10.idkeyStat(r0.a(), 157, 1, false);
        r10.d(r0.b(), 505, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), r9);
        r0.f354398m = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x012a, code lost:
    
        if (r19.f354421u == 0) goto L44;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x012c, code lost:
    
        r19.f354421u = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x013b, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r19.f354421u) >= 20000) goto L47;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x013d, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "feedInputBuffer continue fails over 20s, set state error");
        t(-1);
        r19.f354421u = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d3, code lost:
    
        r19.f354419s = true;
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", r0, "%s do some work feed input buffer error", i());
     */
    /* JADX WARN: Code restructure failed: missing block: B:2:0x0009, code lost:
    
        if (r19.f354415o != null) goto L4;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0027, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x002a, code lost:
    
        if (r19.f354418r != false) goto L13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x002c, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "%s do some work drain output buffer error %s", i(), r0.toString());
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0053, code lost:
    
        if (ph3.e.a(r19.f354401a) == false) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x0055, code lost:
    
        f();
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x0058, code lost:
    
        r0 = r19.f354402b;
        r9 = u();
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x0060, code lost:
    
        if (r0.f354399n == false) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x0063, code lost:
    
        r10 = com.tencent.mm.sdk.platformtools.z.f193105a;
        r10 = jx3.f.INSTANCE;
        r10.idkeyStat(r0.a(), 158, 1, false);
        r10.d(r0.b(), 506, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), r9);
        r0.f354399n = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0095, code lost:
    
        if (r19.f354420t == 0) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x0097, code lost:
    
        r19.f354420t = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00a6, code lost:
    
        if ((java.lang.System.currentTimeMillis() - r19.f354420t) >= 20000) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "drainOutputBuffer continue fails over 20s, set state error");
        t(-1);
        r19.f354420t = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x003e, code lost:
    
        r19.f354418r = true;
        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", r0, "%s do some work drain output buffer error", i());
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x014b, code lost:
    
        i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0150, code lost:
    
        return r19.f354401a;
     */
    /* JADX WARN: Code restructure failed: missing block: B:6:0x0015, code lost:
    
        if (d(r20, r22) == false) goto L50;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0017, code lost:
    
        r19.f354420t = java.lang.System.currentTimeMillis();
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0023, code lost:
    
        if (ph3.e.a(r19.f354401a) == false) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public int c(long r20, long r22) {
        /*
            Method dump skipped, instructions count: 337
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph3.i.c(long, long):int");
    }

    public final boolean d(long j17, long j18) {
        i();
        this.f354414n.b();
        android.os.SystemClock.elapsedRealtime();
        if (this.f354416p < 0) {
            synchronized (this.f354417q) {
                this.f354416p = this.f354415o.g(this.f354413m, 0L);
            }
            if (this.f354416p < 0) {
                if (this.f354416p == -2) {
                    android.media.MediaFormat o17 = this.f354415o.o();
                    this.f354409i = o17;
                    j(this.f354415o, o17);
                    return true;
                }
                if (this.f354416p == -3) {
                    return true;
                }
                i();
                return false;
            }
            if ((this.f354413m.flags & 4) != 0) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s process end of stream", i());
                t(9);
                this.f354416p = -1;
                return false;
            }
        }
        if (this.f354401a == 1) {
            this.f354415o.s(this.f354416p, true);
            this.f354416p = -1;
            t(2);
            return true;
        }
        i();
        android.os.SystemClock.elapsedRealtime();
        synchronized (this.f354417q) {
            if (this.f354416p >= 0) {
                java.nio.ByteBuffer m17 = this.f354415o.m(this.f354416p);
                if (m17 != null) {
                    m17.position(this.f354413m.offset);
                    android.media.MediaCodec.BufferInfo bufferInfo = this.f354413m;
                    m17.limit(bufferInfo.offset + bufferInfo.size);
                }
                if (n(j17, j18, this.f354415o, m17, this.f354416p, this.f354413m)) {
                    this.f354416p = -1;
                    return true;
                }
            }
            return false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:50:0x00d9 A[Catch: Exception -> 0x02ac, TryCatch #1 {Exception -> 0x02ac, blocks: (B:3:0x0003, B:5:0x000d, B:8:0x0013, B:9:0x0015, B:23:0x0036, B:25:0x004e, B:28:0x0067, B:31:0x0071, B:32:0x0073, B:39:0x0093, B:44:0x0086, B:45:0x0087, B:48:0x00d1, B:50:0x00d9, B:52:0x00ec, B:53:0x00ee, B:60:0x010e, B:65:0x0101, B:66:0x0102, B:69:0x0118, B:71:0x011c, B:72:0x011e, B:80:0x0174, B:82:0x0185, B:84:0x018b, B:86:0x01c5, B:87:0x02a1, B:89:0x01e6, B:91:0x01ee, B:93:0x01f4, B:95:0x0224, B:96:0x0249, B:98:0x024d, B:101:0x025c, B:103:0x0266, B:105:0x028b, B:106:0x0295, B:108:0x0299, B:116:0x013d, B:123:0x0140, B:124:0x014b, B:136:0x00bd, B:146:0x02a7, B:147:0x02a8, B:34:0x0074, B:36:0x0078, B:37:0x0082, B:11:0x0016, B:13:0x001d, B:15:0x0023, B:16:0x0026, B:21:0x002d, B:22:0x0035, B:55:0x00ef, B:57:0x00f3, B:58:0x00fd), top: B:2:0x0003, inners: #0, #3, #9 }] */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0111  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean e() {
        /*
            Method dump skipped, instructions count: 695
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ph3.i.e():boolean");
    }

    public void f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s flush codec", i());
        this.f354416p = -1;
        try {
            wo.i1 i1Var = this.f354415o;
            if (i1Var != null) {
                i1Var.h();
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", e17, "flushCodec exception", new java.lang.Object[0]);
        }
    }

    public void g(android.media.MediaFormat mediaFormat, java.lang.String str, int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s found media format mime[%s] track[%d] format[%s]", i(), str, java.lang.Integer.valueOf(i17), mediaFormat);
        this.f354412l = i17;
        this.f354410j = str;
        this.f354411k = mediaFormat.getLong("durationUs") / 1000;
        this.f354409i = mediaFormat;
    }

    public abstract boolean h(wo.i1 i1Var);

    public java.lang.String i() {
        ph3.h hVar = this.f354402b;
        if (hVar == null) {
            return u() + "_" + android.os.Process.myTid();
        }
        return u() + "_" + hVar.c() + "_" + android.os.Process.myTid();
    }

    public void j(wo.i1 i1Var, android.media.MediaFormat mediaFormat) {
    }

    public void k() {
    }

    public void l() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s start to pause", i());
        t(4);
        k();
    }

    public boolean m() {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s start to prepare path %s", i(), this.f354404d);
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        com.tencent.mm.sdk.platformtools.o4 M = com.tencent.mm.sdk.platformtools.o4.M("TrackDataSource");
        this.f354406f = false;
        long j17 = 0;
        try {
            try {
                try {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s start to init extractor", i());
                    this.f354414n = new gp.c();
                    if (this instanceof ph3.p) {
                        java.lang.String str = this.f354404d;
                        if (str == null) {
                            str = "";
                        }
                        M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, str);
                        M.putInt("type", 1);
                        M.putLong("ts", java.lang.System.currentTimeMillis());
                    }
                    if (com.tencent.mm.sdk.platformtools.t8.K0(this.f354404d)) {
                        java.io.FileDescriptor fileDescriptor = this.f354405e;
                        if (fileDescriptor != null && fileDescriptor.valid()) {
                            this.f354414n.j(this.f354405e, 0L, 0L);
                        }
                    } else {
                        java.io.RandomAccessFile B = com.tencent.mm.vfs.w6.B(this.f354404d, false);
                        java.io.FileDescriptor fd6 = B.getFD();
                        this.f354405e = fd6;
                        if (wo.v1.f447824d.f447770a == 1) {
                            this.f354414n.j(fd6, 0L, com.tencent.mm.vfs.w6.k(this.f354404d));
                        } else {
                            this.f354414n.f274162a.setDataSource(fd6);
                        }
                        B.close();
                    }
                    int d17 = this.f354414n.d();
                    if (d17 <= 0) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "extractor get track count 0.");
                        this.f354414n.g();
                        gp.c cVar = new gp.c();
                        this.f354414n = cVar;
                        cVar.k(this.f354404d);
                        d17 = this.f354414n.d();
                    }
                    this.f354412l = -1;
                    int i17 = 0;
                    while (true) {
                        if (i17 < d17) {
                            android.media.MediaFormat e17 = this.f354414n.e(i17);
                            java.lang.String string = e17.getString("mime");
                            if (string != null && string.contains(u())) {
                                g(e17, string, i17);
                                break;
                            }
                            i17++;
                        } else {
                            break;
                        }
                    }
                    int i18 = this.f354412l;
                    if (i18 <= -1) {
                        com.tencent.mars.xlog.Log.w("MicroMsg.TrackDataSource", "%s prepare track but can not find track index.[%d, %d]", i(), java.lang.Integer.valueOf(d17), java.lang.Integer.valueOf(this.f354412l));
                        this.f354402b.e("can not find ");
                        if (M.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "").equals(this.f354404d) && (this instanceof ph3.p)) {
                            M.putInt("type", 0);
                            M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                            M.putLong("ts", 0L);
                        }
                        return false;
                    }
                    this.f354414n.i(i18);
                    if (!com.tencent.mm.sdk.platformtools.t8.K0(this.f354404d)) {
                        b(this.f354404d);
                    }
                    long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
                    if (M.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "").equals(this.f354404d) && (this instanceof ph3.p)) {
                        M.putInt("type", 0);
                        M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                        M.putLong("ts", 0L);
                    }
                    try {
                        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s start to init decoder mime[%s] state[%d]", i(), this.f354410j, java.lang.Integer.valueOf(this.f354401a));
                        if (!ph3.e.a(this.f354401a)) {
                            synchronized (this.f354417q) {
                                i();
                                wo.i1 c17 = wo.i1.c(this.f354410j);
                                this.f354415o = c17;
                                h(c17);
                                this.f354415o.x();
                            }
                            j17 = android.os.SystemClock.elapsedRealtime();
                        }
                        t(1);
                        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s finish to prepare cost[%d %d %d]", i(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime), java.lang.Long.valueOf(elapsedRealtime2 - elapsedRealtime), java.lang.Long.valueOf(j17 - elapsedRealtime));
                        return true;
                    } catch (java.lang.Exception e18) {
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", e18, "%s prepare init decoder error %s", i(), e18.toString());
                        com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", e18, "%s prepare init decoder error, format info: %s", i(), this.f354409i);
                        this.f354402b.d(u());
                        return false;
                    }
                } catch (java.lang.Exception e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", e19, "%s prepare init extractor error", i());
                    this.f354402b.e(e19.toString());
                    if (M.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "").equals(this.f354404d) && (this instanceof ph3.p)) {
                        M.putInt("type", 0);
                        M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                        M.putLong("ts", 0L);
                    }
                    return false;
                }
            } catch (java.lang.Throwable th6) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "%s prepare init extractor error %s", i(), th6.toString());
                this.f354402b.e(th6.toString());
                if (M.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "").equals(this.f354404d) && (this instanceof ph3.p)) {
                    M.putInt("type", 0);
                    M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                    M.putLong("ts", 0L);
                }
                return false;
            }
        } catch (java.lang.Throwable th7) {
            if (M.getString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "").equals(this.f354404d) && (this instanceof ph3.p)) {
                M.putInt("type", 0);
                M.putString(com.tencent.kinda.framework.widget.tools.ConstantsKinda.INTENT_LITEAPP_PATH, "");
                M.putLong("ts", 0L);
            }
            throw th7;
        }
    }

    public abstract boolean n(long j17, long j18, wo.i1 i1Var, java.nio.ByteBuffer byteBuffer, int i17, android.media.MediaCodec.BufferInfo bufferInfo);

    public void o() {
        java.lang.String i17 = i();
        boolean z17 = f354400v;
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s release doubleReleaseSwitch:[%b]", i17, java.lang.Boolean.valueOf(z17));
        if (z17) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s into release fun", i());
            if (this.f354414n != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s release,  extractor != null", i());
                this.f354414n.g();
                this.f354414n = null;
            }
            p();
            com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s finish release", i());
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s release", i());
        gp.c cVar = this.f354414n;
        if (cVar != null) {
            cVar.g();
            this.f354414n = null;
        }
        wo.i1 i1Var = this.f354415o;
        if (i1Var != null) {
            i1Var.q();
            this.f354415o = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s finish release", i());
    }

    public void p() {
        java.lang.String i17 = i();
        boolean z17 = f354400v;
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s releaseDecoder doubleReleaseSwitch:[%b]", i17, java.lang.Boolean.valueOf(z17));
        if (z17) {
            long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
            synchronized (this.f354417q) {
                if (this.f354415o != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s release decoder", i());
                    f();
                    com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s wait lock cost[%d]", i(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                    try {
                        try {
                            this.f354415o.y();
                            try {
                                this.f354415o.q();
                            } finally {
                            }
                        } finally {
                        }
                    } catch (java.lang.Exception unused) {
                        this.f354415o.q();
                    } catch (java.lang.Throwable th6) {
                        try {
                            this.f354415o.q();
                            throw th6;
                        } finally {
                        }
                    }
                    this.f354415o = null;
                    com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s finish release decoder [%d]", i(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime));
                } else {
                    com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s releaseDecoder decoder == null, break", i());
                }
            }
            return;
        }
        if (this.f354415o != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s release decoder", i());
            f();
            long elapsedRealtime2 = android.os.SystemClock.elapsedRealtime();
            synchronized (this.f354417q) {
                com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s wait lock cost[%d]", i(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
                try {
                    try {
                        this.f354415o.y();
                        try {
                            this.f354415o.q();
                        } finally {
                        }
                    } finally {
                    }
                } catch (java.lang.Exception unused2) {
                    this.f354415o.q();
                } catch (java.lang.Throwable th7) {
                    try {
                        this.f354415o.q();
                        throw th7;
                    } finally {
                    }
                }
                this.f354415o = null;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s finish release decoder [%d]", i(), java.lang.Long.valueOf(android.os.SystemClock.elapsedRealtime() - elapsedRealtime2));
        }
    }

    public final void q(long j17, long j18) {
        java.lang.String str;
        long j19 = j18 - j17;
        try {
            if (java.lang.Math.abs(j19) <= 3000000 || (str = this.f354404d) == null || !str.contains("sns")) {
                return;
            }
            jx3.f fVar = jx3.f.INSTANCE;
            fVar.t(150, 75);
            fVar.d(17844, 1, "" + j19);
        } catch (java.lang.Throwable unused) {
        }
    }

    public boolean r(int i17, long j17) {
        return false;
    }

    public long s(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s start to seek to ms[%d] isFeedEnd[%b]", i(), java.lang.Integer.valueOf(i17), java.lang.Boolean.valueOf(this.f354406f));
        this.f354406f = false;
        try {
            int i18 = i17 * 1000;
            this.f354414n.h(i18, 0);
            if (this.f354414n.b() < 0) {
                a(i17 * 1000, -1L);
            }
            if (this.f354414n.b() < 0) {
                a(0L, -1L);
                ph3.h hVar = this.f354402b;
                hVar.getClass();
                jx3.f fVar = jx3.f.INSTANCE;
                fVar.idkeyStat(hVar.a(), 155L, 1L, false);
                fVar.d(hVar.b(), 503, java.lang.Long.valueOf(com.tencent.mm.sdk.platformtools.t8.i1()), "");
            }
            long b17 = this.f354414n.b();
            int sampleFlags = this.f354414n.f274162a.getSampleFlags();
            com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s finish to seek extractor [%d, %d], sampleFlag:%s", i(), java.lang.Long.valueOf(b17), java.lang.Long.valueOf(this.f354414n.f274162a.getCachedDuration()), java.lang.Integer.valueOf(sampleFlags));
            if ((sampleFlags & 1) == 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "%s seek error, not in keyframe!!", i());
            }
            if (b17 == 0 && i17 > 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.TrackDataSource", "%s seek error, not seek to %s", java.lang.Integer.valueOf(i18), i());
            }
            return b17 / 1000;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.TrackDataSource", e17, "%s extractor seek exception %s", i(), e17.toString());
            return 0L;
        }
    }

    public void t(int i17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.TrackDataSource", "%s set state old %d new %d", i(), java.lang.Integer.valueOf(this.f354401a), java.lang.Integer.valueOf(i17));
        this.f354401a = i17;
    }

    public abstract java.lang.String u();
}
