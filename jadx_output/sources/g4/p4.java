package g4;

/* loaded from: classes14.dex */
public final class p4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f268491d;

    /* renamed from: e, reason: collision with root package name */
    public int f268492e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ g4.r4 f268493f;

    /* renamed from: g, reason: collision with root package name */
    public java.lang.Object f268494g;

    /* renamed from: h, reason: collision with root package name */
    public java.lang.Object f268495h;

    /* renamed from: i, reason: collision with root package name */
    public java.lang.Object f268496i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(g4.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f268493f = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f268491d = obj;
        this.f268492e |= Integer.MIN_VALUE;
        return this.f268493f.a(null, this);
    }
}
