package dk2;

/* loaded from: classes3.dex */
public final class p4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f233897d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f233898e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233899f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ dk2.q4 f233900g;

    /* renamed from: h, reason: collision with root package name */
    public int f233901h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p4(dk2.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f233900g = q4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f233899f = obj;
        this.f233901h |= Integer.MIN_VALUE;
        return this.f233900g.q(null, null, null, this);
    }
}
