package xy0;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f458137d;

    /* renamed from: e, reason: collision with root package name */
    public int f458138e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f458139f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xy0.g f458140g;

    /* renamed from: h, reason: collision with root package name */
    public int f458141h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xy0.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f458140g = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f458139f = obj;
        this.f458141h |= Integer.MIN_VALUE;
        return this.f458140g.b(null, this);
    }
}
