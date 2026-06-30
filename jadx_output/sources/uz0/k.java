package uz0;

/* loaded from: classes14.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432132d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432133e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f432134f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432135g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ uz0.n f432136h;

    /* renamed from: i, reason: collision with root package name */
    public int f432137i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(uz0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432136h = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432135g = obj;
        this.f432137i |= Integer.MIN_VALUE;
        return this.f432136h.e(null, null, 0, 0.0f, this);
    }
}
