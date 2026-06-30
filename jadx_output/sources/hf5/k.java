package hf5;

/* loaded from: classes11.dex */
public final class k implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.h f281250a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f281251b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f281252c;

    public k(gf5.h rule, hf5.h linePrefixMatcher) {
        kotlin.jvm.internal.o.g(rule, "rule");
        kotlin.jvm.internal.o.g(linePrefixMatcher, "linePrefixMatcher");
        this.f281250a = rule;
        this.f281251b = linePrefixMatcher;
        java.util.Set set = linePrefixMatcher.f281244b;
        this.f281252c = set.isEmpty() ^ true ? set : null;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f281252c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.k)) {
            return false;
        }
        hf5.k kVar = (hf5.k) obj;
        return kotlin.jvm.internal.o.b(this.f281250a, kVar.f281250a) && kotlin.jvm.internal.o.b(this.f281251b, kVar.f281251b);
    }

    public int hashCode() {
        return (this.f281250a.hashCode() * 31) + this.f281251b.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedKeyValueRule(rule=" + this.f281250a + ", linePrefixMatcher=" + this.f281251b + ')';
    }
}
