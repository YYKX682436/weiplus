package sq4;

/* loaded from: classes14.dex */
public final class b {

    /* renamed from: b, reason: collision with root package name */
    public int f411374b;

    /* renamed from: c, reason: collision with root package name */
    public long f411375c;

    /* renamed from: d, reason: collision with root package name */
    public long f411376d;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.String f411379g;

    /* renamed from: h, reason: collision with root package name */
    public long f411380h;

    /* renamed from: i, reason: collision with root package name */
    public long f411381i;

    /* renamed from: j, reason: collision with root package name */
    public java.lang.String f411382j;

    /* renamed from: a, reason: collision with root package name */
    public java.lang.String f411373a = "";

    /* renamed from: e, reason: collision with root package name */
    public java.lang.String f411377e = "";

    /* renamed from: f, reason: collision with root package name */
    public java.lang.String f411378f = "";

    /* renamed from: k, reason: collision with root package name */
    public boolean f411383k = true;

    public final sq4.b a() {
        if (this.f411383k) {
            this.f411374b++;
            this.f411383k = false;
            long j17 = this.f411380h;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            e(java.lang.System.currentTimeMillis() - j17);
            this.f411376d += java.lang.System.currentTimeMillis() - this.f411380h;
        }
        return this;
    }

    public final sq4.b b() {
        this.f411374b++;
        long j17 = this.f411380h;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        e(java.lang.System.currentTimeMillis() - j17);
        this.f411376d += java.lang.System.currentTimeMillis() - this.f411380h;
        return this;
    }

    public final sq4.c c() {
        return new sq4.c(this.f411373a, this.f411374b, this.f411375c, this.f411376d, this.f411377e, this.f411378f, this.f411379g);
    }

    public final sq4.b d(long j17) {
        this.f411377e += '_' + j17;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f411380h = java.lang.System.currentTimeMillis();
        return this;
    }

    public final sq4.b e(long j17) {
        this.f411378f += '_' + j17;
        this.f411381i = j17;
        this.f411375c = java.lang.Math.max(j17, this.f411375c);
        return this;
    }

    public final sq4.b f(java.lang.String side) {
        kotlin.jvm.internal.o.g(side, "side");
        this.f411373a = side;
        return this;
    }

    public final sq4.b g(java.lang.String tag) {
        kotlin.jvm.internal.o.g(tag, "tag");
        this.f411379g = tag;
        return this;
    }
}
