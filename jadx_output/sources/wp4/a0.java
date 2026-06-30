package wp4;

/* loaded from: classes10.dex */
public final class a0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f448397d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f448398e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f448399f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ wp4.b0 f448400g;

    /* renamed from: h, reason: collision with root package name */
    public int f448401h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a0(wp4.b0 b0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f448400g = b0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f448399f = obj;
        this.f448401h |= Integer.MIN_VALUE;
        return this.f448400g.Ai(null, this);
    }
}
