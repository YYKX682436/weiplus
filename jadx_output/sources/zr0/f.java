package zr0;

/* loaded from: classes14.dex */
public final class f extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f475124d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f475125e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ zr0.p f475126f;

    /* renamed from: g, reason: collision with root package name */
    public int f475127g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(zr0.p pVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f475126f = pVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f475125e = obj;
        this.f475127g |= Integer.MIN_VALUE;
        return this.f475126f.j(this);
    }
}
