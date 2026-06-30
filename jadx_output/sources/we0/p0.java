package we0;

/* loaded from: classes11.dex */
public final class p0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f445147d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445148e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ we0.u0 f445149f;

    /* renamed from: g, reason: collision with root package name */
    public int f445150g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(we0.u0 u0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f445149f = u0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445148e = obj;
        this.f445150g |= Integer.MIN_VALUE;
        return this.f445149f.Bi(null, null, this);
    }
}
