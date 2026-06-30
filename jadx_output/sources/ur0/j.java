package ur0;

/* loaded from: classes14.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430302d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f430303e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430304f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430305g;

    /* renamed from: h, reason: collision with root package name */
    public int f430306h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430305g = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430304f = obj;
        this.f430306h |= Integer.MIN_VALUE;
        return this.f430305g.L(false, this);
    }
}
