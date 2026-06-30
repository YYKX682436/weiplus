package hu3;

/* loaded from: classes5.dex */
public final class v0 {

    /* renamed from: a, reason: collision with root package name */
    public final int f285209a;

    /* renamed from: b, reason: collision with root package name */
    public final ct0.b f285210b;

    static {
        new hu3.u0(null);
    }

    public v0(int i17, ct0.b bVar) {
        this.f285209a = i17;
        this.f285210b = bVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hu3.v0)) {
            return false;
        }
        hu3.v0 v0Var = (hu3.v0) obj;
        return this.f285209a == v0Var.f285209a && kotlin.jvm.internal.o.b(this.f285210b, v0Var.f285210b);
    }

    public int hashCode() {
        int hashCode = java.lang.Integer.hashCode(this.f285209a) * 31;
        ct0.b bVar = this.f285210b;
        return hashCode + (bVar == null ? 0 : bVar.hashCode());
    }

    public java.lang.String toString() {
        return "TemplateResult(result=" + this.f285209a + ", captureInfo=" + this.f285210b + ')';
    }
}
