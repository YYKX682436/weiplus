package wh5;

/* loaded from: classes12.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f446027d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f446028e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f446029f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f446030g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f446031h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f446032i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wh5.g0 f446033m;

    /* renamed from: n, reason: collision with root package name */
    public int f446034n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(wh5.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f446033m = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f446032i = obj;
        this.f446034n |= Integer.MIN_VALUE;
        return wh5.g0.c7(this.f446033m, null, null, null, this);
    }
}
