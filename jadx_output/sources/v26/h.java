package v26;

/* loaded from: classes14.dex */
public abstract class h {
    public static final java.lang.Object a(oz5.l lVar, java.lang.Object obj, java.lang.Object obj2, yz5.p pVar, kotlin.coroutines.Continuation frame) {
        java.lang.Object c17 = kotlinx.coroutines.internal.r0.c(lVar, obj2);
        try {
            v26.r0 r0Var = new v26.r0(frame, lVar);
            kotlin.jvm.internal.m0.e(pVar, 2);
            java.lang.Object invoke = pVar.invoke(obj, r0Var);
            kotlinx.coroutines.internal.r0.a(lVar, c17);
            if (invoke == pz5.a.f359186d) {
                kotlin.jvm.internal.o.g(frame, "frame");
            }
            return invoke;
        } catch (java.lang.Throwable th6) {
            kotlinx.coroutines.internal.r0.a(lVar, c17);
            throw th6;
        }
    }
}
