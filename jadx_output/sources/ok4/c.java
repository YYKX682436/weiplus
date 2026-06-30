package ok4;

/* loaded from: classes4.dex */
public final class c implements ok4.d, ok4.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f345977a;

    /* renamed from: b, reason: collision with root package name */
    public long f345978b;

    /* renamed from: c, reason: collision with root package name */
    public long f345979c;

    /* renamed from: d, reason: collision with root package name */
    public long f345980d;

    /* renamed from: e, reason: collision with root package name */
    public int f345981e;

    /* renamed from: f, reason: collision with root package name */
    public long f345982f;

    /* renamed from: g, reason: collision with root package name */
    public long f345983g;

    /* renamed from: h, reason: collision with root package name */
    public long f345984h;

    /* renamed from: i, reason: collision with root package name */
    public int f345985i;

    /* renamed from: j, reason: collision with root package name */
    public long f345986j;

    /* renamed from: k, reason: collision with root package name */
    public long f345987k;

    /* renamed from: l, reason: collision with root package name */
    public long f345988l;

    /* renamed from: m, reason: collision with root package name */
    public int f345989m;

    /* renamed from: n, reason: collision with root package name */
    public int f345990n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f345991o;

    public c(long j17) {
        this.f345977a = j17;
    }

    @Override // ok4.d
    public void a(int i17) {
        this.f345990n = java.lang.Math.max(this.f345990n, i17);
    }

    @Override // ok4.a
    public void b() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f345988l = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void c() {
    }

    @Override // ok4.a
    public void d(long j17) {
    }

    @Override // ok4.d
    public void e() {
        if (this.f345991o) {
            return;
        }
        this.f345985i++;
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f345982f = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void f(long j17, long j18) {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f345987k = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.d
    public void g(int i17, int i18) {
        com.tencent.mars.xlog.Log.i("MicroMsg.CdnPlayerReporter", "seek to " + i18);
        if (i18 != 0) {
            if (i18 < i17) {
                this.f345989m |= 2;
            } else if (i18 > i17) {
                this.f345989m |= 1;
            }
        }
        com.tencent.mm.plugin.report.service.g0.INSTANCE.idkeyStat(354L, 4L, 1L, false);
    }

    @Override // ok4.d
    public void h() {
        if (this.f345991o) {
            return;
        }
        long j17 = this.f345982f;
        if (j17 > 0) {
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f345983g = java.lang.System.currentTimeMillis() - j17;
            this.f345982f = 0L;
        }
    }

    @Override // ok4.a
    public void i() {
    }

    @Override // ok4.a
    public void j() {
    }

    @Override // ok4.a
    public void k() {
    }

    @Override // ok4.d
    public void l(boolean z17, java.lang.String str) {
    }

    @Override // ok4.a
    public void m() {
    }

    @Override // ok4.a
    public void n(int i17) {
    }

    @Override // ok4.a
    public void o() {
    }

    @Override // ok4.d
    public void onCompleted() {
        long j17 = this.f345979c;
        if (j17 > 0) {
            long j18 = this.f345980d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f345980d = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f345979c = 0L;
        }
        this.f345991o = true;
    }

    @Override // ok4.d
    public void onError(int i17, int i18) {
        this.f345981e = i17;
        long j17 = this.f345979c;
        if (j17 > 0) {
            long j18 = this.f345980d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f345980d = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f345979c = 0L;
        }
    }

    @Override // ok4.d
    public void onPause() {
        long j17 = this.f345979c;
        if (j17 > 0) {
            long j18 = this.f345980d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f345980d = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f345979c = 0L;
        }
    }

    @Override // ok4.d
    public void onStart() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        this.f345979c = currentTimeMillis;
        if (this.f345978b == 0) {
            this.f345978b = currentTimeMillis;
        }
    }

    @Override // ok4.d
    public void onStop() {
        long j17 = this.f345979c;
        if (j17 > 0) {
            long j18 = this.f345980d;
            boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
            this.f345980d = j18 + (java.lang.System.currentTimeMillis() - j17);
            this.f345979c = 0L;
        }
        boolean z18 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f345984h = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.a
    public void p() {
    }

    @Override // ok4.d
    public void q() {
    }

    @Override // ok4.a
    public void r() {
    }

    @Override // ok4.d
    public void s() {
        boolean z17 = com.tencent.mm.sdk.platformtools.t8.f192989a;
        this.f345986j = java.lang.System.currentTimeMillis();
    }

    @Override // ok4.d
    public void t(int i17, long j17, long j18) {
    }

    @Override // ok4.a
    public void u() {
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0093  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final ok4.b v() {
        /*
            Method dump skipped, instructions count: 197
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: ok4.c.v():ok4.b");
    }

    @Override // ok4.a
    public void w(long j17) {
    }
}
