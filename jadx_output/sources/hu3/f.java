package hu3;

/* loaded from: classes5.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f285120d;

    /* renamed from: e, reason: collision with root package name */
    public int f285121e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f285122f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ hu3.n0 f285123g;

    /* renamed from: h, reason: collision with root package name */
    public int f285124h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(hu3.n0 n0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f285123g = n0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f285122f = obj;
        this.f285124h |= Integer.MIN_VALUE;
        return this.f285123g.f(this);
    }
}
