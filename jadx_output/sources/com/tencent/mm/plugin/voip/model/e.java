package com.tencent.mm.plugin.voip.model;

/* loaded from: classes14.dex */
public class e {
    public vl.a Q;

    /* renamed from: v, reason: collision with root package name */
    public wu5.b f176459v;

    /* renamed from: a, reason: collision with root package name */
    public boolean f176438a = false;

    /* renamed from: b, reason: collision with root package name */
    public boolean f176439b = true;

    /* renamed from: c, reason: collision with root package name */
    public int f176440c = 2;

    /* renamed from: d, reason: collision with root package name */
    public int f176441d = 0;

    /* renamed from: e, reason: collision with root package name */
    public int f176442e = 0;

    /* renamed from: f, reason: collision with root package name */
    public byte[] f176443f = null;

    /* renamed from: g, reason: collision with root package name */
    public byte[] f176444g = null;

    /* renamed from: h, reason: collision with root package name */
    public byte[] f176445h = null;

    /* renamed from: i, reason: collision with root package name */
    public byte[] f176446i = null;

    /* renamed from: j, reason: collision with root package name */
    public byte[] f176447j = null;

    /* renamed from: k, reason: collision with root package name */
    public int f176448k = 0;

    /* renamed from: l, reason: collision with root package name */
    public int f176449l = 0;

    /* renamed from: m, reason: collision with root package name */
    public int f176450m = 0;

    /* renamed from: n, reason: collision with root package name */
    public int f176451n = 20;

    /* renamed from: o, reason: collision with root package name */
    public android.media.AudioTrack f176452o = null;

    /* renamed from: p, reason: collision with root package name */
    public final java.util.concurrent.atomic.AtomicBoolean f176453p = new java.util.concurrent.atomic.AtomicBoolean(false);

    /* renamed from: q, reason: collision with root package name */
    public com.tencent.mm.plugin.voip.model.b f176454q = null;

    /* renamed from: r, reason: collision with root package name */
    public wu5.c f176455r = null;

    /* renamed from: s, reason: collision with root package name */
    public int f176456s = 0;

    /* renamed from: t, reason: collision with root package name */
    public java.lang.String f176457t = null;

    /* renamed from: u, reason: collision with root package name */
    public boolean f176458u = false;

    /* renamed from: w, reason: collision with root package name */
    public int f176460w = 0;

    /* renamed from: x, reason: collision with root package name */
    public int f176461x = 0;

    /* renamed from: y, reason: collision with root package name */
    public int f176462y = 0;

    /* renamed from: z, reason: collision with root package name */
    public int f176463z = 0;
    public int A = 1;
    public int B = 0;
    public long C = 0;
    public int D = 1;
    public int E = 0;
    public int F = -1;
    public int G = 0;
    public final int H = 1;
    public int I = 0;

    /* renamed from: J, reason: collision with root package name */
    public final java.lang.Object f176437J = new java.lang.Object();
    public int K = 0;
    public int L = 0;
    public int M = 0;
    public int N = 0;
    public int O = 0;
    public int P = 0;
    public boolean R = false;

    public int a() {
        int i17 = this.f176448k;
        if (i17 == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "nSamplerate is no init now  ");
            return 0;
        }
        android.media.AudioTrack audioTrack = this.f176452o;
        if (audioTrack == null) {
            return (this.f176463z * 1000) / i17;
        }
        if (!this.f176438a || audioTrack.getState() == 0) {
            return (this.f176463z * 1000) / this.f176448k;
        }
        try {
            return ((this.f176460w - this.f176452o.getPlaybackHeadPosition()) * 1000) / this.f176448k;
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack getPlaybackHeadPosition error:%s", e17.getMessage());
            return (this.f176463z * 1000) / this.f176448k;
        }
    }

    public int b(android.content.Context context, boolean z17) {
        java.util.concurrent.atomic.AtomicBoolean atomicBoolean = this.f176453p;
        if (this.f176449l == 2) {
            this.f176440c = 3;
        } else {
            this.f176440c = 2;
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.f176448k, this.f176440c, 2);
        this.f176441d = minBufferSize;
        if (minBufferSize == -2 || minBufferSize == -1) {
            this.K = 1;
            return -1;
        }
        this.f176463z = minBufferSize;
        this.E = this.D * minBufferSize;
        this.f176441d = this.H * minBufferSize;
        float f17 = (minBufferSize >> 1) / this.f176448k;
        int a17 = wo.r.a();
        int i17 = wo.v1.f447823c.f447614m0;
        if ((a17 & 1024) != 0) {
            if (i17 <= 0) {
                i17 = 0;
            }
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "CPU ARMv7, ablePlayTimer: " + i17);
        }
        this.f176439b = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "playBufSize:" + this.f176441d + "  MinBufSizeInMs:" + f17 + ",bPlayTimer:" + this.f176439b);
        int h17 = h(z17);
        try {
            if (this.f176452o != null) {
                try {
                    atomicBoolean.compareAndSet(false, true);
                    this.f176452o.release();
                } catch (java.lang.Exception unused) {
                }
            }
            this.f176452o = new to.e(h17, this.f176448k, this.f176440c, 2, this.f176441d, 1);
            atomicBoolean.compareAndSet(true, false);
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.w("MicroMsg.Voip.AudioPlayer", "new AudioTrack:", e17);
            this.K = 6;
        }
        android.media.AudioTrack audioTrack = this.f176452o;
        if (audioTrack == null || audioTrack.getState() == 0) {
            this.K = 2;
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer audioTrack.getState() == AudioTrack.STATE_UNINITIALIZED");
            if (this.f176452o != null) {
                atomicBoolean.compareAndSet(false, true);
                this.f176452o.release();
            }
            if (h17 == 0) {
                this.f176452o = new to.e(3, this.f176448k, this.f176440c, 2, this.f176441d, 1);
            } else {
                this.f176452o = new to.e(0, this.f176448k, this.f176440c, 2, this.f176441d, 1);
            }
            atomicBoolean.compareAndSet(true, false);
        }
        android.media.AudioTrack audioTrack2 = this.f176452o;
        if (audioTrack2 == null) {
            this.K = 3;
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "null == audioTrack return");
            return -1;
        }
        if (audioTrack2.getState() == 0) {
            this.K = 3;
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer STATE_UNINITIALIZED call AudioTrack.release() and return");
            atomicBoolean.compareAndSet(false, true);
            this.f176452o.release();
            this.f176452o = null;
            return -1;
        }
        int i18 = this.f176441d;
        this.f176443f = new byte[i18];
        int i19 = this.f176451n;
        this.f176446i = new byte[i19];
        if (this.f176439b) {
            this.f176442e = i18;
            this.f176444g = new byte[i18];
            this.f176445h = new byte[i18];
            this.f176447j = new byte[i19];
        }
        this.f176438a = false;
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "dkbt AudioTrack init ok, mode:%d issp:%b m:%d size %d,nSamplerate:%d", java.lang.Integer.valueOf(ym1.f.Bi()), java.lang.Boolean.valueOf(ym1.f.f463134h.k()), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(this.f176441d), java.lang.Integer.valueOf(this.f176448k));
        return (this.f176441d * 1000) / (this.f176448k * 2);
    }

    public int c(int i17, int i18, int i19, int i27) {
        if (true == this.f176438a) {
            return 0;
        }
        this.f176448k = i17;
        this.f176449l = i18;
        this.f176450m = i19;
        this.N = i27;
        this.f176451n = (i17 / 1000) * i18 * i19 * 2;
        this.G = (i17 * 60) / 1000;
        return 1;
    }

    public int d() {
        int i17;
        if (true == this.f176438a) {
            return 1;
        }
        android.media.AudioTrack audioTrack = this.f176452o;
        if (audioTrack == null) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack error: audioTrack is null!!");
            return 0;
        }
        this.f176438a = true;
        try {
            audioTrack.play();
        } catch (java.lang.Exception e17) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack.play Exception:%s", e17.getMessage());
        }
        android.media.AudioTrack audioTrack2 = this.f176452o;
        if (audioTrack2 != null && audioTrack2.getPlayState() != 3) {
            this.K = 4;
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack play error: AudioTrack.PLAYSTATE_PLAYING, play do not start !");
            return 0;
        }
        android.media.AudioTrack audioTrack3 = this.f176452o;
        if (audioTrack3 != null && audioTrack3.getState() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "audioTrack error: AudioTrack.STATE_UNINITIALIZED, no more AudioTrack resource!!");
            return 0;
        }
        if (this.f176439b) {
            if (this.f176455r != null) {
                com.tencent.mars.xlog.Log.w("MicroMsg.Voip.AudioPlayer", "Task has been created. " + this.f176455r);
                i17 = -1;
            } else {
                i17 = 0;
            }
            if (i17 != 0) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "InitAudioRecTimer failed, error code = " + i17);
                return 0;
            }
            this.f176455r = ((ku5.t0) ku5.t0.f312615d).e(new com.tencent.mm.plugin.voip.model.d(this), 0L, 20L);
        }
        this.Q = new vl.a();
        this.f176459v = new com.tencent.mm.plugin.voip.model.c(this);
        ((ku5.t0) ku5.t0.f312615d).A("AudioPlayer_play");
        ((ku5.t0) ku5.t0.f312615d).h(this.f176459v, "AudioPlayer_play");
        return 1;
    }

    public int e() {
        wu5.c cVar = this.f176455r;
        if (cVar != null) {
            cVar.cancel(false);
            this.f176455r = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "audio player call stop play");
        if (!this.f176438a) {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "audio player call stop play failed cause current is not playing ");
            return 1;
        }
        this.f176438a = false;
        this.I = 0;
        try {
            i();
        } catch (java.lang.InterruptedException | java.util.concurrent.CancellationException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.AudioPlayer", e17, "", new java.lang.Object[0]);
        }
        try {
            if (this.f176452o != null) {
                this.f176453p.compareAndSet(false, true);
                this.f176459v.b();
                ((ku5.t0) ku5.t0.f312615d).A("AudioPlayer_play");
                this.f176452o.stop();
                this.f176452o.release();
                com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "StopPlay stop audioTrack");
            }
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "StopPlay audioTrack.stop Exception:%s", e18.getMessage());
        }
        return 1;
    }

    public int f() {
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "audio player call uninit");
        if (this.f176452o != null) {
            this.f176453p.compareAndSet(false, true);
            this.f176452o.release();
            this.f176452o = null;
        } else {
            com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "audio player call uninit failed cause audio track is null");
        }
        this.f176438a = false;
        return 1;
    }

    public int g() {
        android.media.AudioTrack audioTrack = this.f176452o;
        return audioTrack != null ? audioTrack.getStreamType() : h(true);
    }

    public final int h(boolean z17) {
        int i17;
        int i18;
        int i19;
        int i27;
        wo.c cVar = wo.v1.f447823c;
        if (cVar.f447591b > 0) {
            i17 = ym1.f.f463134h.g(z17);
        } else {
            i17 = cVar.D;
            if (i17 <= -1) {
                i17 = 0;
            }
        }
        if ((z17 && (i18 = cVar.E) > -1) || (!z17 && (i18 = cVar.F) > -1)) {
            i17 = i18;
        }
        if (1 != this.N) {
            return i17;
        }
        int i28 = cVar.f447632v0;
        if (i28 > -1) {
            i17 = i28;
        }
        return (!z17 || (i27 = cVar.f447634w0) <= -1) ? (z17 || (i19 = cVar.f447636x0) <= -1) ? i17 : i19 : i27;
    }

    public final void i() {
        wu5.b bVar = this.f176459v;
        if (bVar != null) {
            try {
                java.util.concurrent.TimeUnit timeUnit = java.util.concurrent.TimeUnit.SECONDS;
                java.util.concurrent.Future future = bVar.f449841d;
                if (future == null || future.isCancelled()) {
                    return;
                }
                bVar.f449841d.get(3L, timeUnit);
            } catch (java.util.concurrent.ExecutionException | java.util.concurrent.TimeoutException e17) {
                com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Voip.AudioPlayer", e17, "", new java.lang.Object[0]);
            }
        }
    }

    public boolean j(boolean z17) {
        int h17 = ym1.f.Ni() ? 0 : h(z17);
        android.media.AudioTrack audioTrack = this.f176452o;
        if (audioTrack != null && h17 == audioTrack.getStreamType()) {
            return false;
        }
        e();
        this.f176458u = true;
        if (this.f176449l == 2) {
            this.f176440c = 3;
        } else {
            this.f176440c = 2;
        }
        int minBufferSize = android.media.AudioTrack.getMinBufferSize(this.f176448k, this.f176440c, 2);
        this.f176441d = minBufferSize;
        if (minBufferSize == -2 || minBufferSize == -1) {
            this.f176458u = false;
            return false;
        }
        this.f176460w = 0;
        this.f176462y = 0;
        this.A = 1;
        this.B = 0;
        this.C = 0L;
        this.D = 1;
        this.F = -1;
        this.G = 0;
        this.f176463z = minBufferSize;
        this.E = minBufferSize * 1;
        this.f176441d = minBufferSize * this.H;
        if (this.f176452o != null) {
            try {
                this.f176453p.compareAndSet(false, true);
                this.f176459v.b();
                ((ku5.t0) ku5.t0.f312615d).A("AudioPlayer_play");
                this.f176452o.stop();
            } catch (java.lang.Exception e17) {
                com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone audioTrack.stop Exception:%s", e17.getMessage());
            }
            this.f176452o.release();
            this.f176452o = null;
        }
        com.tencent.mars.xlog.Log.i("MicroMsg.Voip.AudioPlayer", "AudioPlayer dkbt switchSpeakerPhone mode:%d issp:%b m:%d size %d,nSamplerate:%d", java.lang.Integer.valueOf(ym1.f.Bi()), java.lang.Boolean.valueOf(ym1.f.f463134h.k()), java.lang.Integer.valueOf(h17), java.lang.Integer.valueOf(this.f176441d), java.lang.Integer.valueOf(this.f176448k));
        to.e eVar = new to.e(h17, this.f176448k, this.f176440c, 2, this.f176441d, 1);
        this.f176452o = eVar;
        if (eVar.getState() == 0) {
            com.tencent.mars.xlog.Log.e("MicroMsg.Voip.AudioPlayer", "AudioPlayer switchSpeakerPhone STATE_UNINITIALIZED call AudioTrack.release() and return");
            this.f176453p.compareAndSet(false, true);
            this.f176452o.release();
            this.f176452o = null;
            return false;
        }
        if (this.f176452o == null) {
            this.f176458u = false;
            return false;
        }
        this.f176458u = false;
        d();
        return true;
    }
}
