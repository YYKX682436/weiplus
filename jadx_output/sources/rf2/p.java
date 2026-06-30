package rf2;

/* loaded from: classes10.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f394845d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f394846e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f394847f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ rf2.q f394848g;

    /* renamed from: h, reason: collision with root package name */
    public int f394849h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(rf2.q qVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f394848g = qVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f394847f = obj;
        this.f394849h |= Integer.MIN_VALUE;
        return rf2.q.c(this.f394848g, null, this);
    }
}
