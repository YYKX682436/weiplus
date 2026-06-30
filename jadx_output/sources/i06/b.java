package i06;

/* loaded from: classes11.dex */
public abstract class b {
    static {
        java.lang.Object m521constructorimpl;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(java.lang.Class.forName("java.lang.ClassValue"));
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m528isSuccessimpl(m521constructorimpl)) {
            m521constructorimpl = java.lang.Boolean.TRUE;
        }
        java.lang.Object m521constructorimpl2 = kotlin.Result.m521constructorimpl(m521constructorimpl);
        java.lang.Boolean bool = java.lang.Boolean.FALSE;
        if (kotlin.Result.m527isFailureimpl(m521constructorimpl2)) {
            m521constructorimpl2 = bool;
        }
        ((java.lang.Boolean) m521constructorimpl2).booleanValue();
    }

    public static final i06.a a(yz5.l compute) {
        kotlin.jvm.internal.o.g(compute, "compute");
        return new i06.i(compute);
    }
}
