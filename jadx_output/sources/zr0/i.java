package zr0;

/* loaded from: classes14.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475138d;

    /* renamed from: e, reason: collision with root package name */
    public long f475139e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475140f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475141g;

    /* renamed from: h, reason: collision with root package name */
    public int f475142h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(zr0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475141g = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475140f = obj;
        this.f475142h |= Integer.MIN_VALUE;
        return this.f475141g.m(null, this);
    }
}
