package df2;

/* loaded from: classes3.dex */
public final class z0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231912d;

    /* renamed from: e, reason: collision with root package name */
    public int f231913e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231914f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f231915g;

    /* renamed from: h, reason: collision with root package name */
    public int f231916h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z0(df2.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231915g = d1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231914f = obj;
        this.f231916h |= Integer.MIN_VALUE;
        return this.f231915g.b7(null, 0, this);
    }
}
