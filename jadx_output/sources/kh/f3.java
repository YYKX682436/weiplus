package kh;

/* loaded from: classes11.dex */
public final class f3 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f307799a;

    /* renamed from: b, reason: collision with root package name */
    public final int f307800b;

    public f3(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f307799a = name;
        this.f307800b = i17;
    }

    public final int a() {
        return this.f307800b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kh.f3)) {
            return false;
        }
        kh.f3 f3Var = (kh.f3) obj;
        return kotlin.jvm.internal.o.b(this.f307799a, f3Var.f307799a) && this.f307800b == f3Var.f307800b;
    }

    public int hashCode() {
        return (this.f307799a.hashCode() * 31) + java.lang.Integer.hashCode(this.f307800b);
    }

    public java.lang.String toString() {
        return this.f307800b + '-' + this.f307799a;
    }
}
