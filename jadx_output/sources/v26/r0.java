package v26;

/* loaded from: classes14.dex */
public final class r0 implements kotlin.coroutines.Continuation, qz5.e {

    /* renamed from: d, reason: collision with root package name */
    public final kotlin.coroutines.Continuation f433053d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f433054e;

    public r0(kotlin.coroutines.Continuation continuation, oz5.l lVar) {
        this.f433053d = continuation;
        this.f433054e = lVar;
    }

    @Override // qz5.e
    public qz5.e getCallerFrame() {
        kotlin.coroutines.Continuation continuation = this.f433053d;
        if (continuation instanceof qz5.e) {
            return (qz5.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return this.f433054e;
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object obj) {
        this.f433053d.resumeWith(obj);
    }
}
