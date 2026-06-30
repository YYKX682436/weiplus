package qg5;

/* loaded from: classes12.dex */
public final class e0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362954d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362955e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362956f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ qg5.l0 f362957g;

    /* renamed from: h, reason: collision with root package name */
    public int f362958h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(qg5.l0 l0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f362957g = l0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f362956f = obj;
        this.f362958h |= Integer.MIN_VALUE;
        return this.f362957g.pj(null, this);
    }
}
