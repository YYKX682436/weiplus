package g4;

/* loaded from: classes5.dex */
public final class a0 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.y0 f268193a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.y0 f268194b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.y0 f268195c;

    /* renamed from: d, reason: collision with root package name */
    public final g4.z0 f268196d;

    /* renamed from: e, reason: collision with root package name */
    public final g4.z0 f268197e;

    static {
        g4.x0 x0Var = g4.x0.f268605c;
        g4.z0 z0Var = g4.z0.f268644d;
        new g4.a0(x0Var, x0Var, x0Var, g4.z0.f268644d, null, 16, null);
    }

    public a0(g4.y0 refresh, g4.y0 prepend, g4.y0 append, g4.z0 source, g4.z0 z0Var) {
        kotlin.jvm.internal.o.g(refresh, "refresh");
        kotlin.jvm.internal.o.g(prepend, "prepend");
        kotlin.jvm.internal.o.g(append, "append");
        kotlin.jvm.internal.o.g(source, "source");
        this.f268193a = refresh;
        this.f268194b = prepend;
        this.f268195c = append;
        this.f268196d = source;
        this.f268197e = z0Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!kotlin.jvm.internal.o.b(g4.a0.class, obj != null ? obj.getClass() : null)) {
            return false;
        }
        if (obj == null) {
            throw new java.lang.NullPointerException("null cannot be cast to non-null type androidx.paging.CombinedLoadStates");
        }
        g4.a0 a0Var = (g4.a0) obj;
        return ((kotlin.jvm.internal.o.b(this.f268193a, a0Var.f268193a) ^ true) || (kotlin.jvm.internal.o.b(this.f268194b, a0Var.f268194b) ^ true) || (kotlin.jvm.internal.o.b(this.f268195c, a0Var.f268195c) ^ true) || (kotlin.jvm.internal.o.b(this.f268196d, a0Var.f268196d) ^ true) || (kotlin.jvm.internal.o.b(this.f268197e, a0Var.f268197e) ^ true)) ? false : true;
    }

    public int hashCode() {
        int hashCode = ((((((this.f268193a.hashCode() * 31) + this.f268194b.hashCode()) * 31) + this.f268195c.hashCode()) * 31) + this.f268196d.hashCode()) * 31;
        g4.z0 z0Var = this.f268197e;
        return hashCode + (z0Var != null ? z0Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "CombinedLoadStates(refresh=" + this.f268193a + ", prepend=" + this.f268194b + ", append=" + this.f268195c + ", source=" + this.f268196d + ", mediator=" + this.f268197e + ')';
    }

    public /* synthetic */ a0(g4.y0 y0Var, g4.y0 y0Var2, g4.y0 y0Var3, g4.z0 z0Var, g4.z0 z0Var2, int i17, kotlin.jvm.internal.i iVar) {
        this(y0Var, y0Var2, y0Var3, z0Var, (i17 & 16) != 0 ? null : z0Var2);
    }
}
