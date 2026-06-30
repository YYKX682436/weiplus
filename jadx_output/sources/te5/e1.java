package te5;

/* loaded from: classes9.dex */
public final class e1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418629d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f418630e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418631f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f418632g;

    /* renamed from: h, reason: collision with root package name */
    public int f418633h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e1(te5.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418632g = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418631f = obj;
        this.f418633h |= Integer.MIN_VALUE;
        return this.f418632g.cj(null, null, false, this);
    }
}
