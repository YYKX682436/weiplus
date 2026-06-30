package hu0;

/* loaded from: classes5.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f285051d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f285052e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f285053f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu0.a0 f285054g;

    /* renamed from: h, reason: collision with root package name */
    public int f285055h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(hu0.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f285054g = a0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f285053f = obj;
        this.f285055h |= Integer.MIN_VALUE;
        return this.f285054g.P6(this);
    }
}
