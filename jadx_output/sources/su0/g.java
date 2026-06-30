package su0;

/* loaded from: classes5.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f412648d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f412649e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f412650f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ su0.j f412651g;

    /* renamed from: h, reason: collision with root package name */
    public int f412652h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(su0.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f412651g = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f412650f = obj;
        this.f412652h |= Integer.MIN_VALUE;
        return this.f412651g.a(null, this);
    }
}
