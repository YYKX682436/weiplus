package n0;

/* loaded from: classes.dex */
public final class k2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f333585a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f333586b;

    public k2(java.lang.Object obj, java.lang.Object obj2) {
        this.f333585a = obj;
        this.f333586b = obj2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n0.k2)) {
            return false;
        }
        n0.k2 k2Var = (n0.k2) obj;
        return kotlin.jvm.internal.o.b(this.f333585a, k2Var.f333585a) && kotlin.jvm.internal.o.b(this.f333586b, k2Var.f333586b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f333585a;
        int i17 = 0;
        int ordinal = (obj instanceof java.lang.Enum ? ((java.lang.Enum) obj).ordinal() : obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.f333586b;
        if (obj2 instanceof java.lang.Enum) {
            i17 = ((java.lang.Enum) obj2).ordinal();
        } else if (obj2 != null) {
            i17 = obj2.hashCode();
        }
        return ordinal + i17;
    }

    public java.lang.String toString() {
        return "JoinedKey(left=" + this.f333585a + ", right=" + this.f333586b + ')';
    }
}
