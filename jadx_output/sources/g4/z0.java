package g4;

/* loaded from: classes5.dex */
public final class z0 {

    /* renamed from: d, reason: collision with root package name */
    public static final g4.z0 f268644d;

    /* renamed from: a, reason: collision with root package name */
    public final g4.y0 f268645a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.y0 f268646b;

    /* renamed from: c, reason: collision with root package name */
    public final g4.y0 f268647c;

    static {
        g4.x0 x0Var = g4.x0.f268605c;
        f268644d = new g4.z0(x0Var, x0Var, x0Var);
    }

    public z0(g4.y0 refresh, g4.y0 prepend, g4.y0 append) {
        kotlin.jvm.internal.o.g(refresh, "refresh");
        kotlin.jvm.internal.o.g(prepend, "prepend");
        kotlin.jvm.internal.o.g(append, "append");
        this.f268645a = refresh;
        this.f268646b = prepend;
        this.f268647c = append;
    }

    public static g4.z0 a(g4.z0 z0Var, g4.y0 refresh, g4.y0 prepend, g4.y0 append, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            refresh = z0Var.f268645a;
        }
        if ((i17 & 2) != 0) {
            prepend = z0Var.f268646b;
        }
        if ((i17 & 4) != 0) {
            append = z0Var.f268647c;
        }
        z0Var.getClass();
        kotlin.jvm.internal.o.g(refresh, "refresh");
        kotlin.jvm.internal.o.g(prepend, "prepend");
        kotlin.jvm.internal.o.g(append, "append");
        return new g4.z0(refresh, prepend, append);
    }

    public final g4.y0 b(g4.a1 loadType) {
        kotlin.jvm.internal.o.g(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return this.f268645a;
        }
        if (ordinal == 1) {
            return this.f268646b;
        }
        if (ordinal == 2) {
            return this.f268647c;
        }
        throw new jz5.j();
    }

    public final g4.z0 c(g4.a1 loadType, g4.y0 newState) {
        kotlin.jvm.internal.o.g(loadType, "loadType");
        kotlin.jvm.internal.o.g(newState, "newState");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            return a(this, newState, null, null, 6, null);
        }
        if (ordinal == 1) {
            return a(this, null, newState, null, 5, null);
        }
        if (ordinal == 2) {
            return a(this, null, null, newState, 3, null);
        }
        throw new jz5.j();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.z0)) {
            return false;
        }
        g4.z0 z0Var = (g4.z0) obj;
        return kotlin.jvm.internal.o.b(this.f268645a, z0Var.f268645a) && kotlin.jvm.internal.o.b(this.f268646b, z0Var.f268646b) && kotlin.jvm.internal.o.b(this.f268647c, z0Var.f268647c);
    }

    public int hashCode() {
        g4.y0 y0Var = this.f268645a;
        int hashCode = (y0Var != null ? y0Var.hashCode() : 0) * 31;
        g4.y0 y0Var2 = this.f268646b;
        int hashCode2 = (hashCode + (y0Var2 != null ? y0Var2.hashCode() : 0)) * 31;
        g4.y0 y0Var3 = this.f268647c;
        return hashCode2 + (y0Var3 != null ? y0Var3.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "LoadStates(refresh=" + this.f268645a + ", prepend=" + this.f268646b + ", append=" + this.f268647c + ")";
    }
}
