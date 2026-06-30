package dk2;

/* loaded from: classes3.dex */
public final class t1 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f234091d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f234092e;

    /* renamed from: f, reason: collision with root package name */
    public java.lang.Object f234093f;

    /* renamed from: g, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f234094g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ dk2.r4 f234095h;

    /* renamed from: i, reason: collision with root package name */
    public int f234096i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t1(dk2.r4 r4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f234095h = r4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f234094g = obj;
        this.f234096i |= Integer.MIN_VALUE;
        return this.f234095h.F(0, 0, this);
    }
}
