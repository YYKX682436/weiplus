package xw0;

/* loaded from: classes5.dex */
public final class a extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457572d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457573e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f457574f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f457575g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f457576h;

    /* renamed from: i, reason: collision with root package name */
    public int f457577i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457578m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xw0.r f457579n;

    /* renamed from: o, reason: collision with root package name */
    public int f457580o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(xw0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457579n = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457578m = obj;
        this.f457580o |= Integer.MIN_VALUE;
        return this.f457579n.g(null, null, null, this);
    }
}
