package rv0;

/* loaded from: classes5.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f400010d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ rv0.n1 f400011e;

    /* renamed from: f, reason: collision with root package name */
    public int f400012f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(rv0.n1 n1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f400011e = n1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f400010d = obj;
        this.f400012f |= Integer.MIN_VALUE;
        return rv0.n1.l7(this.f400011e, null, this);
    }
}
