package g4;

/* loaded from: classes5.dex */
public final class h0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268324d;

    /* renamed from: e, reason: collision with root package name */
    public int f268325e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.i0 f268326f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268327g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268328h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268329i;

    /* renamed from: m, reason: collision with root package name */
    public java.lang.Object f268330m;

    /* renamed from: n, reason: collision with root package name */
    public java.lang.Object f268331n;

    /* renamed from: o, reason: collision with root package name */
    public java.lang.Object f268332o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h0(g4.i0 i0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268326f = i0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268324d = obj;
        this.f268325e |= Integer.MIN_VALUE;
        return this.f268326f.b(null, this);
    }
}
