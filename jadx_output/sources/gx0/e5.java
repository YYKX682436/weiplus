package gx0;

/* loaded from: classes5.dex */
public final class e5 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f276358d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f276359e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f276360f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ gx0.w8 f276361g;

    /* renamed from: h, reason: collision with root package name */
    public int f276362h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e5(gx0.w8 w8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f276361g = w8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f276360f = obj;
        this.f276362h |= Integer.MIN_VALUE;
        return gx0.w8.a7(this.f276361g, null, null, this);
    }
}
