package sf5;

/* loaded from: classes10.dex */
public final class i extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f407639d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ sf5.k f407640e;

    /* renamed from: f, reason: collision with root package name */
    public int f407641f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(sf5.k kVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f407640e = kVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f407639d = obj;
        this.f407641f |= Integer.MIN_VALUE;
        return this.f407640e.b(null, this);
    }
}
