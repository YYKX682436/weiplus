package df2;

/* loaded from: classes3.dex */
public final class o6 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230921d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230922e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f230923f;

    /* renamed from: g, reason: collision with root package name */
    public float f230924g;

    /* renamed from: h, reason: collision with root package name */
    public float f230925h;

    /* renamed from: i, reason: collision with root package name */
    public float f230926i;

    /* renamed from: m, reason: collision with root package name */
    public float f230927m;

    /* renamed from: n, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230928n;

    /* renamed from: o, reason: collision with root package name */
    public final /* synthetic */ df2.t6 f230929o;

    /* renamed from: p, reason: collision with root package name */
    public int f230930p;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6(df2.t6 t6Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230929o = t6Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230928n = obj;
        this.f230930p |= Integer.MIN_VALUE;
        return df2.t6.b7(this.f230929o, null, null, null, 0.0f, 0.0f, 0.0f, 0.0f, null, this);
    }
}
