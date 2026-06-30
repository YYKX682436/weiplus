package ng1;

/* loaded from: classes7.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f336919d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f336920e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f336921f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f336922g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ ng1.f f336923h;

    /* renamed from: i, reason: collision with root package name */
    public int f336924i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(ng1.f fVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f336923h = fVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f336922g = obj;
        this.f336924i |= Integer.MIN_VALUE;
        return ng1.f.b(this.f336923h, null, this);
    }
}
