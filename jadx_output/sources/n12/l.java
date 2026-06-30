package n12;

/* loaded from: classes10.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334093d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f334094e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f334095f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f334096g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ n12.n f334097h;

    /* renamed from: i, reason: collision with root package name */
    public int f334098i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(n12.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f334097h = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f334096g = obj;
        this.f334098i |= Integer.MIN_VALUE;
        return n12.n.a(this.f334097h, null, null, null, null, null, this);
    }
}
