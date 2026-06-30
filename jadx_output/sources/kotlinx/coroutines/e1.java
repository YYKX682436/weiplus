package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class e1 {

    /* renamed from: a, reason: collision with root package name */
    public static final kotlinx.coroutines.i1 f310173a;

    static {
        java.lang.String str;
        kotlinx.coroutines.i1 i1Var;
        int i17 = kotlinx.coroutines.internal.n0.f310511a;
        try {
            str = java.lang.System.getProperty("kotlinx.coroutines.main.delay");
        } catch (java.lang.SecurityException unused) {
            str = null;
        }
        if (str != null ? java.lang.Boolean.parseBoolean(str) : false) {
            kotlinx.coroutines.p0 p0Var = kotlinx.coroutines.q1.f310568a;
            oz5.i iVar = kotlinx.coroutines.internal.b0.f310484a;
            t26.a aVar = ((t26.a) iVar).f415347h;
            i1Var = !(iVar instanceof kotlinx.coroutines.i1) ? kotlinx.coroutines.d1.f310157n : (kotlinx.coroutines.i1) iVar;
        } else {
            i1Var = kotlinx.coroutines.d1.f310157n;
        }
        f310173a = i1Var;
    }
}
