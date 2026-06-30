package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class y0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310456d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.z0 f310457e;

    /* renamed from: f, reason: collision with root package name */
    public int f310458f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(kotlinx.coroutines.flow.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310457e = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310456d = obj;
        this.f310458f |= Integer.MIN_VALUE;
        return this.f310457e.emit(null, this);
    }
}
