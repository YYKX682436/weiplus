package gf5;

/* loaded from: classes11.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.z f271386a;

    /* renamed from: b, reason: collision with root package name */
    public final double f271387b;

    public d(gf5.z tokenType, double d17) {
        kotlin.jvm.internal.o.g(tokenType, "tokenType");
        this.f271386a = tokenType;
        this.f271387b = d17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.d)) {
            return false;
        }
        gf5.d dVar = (gf5.d) obj;
        return this.f271386a == dVar.f271386a && java.lang.Double.compare(this.f271387b, dVar.f271387b) == 0;
    }

    public int hashCode() {
        return (this.f271386a.hashCode() * 31) + java.lang.Double.hashCode(this.f271387b);
    }

    public java.lang.String toString() {
        return "DetectionTokenCountBonusEntry(tokenType=" + this.f271386a + ", weight=" + this.f271387b + ')';
    }
}
