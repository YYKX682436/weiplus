package fg0;

/* loaded from: classes12.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f261830d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f261831e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f261832f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ fg0.g f261833g;

    /* renamed from: h, reason: collision with root package name */
    public int f261834h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(fg0.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f261833g = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f261832f = obj;
        this.f261834h |= Integer.MIN_VALUE;
        return this.f261833g.V6(null, null, this);
    }
}
