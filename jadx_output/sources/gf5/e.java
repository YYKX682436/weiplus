package gf5;

/* loaded from: classes11.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.z f271388a;

    /* renamed from: b, reason: collision with root package name */
    public final double f271389b;

    public e(gf5.z tokenType, double d17) {
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        this.f271388a = tokenType;
        this.f271389b = d17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.e)) {
            return false;
        }
        gf5.e eVar = (gf5.e) obj;
        return this.f271388a == eVar.f271388a && java.lang.Double.compare(this.f271389b, eVar.f271389b) == 0;
    }

    public int hashCode() {
        return (this.f271388a.hashCode() * 31) + java.lang.Double.hashCode(this.f271389b);
    }

    public java.lang.String toString() {
        return "DetectionTokenWeightEntry(tokenType=" + this.f271388a + ", weight=" + this.f271389b + ')';
    }
}
