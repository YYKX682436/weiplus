package df2;

/* loaded from: classes3.dex */
public final class t5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231410d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231411e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231412f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.w5 f231413g;

    /* renamed from: h, reason: collision with root package name */
    public int f231414h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t5(df2.w5 w5Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231413g = w5Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231412f = obj;
        this.f231414h |= Integer.MIN_VALUE;
        return df2.w5.a(this.f231413g, this);
    }
}
