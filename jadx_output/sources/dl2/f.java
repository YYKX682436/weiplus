package dl2;

/* loaded from: classes3.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public boolean f235195a;

    /* renamed from: b, reason: collision with root package name */
    public final r45.n30 f235196b;

    public f(boolean z17, r45.n30 productItem) {
        kotlin.jvm.internal.o.g(productItem, "productItem");
        this.f235195a = z17;
        this.f235196b = productItem;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl2.f)) {
            return false;
        }
        dl2.f fVar = (dl2.f) obj;
        return this.f235195a == fVar.f235195a && kotlin.jvm.internal.o.b(this.f235196b, fVar.f235196b);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f235195a) * 31) + this.f235196b.hashCode();
    }

    public java.lang.String toString() {
        java.lang.StringBuilder sb6 = new java.lang.StringBuilder("isChoose=");
        sb6.append(this.f235195a);
        sb6.append(",  count=");
        r45.n30 n30Var = this.f235196b;
        sb6.append(n30Var.getInteger(1));
        sb6.append(", giftId=");
        sb6.append(n30Var.getString(0));
        return sb6.toString();
    }
}
