package eq1;

/* loaded from: classes.dex */
public final class t extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f255862d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f255863e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ eq1.u f255864f;

    /* renamed from: g, reason: collision with root package name */
    public int f255865g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t(eq1.u uVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f255864f = uVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f255863e = obj;
        this.f255865g |= Integer.MIN_VALUE;
        java.lang.Object d17 = this.f255864f.d(this);
        return d17 == pz5.a.f359186d ? d17 : kotlin.Result.m520boximpl(d17);
    }
}
