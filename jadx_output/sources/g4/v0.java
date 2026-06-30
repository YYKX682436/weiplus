package g4;

/* loaded from: classes5.dex */
public final class v0 extends g4.y0 {

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Throwable f268588b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(java.lang.Throwable error) {
        super(false, null);
        kotlin.jvm.internal.o.g(error, "error");
        this.f268588b = error;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof g4.v0) {
            g4.v0 v0Var = (g4.v0) obj;
            if (this.f268627a == v0Var.f268627a && kotlin.jvm.internal.o.b(this.f268588b, v0Var.f268588b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return java.lang.Boolean.hashCode(this.f268627a) + this.f268588b.hashCode();
    }

    public java.lang.String toString() {
        return "Error(endOfPaginationReached=" + this.f268627a + ", error=" + this.f268588b + ')';
    }
}
