package hd1;

/* loaded from: classes7.dex */
public final class x extends hd1.z {

    /* renamed from: a, reason: collision with root package name */
    public final int f280440a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f280441b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public x(int i17, java.lang.String errMsg) {
        super(null);
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f280440a = i17;
        this.f280441b = errMsg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hd1.x)) {
            return false;
        }
        hd1.x xVar = (hd1.x) obj;
        return this.f280440a == xVar.f280440a && kotlin.jvm.internal.o.b(this.f280441b, xVar.f280441b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f280440a) * 31) + this.f280441b.hashCode();
    }

    public java.lang.String toString() {
        return "Failure(errCode=" + this.f280440a + ", errMsg=" + this.f280441b + ')';
    }
}
