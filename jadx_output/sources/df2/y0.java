package df2;

/* loaded from: classes3.dex */
public final class y0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231834d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231835e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ df2.d1 f231836f;

    /* renamed from: g, reason: collision with root package name */
    public int f231837g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y0(df2.d1 d1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231836f = d1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231835e = obj;
        this.f231837g |= Integer.MIN_VALUE;
        return this.f231836f.a7(null, null, this);
    }
}
