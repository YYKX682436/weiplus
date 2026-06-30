package g75;

/* loaded from: classes10.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269367d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269368e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269369f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f269370g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g75.k f269371h;

    /* renamed from: i, reason: collision with root package name */
    public int f269372i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(g75.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f269371h = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f269370g = obj;
        this.f269372i |= Integer.MIN_VALUE;
        return this.f269371h.a(null, null, null, 0L, this);
    }
}
