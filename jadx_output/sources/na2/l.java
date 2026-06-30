package na2;

/* loaded from: classes2.dex */
public final class l {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f335977a;

    /* renamed from: b, reason: collision with root package name */
    public final int f335978b;

    public l(java.lang.String name, int i17) {
        kotlin.jvm.internal.o.g(name, "name");
        this.f335977a = name;
        this.f335978b = i17;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof na2.l)) {
            return false;
        }
        na2.l lVar = (na2.l) obj;
        return kotlin.jvm.internal.o.b(this.f335977a, lVar.f335977a) && this.f335978b == lVar.f335978b;
    }

    public int hashCode() {
        return (this.f335977a.hashCode() * 31) + java.lang.Integer.hashCode(this.f335978b);
    }

    public java.lang.String toString() {
        return "TabInfo(name=" + this.f335977a + ", tabId=" + this.f335978b + ')';
    }
}
