package p1;

/* loaded from: classes14.dex */
public final class r {

    /* renamed from: a, reason: collision with root package name */
    public final long f350874a;

    public static final boolean a(long j17, long j18) {
        return j17 == j18;
    }

    public static java.lang.String b(long j17) {
        return "PointerId(value=" + j17 + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof p1.r) {
            return this.f350874a == ((p1.r) obj).f350874a;
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Long.hashCode(this.f350874a);
    }

    public java.lang.String toString() {
        return b(this.f350874a);
    }
}
