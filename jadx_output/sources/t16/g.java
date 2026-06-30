package t16;

/* loaded from: classes15.dex */
public abstract class g {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f414613a;

    public g(java.lang.Object obj) {
        this.f414613a = obj;
    }

    public abstract f26.o0 a(o06.v0 v0Var);

    public java.lang.Object b() {
        return this.f414613a;
    }

    public boolean equals(java.lang.Object obj) {
        if (this != obj) {
            java.lang.Object b17 = b();
            t16.g gVar = obj instanceof t16.g ? (t16.g) obj : null;
            if (!kotlin.jvm.internal.o.b(b17, gVar != null ? gVar.b() : null)) {
                return false;
            }
        }
        return true;
    }

    public int hashCode() {
        java.lang.Object b17 = b();
        if (b17 != null) {
            return b17.hashCode();
        }
        return 0;
    }

    public java.lang.String toString() {
        return java.lang.String.valueOf(b());
    }
}
