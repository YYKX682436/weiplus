package hf5;

/* loaded from: classes11.dex */
public final class n implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.s f281263a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f281264b;

    public n(gf5.s rule) {
        kotlin.jvm.internal.o.g(rule, "rule");
        this.f281263a = rule;
        this.f281264b = kz5.o1.c(java.lang.Character.valueOf(r26.p0.A0(rule.f271443a)));
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f281264b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf5.n) && kotlin.jvm.internal.o.b(this.f281263a, ((hf5.n) obj).f281263a);
    }

    public int hashCode() {
        return this.f281263a.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedMarkupRule(rule=" + this.f281263a + ')';
    }
}
