package y11;

/* loaded from: classes12.dex */
public final class z extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f458846d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f458847e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ y11.b0 f458848f;

    /* renamed from: g, reason: collision with root package name */
    public int f458849g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(y11.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f458848f = b0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f458847e = obj;
        this.f458849g |= Integer.MIN_VALUE;
        return y11.b0.Zi(this.f458848f, this);
    }
}
