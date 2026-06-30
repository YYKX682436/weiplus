package gx0;

/* loaded from: classes5.dex */
public final class p6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276821d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276822e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f276823f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f276824g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276825h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276826i;

    /* renamed from: m, reason: collision with root package name */
    public int f276827m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p6(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276826i = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276825h = obj;
        this.f276827m |= Integer.MIN_VALUE;
        return gx0.w8.i7(this.f276826i, this);
    }
}
