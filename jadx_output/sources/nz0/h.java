package nz0;

/* loaded from: classes5.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public int f341508d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f341509e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341510f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ nz0.o f341511g;

    /* renamed from: h, reason: collision with root package name */
    public int f341512h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(nz0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f341511g = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f341510f = obj;
        this.f341512h |= Integer.MIN_VALUE;
        return nz0.o.a(this.f341511g, 0, null, this);
    }
}
