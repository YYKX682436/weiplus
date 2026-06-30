package kotlinx.coroutines.internal;

/* loaded from: classes14.dex */
public abstract class k0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f310507a = 0;

    static {
        java.lang.Object m521constructorimpl;
        java.lang.Object m521constructorimpl2;
        try {
            kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(qz5.a.class.getCanonicalName());
        } catch (java.lang.Throwable th6) {
            kotlin.Result.Companion companion2 = kotlin.Result.INSTANCE;
            m521constructorimpl = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th6));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl) != null) {
            m521constructorimpl = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        try {
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlinx.coroutines.internal.k0.class.getCanonicalName());
        } catch (java.lang.Throwable th7) {
            kotlin.Result.Companion companion3 = kotlin.Result.INSTANCE;
            m521constructorimpl2 = kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(th7));
        }
        if (kotlin.Result.m524exceptionOrNullimpl(m521constructorimpl2) != null) {
            m521constructorimpl2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
    }
}
