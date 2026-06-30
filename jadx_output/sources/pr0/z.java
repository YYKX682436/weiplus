package pr0;

/* loaded from: classes14.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f357927d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ pr0.g0 f357928e;

    /* renamed from: f, reason: collision with root package name */
    public int f357929f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(pr0.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f357928e = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f357927d = obj;
        this.f357929f |= Integer.MIN_VALUE;
        return pr0.g0.p(this.f357928e, 0, this);
    }
}
