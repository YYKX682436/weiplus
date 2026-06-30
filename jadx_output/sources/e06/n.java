package e06;

/* loaded from: classes10.dex */
public final class n extends e06.l implements e06.h {

    /* renamed from: g, reason: collision with root package name */
    public static final e06.n f246224g = new e06.n(1, 0);

    public n(long j17, long j18) {
        super(j17, j18, 1L);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // e06.h
    public boolean e(java.lang.Comparable comparable) {
        long longValue = ((java.lang.Number) comparable).longValue();
        return this.f246217d <= longValue && longValue <= this.f246218e;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof e06.n) {
            if (!isEmpty() || !((e06.n) obj).isEmpty()) {
                e06.n nVar = (e06.n) obj;
                if (this.f246217d == nVar.f246217d) {
                    if (this.f246218e == nVar.f246218e) {
                    }
                }
            }
            return true;
        }
        return false;
    }

    @Override // e06.h
    public java.lang.Comparable g() {
        return java.lang.Long.valueOf(this.f246218e);
    }

    @Override // e06.h
    public java.lang.Comparable h() {
        return java.lang.Long.valueOf(this.f246217d);
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        long j17 = this.f246217d;
        long j18 = 31 * (j17 ^ (j17 >>> 32));
        long j19 = this.f246218e;
        return (int) (j18 + (j19 ^ (j19 >>> 32)));
    }

    @Override // e06.h
    public boolean isEmpty() {
        return this.f246217d > this.f246218e;
    }

    public java.lang.String toString() {
        return this.f246217d + ".." + this.f246218e;
    }
}
