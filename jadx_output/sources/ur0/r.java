package ur0;

/* loaded from: classes14.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430326d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430327e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430328f;

    /* renamed from: g, reason: collision with root package name */
    public int f430329g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430328f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430327e = obj;
        this.f430329g |= Integer.MIN_VALUE;
        return this.f430328f.p(this);
    }
}
