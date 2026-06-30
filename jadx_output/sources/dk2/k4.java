package dk2;

/* loaded from: classes3.dex */
public final class k4 extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f233680d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dk2.q4 f233681e;

    /* renamed from: f, reason: collision with root package name */
    public int f233682f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k4(dk2.q4 q4Var, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f233681e = q4Var;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f233680d = obj;
        this.f233682f |= Integer.MIN_VALUE;
        return this.f233681e.k(null, null, null, false, this);
    }
}
