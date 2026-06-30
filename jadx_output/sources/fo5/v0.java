package fo5;

/* loaded from: classes11.dex */
public final class v0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f265125d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f265126e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f265127f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f265128g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f265129h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ fo5.x0 f265130i;

    /* renamed from: m, reason: collision with root package name */
    public int f265131m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v0(fo5.x0 x0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f265130i = x0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f265129h = obj;
        this.f265131m |= Integer.MIN_VALUE;
        return this.f265130i.a(null, null, this);
    }
}
