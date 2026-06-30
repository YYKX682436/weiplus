package nl4;

/* loaded from: classes11.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f338210d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f338211e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ nl4.r f338212f;

    /* renamed from: g, reason: collision with root package name */
    public int f338213g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(nl4.r rVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f338212f = rVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f338211e = obj;
        this.f338213g |= Integer.MIN_VALUE;
        return nl4.r.q(this.f338212f, 0L, null, null, this);
    }
}
