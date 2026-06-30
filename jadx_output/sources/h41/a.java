package h41;

/* loaded from: classes14.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f278751d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f278752e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f278753f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f278754g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ h41.j f278755h;

    /* renamed from: i, reason: collision with root package name */
    public int f278756i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(h41.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f278755h = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f278754g = obj;
        this.f278756i |= Integer.MIN_VALUE;
        return this.f278755h.a(false, this);
    }
}
