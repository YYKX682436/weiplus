package v20;

/* loaded from: classes10.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f432741d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f432742e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f432743f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f432744g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f432745h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f432746i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ v20.g f432747m;

    /* renamed from: n, reason: collision with root package name */
    public int f432748n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(v20.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f432747m = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f432746i = obj;
        this.f432748n |= Integer.MIN_VALUE;
        return this.f432747m.a(null, null, null, false, this);
    }
}
