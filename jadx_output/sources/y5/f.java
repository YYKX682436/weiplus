package y5;

/* loaded from: classes14.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f459429d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f459430e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f459431f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y5.g f459432g;

    /* renamed from: h, reason: collision with root package name */
    public int f459433h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(y5.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f459432g = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f459431f = obj;
        this.f459433h |= Integer.MIN_VALUE;
        return this.f459432g.b(null, this);
    }
}
