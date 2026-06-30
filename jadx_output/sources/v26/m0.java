package v26;

/* loaded from: classes14.dex */
public final class m0 extends qz5.d implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final kotlinx.coroutines.flow.k f433029d;

    /* renamed from: e, reason: collision with root package name */
    public final oz5.l f433030e;

    /* renamed from: f, reason: collision with root package name */
    public final int f433031f;

    /* renamed from: g, reason: collision with root package name */
    public oz5.l f433032g;

    /* renamed from: h, reason: collision with root package name */
    public kotlin.coroutines.Continuation f433033h;

    public m0(kotlinx.coroutines.flow.k kVar, oz5.l lVar) {
        super(v26.i0.f433009d, oz5.m.f350329d);
        this.f433029d = kVar;
        this.f433030e = lVar;
        this.f433031f = ((java.lang.Number) lVar.fold(0, v26.l0.f433025d)).intValue();
    }

    public final java.lang.Object a(kotlin.coroutines.Continuation continuation, java.lang.Object obj) {
        oz5.l context = continuation.getContext();
        kotlinx.coroutines.v2.f(context);
        oz5.l lVar = this.f433032g;
        if (lVar != context) {
            if (lVar instanceof v26.c0) {
                throw new java.lang.IllegalStateException(r26.b0.b("\n            Flow exception transparency is violated:\n                Previous 'emit' call has thrown exception " + ((v26.c0) lVar).f432988d + ", but then emission attempt of value '" + obj + "' has been detected.\n                Emissions from 'catch' blocks are prohibited in order to avoid unspecified behaviour, 'Flow.catch' operator can be used instead.\n                For a more detailed explanation, please refer to Flow documentation.\n            ").toString());
            }
            if (((java.lang.Number) context.fold(0, new v26.p0(this))).intValue() != this.f433031f) {
                throw new java.lang.IllegalStateException(("Flow invariant is violated:\n\t\tFlow was collected in " + this.f433030e + ",\n\t\tbut emission happened in " + context + ".\n\t\tPlease refer to 'flow' documentation or use 'flowOn' instead").toString());
            }
            this.f433032g = context;
        }
        this.f433033h = continuation;
        java.lang.Object invoke = v26.o0.f433036a.invoke(this.f433029d, obj, this);
        if (!kotlin.jvm.internal.o.b(invoke, pz5.a.f359186d)) {
            this.f433033h = null;
        }
        return invoke;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        try {
            java.lang.Object a17 = a(continuation, obj);
            return a17 == pz5.a.f359186d ? a17 : jz5.f0.f302826a;
        } catch (java.lang.Throwable th6) {
            this.f433032g = new v26.c0(th6, continuation.getContext());
            throw th6;
        }
    }

    @Override // qz5.a, qz5.e
    public qz5.e getCallerFrame() {
        kotlin.coroutines.Continuation continuation = this.f433033h;
        if (continuation instanceof qz5.e) {
            return (qz5.e) continuation;
        }
        return null;
    }

    @Override // qz5.d, kotlin.coroutines.Continuation
    public oz5.l getContext() {
        oz5.l lVar = this.f433032g;
        return lVar == null ? oz5.m.f350329d : lVar;
    }

    @Override // qz5.a
    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // qz5.a
    public java.lang.Object invokeSuspend(java.lang.Object obj) {
        java.lang.Throwable m524exceptionOrNullimpl = kotlin.Result.m524exceptionOrNullimpl(obj);
        if (m524exceptionOrNullimpl != null) {
            this.f433032g = new v26.c0(m524exceptionOrNullimpl, getContext());
        }
        kotlin.coroutines.Continuation continuation = this.f433033h;
        if (continuation != null) {
            continuation.resumeWith(obj);
        }
        return pz5.a.f359186d;
    }

    @Override // qz5.d, qz5.a
    public void releaseIntercepted() {
        super.releaseIntercepted();
    }
}
