package hf5;

/* loaded from: classes11.dex */
public final class q implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.w f281271a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f281272b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f281273c;

    public q(gf5.w rule, hf5.h matcher) {
        kotlin.jvm.internal.o.g(rule, "rule");
        kotlin.jvm.internal.o.g(matcher, "matcher");
        this.f281271a = rule;
        this.f281272b = matcher;
        this.f281273c = matcher.f281244b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f281273c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.q)) {
            return false;
        }
        hf5.q qVar = (hf5.q) obj;
        return kotlin.jvm.internal.o.b(this.f281271a, qVar.f281271a) && kotlin.jvm.internal.o.b(this.f281272b, qVar.f281272b);
    }

    public int hashCode() {
        return (this.f281271a.hashCode() * 31) + this.f281272b.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedPreprocessorRule(rule=" + this.f281271a + ", matcher=" + this.f281272b + ')';
    }
}
