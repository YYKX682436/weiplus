package u20;

/* loaded from: classes9.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f423942d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f423943e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f423944f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f423945g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f423946h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ u20.y f423947i;

    /* renamed from: m, reason: collision with root package name */
    public int f423948m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(u20.y yVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f423947i = yVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f423946h = obj;
        this.f423948m |= Integer.MIN_VALUE;
        return u20.y.e(this.f423947i, null, this);
    }
}
