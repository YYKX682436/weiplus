package tx2;

/* loaded from: classes15.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f422576d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422577e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f422578f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422579g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ tx2.k f422580h;

    /* renamed from: i, reason: collision with root package name */
    public int f422581i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(tx2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422580h = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422579g = obj;
        this.f422581i |= Integer.MIN_VALUE;
        return this.f422580h.d(null, 0, null, null, this);
    }
}
