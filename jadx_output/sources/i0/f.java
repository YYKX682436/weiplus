package i0;

/* loaded from: classes14.dex */
public final class f implements i0.b {

    /* renamed from: a, reason: collision with root package name */
    public final float f286492a;

    public f(float f17) {
        this.f286492a = f17;
        if (f17 < 0.0f || f17 > 100.0f) {
            throw new java.lang.IllegalArgumentException("The percent should be in the range of [0, 100]");
        }
    }

    @Override // i0.b
    public float a(long j17, p2.f density) {
        kotlin.jvm.internal.o.g(density, "density");
        return d1.k.c(j17) * (this.f286492a / 100.0f);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof i0.f) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f286492a), java.lang.Float.valueOf(((i0.f) obj).f286492a));
    }

    public int hashCode() {
        return java.lang.Float.hashCode(this.f286492a);
    }

    public java.lang.String toString() {
        return "CornerSize(size = " + this.f286492a + "%)";
    }
}
