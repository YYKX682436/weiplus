package t2;

/* loaded from: classes12.dex */
public abstract class s {
    public static final java.lang.Object a(wa.a aVar, kotlin.coroutines.Continuation continuation) {
        try {
            if (aVar.isDone()) {
                return t2.j.e(aVar);
            }
            kotlinx.coroutines.r rVar = new kotlinx.coroutines.r(pz5.f.b(continuation), 1);
            aVar.addListener(new t2.u(aVar, rVar), t2.q.INSTANCE);
            rVar.m(new t2.r(aVar));
            java.lang.Object j17 = rVar.j();
            pz5.a aVar2 = pz5.a.f359186d;
            return j17;
        } catch (java.util.concurrent.ExecutionException e17) {
            java.lang.Throwable cause = e17.getCause();
            if (cause != null) {
                throw cause;
            }
            kotlin.jvm.internal.o.n();
            throw null;
        }
    }
}
