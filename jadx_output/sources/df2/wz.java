package df2;

/* loaded from: classes3.dex */
public final class wz extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f231745d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f231746e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f231747f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.a00 f231748g;

    /* renamed from: h, reason: collision with root package name */
    public int f231749h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public wz(df2.a00 a00Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f231748g = a00Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f231747f = obj;
        this.f231749h |= Integer.MIN_VALUE;
        return df2.a00.a7(this.f231748g, null, this);
    }
}
