package qf2;

/* loaded from: classes10.dex */
public final class u2 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f362604d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f362605e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f362606f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f362607g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ qf2.c3 f362608h;

    /* renamed from: i, reason: collision with root package name */
    public int f362609i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public u2(qf2.c3 c3Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f362608h = c3Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f362607g = obj;
        this.f362609i |= Integer.MIN_VALUE;
        return this.f362608h.g7(0, null, false, null, this);
    }
}
