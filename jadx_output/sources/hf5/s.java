package hf5;

/* loaded from: classes11.dex */
public final class s implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.a0 f281274a;

    public s(gf5.a0 rule) {
        kotlin.jvm.internal.o.g(rule, "rule");
        this.f281274a = rule;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return null;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf5.s) && kotlin.jvm.internal.o.b(this.f281274a, ((hf5.s) obj).f281274a);
    }

    public int hashCode() {
        return this.f281274a.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedWordSetRule(rule=" + this.f281274a + ')';
    }
}
