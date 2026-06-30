package z;

/* loaded from: classes14.dex */
public final class e2 implements z.d2 {

    /* renamed from: a, reason: collision with root package name */
    public final java.lang.Object f468644a;

    /* renamed from: b, reason: collision with root package name */
    public final java.lang.Object f468645b;

    public e2(java.lang.Object obj, java.lang.Object obj2) {
        this.f468644a = obj;
        this.f468645b = obj2;
    }

    public boolean a(java.lang.Object obj, java.lang.Object obj2) {
        return kotlin.jvm.internal.o.b(obj, this.f468644a) && kotlin.jvm.internal.o.b(obj2, this.f468645b);
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof z.d2) {
            z.e2 e2Var = (z.e2) ((z.d2) obj);
            if (kotlin.jvm.internal.o.b(this.f468644a, e2Var.f468644a)) {
                if (kotlin.jvm.internal.o.b(this.f468645b, e2Var.f468645b)) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        java.lang.Object obj = this.f468644a;
        int hashCode = (obj != null ? obj.hashCode() : 0) * 31;
        java.lang.Object obj2 = this.f468645b;
        return hashCode + (obj2 != null ? obj2.hashCode() : 0);
    }
}
