package mm2;

/* loaded from: classes3.dex */
public final class y0 {

    /* renamed from: a, reason: collision with root package name */
    public final qs5.m f329548a;

    /* renamed from: b, reason: collision with root package name */
    public final int f329549b;

    /* renamed from: c, reason: collision with root package name */
    public final android.os.Bundle f329550c;

    public y0(qs5.m result, int i17, android.os.Bundle bundle) {
        kotlin.jvm.internal.o.g(result, "result");
        kotlin.jvm.internal.o.g(bundle, "bundle");
        this.f329548a = result;
        this.f329549b = i17;
        this.f329550c = bundle;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mm2.y0)) {
            return false;
        }
        mm2.y0 y0Var = (mm2.y0) obj;
        return this.f329548a == y0Var.f329548a && this.f329549b == y0Var.f329549b && kotlin.jvm.internal.o.b(this.f329550c, y0Var.f329550c);
    }

    public int hashCode() {
        return (((this.f329548a.hashCode() * 31) + java.lang.Integer.hashCode(this.f329549b)) * 31) + this.f329550c.hashCode();
    }

    public java.lang.String toString() {
        return "GiftConstantClickResultData(result=" + this.f329548a + ", scene=" + this.f329549b + ", bundle=" + this.f329550c + ')';
    }
}
