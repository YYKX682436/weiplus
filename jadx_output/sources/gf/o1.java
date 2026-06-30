package gf;

/* loaded from: classes7.dex */
public final class o1 {

    /* renamed from: b, reason: collision with root package name */
    public static final gf.m1 f271155b = new gf.m1(null);

    /* renamed from: c, reason: collision with root package name */
    public static final java.util.HashMap f271156c = new java.util.HashMap();

    /* renamed from: a, reason: collision with root package name */
    public final android.util.SparseArray f271157a;

    public o1(ze.n runtime) {
        kotlin.jvm.internal.o.g(runtime, "runtime");
        runtime.N.a(new gf.l1(runtime));
        this.f271157a = new android.util.SparseArray();
    }

    public final df.w1 a(int i17) {
        android.util.SparseArray sparseArray = this.f271157a;
        if (sparseArray.indexOfKey(i17) >= 0) {
            java.lang.Object obj = sparseArray.get(i17);
            kotlin.jvm.internal.o.d(obj);
            return (df.w1) obj;
        }
        df.w1 w1Var = new df.w1();
        w1Var.f229593t = new gf.n1(this, i17);
        sparseArray.put(i17, w1Var);
        return w1Var;
    }
}
