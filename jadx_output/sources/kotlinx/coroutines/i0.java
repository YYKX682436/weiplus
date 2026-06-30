package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class i0 {
    public static final java.lang.Object a(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        if (!(obj instanceof kotlinx.coroutines.e0)) {
            return kotlin.Result.m521constructorimpl(obj);
        }
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        return kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(((kotlinx.coroutines.e0) obj).f310172a));
    }

    public static final java.lang.Object b(java.lang.Object obj, yz5.l lVar) {
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
        return m524exceptionOrNullimpl == null ? lVar != null ? new kotlinx.coroutines.f0(obj, lVar) : obj : new kotlinx.coroutines.e0(m524exceptionOrNullimpl, false, 2, null);
    }
}
