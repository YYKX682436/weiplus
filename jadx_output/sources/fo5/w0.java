package fo5;

/* loaded from: classes11.dex */
public final class w0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f265135d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f265136e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f265137f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f265138g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f265139h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fo5.x0 f265140i;

    /* renamed from: m, reason: collision with root package name */
    public int f265141m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public w0(fo5.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f265140i = x0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f265139h = obj;
        this.f265141m |= Integer.MIN_VALUE;
        return this.f265140i.b(null, null, this);
    }
}
