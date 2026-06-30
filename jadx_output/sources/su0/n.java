package su0;

/* loaded from: classes5.dex */
public final class n extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412672d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412673e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412674f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su0.r f412675g;

    /* renamed from: h, reason: collision with root package name */
    public int f412676h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(su0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412675g = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412674f = obj;
        this.f412676h |= Integer.MIN_VALUE;
        return this.f412675g.b(null, null, this);
    }
}
