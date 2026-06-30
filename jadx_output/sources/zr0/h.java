package zr0;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475133d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f475134e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475135f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475136g;

    /* renamed from: h, reason: collision with root package name */
    public int f475137h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(zr0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475136g = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475135f = obj;
        this.f475137h |= Integer.MIN_VALUE;
        return this.f475136g.l(null, 0, 0, this);
    }
}
