package kotlinx.coroutines.internal;

@kotlin.Metadata(d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0005\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u00028\u00000\u00022\u00060\u0003j\u0002`\u00042\b\u0012\u0004\u0012\u00028\u00000\u0005B\u001d\u0012\u0006\u0010:\u001a\u000209\u0012\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u0005¢\u0006\u0004\bK\u0010LJ\u0017\u0010\b\u001a\n\u0018\u00010\u0006j\u0004\u0018\u0001`\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\r\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u000b\u0010\fJ\r\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\r¢\u0006\u0004\b\u0010\u0010\u000fJ\u0015\u0010\u0012\u001a\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0011¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0015\u0010\u001a\u001a\u00020\n2\u0006\u0010\u0019\u001a\u00020\u0016¢\u0006\u0004\b\u001a\u0010\u001bJ\u0011\u0010\u001f\u001a\u0004\u0018\u00010\u001cH\u0010¢\u0006\u0004\b\u001d\u0010\u001eJ \u0010\"\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0016ø\u0001\u0000¢\u0006\u0004\b\"\u0010#J9\u0010&\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 2\u0016\b\b\u0010%\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\r\u0018\u00010$H\u0086\bø\u0001\u0000¢\u0006\u0004\b&\u0010'J!\u0010+\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010\u001c2\u0006\u0010\u0019\u001a\u00020\u0016H\u0010¢\u0006\u0004\b)\u0010*J\u001a\u0010-\u001a\u00020\n2\b\u0010,\u001a\u0004\u0018\u00010\u001cH\u0086\b¢\u0006\u0004\b-\u0010.J!\u0010/\u001a\u00020\r2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000 H\u0086\bø\u0001\u0000¢\u0006\u0004\b/\u0010#J\u001f\u00105\u001a\u00020\r2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00028\u0000H\u0000¢\u0006\u0004\b3\u00104J\u000f\u00107\u001a\u000206H\u0016¢\u0006\u0004\b7\u00108R\u0014\u0010:\u001a\u0002098\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u001a\u0010\u0015\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010<R\u001e\u0010=\u001a\u0004\u0018\u00010\u001c8\u0000@\u0000X\u0081\u000e¢\u0006\f\n\u0004\b=\u0010>\u0012\u0004\b?\u0010\u000fR\u0014\u0010@\u001a\u00020\u001c8\u0000X\u0081\u0004¢\u0006\u0006\n\u0004\b@\u0010>R\u001a\u0010B\u001a\b\u0012\u0002\b\u0003\u0018\u00010\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bA\u0010\u0013R\u0014\u00101\u001a\u0002008\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\bC\u0010DR\u001c\u0010G\u001a\n\u0018\u00010\u0003j\u0004\u0018\u0001`\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bE\u0010FR\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00028\u00000\u00058PX\u0090\u0004¢\u0006\u0006\u001a\u0004\bH\u0010I\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006M"}, d2 = {"Lkotlinx/coroutines/internal/DispatchedContinuation;", androidx.exifinterface.media.ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/n1;", "Lqz5/e;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "Lkotlin/coroutines/Continuation;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "", "isReusable", "()Z", "Ljz5/f0;", "awaitReusability", "()V", "release", "Lkotlinx/coroutines/r;", "claimReusableCancellableContinuation", "()Lkotlinx/coroutines/r;", "Lkotlinx/coroutines/q;", "continuation", "", "tryReleaseClaimedContinuation", "(Lkotlinx/coroutines/q;)Ljava/lang/Throwable;", "cause", "postponeCancellation", "(Ljava/lang/Throwable;)Z", "", "takeState$kotlinx_coroutines_core", "()Ljava/lang/Object;", "takeState", "Lkotlin/Result;", "result", "resumeWith", "(Ljava/lang/Object;)V", "Lkotlin/Function1;", "onCancellation", "resumeCancellableWith", "(Ljava/lang/Object;Lyz5/l;)V", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "state", "resumeCancelled", "(Ljava/lang/Object;)Z", "resumeUndispatchedWith", "Loz5/l;", "context", "value", "dispatchYield$kotlinx_coroutines_core", "(Loz5/l;Ljava/lang/Object;)V", "dispatchYield", "", "toString", "()Ljava/lang/String;", "Lkotlinx/coroutines/p0;", "dispatcher", "Lkotlinx/coroutines/p0;", "Lkotlin/coroutines/Continuation;", "_state", "Ljava/lang/Object;", "get_state$kotlinx_coroutines_core$annotations", "countOrElement", "getReusableCancellableContinuation", "reusableCancellableContinuation", "getContext", "()Loz5/l;", "getCallerFrame", "()Lqz5/e;", "callerFrame", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "delegate", "<init>", "(Lkotlinx/coroutines/p0;Lkotlin/coroutines/Continuation;)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 6, 0})
/* loaded from: classes14.dex */
public final class DispatchedContinuation<T> extends kotlinx.coroutines.n1 implements qz5.e, kotlin.coroutines.Continuation<T> {
    private static final /* synthetic */ java.util.concurrent.atomic.AtomicReferenceFieldUpdater _reusableCancellableContinuation$FU = java.util.concurrent.atomic.AtomicReferenceFieldUpdater.newUpdater(kotlinx.coroutines.internal.DispatchedContinuation.class, java.lang.Object.class, "_reusableCancellableContinuation");

    /* renamed from: d, reason: collision with root package name */
    public static final /* synthetic */ int f310479d = 0;
    private volatile /* synthetic */ java.lang.Object _reusableCancellableContinuation;
    public java.lang.Object _state;
    public final kotlin.coroutines.Continuation<T> continuation;
    public final java.lang.Object countOrElement;
    public final kotlinx.coroutines.p0 dispatcher;

    /* JADX WARN: Multi-variable type inference failed */
    public DispatchedContinuation(kotlinx.coroutines.p0 p0Var, kotlin.coroutines.Continuation<? super T> continuation) {
        super(-1);
        this.dispatcher = p0Var;
        this.continuation = continuation;
        this._state = kotlinx.coroutines.internal.i.f310498a;
        this.countOrElement = kotlinx.coroutines.internal.r0.b(getContext());
        this._reusableCancellableContinuation = null;
    }

    private final kotlinx.coroutines.r getReusableCancellableContinuation() {
        java.lang.Object obj = this._reusableCancellableContinuation;
        if (obj instanceof kotlinx.coroutines.r) {
            return (kotlinx.coroutines.r) obj;
        }
        return null;
    }

    public static /* synthetic */ void get_state$kotlinx_coroutines_core$annotations() {
    }

    public final void awaitReusability() {
        do {
        } while (this._reusableCancellableContinuation == kotlinx.coroutines.internal.i.f310499b);
    }

    @Override // kotlinx.coroutines.n1
    public void cancelCompletedResult$kotlinx_coroutines_core(java.lang.Object takenState, java.lang.Throwable cause) {
        if (takenState instanceof kotlinx.coroutines.f0) {
            ((kotlinx.coroutines.f0) takenState).f310181b.invoke(cause);
        }
    }

    public final kotlinx.coroutines.r claimReusableCancellableContinuation() {
        boolean z17;
        while (true) {
            java.lang.Object obj = this._reusableCancellableContinuation;
            kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.internal.i.f310499b;
            if (obj == null) {
                this._reusableCancellableContinuation = l0Var;
                return null;
            }
            if (obj instanceof kotlinx.coroutines.r) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, l0Var)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        z17 = false;
                        break;
                    }
                }
                if (z17) {
                    return (kotlinx.coroutines.r) obj;
                }
            } else if (obj != l0Var && !(obj instanceof java.lang.Throwable)) {
                throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void dispatchYield$kotlinx_coroutines_core(oz5.l context, T value) {
        this._state = value;
        this.resumeMode = 1;
        this.dispatcher.F(context, this);
    }

    @Override // qz5.e
    public qz5.e getCallerFrame() {
        kotlin.coroutines.Continuation<T> continuation = this.continuation;
        if (continuation instanceof qz5.e) {
            return (qz5.e) continuation;
        }
        return null;
    }

    @Override // kotlin.coroutines.Continuation
    public oz5.l getContext() {
        return this.continuation.getContext();
    }

    @Override // kotlinx.coroutines.n1
    public kotlin.coroutines.Continuation<T> getDelegate$kotlinx_coroutines_core() {
        return this;
    }

    public java.lang.StackTraceElement getStackTraceElement() {
        return null;
    }

    public final boolean isReusable() {
        return this._reusableCancellableContinuation != null;
    }

    public final boolean postponeCancellation(java.lang.Throwable cause) {
        while (true) {
            java.lang.Object obj = this._reusableCancellableContinuation;
            kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.internal.i.f310499b;
            boolean z17 = false;
            boolean z18 = true;
            if (kotlin.jvm.internal.o.b(obj, l0Var)) {
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, l0Var, cause)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != l0Var) {
                        break;
                    }
                }
                if (z17) {
                    return true;
                }
            } else {
                if (obj instanceof java.lang.Throwable) {
                    return true;
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater2.compareAndSet(this, obj, null)) {
                        break;
                    }
                    if (atomicReferenceFieldUpdater2.get(this) != obj) {
                        z18 = false;
                        break;
                    }
                }
                if (z18) {
                    return false;
                }
            }
        }
    }

    public final void release() {
        awaitReusability();
        kotlinx.coroutines.r reusableCancellableContinuation = getReusableCancellableContinuation();
        if (reusableCancellableContinuation != null) {
            reusableCancellableContinuation.f();
        }
    }

    /* JADX WARN: Finally extract failed */
    public final void resumeCancellableWith(java.lang.Object result, yz5.l onCancellation) {
        boolean z17;
        java.lang.Object b17 = kotlinx.coroutines.i0.b(result, onCancellation);
        if (this.dispatcher.I(getContext())) {
            this._state = b17;
            this.resumeMode = 1;
            this.dispatcher.D(getContext(), this);
            return;
        }
        kotlinx.coroutines.w1 a17 = kotlinx.coroutines.v3.f310684a.a();
        if (a17.O()) {
            this._state = b17;
            this.resumeMode = 1;
            a17.M(this);
            return;
        }
        a17.N(true);
        try {
            oz5.l context = getContext();
            int i17 = kotlinx.coroutines.r2.O0;
            kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) context.get(kotlinx.coroutines.q2.f310571d);
            if (r2Var == null || r2Var.a()) {
                z17 = false;
            } else {
                java.util.concurrent.CancellationException x17 = r2Var.x();
                cancelCompletedResult$kotlinx_coroutines_core(b17, x17);
                kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
                resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(x17)));
                z17 = true;
            }
            if (!z17) {
                kotlin.coroutines.Continuation<T> continuation = this.continuation;
                java.lang.Object obj = this.countOrElement;
                oz5.l context2 = continuation.getContext();
                java.lang.Object c17 = kotlinx.coroutines.internal.r0.c(context2, obj);
                kotlinx.coroutines.c4 c18 = c17 != kotlinx.coroutines.internal.r0.f310523a ? kotlinx.coroutines.m0.c(continuation, context2, c17) : null;
                try {
                    this.continuation.resumeWith(result);
                    if (c18 == null || c18.k0()) {
                        kotlinx.coroutines.internal.r0.a(context2, c17);
                    }
                } catch (java.lang.Throwable th6) {
                    if (c18 == null || c18.k0()) {
                        kotlinx.coroutines.internal.r0.a(context2, c17);
                    }
                    throw th6;
                }
            }
            do {
            } while (a17.Q());
        } finally {
            try {
            } finally {
            }
        }
    }

    public final boolean resumeCancelled(java.lang.Object state) {
        oz5.l context = getContext();
        int i17 = kotlinx.coroutines.r2.O0;
        kotlinx.coroutines.r2 r2Var = (kotlinx.coroutines.r2) context.get(kotlinx.coroutines.q2.f310571d);
        if (r2Var == null || r2Var.a()) {
            return false;
        }
        java.util.concurrent.CancellationException x17 = r2Var.x();
        cancelCompletedResult$kotlinx_coroutines_core(state, x17);
        kotlin.Result.Companion companion = kotlin.Result.INSTANCE;
        resumeWith(kotlin.Result.m521constructorimpl(kotlin.ResultKt.createFailure(x17)));
        return true;
    }

    public final void resumeUndispatchedWith(java.lang.Object result) {
        kotlin.coroutines.Continuation<T> continuation = this.continuation;
        java.lang.Object obj = this.countOrElement;
        oz5.l context = continuation.getContext();
        java.lang.Object c17 = kotlinx.coroutines.internal.r0.c(context, obj);
        kotlinx.coroutines.c4 c18 = c17 != kotlinx.coroutines.internal.r0.f310523a ? kotlinx.coroutines.m0.c(continuation, context, c17) : null;
        try {
            this.continuation.resumeWith(result);
        } finally {
            if (c18 == null || c18.k0()) {
                kotlinx.coroutines.internal.r0.a(context, c17);
            }
        }
    }

    @Override // kotlin.coroutines.Continuation
    public void resumeWith(java.lang.Object result) {
        oz5.l context;
        java.lang.Object c17;
        oz5.l context2 = this.continuation.getContext();
        java.lang.Object b17 = kotlinx.coroutines.i0.b(result, null);
        if (this.dispatcher.I(context2)) {
            this._state = b17;
            this.resumeMode = 0;
            this.dispatcher.D(context2, this);
            return;
        }
        kotlinx.coroutines.w1 a17 = kotlinx.coroutines.v3.f310684a.a();
        if (a17.O()) {
            this._state = b17;
            this.resumeMode = 0;
            a17.M(this);
            return;
        }
        a17.N(true);
        try {
            context = getContext();
            c17 = kotlinx.coroutines.internal.r0.c(context, this.countOrElement);
        } finally {
            try {
            } finally {
            }
        }
        try {
            this.continuation.resumeWith(result);
            do {
            } while (a17.Q());
        } finally {
            kotlinx.coroutines.internal.r0.a(context, c17);
        }
    }

    @Override // kotlinx.coroutines.n1
    public java.lang.Object takeState$kotlinx_coroutines_core() {
        java.lang.Object obj = this._state;
        this._state = kotlinx.coroutines.internal.i.f310498a;
        return obj;
    }

    public java.lang.String toString() {
        return "DispatchedContinuation[" + this.dispatcher + ", " + kotlinx.coroutines.c1.b(this.continuation) + ']';
    }

    public final java.lang.Throwable tryReleaseClaimedContinuation(kotlinx.coroutines.q continuation) {
        boolean z17;
        do {
            java.lang.Object obj = this._reusableCancellableContinuation;
            kotlinx.coroutines.internal.l0 l0Var = kotlinx.coroutines.internal.i.f310499b;
            z17 = false;
            if (obj != l0Var) {
                if (!(obj instanceof java.lang.Throwable)) {
                    throw new java.lang.IllegalStateException(("Inconsistent state " + obj).toString());
                }
                java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = _reusableCancellableContinuation$FU;
                while (true) {
                    if (atomicReferenceFieldUpdater.compareAndSet(this, obj, null)) {
                        z17 = true;
                        break;
                    }
                    if (atomicReferenceFieldUpdater.get(this) != obj) {
                        break;
                    }
                }
                if (z17) {
                    return (java.lang.Throwable) obj;
                }
                throw new java.lang.IllegalArgumentException("Failed requirement.".toString());
            }
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = _reusableCancellableContinuation$FU;
            while (true) {
                if (atomicReferenceFieldUpdater2.compareAndSet(this, l0Var, continuation)) {
                    z17 = true;
                    break;
                }
                if (atomicReferenceFieldUpdater2.get(this) != l0Var) {
                    break;
                }
            }
        } while (!z17);
        return null;
    }
}
