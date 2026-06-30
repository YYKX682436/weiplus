package oe1;

/* loaded from: classes13.dex */
public class v1 implements oe1.q1 {

    /* renamed from: h, reason: collision with root package name */
    public static oe1.v1 f344746h;

    /* renamed from: d, reason: collision with root package name */
    public boolean f344747d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f344748e = true;

    /* renamed from: f, reason: collision with root package name */
    public boolean f344749f = false;

    /* renamed from: g, reason: collision with root package name */
    public final te1.i f344750g = new oe1.t1(this);

    public v1() {
        ((oe1.u1) i95.n0.c(oe1.u1.class)).Kd(this);
    }

    public static oe1.v1 h() {
        if (f344746h == null) {
            synchronized (oe1.v1.class) {
                if (f344746h == null) {
                    f344746h = new oe1.v1();
                }
            }
        }
        return f344746h;
    }

    @Override // oe1.q1
    public r9.j G4() {
        if (this.f344748e) {
            return null;
        }
        return bf1.h.i().f19590e;
    }

    public void b(java.lang.String str, long j17, long j18) {
        if (!this.f344748e) {
            bf1.h.i().h(str, j17, j18);
            return;
        }
        try {
            te1.l.b().d(str, j18);
        } catch (java.lang.Exception e17) {
            ve1.g.p(6, "MicroMsg.SameLayer.VideoCore", "preload exception", e17);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0074, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.VideoCore", "mkdirs fail 2, not dir:%s", r1);
        com.tencent.mm.vfs.w6.h(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0084, code lost:
    
        if (com.tencent.mm.vfs.w6.u(r1) != false) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0086, code lost:
    
        com.tencent.mars.xlog.Log.w("MicroMsg.SameLayer.VideoCore", "mkdirs fail 3, no space? dir:%s", r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x008f, code lost:
    
        return null;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String c(java.lang.String r13) {
        /*
            r12 = this;
            java.lang.String r0 = "MicroMsg.SameLayer.VideoCore"
            java.lang.String r1 = lp0.b.D()
            java.lang.String r2 = "/"
            boolean r3 = r1.endsWith(r2)
            if (r3 != 0) goto L12
            java.lang.String r1 = r1.concat(r2)
        L12:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r1)
            r3.append(r13)
            r3.append(r2)
            java.lang.String r1 = r3.toString()
            r2 = 0
            boolean r3 = com.tencent.mm.vfs.w6.u(r1)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L90
            java.lang.String r3 = "mkdirs fail 1, maybe dir exist:%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L9a
            com.tencent.mars.xlog.Log.w(r0, r3, r4)     // Catch: java.lang.Throwable -> L9a
            com.tencent.mm.vfs.z7 r3 = com.tencent.mm.vfs.z7.a(r1)     // Catch: java.lang.Throwable -> L9a
            r4 = 0
            java.lang.String r5 = r3.f213279f
            if (r5 == 0) goto L56
            java.lang.String r9 = com.tencent.mm.vfs.e8.l(r5, r4, r4)     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r5.equals(r9)     // Catch: java.lang.Throwable -> L9a
            if (r5 != 0) goto L56
            com.tencent.mm.vfs.z7 r5 = new com.tencent.mm.vfs.z7     // Catch: java.lang.Throwable -> L9a
            java.lang.String r7 = r3.f213277d     // Catch: java.lang.Throwable -> L9a
            java.lang.String r8 = r3.f213278e     // Catch: java.lang.Throwable -> L9a
            java.lang.String r10 = r3.f213280g     // Catch: java.lang.Throwable -> L9a
            java.lang.String r11 = r3.f213281h     // Catch: java.lang.Throwable -> L9a
            r6 = r5
            r6.<init>(r7, r8, r9, r10, r11)     // Catch: java.lang.Throwable -> L9a
            r3 = r5
        L56:
            com.tencent.mm.vfs.b3 r5 = com.tencent.mm.vfs.a3.f212781a     // Catch: java.lang.Throwable -> L9a
            com.tencent.mm.vfs.z2 r3 = r5.m(r3, r2)     // Catch: java.lang.Throwable -> L9a
            boolean r5 = r3.a()     // Catch: java.lang.Throwable -> L9a
            if (r5 != 0) goto L63
            goto L72
        L63:
            com.tencent.mm.vfs.q2 r5 = r3.f213266a     // Catch: java.lang.Throwable -> L9a
            java.lang.String r3 = r3.f213267b     // Catch: java.lang.Throwable -> L9a
            com.tencent.mm.vfs.x1 r3 = r5.m(r3)     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L72
            boolean r3 = r3.f213236f     // Catch: java.lang.Throwable -> L9a
            if (r3 == 0) goto L72
            r4 = 1
        L72:
            if (r4 != 0) goto L90
            java.lang.String r3 = "mkdirs fail 2, not dir:%s"
            java.lang.Object[] r4 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L9a
            com.tencent.mars.xlog.Log.w(r0, r3, r4)     // Catch: java.lang.Throwable -> L9a
            com.tencent.mm.vfs.w6.h(r1)     // Catch: java.lang.Throwable -> L9a
            boolean r3 = com.tencent.mm.vfs.w6.u(r1)     // Catch: java.lang.Throwable -> L9a
            if (r3 != 0) goto L90
            java.lang.String r13 = "mkdirs fail 3, no space? dir:%s"
            java.lang.Object[] r1 = new java.lang.Object[]{r1}     // Catch: java.lang.Throwable -> L9a
            com.tencent.mars.xlog.Log.w(r0, r13, r1)     // Catch: java.lang.Throwable -> L9a
            return r2
        L90:
            java.lang.String r3 = "ensureDir %s:%s"
            java.lang.Object[] r13 = new java.lang.Object[]{r13, r1}     // Catch: java.lang.Throwable -> L9a
            com.tencent.mars.xlog.Log.i(r0, r3, r13)     // Catch: java.lang.Throwable -> L9a
            return r1
        L9a:
            r13 = move-exception
            java.lang.String r1 = "mkdirs exception:%s"
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            com.tencent.mars.xlog.Log.e(r0, r1, r13)
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: oe1.v1.c(java.lang.String):java.lang.String");
    }

    public java.lang.String f(java.lang.String str) {
        android.net.Uri parse = android.net.Uri.parse(str);
        java.lang.String uri = parse.toString();
        if (str != null) {
            try {
                if (parse.getHost().equals("mpvideo.qpic.cn") && parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID) != null) {
                    uri = parse.getPath() + "_" + parse.getQueryParameter(com.tencent.thumbplayer.tplayer.plugins.report.TPReportKeys.Common.COMMON_VID);
                    java.lang.String queryParameter = parse.getQueryParameter("format_id");
                    if (queryParameter != null) {
                        uri = uri + "_" + queryParameter;
                    }
                    com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoCore", "[TRACE_VIDEO_PRELOAD] cachekey = %s", uri);
                }
            } catch (java.lang.Exception unused) {
            }
        }
        return uri;
    }

    public void i(android.content.Context context, boolean z17, boolean z18, ue1.a aVar, te1.d dVar) {
        if (this.f344747d) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoCore", "init already, current enableProxy:%s", java.lang.Boolean.valueOf(this.f344748e));
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoCore", "init, enableProxy:%s, enableHlsProxy:%s", java.lang.Boolean.valueOf(z17), java.lang.Boolean.valueOf(z18));
        boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f344747d = true;
        this.f344749f = z18;
        this.f344748e = z17;
        if (z17) {
            java.lang.String c17 = c("wxvideocache");
            if (com.tencent.mm.sdk.platformtools.t8.K0(c17)) {
                this.f344748e = false;
                com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoCore", "init, disableProxy for cache dir make fail");
                ((lm1.c) aVar).g(-1);
            } else {
                android.content.Context applicationContext = context.getApplicationContext();
                if (qe1.a.f362015r == null) {
                    synchronized (qe1.a.class) {
                        if (qe1.a.f362015r == null) {
                            qe1.a.f362015r = new qe1.a(applicationContext);
                        }
                    }
                }
                qe1.a a17 = qe1.a.a();
                java.lang.String str = com.tencent.mm.sdk.platformtools.z.f193105a;
                a17.f362017b = false;
                qe1.a.a().f362026k = 1048576L;
                qe1.a.a().f362025j = 536870912L;
                qe1.a.a().f362018c = true;
                qe1.a.a().f362019d = true;
                qe1.a.a().f362020e = true;
                qe1.a.a().f362021f = z18;
                qe1.a.a().f362022g = false;
                qe1.a.a().f362027l = 3;
                qe1.a.a().f362028m = new oe1.w1();
                qe1.a.a().f362031p = new re1.j();
                qe1.a.a().f362029n = aVar;
                qe1.a.a().f362032q = dVar;
                qe1.a.a().f362030o = this.f344750g;
                qe1.a.a().f362024i = c17;
                qe1.a.a().f362023h = c("wxvideotmp");
                if (te1.l.f417790c == null) {
                    synchronized (te1.l.class) {
                        if (te1.l.f417790c == null) {
                            te1.l.f417790c = new te1.l();
                        }
                    }
                }
            }
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SameLayer.VideoCore", "init, costTimeMs:%s", java.lang.Long.valueOf(java.lang.System.currentTimeMillis() - currentTimeMillis));
    }

    @Override // oe1.q1
    public long q0(java.lang.String str, long j17, long j18) {
        if (!this.f344748e) {
            return bf1.h.i().q0(str, j17, j18);
        }
        try {
            return te1.l.b().a(str);
        } catch (java.lang.Exception e17) {
            ve1.g.p(6, "MicroMsg.SameLayer.VideoCore", "getCachedBytes exception", e17);
            return 0L;
        }
    }

    @Override // oe1.q1
    public void t5(java.lang.String str) {
        if (this.f344748e) {
            return;
        }
        bf1.h.i().t5(str);
    }

    @Override // oe1.q1
    public java.lang.String z7(java.lang.String str) {
        if (!this.f344748e) {
            bf1.h.i().getClass();
            return str;
        }
        if (!com.tencent.mm.sdk.platformtools.t8.K0(str)) {
            if (!(!com.tencent.mm.sdk.platformtools.t8.K0(str) && str.startsWith("http://127.0.0.1"))) {
                try {
                    return te1.l.b().f417791a.b(str, true, true, com.tencent.thumbplayer.tmediacodec.util.MimeTypes.VIDEO_MP4, 90);
                } catch (java.lang.Exception e17) {
                    ve1.g.p(6, "MicroMsg.SameLayer.VideoCore", "getProxyUrl exception", e17);
                }
            }
        }
        return str;
    }
}
