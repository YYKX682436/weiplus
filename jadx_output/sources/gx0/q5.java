package gx0;

/* loaded from: classes5.dex */
public final class q5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276867d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276868e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276869f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f276870g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276871h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276872i;

    /* renamed from: m, reason: collision with root package name */
    public int f276873m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276872i = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276871h = obj;
        this.f276873m |= Integer.MIN_VALUE;
        return this.f276872i.r7(false, null, this);
    }
}
