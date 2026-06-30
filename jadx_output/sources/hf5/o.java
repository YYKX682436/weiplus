package hf5;

/* loaded from: classes11.dex */
public final class o implements hf5.r {

    /* renamed from: a, reason: collision with root package name */
    public final gf5.u f281265a;

    /* renamed from: b, reason: collision with root package name */
    public final hf5.h f281266b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Set f281267c;

    public o(gf5.u rule, hf5.h matcher) {
        kotlin.jvm.internal.o.g(rule, "rule");
        kotlin.jvm.internal.o.g(matcher, "matcher");
        this.f281265a = rule;
        this.f281266b = matcher;
        this.f281267c = matcher.f281244b;
    }

    @Override // hf5.r
    public java.util.Set a() {
        return this.f281267c;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hf5.o)) {
            return false;
        }
        hf5.o oVar = (hf5.o) obj;
        return kotlin.jvm.internal.o.b(this.f281265a, oVar.f281265a) && kotlin.jvm.internal.o.b(this.f281266b, oVar.f281266b);
    }

    public int hashCode() {
        return (this.f281265a.hashCode() * 31) + this.f281266b.hashCode();
    }

    public java.lang.String toString() {
        return "PreparedOperatorRule(rule=" + this.f281265a + ", matcher=" + this.f281266b + ')';
    }
}
