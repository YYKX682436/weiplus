package f92;

/* loaded from: classes10.dex */
public final class l extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f260257d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ f92.t f260258e;

    /* renamed from: f, reason: collision with root package name */
    public int f260259f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(f92.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f260258e = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f260257d = obj;
        this.f260259f |= Integer.MIN_VALUE;
        java.lang.Object x17 = this.f260258e.x1(0, this);
        return x17 == pz5.a.f359186d ? x17 : kotlin.Result.m520boximpl(x17);
    }
}
