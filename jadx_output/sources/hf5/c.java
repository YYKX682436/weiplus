package hf5;

/* loaded from: classes5.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.n f281238a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.List f281239b;

    /* renamed from: c, reason: collision with root package name */
    public final int f281240c;

    public c(gf5.n nVar, java.util.List candidates, int i17) {
        kotlin.jvm.internal.o.g(candidates, "candidates");
        this.f281238a = nVar;
        this.f281239b = candidates;
        this.f281240c = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.c)) {
            return false;
        }
        hf5.c cVar = (hf5.c) obj;
        return kotlin.jvm.internal.o.b(this.f281238a, cVar.f281238a) && kotlin.jvm.internal.o.b(this.f281239b, cVar.f281239b) && this.f281240c == cVar.f281240c;
    }

    public int hashCode() {
        gf5.n nVar = this.f281238a;
        return ((((nVar == null ? 0 : nVar.hashCode()) * 31) + this.f281239b.hashCode()) * 31) + java.lang.Integer.hashCode(this.f281240c);
    }

    public java.lang.String toString() {
        return "LanguageDetectionResult(bestMatch=" + this.f281238a + ", candidates=" + this.f281239b + ", analyzedLength=" + this.f281240c + ')';
    }
}
