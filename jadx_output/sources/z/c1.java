package z;

/* loaded from: classes13.dex */
public final class c1 {

    /* renamed from: a, reason: collision with root package name */
    public int f468614a = 300;

    /* renamed from: b, reason: collision with root package name */
    public final java.util.Map f468615b = new java.util.LinkedHashMap();

    public final z.b1 a(java.lang.Object obj, int i17) {
        z.b1 b1Var = new z.b1(obj, null, 2, null);
        this.f468615b.put(java.lang.Integer.valueOf(i17), b1Var);
        return b1Var;
    }

    public boolean equals(java.lang.Object obj) {
        if (obj instanceof z.c1) {
            z.c1 c1Var = (z.c1) obj;
            c1Var.getClass();
            if (this.f468614a == c1Var.f468614a && kotlin.jvm.internal.o.b(this.f468615b, c1Var.f468615b)) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return (((this.f468614a * 31) + 0) * 31) + this.f468615b.hashCode();
    }
}
