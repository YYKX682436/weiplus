package xx0;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457871d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457872e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457873f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ xx0.i f457874g;

    /* renamed from: h, reason: collision with root package name */
    public int f457875h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xx0.i iVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457874g = iVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457873f = obj;
        this.f457875h |= Integer.MIN_VALUE;
        return this.f457874g.a(null, this);
    }
}
