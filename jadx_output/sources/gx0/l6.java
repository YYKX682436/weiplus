package gx0;

/* loaded from: classes5.dex */
public final class l6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276664d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276665e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276666f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276667g;

    /* renamed from: h, reason: collision with root package name */
    public int f276668h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l6(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276667g = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276666f = obj;
        this.f276668h |= Integer.MIN_VALUE;
        return gx0.w8.g7(this.f276667g, null, null, this);
    }
}
