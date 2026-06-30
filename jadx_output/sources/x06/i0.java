package x06;

/* loaded from: classes16.dex */
public final class i0 {

    /* renamed from: d, reason: collision with root package name */
    public static final x06.i0 f451260d = new x06.i0(x06.w0.f451332g, null, null, 6, null);

    /* renamed from: a, reason: collision with root package name */
    public final x06.w0 f451261a;

    /* renamed from: b, reason: collision with root package name */
    public final jz5.f f451262b;

    /* renamed from: c, reason: collision with root package name */
    public final x06.w0 f451263c;

    public i0(x06.w0 reportLevelBefore, jz5.f fVar, x06.w0 reportLevelAfter) {
        kotlin.jvm.internal.o.g(reportLevelBefore, "reportLevelBefore");
        kotlin.jvm.internal.o.g(reportLevelAfter, "reportLevelAfter");
        this.f451261a = reportLevelBefore;
        this.f451262b = fVar;
        this.f451263c = reportLevelAfter;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.i0)) {
            return false;
        }
        x06.i0 i0Var = (x06.i0) obj;
        return this.f451261a == i0Var.f451261a && kotlin.jvm.internal.o.b(this.f451262b, i0Var.f451262b) && this.f451263c == i0Var.f451263c;
    }

    public int hashCode() {
        int hashCode = this.f451261a.hashCode() * 31;
        jz5.f fVar = this.f451262b;
        return ((hashCode + (fVar == null ? 0 : fVar.f302825g)) * 31) + this.f451263c.hashCode();
    }

    public java.lang.String toString() {
        return "JavaNullabilityAnnotationsStatus(reportLevelBefore=" + this.f451261a + ", sinceVersion=" + this.f451262b + ", reportLevelAfter=" + this.f451263c + ')';
    }

    public i0(x06.w0 w0Var, jz5.f fVar, x06.w0 w0Var2, int i17, kotlin.jvm.internal.i iVar) {
        this(w0Var, (i17 & 2) != 0 ? new jz5.f(1, 0, 0) : fVar, (i17 & 4) != 0 ? w0Var : w0Var2);
    }
}
