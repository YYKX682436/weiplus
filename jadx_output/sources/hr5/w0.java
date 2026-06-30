package hr5;

/* loaded from: classes15.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f284485d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f284486e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f284487f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hr5.a1 f284488g;

    /* renamed from: h, reason: collision with root package name */
    public int f284489h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(hr5.a1 a1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f284488g = a1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f284487f = obj;
        this.f284489h |= Integer.MIN_VALUE;
        return this.f284488g.g(null, this);
    }
}
