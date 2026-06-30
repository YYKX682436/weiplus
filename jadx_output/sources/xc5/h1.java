package xc5;

/* loaded from: classes12.dex */
public final class h1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f453469d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f453470e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f453471f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f453472g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f453473h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f453474i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ xc5.k1 f453475m;

    /* renamed from: n, reason: collision with root package name */
    public int f453476n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h1(xc5.k1 k1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f453475m = k1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f453474i = obj;
        this.f453476n |= Integer.MIN_VALUE;
        return this.f453475m.n7(null, null, null, null, this);
    }
}
