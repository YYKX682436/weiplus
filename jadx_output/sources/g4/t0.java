package g4;

/* loaded from: classes5.dex */
public final class t0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f268562a;

    /* renamed from: b, reason: collision with root package name */
    public final g4.b5 f268563b;

    public t0(int i17, g4.b5 hint) {
        kotlin.jvm.internal.o.g(hint, "hint");
        this.f268562a = i17;
        this.f268563b = hint;
    }

    public final int a(g4.a1 loadType) {
        kotlin.jvm.internal.o.g(loadType, "loadType");
        int ordinal = loadType.ordinal();
        if (ordinal == 0) {
            throw new java.lang.IllegalArgumentException("Cannot get presentedItems for loadType: REFRESH");
        }
        g4.b5 b5Var = this.f268563b;
        if (ordinal == 1) {
            return b5Var.f268215a;
        }
        if (ordinal == 2) {
            return b5Var.f268216b;
        }
        throw new jz5.j();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.t0)) {
            return false;
        }
        g4.t0 t0Var = (g4.t0) obj;
        return this.f268562a == t0Var.f268562a && kotlin.jvm.internal.o.b(this.f268563b, t0Var.f268563b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f268562a) * 31;
        g4.b5 b5Var = this.f268563b;
        return hashCode + (b5Var != null ? b5Var.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "GenerationalViewportHint(generationId=" + this.f268562a + ", hint=" + this.f268563b + ")";
    }
}
