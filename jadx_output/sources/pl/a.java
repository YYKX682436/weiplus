package pl;

/* loaded from: classes13.dex */
public abstract class a {

    /* renamed from: m, reason: collision with root package name */
    public static volatile java.util.concurrent.atomic.AtomicInteger f356552m = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: n, reason: collision with root package name */
    public static volatile java.util.concurrent.atomic.AtomicInteger f356553n = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: o, reason: collision with root package name */
    public static volatile java.util.concurrent.atomic.AtomicInteger f356554o = new java.util.concurrent.atomic.AtomicInteger(0);

    /* renamed from: a, reason: collision with root package name */
    public volatile android.media.AudioTrack f356555a;

    /* renamed from: b, reason: collision with root package name */
    public byte[] f356556b;

    /* renamed from: e, reason: collision with root package name */
    public final int f356559e;

    /* renamed from: f, reason: collision with root package name */
    public final int f356560f;

    /* renamed from: h, reason: collision with root package name */
    public hl.d f356562h;

    /* renamed from: i, reason: collision with root package name */
    public ol.j f356563i;

    /* renamed from: c, reason: collision with root package name */
    public int f356557c = 0;

    /* renamed from: d, reason: collision with root package name */
    public int f356558d = 0;

    /* renamed from: g, reason: collision with root package name */
    public double f356561g = 0.0d;

    /* renamed from: j, reason: collision with root package name */
    public int f356564j = 0;

    /* renamed from: k, reason: collision with root package name */
    public long f356565k = -1;

    /* renamed from: l, reason: collision with root package name */
    public float f356566l = 1.0f;

    public a(int i17, int i18, hl.d dVar, ol.j jVar) {
        this.f356559e = 0;
        this.f356560f = 0;
        this.f356559e = i17;
        this.f356560f = i18;
        this.f356562h = dVar;
        this.f356563i = jVar;
    }

    public long a() {
        long j17 = -1;
        try {
            if (this.f356555a == null || this.f356555a.getState() == 0) {
                j17 = this.f356565k;
            } else {
                j17 = java.lang.Math.round((this.f356555a.getPlaybackHeadPosition() / this.f356555a.getSampleRate()) * 1000.0d);
                this.f356565k = j17;
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e17, "getCurrentPosition", new java.lang.Object[0]);
        }
        return j17;
    }

    public void b() {
    }

    public abstract void c(byte[] bArr);

    public abstract void d();

    public void e() {
        try {
            if (this.f356555a != null) {
                f356554o.decrementAndGet();
            }
            if (this.f356555a != null && this.f356555a.getState() != 0) {
                this.f356555a.stop();
                this.f356555a.flush();
            }
            if (this.f356555a != null) {
                this.f356555a.release();
                this.f356555a = null;
            }
        } catch (java.lang.Exception e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e17, "releaseAudioTrack", new java.lang.Object[0]);
        }
    }

    public void f() {
        this.f356557c = 0;
        this.f356558d = 0;
        byte[] bArr = this.f356556b;
        if (bArr != null) {
            java.util.Arrays.fill(bArr, 0, bArr.length, (byte) 0);
        }
    }

    public void g() {
    }

    public void h(double d17) {
        java.lang.Object[] objArr = {java.lang.Double.valueOf(d17)};
        int i17 = rl.b.f397143a;
        com.tencent.mars.xlog.Log.i("MicroMsg.Mix.AudioPcmBasePlayComponent", "setPlaybackRate:%f", objArr);
        try {
            if (this.f356555a != null) {
                if (this.f356555a.getState() == 1 || this.f356555a.getState() == 2) {
                    android.media.PlaybackParams playbackParams = this.f356555a.getPlaybackParams();
                    playbackParams.setSpeed((float) d17);
                    this.f356555a.setPlaybackParams(playbackParams);
                }
            }
        } catch (java.lang.IllegalStateException e17) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e17, "setPlaybackRate", new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e18, "setPlaybackRate", new java.lang.Object[0]);
        }
    }

    public void i(float f17, float f18) {
        try {
            if (this.f356555a != null && (this.f356555a.getState() == 1 || this.f356555a.getState() == 2)) {
                this.f356555a.setStereoVolume(f17, f18);
            }
        } catch (java.lang.IllegalStateException e17) {
            int i17 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e17, be1.x0.NAME, new java.lang.Object[0]);
        } catch (java.lang.Exception e18) {
            int i18 = rl.b.f397143a;
            com.tencent.mars.xlog.Log.printErrStackTrace("MicroMsg.Mix.AudioPcmBasePlayComponent", e18, be1.x0.NAME, new java.lang.Object[0]);
        }
        this.f356566l = f17;
    }
}
