package g80;

/* loaded from: classes12.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f269461d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f269462e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f269463f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f269464g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ g80.o f269465h;

    /* renamed from: i, reason: collision with root package name */
    public int f269466i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g80.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f269465h = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f269464g = obj;
        this.f269466i |= Integer.MIN_VALUE;
        return g80.o.U6(this.f269465h, null, null, null, this);
    }
}
