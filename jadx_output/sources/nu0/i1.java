package nu0;

/* loaded from: classes5.dex */
public final class i1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f339961d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f339962e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f339963f;

    /* renamed from: g, reason: collision with root package name */
    public int f339964g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f339965h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ nu0.b4 f339966i;

    /* renamed from: m, reason: collision with root package name */
    public int f339967m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i1(nu0.b4 b4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f339966i = b4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f339965h = obj;
        this.f339967m |= Integer.MIN_VALUE;
        return nu0.b4.Y6(this.f339966i, this);
    }
}
