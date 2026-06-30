package l41;

/* loaded from: classes15.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f315885d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ l41.j1 f315886e;

    /* renamed from: f, reason: collision with root package name */
    public int f315887f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(l41.j1 j1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f315886e = j1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f315885d = obj;
        this.f315887f |= Integer.MIN_VALUE;
        return l41.j1.a(this.f315886e, this);
    }
}
