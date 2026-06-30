package rm5;

/* loaded from: classes10.dex */
public final class j {

    /* renamed from: v, reason: collision with root package name */
    public static final rm5.i f397498v = new rm5.i(null);

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f397499a;

    /* renamed from: b, reason: collision with root package name */
    public final int f397500b;

    /* renamed from: c, reason: collision with root package name */
    public long f397501c;

    /* renamed from: d, reason: collision with root package name */
    public long f397502d;

    /* renamed from: e, reason: collision with root package name */
    public long f397503e;

    /* renamed from: f, reason: collision with root package name */
    public long f397504f;

    /* renamed from: g, reason: collision with root package name */
    public long f397505g;

    /* renamed from: h, reason: collision with root package name */
    public float f397506h;

    /* renamed from: i, reason: collision with root package name */
    public float f397507i;

    /* renamed from: j, reason: collision with root package name */
    public long f397508j;

    /* renamed from: k, reason: collision with root package name */
    public int f397509k;

    /* renamed from: l, reason: collision with root package name */
    public int f397510l;

    /* renamed from: m, reason: collision with root package name */
    public int f397511m;

    /* renamed from: n, reason: collision with root package name */
    public android.graphics.Rect f397512n;

    /* renamed from: o, reason: collision with root package name */
    public android.graphics.Rect f397513o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f397514p;

    /* renamed from: q, reason: collision with root package name */
    public rm5.n f397515q;

    /* renamed from: r, reason: collision with root package name */
    public long f397516r;

    /* renamed from: s, reason: collision with root package name */
    public long f397517s;

    /* renamed from: t, reason: collision with root package name */
    public final boolean f397518t;

    /* renamed from: u, reason: collision with root package name */
    public com.tencent.tavkit.composition.TAVClip f397519u;

    public j(java.lang.String path, int i17) {
        android.graphics.Bitmap bitmap;
        jz5.f0 f0Var;
        kotlin.jvm.internal.o.g(path, "path");
        this.f397499a = path;
        this.f397500b = i17;
        this.f397506h = 1.0f;
        this.f397507i = 1.0f;
        this.f397512n = new android.graphics.Rect();
        this.f397513o = new android.graphics.Rect();
        this.f397514p = true;
        this.f397515q = new rm5.n(null, null, 0L, 7, null);
        this.f397518t = true;
        xm5.b.c("CompositionTrack", "create VCLogCompositionTrack path:" + path + ", type:" + i17 + ", id:" + this.f397501c, new java.lang.Object[0]);
        if (i17 == 1) {
            a();
            synchronized (rm5.l.f397520a) {
                bitmap = (android.graphics.Bitmap) rm5.l.f397523d.get(path);
            }
            if (bitmap != null) {
                this.f397509k = bitmap.getWidth();
                this.f397510l = bitmap.getHeight();
                xm5.b.c("CompositionTrack", "initImageClipInfo sourceWidth:" + this.f397509k + ", sourceHeight:" + this.f397510l, new java.lang.Object[0]);
            }
        } else if (i17 == 2 || i17 == 3) {
            rm5.p d17 = rm5.l.f397520a.d(path);
            if (d17 != null) {
                this.f397509k = d17.f397532a;
                this.f397510l = d17.f397533b;
                xm5.b.c("CompositionTrack", "initVideoClipInfo, sourceWidth:" + this.f397509k + ", sourceHeight:" + this.f397510l, new java.lang.Object[0]);
                f0Var = jz5.f0.f302826a;
            } else {
                f0Var = null;
            }
            if (f0Var == null) {
                xm5.b.c("CompositionTrack", "initVideoClipInfo failed", new java.lang.Object[0]);
            }
        }
        this.f397508j = a().getDuration().getTimeUs() / 1000;
        e(0L);
        d(this.f397508j);
        b(this.f397505g);
    }

    public final com.tencent.tavkit.composition.resource.TAVResource a() {
        return rm5.l.f397520a.c(this);
    }

    public final void b(long j17) {
        if (j17 >= 0) {
            this.f397503e = j17;
        }
    }

    public final void c(long j17) {
        if (j17 >= 0) {
            this.f397502d = j17;
        }
    }

    public final void d(long j17) {
        if (j17 >= 0) {
            this.f397505g = j17;
        }
    }

    public final void e(long j17) {
        if (j17 >= 0) {
            this.f397504f = j17;
        }
    }

    public final void f(float f17) {
        this.f397507i = f17;
        if (this.f397500b != 2 || this.f397518t) {
            com.tencent.tavkit.composition.TAVClip tAVClip = this.f397519u;
            com.tencent.tavkit.composition.model.TAVAudioConfiguration audioConfiguration = tAVClip != null ? tAVClip.getAudioConfiguration() : null;
            if (audioConfiguration == null) {
                return;
            }
            audioConfiguration.setVolume(f17);
        }
    }

    public final void g() {
        b(((float) this.f397502d) + (((float) (this.f397505g - this.f397504f)) / this.f397506h));
    }
}
