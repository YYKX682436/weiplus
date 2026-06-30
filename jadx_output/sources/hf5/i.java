package hf5;

/* loaded from: classes11.dex */
public final class i implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.a f281245a;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Set f281246b;

    public i(gf5.a rule) {
        kotlin.jvm.internal.o.g(rule, "rule");
        this.f281245a = rule;
        this.f281246b = kz5.o1.c(java.lang.Character.valueOf(r26.p0.A0(rule.f271366a)));
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f281246b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hf5.i) && kotlin.jvm.internal.o.b(this.f281245a, ((hf5.i) obj).f281245a);
    }

    public int hashCode() {
        return this.f281245a.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedDelimitedRule(rule=" + this.f281245a + ')';
    }
}
