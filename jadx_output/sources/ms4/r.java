package ms4;

/* loaded from: classes8.dex */
public final class r extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f331100d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f331101e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ ms4.t f331102f;

    /* renamed from: g, reason: collision with root package name */
    public int f331103g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(ms4.t tVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f331102f = tVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f331101e = obj;
        this.f331103g |= Integer.MIN_VALUE;
        return this.f331102f.N6(null, this);
    }
}
