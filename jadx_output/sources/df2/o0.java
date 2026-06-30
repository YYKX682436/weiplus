package df2;

/* loaded from: classes3.dex */
public final class o0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f230905d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f230906e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f230907f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f230908g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ df2.v0 f230909h;

    /* renamed from: i, reason: collision with root package name */
    public int f230910i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o0(df2.v0 v0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f230909h = v0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f230908g = obj;
        this.f230910i |= Integer.MIN_VALUE;
        return this.f230909h.d7(null, null, false, this);
    }
}
