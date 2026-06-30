package pi0;

/* loaded from: classes11.dex */
public final class r0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f354720d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f354721e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ pi0.t0 f354722f;

    /* renamed from: g, reason: collision with root package name */
    public int f354723g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(pi0.t0 t0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f354722f = t0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f354721e = obj;
        this.f354723g |= Integer.MIN_VALUE;
        return this.f354722f.a(null, this);
    }
}
