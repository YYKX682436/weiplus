package rv0;

/* loaded from: classes5.dex */
public final class q5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f400203d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f400204e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f400205f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400206g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ rv0.z6 f400207h;

    /* renamed from: i, reason: collision with root package name */
    public int f400208i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q5(rv0.z6 z6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f400207h = z6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f400206g = obj;
        this.f400208i |= Integer.MIN_VALUE;
        return rv0.z6.m7(this.f400207h, null, this);
    }
}
