package ny0;

/* loaded from: classes5.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341388d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ ny0.d f341389e;

    /* renamed from: f, reason: collision with root package name */
    public int f341390f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ny0.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f341389e = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f341388d = obj;
        this.f341390f |= Integer.MIN_VALUE;
        return this.f341389e.g(null, this);
    }
}
