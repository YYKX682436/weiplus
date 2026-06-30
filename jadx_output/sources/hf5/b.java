package hf5;

/* loaded from: classes5.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.n f281234a;

    /* renamed from: b, reason: collision with root package name */
    public final double f281235b;

    /* renamed from: c, reason: collision with root package name */
    public final double f281236c;

    /* renamed from: d, reason: collision with root package name */
    public final int f281237d;

    public b(gf5.n language, double d17, double d18, int i17) {
        kotlin.jvm.internal.o.g(language, "language");
        this.f281234a = language;
        this.f281235b = d17;
        this.f281236c = d18;
        this.f281237d = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.b)) {
            return false;
        }
        hf5.b bVar = (hf5.b) obj;
        return kotlin.jvm.internal.o.b(this.f281234a, bVar.f281234a) && java.lang.Double.compare(this.f281235b, bVar.f281235b) == 0 && java.lang.Double.compare(this.f281236c, bVar.f281236c) == 0 && this.f281237d == bVar.f281237d;
    }

    public int hashCode() {
        return (((((this.f281234a.hashCode() * 31) + java.lang.Double.hashCode(this.f281235b)) * 31) + java.lang.Double.hashCode(this.f281236c)) * 31) + java.lang.Integer.hashCode(this.f281237d);
    }

    public java.lang.String toString() {
        return "LanguageDetectionCandidate(language=" + this.f281234a + ", score=" + this.f281235b + ", coverageRatio=" + this.f281236c + ", spanCount=" + this.f281237d + ')';
    }
}
