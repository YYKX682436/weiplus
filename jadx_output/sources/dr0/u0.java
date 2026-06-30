package dr0;

/* loaded from: classes12.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public java.util.List f242558a;

    /* renamed from: b, reason: collision with root package name */
    public java.lang.Throwable f242559b;

    /* renamed from: c, reason: collision with root package name */
    public java.util.Map f242560c;

    public u0(java.util.List keys, java.lang.Throwable th6, java.util.Map extra, int i17, kotlin.jvm.internal.i iVar) {
        keys = (i17 & 1) != 0 ? kz5.p0.f313996d : keys;
        th6 = (i17 & 2) != 0 ? null : th6;
        extra = (i17 & 4) != 0 ? new java.util.LinkedHashMap() : extra;
        kotlin.jvm.internal.o.g(keys, "keys");
        kotlin.jvm.internal.o.g(extra, "extra");
        this.f242558a = keys;
        this.f242559b = th6;
        this.f242560c = extra;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dr0.u0)) {
            return false;
        }
        dr0.u0 u0Var = (dr0.u0) obj;
        return kotlin.jvm.internal.o.b(this.f242558a, u0Var.f242558a) && kotlin.jvm.internal.o.b(this.f242559b, u0Var.f242559b) && kotlin.jvm.internal.o.b(this.f242560c, u0Var.f242560c);
    }

    public int hashCode() {
        int hashCode = this.f242558a.hashCode() * 31;
        java.lang.Throwable th6 = this.f242559b;
        return ((hashCode + (th6 == null ? 0 : th6.hashCode())) * 31) + this.f242560c.hashCode();
    }

    public java.lang.String toString() {
        return "Args(keys=" + this.f242558a + ", stack=" + this.f242559b + ", extra=" + this.f242560c + ')';
    }
}
