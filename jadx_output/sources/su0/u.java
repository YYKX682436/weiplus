package su0;

/* loaded from: classes5.dex */
public final class u extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412701d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412702e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f412703f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412704g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ su0.a0 f412705h;

    /* renamed from: i, reason: collision with root package name */
    public int f412706i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u(su0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412705h = a0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412704g = obj;
        this.f412706i |= Integer.MIN_VALUE;
        return this.f412705h.b(null, null, this);
    }
}
