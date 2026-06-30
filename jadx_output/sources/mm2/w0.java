package mm2;

/* loaded from: classes3.dex */
public final class w0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.String f329509a;

    /* renamed from: b, reason: collision with root package name */
    public final int f329510b;

    public w0(java.lang.String str, int i17) {
        this.f329509a = str;
        this.f329510b = i17;
    }

    public final boolean a(mm2.w0 other) {
        kotlin.jvm.internal.o.g(other, "other");
        java.lang.String str = other.f329509a;
        return (str == null || str.length() == 0) || !kotlin.jvm.internal.o.b(str, this.f329509a) || this.f329510b < other.f329510b;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.w0)) {
            return false;
        }
        mm2.w0 w0Var = (mm2.w0) obj;
        return kotlin.jvm.internal.o.b(this.f329509a, w0Var.f329509a) && this.f329510b == w0Var.f329510b;
    }

    public int hashCode() {
        java.lang.String str = this.f329509a;
        return ((str == null ? 0 : str.hashCode()) * 31) + java.lang.Integer.hashCode(this.f329510b);
    }

    public java.lang.String toString() {
        return "CheerInfoVersion[id = " + this.f329509a + ", version = " + this.f329510b + ']';
    }
}
