package kotlinx.coroutines.flow;

/* loaded from: classes14.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.g1 f310252e;

    /* renamed from: f, reason: collision with root package name */
    public int f310253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(kotlinx.coroutines.flow.g1 g1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310252e = g1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310251d = obj;
        this.f310253f |= Integer.MIN_VALUE;
        return this.f310252e.emit(null, this);
    }
}
