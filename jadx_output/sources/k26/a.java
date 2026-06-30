package k26;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f303767a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f303768b;

    public a(java.lang.Object obj, java.lang.Object obj2) {
        this.f303767a = obj;
        this.f303768b = obj2;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k26.a)) {
            return false;
        }
        k26.a aVar = (k26.a) obj;
        return kotlin.jvm.internal.o.b(this.f303767a, aVar.f303767a) && kotlin.jvm.internal.o.b(this.f303768b, aVar.f303768b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f303767a;
        int hashCode = (obj == null ? 0 : obj.hashCode()) * 31;
        java.lang.Object obj2 = this.f303768b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }

    public java.lang.String toString() {
        return "ApproximationBounds(lower=" + this.f303767a + ", upper=" + this.f303768b + ')';
    }
}
