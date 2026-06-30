package nu0;

/* loaded from: classes5.dex */
public final class y0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f340145d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nu0.b1 f340146e;

    /* renamed from: f, reason: collision with root package name */
    public int f340147f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(nu0.b1 b1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f340146e = b1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f340145d = obj;
        this.f340147f |= Integer.MIN_VALUE;
        return this.f340146e.d5(false, this);
    }
}
