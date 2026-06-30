package yy0;

/* loaded from: classes5.dex */
public final class j8 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f468173d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f468174e;

    /* renamed from: f, reason: collision with root package name */
    public long f468175f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f468176g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ yy0.k8 f468177h;

    /* renamed from: i, reason: collision with root package name */
    public int f468178i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j8(yy0.k8 k8Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f468177h = k8Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f468176g = obj;
        this.f468178i |= Integer.MIN_VALUE;
        return this.f468177h.Di(null, 0L, null, this);
    }
}
