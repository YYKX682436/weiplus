package xw0;

/* loaded from: classes5.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457593d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457594e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f457595f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f457596g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f457597h;

    /* renamed from: i, reason: collision with root package name */
    public int f457598i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457599m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xw0.r f457600n;

    /* renamed from: o, reason: collision with root package name */
    public int f457601o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(xw0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457600n = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457599m = obj;
        this.f457601o |= Integer.MIN_VALUE;
        return this.f457600n.k(null, this);
    }
}
