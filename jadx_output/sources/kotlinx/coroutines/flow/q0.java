package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class q0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310368d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.r0 f310369e;

    /* renamed from: f, reason: collision with root package name */
    public int f310370f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q0(kotlinx.coroutines.flow.r0 r0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310369e = r0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310368d = obj;
        this.f310370f |= Integer.MIN_VALUE;
        return this.f310369e.emit(null, this);
    }
}
