package lu3;

/* loaded from: classes10.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f321396d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f321397e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f321398f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ lu3.m f321399g;

    /* renamed from: h, reason: collision with root package name */
    public int f321400h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(lu3.m mVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f321399g = mVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f321398f = obj;
        this.f321400h |= Integer.MIN_VALUE;
        return this.f321399g.d(null, this);
    }
}
