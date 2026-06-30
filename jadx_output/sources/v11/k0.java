package v11;

/* loaded from: classes11.dex */
public final class k0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f432428a;

    /* renamed from: b, reason: collision with root package name */
    public final int f432429b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f432430c;

    /* renamed from: d, reason: collision with root package name */
    public final v11.l0 f432431d;

    /* renamed from: e, reason: collision with root package name */
    public final java.util.List f432432e;

    /* renamed from: f, reason: collision with root package name */
    public final v11.s f432433f;

    public k0(int i17, int i18, boolean z17, v11.l0 alignment, java.util.List runs, v11.s sVar) {
        kotlin.jvm.internal.o.g(alignment, "alignment");
        kotlin.jvm.internal.o.g(runs, "runs");
        this.f432428a = i17;
        this.f432429b = i18;
        this.f432430c = z17;
        this.f432431d = alignment;
        this.f432432e = runs;
        this.f432433f = sVar;
    }

    public static v11.k0 a(v11.k0 k0Var, int i17, int i18, boolean z17, v11.l0 l0Var, java.util.List list, v11.s sVar, int i19, java.lang.Object obj) {
        if ((i19 & 1) != 0) {
            i17 = k0Var.f432428a;
        }
        if ((i19 & 2) != 0) {
            i18 = k0Var.f432429b;
        }
        int i27 = i18;
        if ((i19 & 4) != 0) {
            z17 = k0Var.f432430c;
        }
        boolean z18 = z17;
        if ((i19 & 8) != 0) {
            l0Var = k0Var.f432431d;
        }
        v11.l0 alignment = l0Var;
        if ((i19 & 16) != 0) {
            list = k0Var.f432432e;
        }
        java.util.List runs = list;
        if ((i19 & 32) != 0) {
            sVar = k0Var.f432433f;
        }
        k0Var.getClass();
        kotlin.jvm.internal.o.g(alignment, "alignment");
        kotlin.jvm.internal.o.g(runs, "runs");
        return new v11.k0(i17, i27, z18, alignment, runs, sVar);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v11.k0)) {
            return false;
        }
        v11.k0 k0Var = (v11.k0) obj;
        return this.f432428a == k0Var.f432428a && this.f432429b == k0Var.f432429b && this.f432430c == k0Var.f432430c && this.f432431d == k0Var.f432431d && kotlin.jvm.internal.o.b(this.f432432e, k0Var.f432432e) && kotlin.jvm.internal.o.b(this.f432433f, k0Var.f432433f);
    }

    public int hashCode() {
        int hashCode = ((((((((java.lang.Integer.hashCode(this.f432428a) * 31) + java.lang.Integer.hashCode(this.f432429b)) * 31) + java.lang.Boolean.hashCode(this.f432430c)) * 31) + this.f432431d.hashCode()) * 31) + this.f432432e.hashCode()) * 31;
        v11.s sVar = this.f432433f;
        return hashCode + (sVar == null ? 0 : sVar.hashCode());
    }

    public java.lang.String toString() {
        return "TableCellUiModel(row=" + this.f432428a + ", column=" + this.f432429b + ", isHeader=" + this.f432430c + ", alignment=" + this.f432431d + ", runs=" + this.f432432e + ", sourceRange=" + this.f432433f + ')';
    }
}
