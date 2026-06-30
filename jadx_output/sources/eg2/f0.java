package eg2;

/* loaded from: classes3.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f252560d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f252561e;

    /* renamed from: f, reason: collision with root package name */
    public int f252562f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f252563g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ eg2.i0 f252564h;

    /* renamed from: i, reason: collision with root package name */
    public int f252565i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(eg2.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f252564h = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f252563g = obj;
        this.f252565i |= Integer.MIN_VALUE;
        return this.f252564h.d(null, 0L, this);
    }
}
