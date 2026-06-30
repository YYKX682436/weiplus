package z0;

/* loaded from: classes14.dex */
public final class g implements z0.d {

    /* renamed from: b, reason: collision with root package name */
    public final float f468906b;

    /* renamed from: c, reason: collision with root package name */
    public final float f468907c;

    public g(float f17, float f18) {
        this.f468906b = f17;
        this.f468907c = f18;
    }

    public long a(long j17, long j18, p2.s layoutDirection) {
        kotlin.jvm.internal.o.g(layoutDirection, "layoutDirection");
        float f17 = (((int) (j18 >> 32)) - ((int) (j17 >> 32))) / 2.0f;
        float b17 = (p2.q.b(j18) - p2.q.b(j17)) / 2.0f;
        p2.s sVar = p2.s.Ltr;
        float f18 = this.f468906b;
        if (layoutDirection != sVar) {
            f18 *= -1;
        }
        float f19 = 1;
        return p2.n.a(a06.d.b(f17 * (f18 + f19)), a06.d.b(b17 * (f19 + this.f468907c)));
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0.g)) {
            return false;
        }
        z0.g gVar = (z0.g) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f468906b), java.lang.Float.valueOf(gVar.f468906b)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f468907c), java.lang.Float.valueOf(gVar.f468907c));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f468906b) * 31) + java.lang.Float.hashCode(this.f468907c);
    }

    public java.lang.String toString() {
        return "BiasAlignment(horizontalBias=" + this.f468906b + ", verticalBias=" + this.f468907c + ')';
    }
}
