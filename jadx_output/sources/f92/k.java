package f92;

/* loaded from: classes10.dex */
public final class k extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260254d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f92.t f260255e;

    /* renamed from: f, reason: collision with root package name */
    public int f260256f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k(f92.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260255e = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260254d = obj;
        this.f260256f |= Integer.MIN_VALUE;
        java.lang.Object c47 = this.f260255e.c4(null, this);
        return c47 == pz5.a.f359186d ? c47 : kotlin.Result.m520boximpl(c47);
    }
}
