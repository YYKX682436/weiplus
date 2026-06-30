package f80;

/* loaded from: classes12.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f260102d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f260103e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260104f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ f80.j f260105g;

    /* renamed from: h, reason: collision with root package name */
    public int f260106h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(f80.j jVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260105g = jVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260104f = obj;
        this.f260106h |= Integer.MIN_VALUE;
        return f80.j.o(this.f260105g, this);
    }
}
