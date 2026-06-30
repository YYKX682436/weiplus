package x06;

/* loaded from: classes16.dex */
public final class n0 {

    /* renamed from: a, reason: collision with root package name */
    public final x06.w0 f451278a;

    /* renamed from: b, reason: collision with root package name */
    public final x06.w0 f451279b;

    /* renamed from: c, reason: collision with root package name */
    public final java.util.Map f451280c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f451281d;

    public n0(x06.w0 globalLevel, x06.w0 w0Var, java.util.Map userDefinedLevelForSpecificAnnotation, int i17, kotlin.jvm.internal.i iVar) {
        w0Var = (i17 & 2) != 0 ? null : w0Var;
        userDefinedLevelForSpecificAnnotation = (i17 & 4) != 0 ? kz5.q0.f314001d : userDefinedLevelForSpecificAnnotation;
        kotlin.jvm.internal.o.g(globalLevel, "globalLevel");
        kotlin.jvm.internal.o.g(userDefinedLevelForSpecificAnnotation, "userDefinedLevelForSpecificAnnotation");
        this.f451278a = globalLevel;
        this.f451279b = w0Var;
        this.f451280c = userDefinedLevelForSpecificAnnotation;
        jz5.h.b(new x06.m0(this));
        x06.w0 w0Var2 = x06.w0.f451330e;
        this.f451281d = globalLevel == w0Var2 && w0Var == w0Var2 && userDefinedLevelForSpecificAnnotation.isEmpty();
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x06.n0)) {
            return false;
        }
        x06.n0 n0Var = (x06.n0) obj;
        return this.f451278a == n0Var.f451278a && this.f451279b == n0Var.f451279b && kotlin.jvm.internal.o.b(this.f451280c, n0Var.f451280c);
    }

    public int hashCode() {
        int hashCode = this.f451278a.hashCode() * 31;
        x06.w0 w0Var = this.f451279b;
        return ((hashCode + (w0Var == null ? 0 : w0Var.hashCode())) * 31) + this.f451280c.hashCode();
    }

    public java.lang.String toString() {
        return "Jsr305Settings(globalLevel=" + this.f451278a + ", migrationLevel=" + this.f451279b + ", userDefinedLevelForSpecificAnnotation=" + this.f451280c + ')';
    }
}
