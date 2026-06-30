package kotlinx.coroutines;

/* loaded from: classes.dex */
public final class f0 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f310180a;

    /* renamed from: b, reason: collision with root package name */
    public final yz5.l f310181b;

    public f0(java.lang.Object obj, yz5.l lVar) {
        this.f310180a = obj;
        this.f310181b = lVar;
    }

    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kotlinx.coroutines.f0)) {
            return false;
        }
        kotlinx.coroutines.f0 f0Var = (kotlinx.coroutines.f0) obj;
        return kotlin.jvm.internal.o.b(this.f310180a, f0Var.f310180a) && kotlin.jvm.internal.o.b(this.f310181b, f0Var.f310181b);
    }

    public int hashCode() {
        java.lang.Object obj = this.f310180a;
        return ((obj == null ? 0 : obj.hashCode()) * 31) + this.f310181b.hashCode();
    }

    public java.lang.String toString() {
        return "CompletedWithCancellation(result=" + this.f310180a + ", onCancellation=" + this.f310181b + ')';
    }
}
