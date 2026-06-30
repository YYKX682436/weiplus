package qz5;

/* loaded from: classes14.dex */
public abstract class j extends qz5.a {
    public j(kotlin.coroutines.Continuation continuation) {
        super(continuation);
        if (continuation != null) {
            if (!(continuation.getContext() == oz5.m.f350329d)) {
                throw new java.lang.IllegalArgumentException("Coroutines with restricted suspension must have EmptyCoroutineContext".toString());
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return oz5.m.f350329d;
    }
}
