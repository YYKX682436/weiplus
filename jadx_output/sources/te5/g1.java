package te5;

/* loaded from: classes9.dex */
public final class g1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f418642d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f418643e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f418644f;

    /* renamed from: g, reason: collision with root package name */
    public int f418645g;

    /* renamed from: h, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f418646h;

    /* renamed from: i, reason: collision with root package name */
    public final /* synthetic */ te5.l1 f418647i;

    /* renamed from: m, reason: collision with root package name */
    public int f418648m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g1(te5.l1 l1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f418647i = l1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f418646h = obj;
        this.f418648m |= Integer.MIN_VALUE;
        return this.f418647i.ij(null, null, 0, null, null, false, 0, this);
    }
}
