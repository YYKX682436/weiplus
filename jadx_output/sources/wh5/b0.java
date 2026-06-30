package wh5;

/* loaded from: classes12.dex */
public final class b0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f446019d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f446020e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f446021f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f446022g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f446023h;

    /* renamed from: i, reason: collision with root package name */
    public int f446024i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b0(wh5.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f446023h = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f446022g = obj;
        this.f446024i |= Integer.MIN_VALUE;
        return this.f446023h.f7(null, null, null, this);
    }
}
