package su2;

/* loaded from: classes2.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412756d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412757e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412758f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su2.p f412759g;

    /* renamed from: h, reason: collision with root package name */
    public int f412760h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(su2.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412759g = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412758f = obj;
        this.f412760h |= Integer.MIN_VALUE;
        return this.f412759g.b(null, this);
    }
}
