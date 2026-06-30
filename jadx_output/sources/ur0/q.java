package ur0;

/* loaded from: classes14.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430322d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430323e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430324f;

    /* renamed from: g, reason: collision with root package name */
    public int f430325g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430324f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430323e = obj;
        this.f430325g |= Integer.MIN_VALUE;
        return this.f430324f.n(null, this);
    }
}
