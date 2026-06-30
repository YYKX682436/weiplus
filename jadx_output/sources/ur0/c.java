package ur0;

/* loaded from: classes14.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430285d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f430286e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430287f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430288g;

    /* renamed from: h, reason: collision with root package name */
    public int f430289h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430288g = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430287f = obj;
        this.f430289h |= Integer.MIN_VALUE;
        return ur0.s.I(this.f430288g, this);
    }
}
