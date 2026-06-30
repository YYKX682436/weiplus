package yn1;

/* loaded from: classes11.dex */
public final class q extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f463792d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f463793e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f463794f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f463795g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f463796h;

    /* renamed from: i, reason: collision with root package name */
    public long f463797i;

    /* renamed from: m, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f463798m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ yn1.s f463799n;

    /* renamed from: o, reason: collision with root package name */
    public int f463800o;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(yn1.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f463799n = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f463798m = obj;
        this.f463800o |= Integer.MIN_VALUE;
        return yn1.s.wi(this.f463799n, this);
    }
}
