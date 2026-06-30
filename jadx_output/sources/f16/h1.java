package f16;

/* loaded from: classes15.dex */
public abstract class h1 {
    public static final java.lang.Object a(java.util.Set set, java.lang.Object obj, java.lang.Object obj2, java.lang.Object obj3, boolean z17) {
        if (!z17) {
            if (obj3 != null) {
                set = kz5.n0.X0(kz5.q1.j(set, obj3));
            }
            return kz5.n0.A0(set);
        }
        java.lang.Object obj4 = set.contains(obj) ? obj : set.contains(obj2) ? obj2 : null;
        if (kotlin.jvm.internal.o.b(obj4, obj) && kotlin.jvm.internal.o.b(obj3, obj2)) {
            return null;
        }
        return obj3 == null ? obj4 : obj3;
    }
}
