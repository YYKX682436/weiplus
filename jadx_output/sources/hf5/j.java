package hf5;

/* loaded from: classes11.dex */
public final class j implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.f f281247a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f281248b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f281249c;

    public j(gf5.f rule, hf5.h matcher) {
        kotlin.jvm.internal.o.g(rule, "rule");
        kotlin.jvm.internal.o.g(matcher, "matcher");
        this.f281247a = rule;
        this.f281248b = matcher;
        this.f281249c = matcher.f281244b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f281249c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.j)) {
            return false;
        }
        hf5.j jVar = (hf5.j) obj;
        return kotlin.jvm.internal.o.b(this.f281247a, jVar.f281247a) && kotlin.jvm.internal.o.b(this.f281248b, jVar.f281248b);
    }

    public int hashCode() {
        return (this.f281247a.hashCode() * 31) + this.f281248b.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedDiffLineRule(rule=" + this.f281247a + ", matcher=" + this.f281248b + ')';
    }
}
