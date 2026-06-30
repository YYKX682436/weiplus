package h41;

/* loaded from: classes14.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f278786d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f278787e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f278788f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278789g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h41.j f278790h;

    /* renamed from: i, reason: collision with root package name */
    public int f278791i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(h41.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278790h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278789g = obj;
        this.f278791i |= Integer.MIN_VALUE;
        return this.f278790h.d(null, this);
    }
}
