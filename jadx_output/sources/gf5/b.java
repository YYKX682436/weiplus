package gf5;

/* loaded from: classes11.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.c f271376a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f271377b;

    /* renamed from: c, reason: collision with root package name */
    public final double f271378c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f271379d;

    public b(gf5.c mode, java.util.List patterns, double d17, boolean z17) {
        kotlin.jvm.internal.o.g(mode, "mode");
        kotlin.jvm.internal.o.g(patterns, "patterns");
        this.f271376a = mode;
        this.f271377b = patterns;
        this.f271378c = d17;
        this.f271379d = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gf5.b)) {
            return false;
        }
        gf5.b bVar = (gf5.b) obj;
        return this.f271376a == bVar.f271376a && kotlin.jvm.internal.o.b(this.f271377b, bVar.f271377b) && java.lang.Double.compare(this.f271378c, bVar.f271378c) == 0 && this.f271379d == bVar.f271379d;
    }

    public int hashCode() {
        return (((((this.f271376a.hashCode() * 31) + this.f271377b.hashCode()) * 31) + java.lang.Double.hashCode(this.f271378c)) * 31) + java.lang.Boolean.hashCode(this.f271379d);
    }

    public java.lang.String toString() {
        return "DetectionTextPatternBonusEntry(mode=" + this.f271376a + ", patterns=" + this.f271377b + ", weight=" + this.f271378c + ", ignoreCase=" + this.f271379d + ')';
    }
}
