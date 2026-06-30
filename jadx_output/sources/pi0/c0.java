package pi0;

/* loaded from: classes11.dex */
public final class c0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354538d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354539e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.g0 f354540f;

    /* renamed from: g, reason: collision with root package name */
    public int f354541g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c0(pi0.g0 g0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354540f = g0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354539e = obj;
        this.f354541g |= Integer.MIN_VALUE;
        return this.f354540f.a(null, 0L, null, false, this);
    }
}
