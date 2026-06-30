package s2;

/* loaded from: classes14.dex */
public final class g0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f402223a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f402224b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f402225c;

    /* renamed from: d, reason: collision with root package name */
    public final s2.h0 f402226d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f402227e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f402228f;

    public g0(boolean z17, boolean z18, boolean z19, s2.h0 securePolicy, boolean z27, boolean z28, int i17, kotlin.jvm.internal.i iVar) {
        z17 = (i17 & 1) != 0 ? false : z17;
        z18 = (i17 & 2) != 0 ? true : z18;
        z19 = (i17 & 4) != 0 ? true : z19;
        securePolicy = (i17 & 8) != 0 ? s2.h0.Inherit : securePolicy;
        z27 = (i17 & 16) != 0 ? true : z27;
        z28 = (i17 & 32) != 0 ? true : z28;
        kotlin.jvm.internal.o.g(securePolicy, "securePolicy");
        this.f402223a = z17;
        this.f402224b = z18;
        this.f402225c = z19;
        this.f402226d = securePolicy;
        this.f402227e = z27;
        this.f402228f = z28;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s2.g0)) {
            return false;
        }
        s2.g0 g0Var = (s2.g0) obj;
        return this.f402223a == g0Var.f402223a && this.f402224b == g0Var.f402224b && this.f402225c == g0Var.f402225c && this.f402226d == g0Var.f402226d && this.f402227e == g0Var.f402227e && this.f402228f == g0Var.f402228f;
    }

    public int hashCode() {
        boolean z17 = this.f402224b;
        return (((((((((((((java.lang.Boolean.hashCode(z17) * 31) + java.lang.Boolean.hashCode(this.f402223a)) * 31) + java.lang.Boolean.hashCode(z17)) * 31) + java.lang.Boolean.hashCode(this.f402225c)) * 31) + this.f402226d.hashCode()) * 31) + java.lang.Boolean.hashCode(this.f402227e)) * 31) + java.lang.Boolean.hashCode(this.f402228f)) * 31) + java.lang.Boolean.hashCode(false);
    }
}
