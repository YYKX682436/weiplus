package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class j1 implements kotlinx.coroutines.flow.k {

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ kotlin.jvm.internal.h0 f310298d;

    public j1(kotlin.jvm.internal.h0 h0Var) {
        this.f310298d = h0Var;
    }

    @Override // kotlinx.coroutines.flow.k
    public java.lang.Object emit(java.lang.Object obj, kotlin.coroutines.Continuation continuation) {
        this.f310298d.f310123d = obj;
        throw new v26.a(this);
    }
}
