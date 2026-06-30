package g4;

/* loaded from: classes5.dex */
public final class f1 extends g4.l1 {

    /* renamed from: a, reason: collision with root package name */
    public final g4.a1 f268279a;

    /* renamed from: b, reason: collision with root package name */
    public final int f268280b;

    /* renamed from: c, reason: collision with root package name */
    public final int f268281c;

    /* renamed from: d, reason: collision with root package name */
    public final int f268282d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(g4.a1 loadType, int i17, int i18, int i19) {
        super(null);
        kotlin.jvm.internal.o.g(loadType, "loadType");
        this.f268279a = loadType;
        this.f268280b = i17;
        this.f268281c = i18;
        this.f268282d = i19;
        if (!(loadType != g4.a1.REFRESH)) {
            throw new java.lang.IllegalArgumentException("Drop load type must be PREPEND or APPEND".toString());
        }
        if (!(b() > 0)) {
            throw new java.lang.IllegalArgumentException(("Drop count must be > 0, but was " + b()).toString());
        }
        if (i19 >= 0) {
            return;
        }
        throw new java.lang.IllegalArgumentException(("Invalid placeholdersRemaining " + i19).toString());
    }

    public final int b() {
        return (this.f268281c - this.f268280b) + 1;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g4.f1)) {
            return false;
        }
        g4.f1 f1Var = (g4.f1) obj;
        return kotlin.jvm.internal.o.b(this.f268279a, f1Var.f268279a) && this.f268280b == f1Var.f268280b && this.f268281c == f1Var.f268281c && this.f268282d == f1Var.f268282d;
    }

    public int hashCode() {
        g4.a1 a1Var = this.f268279a;
        return ((((((a1Var != null ? a1Var.hashCode() : 0) * 31) + java.lang.Integer.hashCode(this.f268280b)) * 31) + java.lang.Integer.hashCode(this.f268281c)) * 31) + java.lang.Integer.hashCode(this.f268282d);
    }

    public java.lang.String toString() {
        return "Drop(loadType=" + this.f268279a + ", minPageOffset=" + this.f268280b + ", maxPageOffset=" + this.f268281c + ", placeholdersRemaining=" + this.f268282d + ")";
    }
}
