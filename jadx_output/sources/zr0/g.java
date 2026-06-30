package zr0;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475128d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f475129e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475130f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475131g;

    /* renamed from: h, reason: collision with root package name */
    public int f475132h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(zr0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475131g = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475130f = obj;
        this.f475132h |= Integer.MIN_VALUE;
        return this.f475131g.k(null, this);
    }
}
