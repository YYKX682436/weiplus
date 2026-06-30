package n12;

/* loaded from: classes10.dex */
public final class h extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f334078d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f334079e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ n12.n f334080f;

    /* renamed from: g, reason: collision with root package name */
    public int f334081g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(n12.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f334080f = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f334079e = obj;
        this.f334081g |= Integer.MIN_VALUE;
        return this.f334080f.b(this);
    }
}
