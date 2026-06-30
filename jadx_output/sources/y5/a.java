package y5;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f459397d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f459398e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f459399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ y5.c f459400g;

    /* renamed from: h, reason: collision with root package name */
    public int f459401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(y5.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f459400g = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f459399f = obj;
        this.f459401h |= Integer.MIN_VALUE;
        return this.f459400g.b(null, this);
    }
}
