package kotlinx.coroutines.flow;

/* loaded from: classes5.dex */
public final class z1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f310468d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ kotlinx.coroutines.flow.a2 f310469e;

    /* renamed from: f, reason: collision with root package name */
    public int f310470f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z1(kotlinx.coroutines.flow.a2 a2Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f310469e = a2Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f310468d = obj;
        this.f310470f |= Integer.MIN_VALUE;
        return this.f310469e.emit(null, this);
    }
}
