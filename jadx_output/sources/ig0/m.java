package ig0;

/* loaded from: classes12.dex */
public final class m extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f291326d;

    /* renamed from: e, reason: collision with root package name */
    public java.lang.Object f291327e;

    /* renamed from: f, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f291328f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ ig0.o f291329g;

    /* renamed from: h, reason: collision with root package name */
    public int f291330h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(ig0.o oVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f291329g = oVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f291328f = obj;
        this.f291330h |= Integer.MIN_VALUE;
        return this.f291329g.ij(null, this);
    }
}
