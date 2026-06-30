package f06;

/* loaded from: classes15.dex */
public final class z {

    /* renamed from: c, reason: collision with root package name */
    public static final f06.z f258459c = new f06.z(null, null);

    /* renamed from: a, reason: collision with root package name */
    public final f06.a0 f258460a;

    /* renamed from: b, reason: collision with root package name */
    public final f06.w f258461b;

    public z(f06.a0 a0Var, f06.w wVar) {
        java.lang.String str;
        this.f258460a = a0Var;
        this.f258461b = wVar;
        if ((a0Var == null) == (wVar == null)) {
            return;
        }
        if (a0Var == null) {
            str = "Star projection must have no type specified.";
        } else {
            str = "The projection variance " + a0Var + " requires type to be specified.";
        }
        throw new java.lang.IllegalArgumentException(str.toString());
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f06.z)) {
            return false;
        }
        f06.z zVar = (f06.z) obj;
        return this.f258460a == zVar.f258460a && kotlin.jvm.internal.o.b(this.f258461b, zVar.f258461b);
    }

    public int hashCode() {
        f06.a0 a0Var = this.f258460a;
        int hashCode = (a0Var == null ? 0 : a0Var.hashCode()) * 31;
        f06.w wVar = this.f258461b;
        return hashCode + (wVar != null ? wVar.hashCode() : 0);
    }

    public java.lang.String toString() {
        f06.a0 a0Var = this.f258460a;
        int i17 = a0Var == null ? -1 : f06.y.f258458a[a0Var.ordinal()];
        if (i17 == -1) {
            return "*";
        }
        f06.w wVar = this.f258461b;
        if (i17 == 1) {
            return java.lang.String.valueOf(wVar);
        }
        if (i17 == 2) {
            return "in " + wVar;
        }
        if (i17 != 3) {
            throw new jz5.j();
        }
        return "out " + wVar;
    }
}
