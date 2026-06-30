package w21;

/* loaded from: classes14.dex */
public class i0 implements tl.h {

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioTrack f442380a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.String f442381b;

    /* renamed from: c, reason: collision with root package name */
    public tl.e f442382c;

    /* renamed from: d, reason: collision with root package name */
    public tl.f f442383d;

    /* renamed from: e, reason: collision with root package name */
    public volatile int f442384e;

    /* renamed from: f, reason: collision with root package name */
    public int f442385f;

    /* renamed from: g, reason: collision with root package name */
    public wu5.c f442386g;

    /* renamed from: h, reason: collision with root package name */
    public final com.tencent.qqpinyin.voicerecoapi.a f442387h;

    /* renamed from: i, reason: collision with root package name */
    public android.media.MediaPlayer.OnCompletionListener f442388i;

    /* renamed from: j, reason: collision with root package name */
    public android.media.MediaPlayer.OnErrorListener f442389j;

    /* renamed from: k, reason: collision with root package name */
    public int f442390k;

    /* renamed from: l, reason: collision with root package name */
    public final fp.e f442391l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f442392m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f442393n;

    /* renamed from: o, reason: collision with root package name */
    public final byte[] f442394o;

    /* renamed from: p, reason: collision with root package name */
    public int f442395p;

    /* renamed from: q, reason: collision with root package name */
    public java.io.InputStream f442396q;

    /* renamed from: r, reason: collision with root package name */
    public int f442397r;

    public i0() {
        this.f442381b = "";
        this.f442382c = null;
        this.f442383d = null;
        this.f442384e = 0;
        this.f442385f = 2;
        this.f442387h = null;
        this.f442392m = false;
        this.f442393n = true;
        this.f442394o = new byte[2000];
        this.f442395p = 0;
        this.f442396q = null;
        this.f442397r = 314;
        cv.j1.a();
        this.f442388i = new w21.f0(this);
        this.f442389j = new w21.g0(this);
        com.tencent.qqpinyin.voicerecoapi.a aVar = new com.tencent.qqpinyin.voicerecoapi.a();
        this.f442387h = aVar;
        int b17 = aVar.b();
        if (b17 != 0) {
            com.tencent.mars.xlog.Log.e("speex", "res: " + b17);
        }
    }

    public static void k(w21.i0 i0Var) {
        wu5.c cVar = i0Var.f442386g;
        if (cVar == null || cVar.h() == java.lang.Thread.currentThread()) {
            return;
        }
        try {
            i0Var.f442386g.get();
        } catch (java.util.concurrent.ExecutionException e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "ExecutionException:%s", e17.toString());
        }
        i0Var.f442386g = null;
    }

    @Override // tl.h
    public void a(tl.f fVar) {
        this.f442383d = fVar;
    }

    @Override // tl.h
    public void b(tl.e eVar) {
        this.f442382c = eVar;
    }

    @Override // tl.h
    public double c() {
        return 0.0d;
    }

    @Override // tl.h
    public void d(tl.g gVar) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "seek not support");
    }

    @Override // tl.h
    public boolean e(java.lang.String str, boolean z17, int i17) {
        return m(str, z17, i17);
    }

    @Override // tl.h
    public boolean f(boolean z17) {
        if (this.f442384e != 1) {
            return false;
        }
        this.f442384e = 2;
        synchronized ("") {
            try {
                try {
                    java.lang.System.currentTimeMillis();
                    "".wait();
                    java.lang.System.currentTimeMillis();
                } catch (java.lang.Exception e17) {
                    boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    fp.e eVar = this.f442391l;
                    if (eVar != null && z17 && this.f442393n) {
                        eVar.a();
                    }
                    return false;
                }
            } finally {
                fp.e eVar2 = this.f442391l;
                if (eVar2 != null && z17 && this.f442393n) {
                    eVar2.a();
                }
            }
        }
        return true;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:1|(4:3|4|5|6)|15|(1:17)(1:32)|18|(2:20|(6:22|23|24|25|26|27))|31|23|24|25|26|27|(2:(1:10)|(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x005b, code lost:
    
        r13 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x005c, code lost:
    
        com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "audioTrack error:%s", r13.getMessage());
     */
    @Override // tl.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void g(boolean r13) {
        /*
            r12 = this;
            r0 = 1
            r12.f442392m = r0
            r1 = 2
            r12.f442385f = r1
            r2 = 16000(0x3e80, float:2.2421E-41)
            int r1 = android.media.AudioTrack.getMinBufferSize(r2, r1, r1)
            r12.f442390k = r1
            android.media.AudioTrack r1 = r12.f442380a
            java.lang.String r2 = "MicroMsg.SpeexPlayer"
            if (r1 == 0) goto L2e
            r3 = 0
            r1.stop()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            android.media.AudioTrack r1 = r12.f442380a     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            r1.release()     // Catch: java.lang.Throwable -> L1e java.lang.Exception -> L20
            goto L28
        L1e:
            r13 = move-exception
            goto L2b
        L20:
            r1 = move-exception
            java.lang.String r1 = r1.getMessage()     // Catch: java.lang.Throwable -> L1e
            com.tencent.mars.xlog.Log.e(r2, r1)     // Catch: java.lang.Throwable -> L1e
        L28:
            r12.f442380a = r3
            goto L2e
        L2b:
            r12.f442380a = r3
            throw r13
        L2e:
            r1 = 3
            r3 = 0
            if (r13 == 0) goto L34
            r13 = r1
            goto L35
        L34:
            r13 = r3
        L35:
            wo.c r4 = wo.v1.f447823c
            boolean r5 = r4.f447589a
            if (r5 == 0) goto L44
            r4.c()
            int r4 = r4.f447603h
            if (r4 != r0) goto L44
            r6 = r1
            goto L45
        L44:
            r6 = r13
        L45:
            to.e r13 = new to.e
            r7 = 16000(0x3e80, float:2.2421E-41)
            int r8 = r12.f442385f
            r9 = 2
            int r0 = r12.f442390k
            int r10 = r0 * 8
            r11 = 1
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11)
            r12.f442380a = r13
            r13.play()     // Catch: java.lang.Exception -> L5b
            goto L69
        L5b:
            r13 = move-exception
            java.lang.String r13 = r13.getMessage()
            java.lang.Object[] r13 = new java.lang.Object[]{r13}
            java.lang.String r0 = "audioTrack error:%s"
            com.tencent.mars.xlog.Log.e(r2, r0, r13)
        L69:
            r12.f442392m = r3
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.i0.g(boolean):void");
    }

    @Override // tl.h
    public int getStatus() {
        return this.f442384e;
    }

    @Override // tl.h
    public boolean h(float f17) {
        return false;
    }

    @Override // tl.h
    public void i(boolean z17) {
        this.f442393n = z17;
    }

    @Override // tl.h
    public boolean isPlaying() {
        return this.f442384e == 1;
    }

    @Override // tl.h
    public boolean j(java.lang.String str, boolean z17) {
        return m(str, z17, 0);
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0068 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void l(boolean r8, int r9) {
        /*
            r7 = this;
            java.lang.String r9 = "MicroMsg.SpeexPlayer"
            java.lang.String r0 = r7.f442381b
            boolean r0 = com.tencent.mm.vfs.w6.j(r0)
            if (r0 != 0) goto Lb
            return
        Lb:
            r0 = 3
            if (r8 == 0) goto L10
            r8 = r0
            goto L11
        L10:
            r8 = 0
        L11:
            xm1.h r1 = ym1.f.wi()     // Catch: java.lang.Exception -> L8f
            boolean r1 = r1.l()     // Catch: java.lang.Exception -> L8f
            if (r1 != 0) goto L23
            an1.c r1 = an1.c.f8833a     // Catch: java.lang.Exception -> L8f
            boolean r1 = r1.b()     // Catch: java.lang.Exception -> L8f
            if (r1 == 0) goto L24
        L23:
            r8 = r0
        L24:
            wo.c r1 = wo.v1.f447823c     // Catch: java.lang.Exception -> L8f
            boolean r2 = r1.f447589a     // Catch: java.lang.Exception -> L8f
            if (r2 == 0) goto L34
            r1.c()     // Catch: java.lang.Exception -> L8f
            int r1 = r1.f447603h     // Catch: java.lang.Exception -> L8f
            r2 = 1
            if (r1 != r2) goto L34
            r1 = r0
            goto L35
        L34:
            r1 = r8
        L35:
            int r8 = r7.f442385f     // Catch: java.lang.Exception -> L8f
            r0 = 2
            r2 = 16000(0x3e80, float:2.2421E-41)
            int r8 = android.media.AudioTrack.getMinBufferSize(r2, r8, r0)     // Catch: java.lang.Exception -> L8f
            r7.f442390k = r8     // Catch: java.lang.Exception -> L8f
            r7.n()     // Catch: java.lang.Exception -> L8f
            to.e r8 = new to.e     // Catch: java.lang.Exception -> L8f
            r2 = 16000(0x3e80, float:2.2421E-41)
            int r3 = r7.f442385f     // Catch: java.lang.Exception -> L8f
            r4 = 2
            int r0 = r7.f442390k     // Catch: java.lang.Exception -> L8f
            int r5 = r0 * 8
            r6 = 1
            r0 = r8
            r0.<init>(r1, r2, r3, r4, r5, r6)     // Catch: java.lang.Exception -> L8f
            r7.f442380a = r8     // Catch: java.lang.Exception -> L8f
            r8 = 640(0x280, float:8.97E-43)
            r7.f442397r = r8     // Catch: java.lang.Exception -> L8f
            fp.e r8 = r7.f442391l     // Catch: java.lang.Exception -> L8f
            if (r8 == 0) goto L64
            boolean r0 = r7.f442393n     // Catch: java.lang.Exception -> L8f
            if (r0 == 0) goto L64
            r8.b()     // Catch: java.lang.Exception -> L8f
        L64:
            android.media.AudioTrack r8 = r7.f442380a     // Catch: java.lang.Exception -> L8f
            if (r8 == 0) goto Lc2
            r8.play()     // Catch: java.lang.Exception -> L80
            w21.h0 r8 = new w21.h0     // Catch: java.lang.Exception -> L8f
            r8.<init>(r7)     // Catch: java.lang.Exception -> L8f
            ku5.u0 r0 = ku5.t0.f312615d     // Catch: java.lang.Exception -> L8f
            ku5.t0 r0 = (ku5.t0) r0     // Catch: java.lang.Exception -> L8f
            r0.getClass()     // Catch: java.lang.Exception -> L8f
            r1 = 0
            wu5.c r8 = r0.k(r8, r1)     // Catch: java.lang.Exception -> L8f
            r7.f442386g = r8     // Catch: java.lang.Exception -> L8f
            goto Lc2
        L80:
            r8 = move-exception
            java.lang.String r8 = r8.getMessage()     // Catch: java.lang.Exception -> L8f
            java.lang.Object[] r8 = new java.lang.Object[]{r8}     // Catch: java.lang.Exception -> L8f
            java.lang.String r0 = "audioTrack error:%s"
            com.tencent.mars.xlog.Log.e(r9, r0, r8)     // Catch: java.lang.Exception -> L8f
            goto Lc2
        L8f:
            r8 = move-exception
            fp.e r0 = r7.f442391l
            if (r0 == 0) goto L9b
            boolean r1 = r7.f442393n
            if (r1 == 0) goto L9b
            r0.a()
        L9b:
            r7.n()
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "playImp : fail, exception = "
            r0.<init>(r1)
            java.lang.String r1 = r8.getMessage()
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.tencent.mars.xlog.Log.e(r9, r0)
            boolean r0 = com.tencent.mm.sdk.platformtools.t8.f192989a
            java.lang.String r8 = com.tencent.mm.sdk.platformtools.z3.c(r8)
            java.lang.Object[] r8 = new java.lang.Object[]{r8}
            java.lang.String r0 = "exception:%s"
            com.tencent.mars.xlog.Log.e(r9, r0, r8)
        Lc2:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: w21.i0.l(boolean, int):void");
    }

    public final boolean m(java.lang.String str, boolean z17, int i17) {
        if (this.f442384e != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "startPlay error status:" + this.f442384e);
            return false;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SpeexPlayer", "startPlay");
        this.f442384e = 1;
        this.f442381b = str;
        try {
            l(z17, i17);
        } catch (java.lang.Exception e17) {
            try {
                l(true, i17);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "startPlay File[" + this.f442381b + "] failed");
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                this.f442384e = -1;
                return false;
            }
        }
        return true;
    }

    public final void n() {
        android.media.AudioTrack audioTrack = this.f442380a;
        if (audioTrack != null) {
            audioTrack.stop();
            this.f442380a.release();
            this.f442380a = null;
        }
    }

    @Override // tl.h
    public boolean pause() {
        return f(true);
    }

    @Override // tl.h
    public boolean resume() {
        if (this.f442384e != 2) {
            return false;
        }
        this.f442384e = 1;
        synchronized ("") {
            try {
                try {
                    "".notify();
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    fp.e eVar = this.f442391l;
                    if (eVar != null && this.f442393n) {
                        eVar.b();
                    }
                    return false;
                }
            } finally {
                fp.e eVar2 = this.f442391l;
                if (eVar2 != null && this.f442393n) {
                    eVar2.b();
                }
            }
        }
        return true;
    }

    @Override // tl.h
    public boolean seek(long j17) {
        com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "seek not support");
        return false;
    }

    @Override // tl.h
    public void setMute(boolean z17) {
        if (!j65.e.b() || !j65.e.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SpeexPlayer", "is not mute mode, don't set mute!!");
            return;
        }
        android.media.AudioTrack audioTrack = this.f442380a;
        if (audioTrack == null) {
            return;
        }
        audioTrack.setVolume(z17 ? 0.0f : 1.0f);
    }

    @Override // tl.h
    public boolean stop() {
        com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "stop  status:" + this.f442384e);
        if (this.f442384e != 1 && this.f442384e != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "stop  error status:" + this.f442384e);
            try {
                synchronized ("") {
                    "".notify();
                }
                synchronized ("") {
                    "".notify();
                }
            } catch (java.lang.Exception unused) {
            }
            this.f442384e = 3;
            return false;
        }
        this.f442384e = 3;
        synchronized ("") {
            try {
                try {
                    "".notify();
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SpeexPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    n();
                    fp.e eVar = this.f442391l;
                    if (eVar != null && this.f442393n) {
                        eVar.a();
                    }
                    return false;
                }
            } finally {
                fp.e eVar2 = this.f442391l;
                if (eVar2 != null && this.f442393n) {
                    eVar2.a();
                }
            }
        }
        return true;
    }

    public i0(android.content.Context context) {
        this();
        this.f442391l = new fp.e(context);
    }
}
