package e21;

/* loaded from: classes11.dex */
public final class p0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f246563d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f246564e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ e21.z0 f246565f;

    /* renamed from: g, reason: collision with root package name */
    public int f246566g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p0(e21.z0 z0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f246565f = z0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f246564e = obj;
        this.f246566g |= Integer.MIN_VALUE;
        return this.f246565f.g(null, this);
    }
}
