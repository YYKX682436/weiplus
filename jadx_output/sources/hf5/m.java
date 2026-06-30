package hf5;

/* loaded from: classes11.dex */
public final class m implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.r f281260a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f281261b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f281262c;

    public m(gf5.r rule, hf5.h matcher) {
        kotlin.jvm.internal.o.g(rule, "rule");
        kotlin.jvm.internal.o.g(matcher, "matcher");
        this.f281260a = rule;
        this.f281261b = matcher;
        this.f281262c = matcher.f281244b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f281262c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.m)) {
            return false;
        }
        hf5.m mVar = (hf5.m) obj;
        return kotlin.jvm.internal.o.b(this.f281260a, mVar.f281260a) && kotlin.jvm.internal.o.b(this.f281261b, mVar.f281261b);
    }

    public int hashCode() {
        return (this.f281260a.hashCode() * 31) + this.f281261b.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedLineMatchRule(rule=" + this.f281260a + ", matcher=" + this.f281261b + ')';
    }
}
