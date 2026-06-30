package pr0;

/* loaded from: classes14.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357828d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f357829e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357830f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357831g;

    /* renamed from: h, reason: collision with root package name */
    public int f357832h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(pr0.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357831g = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357830f = obj;
        this.f357832h |= Integer.MIN_VALUE;
        return pr0.g0.q(this.f357831g, 0, 0, 0, null, false, this);
    }
}
