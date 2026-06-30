package lm2;

/* loaded from: classes4.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f319402d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f319403e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ lm2.n f319404f;

    /* renamed from: g, reason: collision with root package name */
    public int f319405g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(lm2.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f319404f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f319403e = obj;
        this.f319405g |= Integer.MIN_VALUE;
        return this.f319404f.a(null, 0L, null, this);
    }
}
