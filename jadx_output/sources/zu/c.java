package zu;

/* loaded from: classes12.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475637d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f475638e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f475639f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f475640g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f475641h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475642i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ zu.d f475643m;

    /* renamed from: n, reason: collision with root package name */
    public int f475644n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(zu.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475643m = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475642i = obj;
        this.f475644n |= Integer.MIN_VALUE;
        return this.f475643m.T6(null, this);
    }
}
