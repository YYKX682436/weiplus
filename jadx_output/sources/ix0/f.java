package ix0;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f295298d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f295299e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f295300f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f295301g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f295302h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ix0.g f295303i;

    /* renamed from: m, reason: collision with root package name */
    public int f295304m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(ix0.g gVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f295303i = gVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f295302h = obj;
        this.f295304m |= Integer.MIN_VALUE;
        return ix0.g.i(this.f295303i, null, null, this);
    }
}
