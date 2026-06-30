package f26;

/* loaded from: classes16.dex */
public final class h2 {

    /* renamed from: a, reason: collision with root package name */
    public final o06.e2 f259170a;

    /* renamed from: b, reason: collision with root package name */
    public final f26.c0 f259171b;

    public h2(o06.e2 typeParameter, f26.c0 typeAttr) {
        kotlin.jvm.internal.o.g(typeParameter, "typeParameter");
        kotlin.jvm.internal.o.g(typeAttr, "typeAttr");
        this.f259170a = typeParameter;
        this.f259171b = typeAttr;
    }

    public boolean equals(java.lang.Object obj) {
        if (!(obj instanceof f26.h2)) {
            return false;
        }
        f26.h2 h2Var = (f26.h2) obj;
        return kotlin.jvm.internal.o.b(h2Var.f259170a, this.f259170a) && kotlin.jvm.internal.o.b(h2Var.f259171b, this.f259171b);
    }

    public int hashCode() {
        int hashCode = this.f259170a.hashCode();
        return hashCode + (hashCode * 31) + this.f259171b.hashCode();
    }

    public java.lang.String toString() {
        return "DataToEraseUpperBound(typeParameter=" + this.f259170a + ", typeAttr=" + this.f259171b + ')';
    }
}
