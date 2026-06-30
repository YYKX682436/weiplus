package cu2;

/* loaded from: classes2.dex */
public final class l0 {

    /* renamed from: a, reason: collision with root package name */
    public final long f222418a;

    /* renamed from: b, reason: collision with root package name */
    public final float f222419b;

    public l0(long j17, float f17) {
        this.f222418a = j17;
        this.f222419b = f17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cu2.l0)) {
            return false;
        }
        cu2.l0 l0Var = (cu2.l0) obj;
        return this.f222418a == l0Var.f222418a && java.lang.Float.compare(this.f222419b, l0Var.f222419b) == 0;
    }

    public int hashCode() {
        return (java.lang.Long.hashCode(this.f222418a) * 31) + java.lang.Float.hashCode(this.f222419b);
    }

    public java.lang.String toString() {
        return "MaxProgressData(feedId=" + this.f222418a + ", maxProgress=" + this.f222419b + ')';
    }
}
