package ls4;

/* loaded from: classes8.dex */
public final class i0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f321063d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f321064e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f321065f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f321066g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f321067h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ ls4.n0 f321068i;

    /* renamed from: m, reason: collision with root package name */
    public int f321069m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i0(ls4.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f321068i = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f321067h = obj;
        this.f321069m |= Integer.MIN_VALUE;
        return this.f321068i.d(null, this);
    }
}
