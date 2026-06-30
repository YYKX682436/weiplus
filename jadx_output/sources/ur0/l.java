package ur0;

/* loaded from: classes14.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f430312d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f430313e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ur0.s f430314f;

    /* renamed from: g, reason: collision with root package name */
    public int f430315g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(ur0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f430314f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f430313e = obj;
        this.f430315g |= Integer.MIN_VALUE;
        return this.f430314f.M(0, 0, this);
    }
}
