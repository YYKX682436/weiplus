package xc5;

/* loaded from: classes12.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453454d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453455e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f453456f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f453457g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f453458h;

    /* renamed from: i, reason: collision with root package name */
    public int f453459i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(xc5.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f453458h = k1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f453457g = obj;
        this.f453459i |= Integer.MIN_VALUE;
        return this.f453458h.m7(null, null, null, this);
    }
}
