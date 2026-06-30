package qz5;

/* loaded from: classes14.dex */
public abstract class d extends qz5.a {
    private final oz5.l _context;
    private transient kotlin.coroutines.Continuation<java.lang.Object> intercepted;

    public d(kotlin.coroutines.Continuation continuation, oz5.l lVar) {
        super(continuation);
        this._context = lVar;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        oz5.l lVar = this._context;
        kotlin.jvm.internal.o.d(lVar);
        return lVar;
    }

    public final kotlin.coroutines.Continuation<java.lang.Object> intercepted() {
        kotlin.coroutines.Continuation<java.lang.Object> continuation = this.intercepted;
        if (continuation == null) {
            oz5.l context = getContext();
            int i17 = oz5.f.Y0;
            oz5.f fVar = (oz5.f) context.get(oz5.e.f350327d);
            continuation = fVar != null ? new kotlinx.coroutines.internal.DispatchedContinuation((kotlinx.coroutines.p0) fVar, this) : this;
            this.intercepted = continuation;
        }
        return continuation;
    }

    @Override // qz5.a
    public void releaseIntercepted() {
        kotlin.coroutines.Continuation<java.lang.Object> continuation = this.intercepted;
        if (continuation != null && continuation != this) {
            oz5.l context = getContext();
            int i17 = oz5.f.Y0;
            oz5.i iVar = context.get(oz5.e.f350327d);
            kotlin.jvm.internal.o.d(iVar);
            ((kotlinx.coroutines.internal.DispatchedContinuation) continuation).release();
        }
        this.intercepted = qz5.c.f367938d;
    }

    public d(kotlin.coroutines.Continuation continuation) {
        this(continuation, continuation != null ? continuation.getContext() : null);
    }
}
