package kotlin.jvm.internal;

/* loaded from: classes15.dex */
public abstract class i0 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlin.jvm.internal.j0 f310124a;

    /* renamed from: b, reason: collision with root package name */
    public static final f06.d[] f310125b;

    static {
        kotlin.jvm.internal.j0 j0Var = null;
        try {
            j0Var = (kotlin.jvm.internal.j0) i06.g4.class.newInstance();
        } catch (java.lang.ClassCastException | java.lang.ClassNotFoundException | java.lang.IllegalAccessException | java.lang.InstantiationException unused) {
        }
        if (j0Var == null) {
            j0Var = new kotlin.jvm.internal.j0();
        }
        f310124a = j0Var;
        f310125b = new f06.d[0];
    }

    public static f06.d a(java.lang.Class cls) {
        return f310124a.b(cls);
    }

    public static f06.f b(java.lang.Class cls, java.lang.String str) {
        return f310124a.c(cls, str);
    }

    public static f06.j c(kotlin.jvm.internal.r rVar) {
        return f310124a.d(rVar);
    }

    public static f06.l d(kotlin.jvm.internal.t tVar) {
        return f310124a.e(tVar);
    }

    public static f06.u e(kotlin.jvm.internal.z zVar) {
        return f310124a.g(zVar);
    }
}
