package xw0;

/* loaded from: classes5.dex */
public final class e extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457602d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457603e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f457604f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f457605g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f457606h;

    /* renamed from: i, reason: collision with root package name */
    public int f457607i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457608m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ xw0.r f457609n;

    /* renamed from: o, reason: collision with root package name */
    public int f457610o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(xw0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457609n = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457608m = obj;
        this.f457610o |= Integer.MIN_VALUE;
        return this.f457609n.n(null, this);
    }
}
