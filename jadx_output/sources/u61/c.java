package u61;

/* loaded from: classes4.dex */
public final class c extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f424879d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f424880e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f424881f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ u61.d f424882g;

    /* renamed from: h, reason: collision with root package name */
    public int f424883h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(u61.d dVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f424882g = dVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f424881f = obj;
        this.f424883h |= Integer.MIN_VALUE;
        return this.f424882g.a(null, null, null, null, this);
    }
}
