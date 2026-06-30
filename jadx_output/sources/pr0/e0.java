package pr0;

/* loaded from: classes14.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f357822d;

    /* renamed from: e, reason: collision with root package name */
    public long f357823e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357824f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357825g;

    /* renamed from: h, reason: collision with root package name */
    public int f357826h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(pr0.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357825g = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357824f = obj;
        this.f357826h |= Integer.MIN_VALUE;
        return pr0.g0.r(this.f357825g, 0, 0, 0, false, this);
    }
}
