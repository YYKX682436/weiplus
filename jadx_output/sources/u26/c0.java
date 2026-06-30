package u26;

/* loaded from: classes14.dex */
public final class c0 {

    /* renamed from: b, reason: collision with root package name */
    public static final u26.b0 f424140b = new u26.b0();

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f424141a;

    public static final java.lang.Throwable a(java.lang.Object obj) {
        u26.a0 a0Var = obj instanceof u26.a0 ? (u26.a0) obj : null;
        if (a0Var != null) {
            return a0Var.f424135a;
        }
        return null;
    }

    public static final java.lang.Object b(java.lang.Object obj) {
        if (obj instanceof u26.b0) {
            return null;
        }
        return obj;
    }

    public static java.lang.String c(java.lang.Object obj) {
        if (obj instanceof u26.a0) {
            return ((u26.a0) obj).toString();
        }
        return "Value(" + obj + ')';
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof u26.c0) {
            return kotlin.jvm.internal.o.b(this.f424141a, ((u26.c0) obj).f424141a);
        }
        return false;
    }

    public int hashCode() {
        java.lang.Object obj = this.f424141a;
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    public java.lang.String toString() {
        return c(this.f424141a);
    }
}
