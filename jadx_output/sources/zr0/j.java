package zr0;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475143d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f475144e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475145f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475146g;

    /* renamed from: h, reason: collision with root package name */
    public int f475147h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(zr0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475146g = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475145f = obj;
        this.f475147h |= Integer.MIN_VALUE;
        return this.f475146g.n(null, this);
    }
}
