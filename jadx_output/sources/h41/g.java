package h41;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f278779d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f278780e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f278781f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278782g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h41.j f278783h;

    /* renamed from: i, reason: collision with root package name */
    public int f278784i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(h41.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278783h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278782g = obj;
        this.f278784i |= Integer.MIN_VALUE;
        return this.f278783h.c(null, this);
    }
}
