package hd1;

/* loaded from: classes7.dex */
public final class y extends hd1.z {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f280442a;

    public y(java.lang.Object obj) {
        super(null);
        this.f280442a = obj;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hd1.y) && kotlin.jvm.internal.o.b(this.f280442a, ((hd1.y) obj).f280442a);
    }

    public int hashCode() {
        java.lang.Object obj = this.f280442a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return "Success(ret=" + this.f280442a + ')';
    }
}
