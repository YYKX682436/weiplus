package dw3;

/* loaded from: classes5.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f244212a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.String f244213b;

    public h0(boolean z17, java.lang.String extData) {
        kotlin.jvm.internal.o.g(extData, "extData");
        this.f244212a = z17;
        this.f244213b = extData;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dw3.h0)) {
            return false;
        }
        dw3.h0 h0Var = (dw3.h0) obj;
        return this.f244212a == h0Var.f244212a && kotlin.jvm.internal.o.b(this.f244213b, h0Var.f244213b);
    }

    public int hashCode() {
        return (java.lang.Boolean.hashCode(this.f244212a) * 31) + this.f244213b.hashCode();
    }

    public java.lang.String toString() {
        return "Result(exist=" + this.f244212a + ", extData=" + this.f244213b + ')';
    }
}
