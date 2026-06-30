package n12;

/* loaded from: classes10.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334083d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f334084e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n12.n f334085f;

    /* renamed from: g, reason: collision with root package name */
    public int f334086g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(n12.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f334085f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f334084e = obj;
        this.f334086g |= Integer.MIN_VALUE;
        return this.f334085f.c(this);
    }
}
