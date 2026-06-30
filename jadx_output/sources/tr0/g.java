package tr0;

/* loaded from: classes14.dex */
public final class g extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f421299d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f421300e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f421301f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ tr0.t f421302g;

    /* renamed from: h, reason: collision with root package name */
    public int f421303h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(tr0.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f421302g = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f421301f = obj;
        this.f421303h |= Integer.MIN_VALUE;
        return this.f421302g.M(false, this);
    }
}
