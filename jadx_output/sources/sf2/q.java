package sf2;

/* loaded from: classes10.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407242d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407243e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407244f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.x f407245g;

    /* renamed from: h, reason: collision with root package name */
    public int f407246h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(sf2.x xVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407245g = xVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407244f = obj;
        this.f407246h |= Integer.MIN_VALUE;
        return this.f407245g.o7(null, this);
    }
}
