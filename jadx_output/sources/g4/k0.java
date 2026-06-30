package g4;

/* loaded from: classes5.dex */
public final class k0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268396d;

    /* renamed from: e, reason: collision with root package name */
    public int f268397e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.l0 f268398f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268399g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268400h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k0(g4.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268398f = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268396d = obj;
        this.f268397e |= Integer.MIN_VALUE;
        return this.f268398f.emit(null, this);
    }
}
