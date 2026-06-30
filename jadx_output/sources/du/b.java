package du;

/* loaded from: classes12.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f243315d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f243316e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f243317f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ du.c f243318g;

    /* renamed from: h, reason: collision with root package name */
    public int f243319h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(du.c cVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f243318g = cVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f243317f = obj;
        this.f243319h |= Integer.MIN_VALUE;
        return this.f243318g.i(null, null, this);
    }
}
