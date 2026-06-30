package em2;

/* loaded from: classes3.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public long f255177a;

    /* renamed from: b, reason: collision with root package name */
    public int f255178b;

    /* renamed from: c, reason: collision with root package name */
    public int f255179c = 1;

    /* renamed from: d, reason: collision with root package name */
    public android.graphics.Point f255180d;

    /* renamed from: e, reason: collision with root package name */
    public long f255181e;

    /* renamed from: f, reason: collision with root package name */
    public long f255182f;

    /* renamed from: g, reason: collision with root package name */
    public long f255183g;

    public final void a(boolean z17) {
        if (zl2.r4.f473950a.w1()) {
            return;
        }
        c(z17);
        this.f255177a = 0L;
        this.f255181e = 0L;
        com.tencent.mars.xlog.Log.i("Finder.FinderLiveMiniWindowReporter", "exit clickCloseBtn:" + z17);
    }

    public final void b() {
        int i17;
        int i18 = 1;
        boolean z17 = this.f255178b == 0;
        android.graphics.Point point = this.f255180d;
        if (point != null) {
            int i19 = point.x;
            int i27 = point.y;
            if (i19 != i27) {
                i17 = i19 > i27 ? 2 : 3;
            }
            i18 = i17;
        }
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Nj(z17, 1, 0L, i18, this.f255179c, 0L);
    }

    public final void c(boolean z17) {
        if (this.f255177a <= 0) {
            com.tencent.mars.xlog.Log.i("Finder.FinderLiveMiniWindowReporter", "reportExit but lastEnterTime <= 0, lastEnterTime:" + this.f255177a);
            return;
        }
        int i17 = 1;
        boolean z18 = this.f255178b == 0;
        long c17 = c01.id.c() - this.f255177a;
        android.graphics.Point point = this.f255180d;
        if (point != null) {
            int i18 = point.x;
            int i19 = point.y;
            if (i18 == i19) {
                i17 = 3;
            } else if (i18 > i19) {
                i17 = 2;
            }
        }
        if (this.f255183g > 0) {
            this.f255182f += c01.id.c() - this.f255183g;
            this.f255183g = c01.id.c();
        }
        long j17 = c17 - this.f255182f;
        ((ml2.r0) i95.n0.c(ml2.r0.class)).Nj(z18, 2, c17, i17, this.f255179c, j17);
        if (z17) {
            ((ml2.r0) i95.n0.c(ml2.r0.class)).Nj(z18, 3, c17, i17, this.f255179c, j17);
        }
    }
}
