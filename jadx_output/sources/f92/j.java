package f92;

/* loaded from: classes10.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260251d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f92.t f260252e;

    /* renamed from: f, reason: collision with root package name */
    public int f260253f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(f92.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260252e = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260251d = obj;
        this.f260253f |= Integer.MIN_VALUE;
        java.lang.Object D4 = this.f260252e.D4(null, this);
        return D4 == pz5.a.f359186d ? D4 : kotlin.Result.m520boximpl(D4);
    }
}
