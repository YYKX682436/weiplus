package ut;

/* loaded from: classes12.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430753d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ut.q0 f430754e;

    /* renamed from: f, reason: collision with root package name */
    public int f430755f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(ut.q0 q0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430754e = q0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430753d = obj;
        this.f430755f |= Integer.MIN_VALUE;
        return this.f430754e.W(null, null, false, null, 0L, null, this);
    }
}
