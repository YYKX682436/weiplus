package y;

/* loaded from: classes5.dex */
public final class j1 {

    /* renamed from: a, reason: collision with root package name */
    public final float f458374a;

    /* renamed from: b, reason: collision with root package name */
    public final float f458375b;

    /* renamed from: c, reason: collision with root package name */
    public final long f458376c;

    public j1(float f17, float f18, long j17) {
        this.f458374a = f17;
        this.f458375b = f18;
        this.f458376c = j17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.j1)) {
            return false;
        }
        y.j1 j1Var = (y.j1) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f458374a), java.lang.Float.valueOf(j1Var.f458374a)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f458375b), java.lang.Float.valueOf(j1Var.f458375b)) && this.f458376c == j1Var.f458376c;
    }

    public int hashCode() {
        return (((java.lang.Float.hashCode(this.f458374a) * 31) + java.lang.Float.hashCode(this.f458375b)) * 31) + java.lang.Long.hashCode(this.f458376c);
    }

    public java.lang.String toString() {
        return "FlingInfo(initialVelocity=" + this.f458374a + ", distance=" + this.f458375b + ", duration=" + this.f458376c + ')';
    }
}
