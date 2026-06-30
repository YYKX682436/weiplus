package wf2;

/* loaded from: classes10.dex */
public final class o extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f445603d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f445604e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f445605f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f445606g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f445607h;

    /* renamed from: i, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f445608i;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ wf2.a0 f445609m;

    /* renamed from: n, reason: collision with root package name */
    public int f445610n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(wf2.a0 a0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f445609m = a0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f445608i = obj;
        this.f445610n |= Integer.MIN_VALUE;
        return this.f445609m.Z6(null, null, null, this);
    }
}
