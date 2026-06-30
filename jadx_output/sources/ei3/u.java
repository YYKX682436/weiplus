package ei3;

/* loaded from: classes14.dex */
public abstract class u implements ei3.j {
    public final int A;
    public com.tencent.mm.sdk.platformtools.n3 F;

    /* renamed from: a, reason: collision with root package name */
    public wo.i1 f253124a;

    /* renamed from: b, reason: collision with root package name */
    public android.media.MediaFormat f253125b;

    /* renamed from: c, reason: collision with root package name */
    public android.media.MediaCodec.BufferInfo f253126c;

    /* renamed from: e, reason: collision with root package name */
    public int f253128e;

    /* renamed from: f, reason: collision with root package name */
    public int f253129f;

    /* renamed from: g, reason: collision with root package name */
    public long f253130g;

    /* renamed from: h, reason: collision with root package name */
    public long f253131h;

    /* renamed from: i, reason: collision with root package name */
    public int f253132i;

    /* renamed from: q, reason: collision with root package name */
    public final boolean f253140q;

    /* renamed from: r, reason: collision with root package name */
    public final boolean f253141r;

    /* renamed from: u, reason: collision with root package name */
    public boolean f253144u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f253145v;

    /* renamed from: x, reason: collision with root package name */
    public ei3.i f253147x;

    /* renamed from: y, reason: collision with root package name */
    public final int f253148y;

    /* renamed from: z, reason: collision with root package name */
    public final int f253149z;

    /* renamed from: d, reason: collision with root package name */
    public long f253127d = 0;

    /* renamed from: j, reason: collision with root package name */
    public boolean f253133j = false;

    /* renamed from: k, reason: collision with root package name */
    public boolean f253134k = false;

    /* renamed from: l, reason: collision with root package name */
    public ei3.h f253135l = null;

    /* renamed from: m, reason: collision with root package name */
    public long f253136m = 0;

    /* renamed from: n, reason: collision with root package name */
    public final java.lang.Object f253137n = new java.lang.Object();

    /* renamed from: o, reason: collision with root package name */
    public volatile boolean f253138o = false;

    /* renamed from: p, reason: collision with root package name */
    public volatile boolean f253139p = false;

    /* renamed from: s, reason: collision with root package name */
    public final com.tencent.mm.sdk.platformtools.n3 f253142s = new ei3.q(this, android.os.Looper.getMainLooper());

    /* renamed from: t, reason: collision with root package name */
    public volatile tl.w f253143t = null;

    /* renamed from: w, reason: collision with root package name */
    public final java.lang.Object f253146w = new byte[0];
    public volatile boolean B = false;
    public long C = 0;
    public long D = -1;
    public boolean E = false;
    public final java.lang.Runnable G = new ei3.r(this);
    public long H = 0;
    public final tl.v I = new ei3.s(this);

    public u(int i17, int i18, int i19, ei3.x0 x0Var, boolean z17) {
        this.f253140q = true;
        this.f253141r = false;
        this.f253149z = i18;
        this.f253148y = i17;
        this.A = i19;
        if (i19 <= 0) {
            this.A = 1;
        }
        this.f253140q = ((h62.d) ((e42.e0) i95.n0.c(e42.e0.class))).fj(e42.d0.clicfg_ignore_mediacodec_lock, false);
        this.f253141r = z17;
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "create MMSightAACMediaCodecRecorder, audioBitrate: %s, audioSampleRate: %s, audioChannelCount:%s, isUseFFmpegMuxer:%s", java.lang.Integer.valueOf(i18), java.lang.Integer.valueOf(i17), java.lang.Integer.valueOf(this.A), java.lang.Boolean.valueOf(z17));
    }

    @Override // ei3.j
    public void a(boolean z17) {
        this.f253134k = z17;
    }

    @Override // ei3.j
    public int b(ei3.h hVar) {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, onPcmReady: %s", hVar);
        this.f253135l = hVar;
        int i17 = 0;
        if (this.f253134k) {
            this.f253142s.sendEmptyMessage(0);
        } else {
            if (this.f253143t == null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "start, pcmrecorder is null");
                return -1;
            }
            if (!this.f253143t.k()) {
                i17 = -1;
            }
        }
        this.C = 0L;
        this.D = -1L;
        return i17;
    }

    @Override // ei3.j
    public int c(int i17, java.lang.String str) {
        if (!this.f253134k && this.f253143t != null) {
            java.lang.Object[] objArr = new java.lang.Object[1];
            objArr[0] = java.lang.Boolean.valueOf(this.f253147x == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightAACMediaCodecRecorder", "call init, before pcmRecorder stop, stopCallback null ? %B", objArr);
            this.f253143t.l();
        }
        if (this.f253124a != null) {
            java.lang.Object[] objArr2 = new java.lang.Object[1];
            objArr2[0] = java.lang.Boolean.valueOf(this.f253147x == null);
            com.tencent.mars.xlog.Log.e("MicroMsg.MMSightAACMediaCodecRecorder", "call init, before audioEncoder stop, stopCallback null ? %B", objArr2);
            h();
            ei3.i iVar = this.f253147x;
            if (iVar != null) {
                iVar.a();
                this.f253147x = null;
            }
        }
        this.f253144u = false;
        synchronized (this.f253146w) {
            this.f253145v = false;
            this.E = false;
            this.f253147x = null;
        }
        if (!this.f253134k) {
            this.f253143t = new tl.w(this.f253148y, this.A, 5);
            this.f253143t.e(1);
            this.f253143t.g(128);
            this.f253143t.i(true);
            this.f253143t.f420172y = this.I;
        }
        com.tencent.mm.sdk.platformtools.n3 n3Var = this.F;
        if (n3Var == null) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "create pcm control handler");
            this.F = new com.tencent.mm.sdk.platformtools.n3();
        } else if (n3Var.getLooper() != android.os.Looper.myLooper()) {
            com.tencent.mars.xlog.Log.w("MicroMsg.MMSightAACMediaCodecRecorder", "error pcm control handler looper[%s, %s], recreate handler", this.F.getLooper(), android.os.Looper.myLooper());
            this.F = new com.tencent.mm.sdk.platformtools.n3();
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "sample rate %d, audio rate %d", java.lang.Integer.valueOf(this.f253148y), java.lang.Integer.valueOf(this.f253149z));
        try {
            this.f253126c = new android.media.MediaCodec.BufferInfo();
            android.media.MediaFormat mediaFormat = new android.media.MediaFormat();
            this.f253125b = mediaFormat;
            mediaFormat.setString("mime", "audio/mp4a-latm");
            this.f253125b.setInteger("aac-profile", 2);
            this.f253125b.setInteger("sample-rate", this.f253148y);
            this.f253125b.setInteger("channel-count", this.A);
            this.f253125b.setInteger(com.tencent.mm.plugin.mmsight.segment.FFmpegMetadataRetriever.METADATA_KEY_VARIANT_BITRATE, this.f253149z);
            this.f253125b.setInteger("max-input-size", this.A * 16384);
            wo.i1 d17 = wo.i1.d("audio/mp4a-latm", false);
            this.f253124a = d17;
            d17.a(this.f253125b, null, null, 1);
            this.f253124a.x();
            if (this.f253140q) {
                this.f253138o = false;
                this.f253136m = java.lang.System.currentTimeMillis();
            } else {
                synchronized (this.f253137n) {
                    this.f253138o = false;
                    this.f253136m = java.lang.System.currentTimeMillis();
                }
            }
            return 0;
        } catch (java.lang.Throwable th6) {
            try {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.MMSightAACMediaCodecRecorder", th6, "start aac encoder error: %s", th6.getMessage());
                h();
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightRecorderIDKeyStat", "markMediaCodecAACInitError");
                com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(440L, 15L, 1L, false);
                this.f253133j = false;
                return -1;
            } finally {
                this.f253133j = false;
            }
        }
    }

    @Override // ei3.j
    public void clear() {
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "clear");
        h();
        m();
    }

    @Override // ei3.j
    public void d() {
        this.f253133j = true;
    }

    @Override // ei3.j
    public tl.v e() {
        return this.I;
    }

    @Override // ei3.j
    public int f(ei3.i iVar) {
        java.lang.Object[] objArr = new java.lang.Object[4];
        objArr[0] = java.lang.Boolean.valueOf(this.f253143t == null);
        objArr[1] = java.lang.Boolean.valueOf(this.f253147x == null);
        objArr[2] = java.lang.Boolean.valueOf(iVar == null);
        objArr[3] = java.lang.Boolean.valueOf(this.f253144u);
        com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "call stop, pcmRecorder null[%B], old stopCallback null[%B]new stopCallback null[%B], pcmMarkStop[%B]", objArr);
        if (this.f253143t == null && !this.f253134k) {
            return -1;
        }
        this.f253144u = true;
        synchronized (this.f253146w) {
            this.f253147x = iVar;
            if (this.f253145v && iVar != null) {
                com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "has stop, directly call stop callback");
                iVar.a();
                this.f253147x = null;
            }
        }
        com.tencent.mm.sdk.platformtools.u3.i(new ei3.t(this), 500L);
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x012e A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0027 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(boolean r19) {
        /*
            Method dump skipped, instructions count: 364
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ei3.u.g(boolean):void");
    }

    public void h() {
        if (this.f253140q) {
            i();
            return;
        }
        synchronized (this.f253137n) {
            i();
        }
    }

    public final void i() {
        if (this.f253138o || 0 == this.f253136m) {
            return;
        }
        while (this.f253139p) {
            java.lang.Thread.yield();
        }
        this.f253138o = true;
        try {
            try {
                if (this.f253124a != null) {
                    com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop encoder");
                    this.f253124a.y();
                    this.f253124a.q();
                    this.f253124a = null;
                }
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.MMSightAACMediaCodecRecorder", "clear error: %s", e17.getMessage());
            }
        } finally {
            this.f253124a = null;
        }
    }

    public abstract boolean j();

    public abstract void k(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo);

    public abstract void l(java.nio.ByteBuffer byteBuffer, android.media.MediaCodec.BufferInfo bufferInfo, int i17, int i18, int i19);

    public final synchronized void m() {
        if (this.f253143t != null && !this.f253134k) {
            com.tencent.mars.xlog.Log.i("MicroMsg.MMSightAACMediaCodecRecorder", "stop pcm recorder");
            this.f253143t.l();
            this.f253143t = null;
        }
    }
}
