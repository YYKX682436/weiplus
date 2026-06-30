package he1;

/* loaded from: classes15.dex */
public final class i extends he1.k {

    /* renamed from: a, reason: collision with root package name */
    public final int f280882a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f280883b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(int i17, java.lang.String errMsg) {
        super(null);
        kotlin.jvm.internal.o.g(errMsg, "errMsg");
        this.f280882a = i17;
        this.f280883b = errMsg;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof he1.i)) {
            return false;
        }
        he1.i iVar = (he1.i) obj;
        return this.f280882a == iVar.f280882a && kotlin.jvm.internal.o.b(this.f280883b, iVar.f280883b);
    }

    public int hashCode() {
        return (java.lang.Integer.hashCode(this.f280882a) * 31) + this.f280883b.hashCode();
    }

    public java.lang.String toString() {
        return "Failure(errCode=" + this.f280882a + ", errMsg=" + this.f280883b + ')';
    }
}
