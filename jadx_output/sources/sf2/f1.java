package sf2;

/* loaded from: classes10.dex */
public final class f1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f407131d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f407132e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407133f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ sf2.i1 f407134g;

    /* renamed from: h, reason: collision with root package name */
    public int f407135h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f1(sf2.i1 i1Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407134g = i1Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407133f = obj;
        this.f407135h |= Integer.MIN_VALUE;
        return this.f407134g.a(null, this);
    }
}
