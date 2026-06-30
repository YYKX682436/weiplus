package hf5;

/* loaded from: classes11.dex */
public final class p implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.v f281268a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f281269b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f281270c;

    public p(gf5.v rule, hf5.h matcher) {
        kotlin.jvm.internal.o.g(rule, "rule");
        kotlin.jvm.internal.o.g(matcher, "matcher");
        this.f281268a = rule;
        this.f281269b = matcher;
        this.f281270c = matcher.f281244b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f281270c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.p)) {
            return false;
        }
        hf5.p pVar = (hf5.p) obj;
        return kotlin.jvm.internal.o.b(this.f281268a, pVar.f281268a) && kotlin.jvm.internal.o.b(this.f281269b, pVar.f281269b);
    }

    public int hashCode() {
        return (this.f281268a.hashCode() * 31) + this.f281269b.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedPrefixedRule(rule=" + this.f281268a + ", matcher=" + this.f281269b + ')';
    }
}
