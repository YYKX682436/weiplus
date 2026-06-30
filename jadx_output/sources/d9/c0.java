package d9;

/* loaded from: classes15.dex */
public final class c0 {

    /* renamed from: i, reason: collision with root package name */
    public int f227301i;

    /* renamed from: j, reason: collision with root package name */
    public int f227302j;

    /* renamed from: k, reason: collision with root package name */
    public int f227303k;

    /* renamed from: l, reason: collision with root package name */
    public int f227304l;

    /* renamed from: q, reason: collision with root package name */
    public com.google.android.exoplayer2.Format f227309q;

    /* renamed from: r, reason: collision with root package name */
    public int f227310r;

    /* renamed from: a, reason: collision with root package name */
    public int f227293a = 1000;

    /* renamed from: b, reason: collision with root package name */
    public int[] f227294b = new int[1000];

    /* renamed from: c, reason: collision with root package name */
    public long[] f227295c = new long[1000];

    /* renamed from: f, reason: collision with root package name */
    public long[] f227298f = new long[1000];

    /* renamed from: e, reason: collision with root package name */
    public int[] f227297e = new int[1000];

    /* renamed from: d, reason: collision with root package name */
    public int[] f227296d = new int[1000];

    /* renamed from: g, reason: collision with root package name */
    public q8.n[] f227299g = new q8.n[1000];

    /* renamed from: h, reason: collision with root package name */
    public com.google.android.exoplayer2.Format[] f227300h = new com.google.android.exoplayer2.Format[1000];

    /* renamed from: m, reason: collision with root package name */
    public long f227305m = Long.MIN_VALUE;

    /* renamed from: n, reason: collision with root package name */
    public long f227306n = Long.MIN_VALUE;

    /* renamed from: p, reason: collision with root package name */
    public boolean f227308p = true;

    /* renamed from: o, reason: collision with root package name */
    public boolean f227307o = true;

    public final long a(int i17) {
        this.f227305m = java.lang.Math.max(this.f227305m, d(i17));
        int i18 = this.f227301i - i17;
        this.f227301i = i18;
        this.f227302j += i17;
        int i19 = this.f227303k + i17;
        this.f227303k = i19;
        int i27 = this.f227293a;
        if (i19 >= i27) {
            this.f227303k = i19 - i27;
        }
        int i28 = this.f227304l - i17;
        this.f227304l = i28;
        if (i28 < 0) {
            this.f227304l = 0;
        }
        if (i18 != 0) {
            return this.f227295c[this.f227303k];
        }
        int i29 = this.f227303k;
        if (i29 != 0) {
            i27 = i29;
        }
        return this.f227295c[i27 - 1] + this.f227296d[r2];
    }

    public long b(int i17) {
        int i18 = this.f227302j;
        int i19 = this.f227301i;
        int i27 = (i18 + i19) - i17;
        t9.a.a(i27 >= 0 && i27 <= i19 - this.f227304l);
        int i28 = this.f227301i - i27;
        this.f227301i = i28;
        this.f227306n = java.lang.Math.max(this.f227305m, d(i28));
        int i29 = this.f227301i;
        if (i29 == 0) {
            return 0L;
        }
        return this.f227295c[e(i29 - 1)] + this.f227296d[r6];
    }

    public final int c(int i17, int i18, long j17, boolean z17) {
        int i19 = -1;
        for (int i27 = 0; i27 < i18 && this.f227298f[i17] <= j17; i27++) {
            if (!z17 || (this.f227297e[i17] & 1) != 0) {
                i19 = i27;
            }
            i17++;
            if (i17 == this.f227293a) {
                i17 = 0;
            }
        }
        return i19;
    }

    public final long d(int i17) {
        long j17 = Long.MIN_VALUE;
        if (i17 == 0) {
            return Long.MIN_VALUE;
        }
        int e17 = e(i17 - 1);
        for (int i18 = 0; i18 < i17; i18++) {
            j17 = java.lang.Math.max(j17, this.f227298f[e17]);
            if ((this.f227297e[e17] & 1) != 0) {
                break;
            }
            e17--;
            if (e17 == -1) {
                e17 = this.f227293a - 1;
            }
        }
        return j17;
    }

    public final int e(int i17) {
        int i18 = this.f227303k + i17;
        int i19 = this.f227293a;
        return i18 < i19 ? i18 : i18 - i19;
    }

    public synchronized boolean f() {
        return this.f227304l != this.f227301i;
    }
}
