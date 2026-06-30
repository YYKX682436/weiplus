package nz0;

/* loaded from: classes5.dex */
public final class b extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f341490d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ nz0.d f341491e;

    /* renamed from: f, reason: collision with root package name */
    public int f341492f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(nz0.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f341491e = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f341490d = obj;
        this.f341492f |= Integer.MIN_VALUE;
        return this.f341491e.b(this);
    }
}
