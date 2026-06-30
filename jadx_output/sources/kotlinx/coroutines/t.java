package kotlinx.coroutines;

/* loaded from: classes14.dex */
public abstract class t {
    public static final kotlinx.coroutines.r a(kotlin.coroutines.Continuation continuation) {
        if (!(continuation instanceof kotlinx.coroutines.internal.DispatchedContinuation)) {
            return new kotlinx.coroutines.r(continuation, 1);
        }
        kotlinx.coroutines.r claimReusableCancellableContinuation = ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).claimReusableCancellableContinuation();
        if (claimReusableCancellableContinuation != null) {
            if (!claimReusableCancellableContinuation.r()) {
                claimReusableCancellableContinuation = null;
            }
            if (claimReusableCancellableContinuation != null) {
                return claimReusableCancellableContinuation;
            }
        }
        return new kotlinx.coroutines.r(continuation, 2);
    }
}
