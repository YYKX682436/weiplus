package rv0;

/* loaded from: classes5.dex */
public final class s5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400240d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f400241e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f400242f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400243g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400244h;

    /* renamed from: i, reason: collision with root package name */
    public int f400245i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public s5(rv0.z6 z6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f400244h = z6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f400243g = obj;
        this.f400245i |= Integer.MIN_VALUE;
        return rv0.z6.n7(this.f400244h, null, false, this);
    }
}
