package nz0;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f341499d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f341500e;

    /* renamed from: f, reason: collision with root package name */
    public int f341501f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341502g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ nz0.o f341503h;

    /* renamed from: i, reason: collision with root package name */
    public int f341504i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(nz0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f341503h = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f341502g = obj;
        this.f341504i |= Integer.MIN_VALUE;
        return this.f341503h.b(null, 0, this);
    }
}
