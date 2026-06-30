package ou4;

/* loaded from: classes8.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f349013d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f349014e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ou4.s f349015f;

    /* renamed from: g, reason: collision with root package name */
    public int f349016g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ou4.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f349015f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f349014e = obj;
        this.f349016g |= Integer.MIN_VALUE;
        return this.f349015f.f(this);
    }
}
