package tx0;

/* loaded from: classes.dex */
public final class d extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f422506d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f422507e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ tx0.k f422508f;

    /* renamed from: g, reason: collision with root package name */
    public int f422509g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(tx0.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f422508f = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f422507e = obj;
        this.f422509g |= Integer.MIN_VALUE;
        java.lang.Object c17 = this.f422508f.c(this);
        return c17 == pz5.a.f359186d ? c17 : kotlin.Result.m520boximpl(c17);
    }
}
