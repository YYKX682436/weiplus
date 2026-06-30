package yf0;

/* loaded from: classes12.dex */
public final class v extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f461607d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f461608e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f461609f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f461610g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f461611h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ yf0.k0 f461612i;

    /* renamed from: m, reason: collision with root package name */
    public int f461613m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v(yf0.k0 k0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f461612i = k0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f461611h = obj;
        this.f461613m |= Integer.MIN_VALUE;
        return yf0.k0.U6(this.f461612i, null, null, this);
    }
}
