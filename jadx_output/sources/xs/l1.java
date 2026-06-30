package xs;

/* loaded from: classes12.dex */
public abstract class l1 {
    public static final boolean a(j15.d dVar) {
        java.lang.String k17;
        kotlin.jvm.internal.o.g(dVar, "<this>");
        j15.c t17 = dVar.o().t();
        if ((t17 != null ? t17.getSize() : 0L) <= 0) {
            return false;
        }
        j15.c t18 = dVar.o().t();
        return (t18 == null || (k17 = t18.k()) == null) ? false : r26.n0.N(k17) ^ true;
    }

    public static final boolean b(j15.d dVar, boolean z17) {
        java.lang.String k17;
        kotlin.jvm.internal.o.g(dVar, "<this>");
        if (z17) {
            j15.c t17 = dVar.o().t();
            return (t17 != null ? t17.getSize() : 0L) > 0;
        }
        j15.c t18 = dVar.o().t();
        if ((t18 != null ? t18.getSize() : 0L) > 0) {
            j15.c t19 = dVar.o().t();
            if ((t19 == null || (k17 = t19.k()) == null) ? false : !r26.n0.N(k17)) {
                return true;
            }
        }
        return false;
    }
}
