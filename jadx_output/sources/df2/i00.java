package df2;

/* loaded from: classes3.dex */
public final class i00 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230370d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230371e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230372f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ df2.m00 f230373g;

    /* renamed from: h, reason: collision with root package name */
    public int f230374h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i00(df2.m00 m00Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230373g = m00Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230372f = obj;
        this.f230374h |= Integer.MIN_VALUE;
        return df2.m00.a7(this.f230373g, 0, this);
    }
}
