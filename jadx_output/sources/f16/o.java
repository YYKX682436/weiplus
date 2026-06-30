package f16;

/* loaded from: classes15.dex */
public final class o {

    /* renamed from: a, reason: collision with root package name */
    public final f16.n f258760a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f258761b;

    public o(f16.n qualifier, boolean z17) {
        kotlin.jvm.internal.o.g(qualifier, "qualifier");
        this.f258760a = qualifier;
        this.f258761b = z17;
    }

    public static f16.o a(f16.o oVar, f16.n qualifier, boolean z17, int i17, java.lang.Object obj) {
        if ((i17 & 1) != 0) {
            qualifier = oVar.f258760a;
        }
        if ((i17 & 2) != 0) {
            z17 = oVar.f258761b;
        }
        oVar.getClass();
        kotlin.jvm.internal.o.g(qualifier, "qualifier");
        return new f16.o(qualifier, z17);
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f16.o)) {
            return false;
        }
        f16.o oVar = (f16.o) obj;
        return this.f258760a == oVar.f258760a && this.f258761b == oVar.f258761b;
    }

    public int hashCode() {
        return (this.f258760a.hashCode() * 31) + java.lang.Boolean.hashCode(this.f258761b);
    }

    public java.lang.String toString() {
        return "NullabilityQualifierWithMigrationStatus(qualifier=" + this.f258760a + ", isForWarningOnly=" + this.f258761b + ')';
    }
}
