package tx2;

/* loaded from: classes15.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422559d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f422560e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422561f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tx2.k f422562g;

    /* renamed from: h, reason: collision with root package name */
    public int f422563h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tx2.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422562g = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422561f = obj;
        this.f422563h |= Integer.MIN_VALUE;
        return this.f422562g.b(null, null, this);
    }
}
