package rv0;

/* loaded from: classes5.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400069d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f400070e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400071f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400072g;

    /* renamed from: h, reason: collision with root package name */
    public int f400073h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f400072g = n1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f400071f = obj;
        this.f400073h |= Integer.MIN_VALUE;
        return rv0.n1.k7(this.f400072g, null, this);
    }
}
