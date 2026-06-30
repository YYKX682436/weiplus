package vh0;

/* loaded from: classes8.dex */
public final class p1 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f436935a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f436936b;

    public p1(java.lang.Object obj, java.lang.Object obj2) {
        this.f436935a = obj;
        this.f436936b = obj2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vh0.p1)) {
            return false;
        }
        vh0.p1 p1Var = (vh0.p1) obj;
        return kotlin.jvm.internal.o.b(this.f436935a, p1Var.f436935a) && kotlin.jvm.internal.o.b(this.f436936b, p1Var.f436936b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f436935a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f436936b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "OpResult(status=" + this.f436935a + ", value=" + this.f436936b + ')';
    }
}
