package s72;

/* loaded from: classes12.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f404112d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f404113e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f404114f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f404115g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ s72.j0 f404116h;

    /* renamed from: i, reason: collision with root package name */
    public int f404117i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(s72.j0 j0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f404116h = j0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f404115g = obj;
        this.f404117i |= Integer.MIN_VALUE;
        return this.f404116h.Z6(null, this);
    }
}
