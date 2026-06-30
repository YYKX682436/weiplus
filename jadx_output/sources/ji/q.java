package ji;

/* loaded from: classes3.dex */
public final class q {

    /* renamed from: a, reason: collision with root package name */
    public int f299905a;

    /* renamed from: b, reason: collision with root package name */
    public long f299906b;

    /* renamed from: c, reason: collision with root package name */
    public final long f299907c;

    /* renamed from: d, reason: collision with root package name */
    public final int f299908d;

    /* renamed from: e, reason: collision with root package name */
    public final long f299909e;

    public q(long j17, int i17, long j18) {
        this.f299907c = j17;
        this.f299908d = i17;
        this.f299909e = j18;
    }

    public final boolean a(long j17, yz5.a cb6) {
        int i17;
        kotlin.jvm.internal.o.g(cb6, "cb");
        long currentTimeMillis = java.lang.System.currentTimeMillis();
        long j18 = currentTimeMillis - this.f299906b;
        this.f299906b = currentTimeMillis;
        boolean z17 = j17 > this.f299907c;
        int i18 = this.f299908d;
        long j19 = this.f299909e;
        if (z17 && j18 > j19 && (i17 = this.f299905a) < i18) {
            int i19 = i17 + 1;
            this.f299905a = i19;
            if (i19 == i18) {
                cb6.invoke();
                return !z17 && j18 > j19;
            }
        }
        if (!z17 && j18 > j19 && this.f299905a < i18) {
            this.f299905a = 0;
        }
        if (z17) {
        }
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ji.q)) {
            return false;
        }
        ji.q qVar = (ji.q) obj;
        return this.f299907c == qVar.f299907c && this.f299908d == qVar.f299908d && this.f299909e == qVar.f299909e;
    }

    public int hashCode() {
        long j17 = this.f299907c;
        int i17 = ((((int) (j17 ^ (j17 >>> 32))) * 31) + this.f299908d) * 31;
        long j18 = this.f299909e;
        return i17 + ((int) ((j18 >>> 32) ^ j18));
    }

    public java.lang.String toString() {
        return "{size = " + this.f299907c + ", checkTimes = " + this.f299908d + '}';
    }
}
