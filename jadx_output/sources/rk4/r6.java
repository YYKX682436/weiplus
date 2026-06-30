package rk4;

/* loaded from: classes4.dex */
public final class r6 {

    /* renamed from: a, reason: collision with root package name */
    public final pi0.l1 f396954a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f396955b;

    public r6(pi0.l1 instance, boolean z17) {
        kotlin.jvm.internal.o.g(instance, "instance");
        this.f396954a = instance;
        this.f396955b = z17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rk4.r6)) {
            return false;
        }
        rk4.r6 r6Var = (rk4.r6) obj;
        return kotlin.jvm.internal.o.b(this.f396954a, r6Var.f396954a) && this.f396955b == r6Var.f396955b;
    }

    public int hashCode() {
        return (this.f396954a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f396955b);
    }

    public java.lang.String toString() {
        return "CachedAppInfo(instance=" + this.f396954a + ", newCreated=" + this.f396955b + ')';
    }
}
