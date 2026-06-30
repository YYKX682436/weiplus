package dx0;

/* loaded from: classes5.dex */
public final class j extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f244443d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ dx0.n f244444e;

    /* renamed from: f, reason: collision with root package name */
    public int f244445f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(dx0.n nVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f244444e = nVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f244443d = obj;
        this.f244445f |= Integer.MIN_VALUE;
        return this.f244444e.c(null, false, this);
    }
}
