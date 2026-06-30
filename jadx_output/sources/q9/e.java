package q9;

/* loaded from: classes15.dex */
public abstract class e implements q9.m {

    /* renamed from: a, reason: collision with root package name */
    public final d9.k0 f360847a;

    /* renamed from: b, reason: collision with root package name */
    public final int f360848b;

    /* renamed from: c, reason: collision with root package name */
    public final int[] f360849c;

    /* renamed from: d, reason: collision with root package name */
    public final com.google.android.exoplayer2.Format[] f360850d;

    /* renamed from: e, reason: collision with root package name */
    public final long[] f360851e;

    /* renamed from: f, reason: collision with root package name */
    public int f360852f;

    public e(d9.k0 k0Var, int... iArr) {
        int i17 = 0;
        t9.a.d(iArr.length > 0);
        k0Var.getClass();
        this.f360847a = k0Var;
        int length = iArr.length;
        this.f360848b = length;
        this.f360850d = new com.google.android.exoplayer2.Format[length];
        for (int i18 = 0; i18 < iArr.length; i18++) {
            this.f360850d[i18] = k0Var.f227371b[iArr[i18]];
        }
        java.util.Arrays.sort(this.f360850d, new q9.d(null));
        this.f360849c = new int[this.f360848b];
        while (true) {
            int i19 = this.f360848b;
            if (i17 >= i19) {
                this.f360851e = new long[i19];
                return;
            } else {
                this.f360849c[i17] = k0Var.a(this.f360850d[i17]);
                i17++;
            }
        }
    }

    public final boolean d(int i17, long j17) {
        long elapsedRealtime = android.os.SystemClock.elapsedRealtime();
        boolean f17 = f(i17, elapsedRealtime);
        int i18 = 0;
        while (i18 < this.f360848b && !f17) {
            f17 = (i18 == i17 || f(i18, elapsedRealtime)) ? false : true;
            i18++;
        }
        if (!f17) {
            return false;
        }
        long[] jArr = this.f360851e;
        jArr[i17] = java.lang.Math.max(jArr[i17], elapsedRealtime + j17);
        return true;
    }

    public final int e(int i17) {
        for (int i18 = 0; i18 < this.f360848b; i18++) {
            if (this.f360849c[i18] == i17) {
                return i18;
            }
        }
        return -1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        q9.e eVar = (q9.e) obj;
        return this.f360847a == eVar.f360847a && java.util.Arrays.equals(this.f360849c, eVar.f360849c);
    }

    public final boolean f(int i17, long j17) {
        return this.f360851e[i17] > j17;
    }

    public int hashCode() {
        if (this.f360852f == 0) {
            this.f360852f = (java.lang.System.identityHashCode(this.f360847a) * 31) + java.util.Arrays.hashCode(this.f360849c);
        }
        return this.f360852f;
    }
}
