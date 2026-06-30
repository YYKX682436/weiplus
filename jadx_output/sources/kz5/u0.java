package kz5;

/* loaded from: classes5.dex */
public final class u0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f314015a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f314016b;

    public u0(int i17, java.lang.Object obj) {
        this.f314015a = i17;
        this.f314016b = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kz5.u0)) {
            return false;
        }
        kz5.u0 u0Var = (kz5.u0) obj;
        return this.f314015a == u0Var.f314015a && kotlin.jvm.internal.o.b(this.f314016b, u0Var.f314016b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f314015a) * 31;
        java.lang.Object obj = this.f314016b;
        return hashCode + (obj == null ? 0 : obj.hashCode());
    }

    public java.lang.String toString() {
        return "IndexedValue(index=" + this.f314015a + ", value=" + this.f314016b + ')';
    }
}
