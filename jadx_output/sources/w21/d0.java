package w21;

/* loaded from: classes14.dex */
public class d0 implements tl.h {
    public static final java.lang.Object I = new java.lang.Object();

    /* renamed from: J, reason: collision with root package name */
    public static int f442308J = -1;
    public static int K;
    public final boolean A;
    public volatile boolean B;
    public volatile java.lang.Runnable C;
    public w21.e0 D;
    public final android.media.MediaPlayer.OnCompletionListener E;
    public final android.media.MediaPlayer.OnErrorListener F;
    public java.util.concurrent.Future G;
    public volatile int H;

    /* renamed from: a, reason: collision with root package name */
    public android.media.AudioTrack f442309a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Boolean f442310b;

    /* renamed from: c, reason: collision with root package name */
    public w21.a0 f442311c;

    /* renamed from: d, reason: collision with root package name */
    public final fp.e f442312d;

    /* renamed from: e, reason: collision with root package name */
    public tl.e f442313e;

    /* renamed from: f, reason: collision with root package name */
    public tl.f f442314f;

    /* renamed from: g, reason: collision with root package name */
    public int f442315g;

    /* renamed from: h, reason: collision with root package name */
    public int f442316h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.String f442317i;

    /* renamed from: j, reason: collision with root package name */
    public volatile int f442318j;

    /* renamed from: k, reason: collision with root package name */
    public int f442319k;

    /* renamed from: l, reason: collision with root package name */
    public volatile boolean f442320l;

    /* renamed from: m, reason: collision with root package name */
    public final int f442321m;

    /* renamed from: n, reason: collision with root package name */
    public int f442322n;

    /* renamed from: o, reason: collision with root package name */
    public yl.d f442323o;

    /* renamed from: p, reason: collision with root package name */
    public vl.a f442324p;

    /* renamed from: q, reason: collision with root package name */
    public int f442325q;

    /* renamed from: r, reason: collision with root package name */
    public final float f442326r;

    /* renamed from: s, reason: collision with root package name */
    public boolean f442327s;

    /* renamed from: t, reason: collision with root package name */
    public w21.t0 f442328t;

    /* renamed from: u, reason: collision with root package name */
    public tl.g f442329u;

    /* renamed from: v, reason: collision with root package name */
    public final java.lang.Object f442330v;

    /* renamed from: w, reason: collision with root package name */
    public volatile long f442331w;

    /* renamed from: x, reason: collision with root package name */
    public volatile boolean f442332x;

    /* renamed from: y, reason: collision with root package name */
    public boolean f442333y;

    /* renamed from: z, reason: collision with root package name */
    public final java.util.List f442334z;

    public d0(float f17) {
        this.f442310b = java.lang.Boolean.FALSE;
        this.f442313e = null;
        this.f442314f = null;
        this.f442315g = 2;
        this.f442316h = 16000;
        this.f442317i = "";
        this.f442318j = 0;
        this.f442319k = 0;
        this.f442320l = false;
        this.f442322n = 0;
        this.f442323o = null;
        this.f442325q = 8;
        this.f442326r = 1.0f;
        this.f442327s = true;
        this.f442329u = null;
        this.f442330v = new java.lang.Object();
        this.f442331w = 0L;
        this.f442332x = false;
        this.f442333y = false;
        this.f442334z = new java.util.ArrayList();
        this.A = true;
        this.B = false;
        this.C = null;
        this.E = new w21.y(this);
        this.F = new w21.z(this);
        this.G = null;
        this.H = 0;
        int i17 = f442308J + 1;
        f442308J = i17;
        this.f442321m = i17;
        this.f442326r = f17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "[%d] new Instance", java.lang.Integer.valueOf(i17));
    }

    public static /* synthetic */ int k(w21.d0 d0Var) {
        int i17 = d0Var.f442319k;
        d0Var.f442319k = i17 + 1;
        return i17;
    }

    public static /* synthetic */ long l(w21.d0 d0Var) {
        long j17 = d0Var.f442331w;
        d0Var.f442331w = 1 + j17;
        return j17;
    }

    public static /* synthetic */ int m(w21.d0 d0Var) {
        int i17 = d0Var.f442322n;
        d0Var.f442322n = i17 + 1;
        return i17;
    }

    @Override // tl.h
    public void a(tl.f fVar) {
        this.f442314f = fVar;
    }

    @Override // tl.h
    public void b(tl.e eVar) {
        this.f442313e = eVar;
    }

    @Override // tl.h
    public double c() {
        return 0.0d;
    }

    @Override // tl.h
    public void d(tl.g gVar) {
        this.f442329u = gVar;
    }

    @Override // tl.h
    public boolean e(java.lang.String str, boolean z17, int i17) {
        java.lang.String str2 = this.f442317i;
        return (str2 == null || !str2.equals(str)) ? u(str, z17, i17, true) : u(str, z17, i17, false);
    }

    @Override // tl.h
    public boolean f(boolean z17) {
        if (this.f442318j != 1) {
            return false;
        }
        this.f442318j = 2;
        synchronized ("") {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "before mOk.wait");
                long currentTimeMillis = java.lang.System.currentTimeMillis();
                "".wait(1000L);
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "after mOk.wait time:" + (java.lang.System.currentTimeMillis() - currentTimeMillis));
            } catch (java.lang.Exception e17) {
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                return false;
            }
        }
        fp.e eVar = this.f442312d;
        if (eVar != null && z17) {
            eVar.a();
        }
        return true;
    }

    @Override // tl.h
    public void g(boolean z17) {
        this.f442320l = true;
        this.f442315g = 2;
        n(z17);
        android.media.AudioTrack audioTrack = this.f442309a;
        if (audioTrack != null) {
            try {
                audioTrack.play();
            } catch (java.lang.Exception e17) {
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(161L, 0L, 1L, false);
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(161L, 3L, 1L, false);
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "audioTrack error:%s", e17.getMessage());
            }
        }
        this.f442320l = false;
    }

    @Override // tl.h
    public int getStatus() {
        return this.f442318j;
    }

    @Override // tl.h
    public boolean h(float f17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "setPlaySpeed() called with: speed = [" + f17 + "]");
        float f18 = this.f442326r;
        if (f17 > f18) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SilkPlayer", "speed is too high, limited to %f", java.lang.Float.valueOf(f18));
            f17 = f18;
        }
        if (this.D == null) {
            this.D = new w21.e0(this.f442316h, 1);
        }
        this.D.f442347d = f17;
        return true;
    }

    @Override // tl.h
    public void i(boolean z17) {
        this.f442327s = z17;
    }

    @Override // tl.h
    public boolean isPlaying() {
        w21.a0 a0Var;
        java.lang.Object[] objArr = new java.lang.Object[3];
        objArr[0] = java.lang.Boolean.valueOf(this.f442318j == 1);
        w21.a0 a0Var2 = this.f442311c;
        objArr[1] = a0Var2;
        objArr[2] = java.lang.Boolean.valueOf(a0Var2 == null || a0Var2.d());
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "isPlaying %s and mPlayRunnable is %s && mPlayRunnable is done %s", objArr);
        return this.f442318j == 1 || this.f442318j == 4 || !(this.f442318j == 1 || (a0Var = this.f442311c) == null || a0Var.d());
    }

    @Override // tl.h
    public boolean j(java.lang.String str, boolean z17) {
        return u(str, z17, 0, true);
    }

    public final void n(boolean z17) {
        if (this.f442309a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            try {
                v();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "mAudioTrack.stop() error: %s", e17.getMessage());
            }
            this.f442309a = null;
        }
        this.f442309a = ul.a.a(z17, this.f442316h, this.f442315g, 2, this.f442325q);
        this.f442324p = new vl.a();
        android.media.AudioTrack audioTrack = this.f442309a;
        if (audioTrack == null || audioTrack.getState() == 0) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(161L, 0L, 1L, false);
            g0Var.idkeyStat(161L, 2L, 1L, false);
            try {
                android.media.AudioTrack audioTrack2 = this.f442309a;
                if (audioTrack2 != null) {
                    audioTrack2.release();
                    this.f442309a = null;
                }
            } catch (java.lang.Exception unused) {
            }
        }
        this.H = 0;
    }

    public final boolean o() {
        if (this.f442309a != null) {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", com.tencent.tav.core.AssetExtension.SCENE_PLAY);
                this.f442309a.play();
                this.f442311c = new w21.a0(this, null);
                ((ku5.t0) ku5.t0.f312615d).g(this.f442311c);
                return true;
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "audioTrack error:%s", e17.getMessage());
                com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
                g0Var.idkeyStat(161L, 0L, 1L, false);
                g0Var.idkeyStat(161L, 3L, 1L, false);
            }
        }
        return false;
    }

    public final boolean p(java.lang.String str) {
        boolean z17;
        if (str == null) {
            return false;
        }
        try {
            int lastIndexOf = str.lastIndexOf("/");
            if (lastIndexOf == -1) {
                com.tencent.mars.xlog.Log.w("MicroMsg.SilkPlayer", "ensureFileFloder end == -1");
                return false;
            }
            java.lang.String substring = str.substring(0, lastIndexOf + 1);
            com.tencent.mm.vfs.r6 r6Var = new com.tencent.mm.vfs.r6(substring);
            if (!r6Var.m()) {
                if (!r6Var.J() && !r6Var.y()) {
                    z17 = false;
                    com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "ensureFileFloder mkdir:%s,sucess:%s", substring, java.lang.Boolean.valueOf(z17));
                }
                z17 = true;
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "ensureFileFloder mkdir:%s,sucess:%s", substring, java.lang.Boolean.valueOf(z17));
            }
            return true;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.SilkPlayer", "ensureFileFloder Exception:", e17.getMessage());
            return false;
        }
    }

    @Override // tl.h
    public boolean pause() {
        return f(true);
    }

    public final void q(java.lang.String str) {
        int b17;
        int i17 = this.f442321m;
        K = i17;
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "[%d] SilkDecInit", java.lang.Integer.valueOf(i17));
        try {
            java.io.InputStream E = com.tencent.mm.vfs.w6.E(str);
            int available = E.available();
            long j17 = (available * 1000) / 23900;
            int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.f442316h, 2, 2) * 2;
            if (!ym1.f.Ni() || available >= minBufferSize) {
                this.f442325q = 8;
            } else {
                this.f442325q = 1;
            }
            byte[] bArr = new byte[available];
            E.read(bArr, 0, available);
            this.f442316h = com.tencent.mm.modelvoice.MediaRecorder.SilkGetEncSampleRate(new byte[]{bArr[0]}, 0L);
            w21.t0 t0Var = this.f442328t;
            if (t0Var != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "silkdec uninit success: %d" + t0Var.a());
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "[%d] Using ThreadSafeSilkDecoder for thread safety", java.lang.Integer.valueOf(this.f442321m));
            this.f442328t = new w21.t0(this.f442316h, bArr, available);
            int Ni = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).Ni(e42.d0.clicfg_msg_voice_silk_agc, -1);
            if (1 == Ni || Ni == 0) {
                this.f442328t.d(100, new byte[]{(byte) Ni}, 1);
            }
            boolean bj6 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).bj();
            int Di = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Di();
            int Ni2 = ((u14.t) ((wd0.l1) i95.n0.c(wd0.l1.class))).Ni();
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "WaveHAid, flag:%s, type:%s, device:%s", java.lang.Boolean.valueOf(bj6), java.lang.Integer.valueOf(Di), java.lang.Integer.valueOf(Ni2));
            if (bj6) {
                byte[] bArr2 = {(byte) (Di & 255), (byte) ((Di >> 8) & 255), (byte) ((Di >> 16) & 255), (byte) ((Di >> 24) & 255), (byte) (Ni2 & 255), (byte) ((Ni2 >> 8) & 255), (byte) ((Ni2 >> 16) & 255), (byte) ((Ni2 >> 24) & 255)};
                this.f442328t.d(300, bArr2, 8);
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "WaveHAid, params:%d,%d,%d,%d, len:%d", java.lang.Byte.valueOf(bArr2[0]), java.lang.Byte.valueOf(bArr2[1]), java.lang.Byte.valueOf(bArr2[2]), java.lang.Byte.valueOf(bArr2[3]), 8);
            }
            E.close();
            byte[] bArr3 = new byte[android.media.AudioTrack.getMinBufferSize(this.f442316h, 2, 2) * 2];
            short s17 = (short) ((this.f442316h * 20) / 1000);
            for (int i18 = 0; i18 < this.f442322n; i18++) {
                w21.t0 t0Var2 = this.f442328t;
                if (t0Var2 != null && (b17 = t0Var2.b(bArr3, s17)) <= 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "[%d], skip frame failed: %d", java.lang.Integer.valueOf(this.f442321m), java.lang.Integer.valueOf(b17));
                    return;
                }
            }
        } catch (java.lang.Exception e17) {
            com.tencent.mm.plugin.report.service.g0 g0Var = com.tencent.mm.plugin.report.service.g0.INSTANCE;
            g0Var.idkeyStat(161L, 0L, 1L, false);
            g0Var.idkeyStat(161L, 1L, 1L, false);
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
            android.media.MediaPlayer.OnErrorListener onErrorListener = this.F;
            if (onErrorListener != null) {
                ((w21.z) onErrorListener).onError(null, 0, 0);
            }
            this.f442318j = 0;
        }
    }

    public final boolean r(boolean z17, int i17) {
        fp.e eVar = this.f442312d;
        if (!com.tencent.mm.vfs.w6.j(this.f442317i)) {
            return false;
        }
        try {
            n(z17);
            android.media.AudioTrack audioTrack = this.f442309a;
            if (audioTrack != null) {
                audioTrack.setVolume(this.f442310b.booleanValue() ? 0.0f : 1.0f);
                if (eVar != null && this.f442327s) {
                    eVar.b();
                }
                return o();
            }
        } catch (java.lang.Exception e17) {
            if (eVar != null && this.f442327s) {
                eVar.a();
            }
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "playImp : fail, exception = " + e17.getMessage());
            boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
        }
        return false;
    }

    @Override // tl.h
    public boolean resume() {
        if (this.f442318j != 2) {
            return false;
        }
        this.f442318j = 1;
        synchronized ("") {
            try {
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "before mpause.notify");
                "".notifyAll();
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "after mpause.notify");
            } catch (java.lang.Exception e17) {
                boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                return false;
            }
        }
        fp.e eVar = this.f442312d;
        if (eVar != null && this.f442327s) {
            eVar.b();
        }
        return true;
    }

    public java.lang.String s(java.lang.String str, java.lang.String str2) {
        java.io.InputStream inputStream;
        if (this.f442318j != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "startPlay error status:" + this.f442318j);
            return null;
        }
        this.f442318j = 1;
        this.f442317i = str;
        try {
            inputStream = com.tencent.mm.vfs.w6.E(str);
        } catch (java.lang.Exception e17) {
            e = e17;
            inputStream = null;
        }
        try {
            int available = inputStream.available();
            byte[] bArr = new byte[available];
            inputStream.read(bArr, 0, available);
            this.f442316h = com.tencent.mm.modelvoice.MediaRecorder.SilkGetEncSampleRate(new byte[]{bArr[0]}, 0L);
            w21.t0 t0Var = new w21.t0(this.f442316h, bArr, available);
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "[%d] SilkDecInit in silkToPcm", java.lang.Integer.valueOf(this.f442321m));
            inputStream.close();
            return t(str2, t0Var);
        } catch (java.lang.Exception e18) {
            e = e18;
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "silkToPcm, file[%s], exception: %s", this.f442317i, e.getMessage());
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e));
            this.f442318j = -1;
            if (inputStream != null) {
                try {
                    inputStream.close();
                } catch (java.io.IOException e19) {
                    com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SilkPlayer", e19, "", new java.lang.Object[0]);
                }
            }
            return null;
        }
    }

    @Override // tl.h
    public boolean seek(long j17) {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "seek: " + j17);
        if (this.f442318j == 0) {
            tl.g gVar = this.f442329u;
            if (gVar != null) {
                ((sl.b) gVar).a(this.f442331w * 20);
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "now stop, can not seek");
            return false;
        }
        if (this.f442318j == 4) {
            java.util.concurrent.Future future = this.G;
            if (future == null || future.isDone() || !this.G.cancel(false)) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "cancel previous stopping error");
                return false;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "cancel previous stopping");
            if (this.f442311c == null) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "playing runnable is null");
                return false;
            }
            this.f442318j = 1;
            ((ku5.t0) ku5.t0.f312615d).g(this.f442311c);
        }
        if (this.f442318j != 1) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "not playing, can not seek");
            return false;
        }
        synchronized (this.f442330v) {
            this.f442331w = j17 / 20;
            this.f442332x = true;
        }
        return true;
    }

    @Override // tl.h
    public void setMute(boolean z17) {
        if (!j65.e.b() || !j65.e.g()) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "is not mute mode, don't set mute!!");
            this.f442310b = java.lang.Boolean.FALSE;
            return;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "setMute:%s,mAudioTrack:%s", java.lang.Boolean.valueOf(z17), this.f442309a);
        this.f442310b = java.lang.Boolean.valueOf(z17);
        android.media.AudioTrack audioTrack = this.f442309a;
        if (audioTrack != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "setMute ret:%s", java.lang.Integer.valueOf(audioTrack.setVolume(z17 ? 0.0f : 1.0f)));
        }
    }

    @Override // tl.h
    public boolean stop() {
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "stop  status:" + this.f442318j);
        if (this.f442318j != 1 && this.f442318j != 2) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "stop  error status:" + this.f442318j);
            return false;
        }
        this.f442318j = 3;
        synchronized ("") {
            try {
                try {
                    "".notifyAll();
                } catch (java.lang.Exception e17) {
                    boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                    com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                    fp.e eVar = this.f442312d;
                    if (eVar != null && this.f442327s) {
                        eVar.a();
                    }
                    return false;
                }
            } finally {
                fp.e eVar2 = this.f442312d;
                if (eVar2 != null && this.f442327s) {
                    eVar2.a();
                }
            }
        }
        return true;
    }

    public final java.lang.String t(java.lang.String str, w21.t0 t0Var) {
        java.io.OutputStream outputStream;
        if (!com.tencent.mm.vfs.w6.j(this.f442317i)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl(), file not exist, fileName = %s", this.f442317i);
            return null;
        }
        if (t0Var == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "silkDecode is null.");
            return null;
        }
        try {
            try {
                android.os.Process.setThreadPriority(-16);
                byte[] bArr = new byte[android.media.AudioTrack.getMinBufferSize(this.f442316h, 2, 2) << 1];
                short s17 = (short) ((this.f442316h * 20) / 1000);
                p(str);
                outputStream = com.tencent.mm.vfs.w6.K(str, false);
                while (true) {
                    try {
                        if (this.f442318j != 1 && this.f442318j != 2) {
                            break;
                        }
                        int b17 = t0Var.b(bArr, s17);
                        if (b17 < 0) {
                            this.f442318j = 0;
                        } else {
                            while (this.f442320l) {
                                java.lang.Thread.sleep(20L);
                            }
                            outputStream.write(bArr, 0, s17 * 2);
                            outputStream.flush();
                            if (b17 == 0) {
                                this.f442318j = 0;
                            }
                        }
                    } catch (java.lang.Exception e17) {
                        e = e17;
                        com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl thread exception: " + e.getMessage());
                        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                        com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e));
                        this.f442318j = 0;
                        if (outputStream != null) {
                            try {
                                outputStream.close();
                            } catch (java.io.IOException e18) {
                                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.SilkPlayer", e18, "", new java.lang.Object[0]);
                            }
                        }
                        return null;
                    }
                }
                outputStream.close();
                int a17 = t0Var.a();
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "[%d] SilkDecUnInit in silkToPcmImpl", java.lang.Integer.valueOf(this.f442321m));
                if (a17 != 0) {
                    com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl res: " + a17);
                }
                return str;
            } catch (java.lang.Exception e19) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "hakon silkToPcmImpl exception: " + e19.getMessage());
                boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e19));
                return null;
            }
        } catch (java.lang.Exception e27) {
            e = e27;
            outputStream = null;
        }
    }

    public final boolean u(java.lang.String str, boolean z17, int i17, boolean z18) {
        java.util.concurrent.Future future;
        if (this.f442318j != 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "startPlay error status:" + this.f442318j);
            return false;
        }
        if (this.f442318j == 4 && (future = this.G) != null && !future.isDone() && !this.G.cancel(false)) {
            com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "cancel error");
            return false;
        }
        if (x51.o1.H) {
            s(str, tl.i0.f420053b);
        }
        if (z18) {
            ((java.util.ArrayList) this.f442334z).clear();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "startPlay");
        this.f442318j = 1;
        this.f442317i = str;
        synchronized (I) {
            q(str);
        }
        if (x51.o1.H) {
            this.f442323o = new yl.d(tl.i0.f420052a, this.f442315g == 2 ? 1 : 2, this.f442316h, 2);
        }
        try {
            return r(z17, i17);
        } catch (java.lang.Exception e17) {
            try {
                return r(true, i17);
            } catch (java.lang.Exception unused) {
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "startPlay File[" + this.f442317i + "] failed");
                boolean z19 = com.tencent.mm.sdk.platformtools.t8.f192989a;
                com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "exception:%s", com.tencent.mm.sdk.platformtools.z3.c(e17));
                this.f442318j = -1;
                return false;
            }
        }
    }

    public void v() {
        if (this.f442309a != null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "mAudioTrack.stop()");
            this.f442309a.stop();
            this.f442309a.release();
            this.f442309a = null;
            if (this.B) {
                com.tencent.mars.xlog.Log.i("MicroMsg.SilkPlayer", "stopAudioTrack: needCheckComplete");
                this.B = false;
                java.lang.Runnable runnable = this.C;
                this.C = null;
                if (runnable != null) {
                    java.util.concurrent.Future future = this.G;
                    if (future != null && !future.isDone()) {
                        com.tencent.mars.xlog.Log.e("MicroMsg.SilkPlayer", "stopAudioTrack has uncompleted task");
                    }
                    ku5.t0 t0Var = (ku5.t0) ku5.t0.f312615d;
                    t0Var.getClass();
                    this.G = t0Var.k(runnable, 0L);
                }
            }
        }
        vl.a aVar = this.f442324p;
        if (aVar != null) {
            java.lang.String str = this.f442317i;
            android.media.AudioTrack audioTrack = this.f442309a;
            aVar.b(1, 0, str, audioTrack != null ? audioTrack.getStreamType() : 0);
            this.f442324p.c(0);
            this.f442324p.e(0);
            this.f442324p.d(0);
        }
    }

    public d0(android.content.Context context, float f17) {
        this(f17);
        this.f442312d = new fp.e(context);
    }
}
