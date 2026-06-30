package y;

/* loaded from: classes3.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f458303a;

    /* renamed from: b, reason: collision with root package name */
    public final float f458304b;

    public a(float f17, float f18) {
        this.f458303a = f17;
        this.f458304b = f18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof y.a)) {
            return false;
        }
        y.a aVar = (y.a) obj;
        return kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f458303a), java.lang.Float.valueOf(aVar.f458303a)) && kotlin.jvm.internal.o.b(java.lang.Float.valueOf(this.f458304b), java.lang.Float.valueOf(aVar.f458304b));
    }

    public int hashCode() {
        return (java.lang.Float.hashCode(this.f458303a) * 31) + java.lang.Float.hashCode(this.f458304b);
    }

    public java.lang.String toString() {
        return "FlingResult(distanceCoefficient=" + this.f458303a + ", velocityCoefficient=" + this.f458304b + ')';
    }
}
