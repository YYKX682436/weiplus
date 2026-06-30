package ng1;

/* loaded from: classes7.dex */
public final class p extends ng1.r {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f336947a;

    public p(java.lang.String str) {
        super(null);
        this.f336947a = str;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ng1.p) && kotlin.jvm.internal.o.b(this.f336947a, ((ng1.p) obj).f336947a);
    }

    public int hashCode() {
        java.lang.String str = this.f336947a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public java.lang.String toString() {
        return "NetworkError(message=" + this.f336947a + ')';
    }
}
