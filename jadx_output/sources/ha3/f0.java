package ha3;

/* loaded from: classes15.dex */
public final class f0 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f279845d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f279846e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f279847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ha3.h0 f279848g;

    /* renamed from: h, reason: collision with root package name */
    public int f279849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f0(ha3.h0 h0Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f279848g = h0Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f279847f = obj;
        this.f279849h |= Integer.MIN_VALUE;
        return this.f279848g.a(null, this);
    }
}
