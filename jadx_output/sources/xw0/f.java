package xw0;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f457611d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f457612e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f457613f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f457614g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f457615h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ xw0.r f457616i;

    /* renamed from: m, reason: collision with root package name */
    public int f457617m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(xw0.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f457616i = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f457615h = obj;
        this.f457617m |= Integer.MIN_VALUE;
        return this.f457616i.p(null, null, null, null, this);
    }
}
