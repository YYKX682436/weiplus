package n0;

/* loaded from: classes14.dex */
public final class g3 implements n0.f3, n0.v2 {

    /* renamed from: d, reason: collision with root package name */
    public final oz5.l f333515d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ n0.v2 f333516e;

    public g3(n0.v2 state, oz5.l coroutineContext) {
        kotlin.jvm.internal.o.g(state, "state");
        kotlin.jvm.internal.o.g(coroutineContext, "coroutineContext");
        this.f333515d = coroutineContext;
        this.f333516e = state;
    }

    @Override // kotlinx.coroutines.y0
    public oz5.l getCoroutineContext() {
        return this.f333515d;
    }

    @Override // n0.e5
    public java.lang.Object getValue() {
        return this.f333516e.getValue();
    }

    @Override // n0.v2
    public void setValue(java.lang.Object obj) {
        this.f333516e.setValue(obj);
    }
}
