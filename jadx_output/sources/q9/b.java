package q9;

/* loaded from: classes15.dex */
public class b extends q9.e {

    /* renamed from: g, reason: collision with root package name */
    public final r9.e f360840g;

    /* renamed from: h, reason: collision with root package name */
    public final int f360841h;

    /* renamed from: i, reason: collision with root package name */
    public final long f360842i;

    /* renamed from: j, reason: collision with root package name */
    public final long f360843j;

    /* renamed from: k, reason: collision with root package name */
    public final float f360844k;

    /* renamed from: l, reason: collision with root package name */
    public int f360845l;

    /* renamed from: m, reason: collision with root package name */
    public int f360846m;

    public b(d9.k0 k0Var, int[] iArr, r9.e eVar, int i17, long j17, long j18, long j19, float f17) {
        super(k0Var, iArr);
        this.f360840g = eVar;
        this.f360841h = i17;
        this.f360842i = j17 * 1000;
        this.f360843j = j18 * 1000;
        this.f360844k = f17;
        this.f360845l = g(Long.MIN_VALUE);
        this.f360846m = 1;
    }

    @Override // q9.m
    public void a(long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        int i17 = this.f360845l;
        int g17 = g(elapsedRealtime);
        this.f360845l = g17;
        if (g17 == i17) {
            return;
        }
        if (!f(i17, elapsedRealtime)) {
            com.google.android.exoplayer2.Format[] formatArr = this.f360850d;
            com.google.android.exoplayer2.Format format = formatArr[i17];
            int i18 = formatArr[this.f360845l].f44076e;
            int i19 = format.f44076e;
            if (i18 > i19 && j17 < this.f360842i) {
                this.f360845l = i17;
            } else if (i18 < i19 && j17 >= this.f360843j) {
                this.f360845l = i17;
            }
        }
        if (this.f360845l != i17) {
            this.f360846m = 3;
        }
    }

    @Override // q9.m
    public java.lang.Object b() {
        return null;
    }

    @Override // q9.m
    public int c() {
        return this.f360846m;
    }

    public final int g(long j17) {
        long j18 = this.f360840g.c() == -1 ? this.f360841h : ((float) r0) * this.f360844k;
        int i17 = 0;
        for (int i18 = 0; i18 < this.f360848b; i18++) {
            if (j17 == Long.MIN_VALUE || !f(i18, j17)) {
                if (this.f360850d[i18].f44076e <= j18) {
                    return i18;
                }
                i17 = i18;
            }
        }
        return i17;
    }

    @Override // q9.m
    public int getSelectedIndex() {
        return this.f360845l;
    }
}
