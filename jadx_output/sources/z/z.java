package z;

/* loaded from: classes5.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public double f468880a;

    /* renamed from: b, reason: collision with root package name */
    public double f468881b;

    public z(double d17, double d18) {
        this.f468880a = d17;
        this.f468881b = d18;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z.z)) {
            return false;
        }
        z.z zVar = (z.z) obj;
        return kotlin.jvm.internal.o.b(java.lang.Double.valueOf(this.f468880a), java.lang.Double.valueOf(zVar.f468880a)) && kotlin.jvm.internal.o.b(java.lang.Double.valueOf(this.f468881b), java.lang.Double.valueOf(zVar.f468881b));
    }

    public int hashCode() {
        return (java.lang.Double.hashCode(this.f468880a) * 31) + java.lang.Double.hashCode(this.f468881b);
    }

    public java.lang.String toString() {
        return "ComplexDouble(_real=" + this.f468880a + ", _imaginary=" + this.f468881b + ')';
    }
}
