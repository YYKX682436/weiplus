package ir2;

/* loaded from: classes2.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f294105d;

    /* renamed from: e, reason: collision with root package name */
    public long f294106e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f294107f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ir2.c f294108g;

    /* renamed from: h, reason: collision with root package name */
    public int f294109h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(ir2.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f294108g = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f294107f = obj;
        this.f294109h |= Integer.MIN_VALUE;
        return ir2.c.g(this.f294108g, this);
    }
}
