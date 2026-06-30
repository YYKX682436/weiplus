package un0;

/* loaded from: classes14.dex */
public final class p extends qz5.d {

    /* renamed from: d, reason: collision with root package name */
    public java.lang.Object f429405d;

    /* renamed from: e, reason: collision with root package name */
    public /* synthetic */ java.lang.Object f429406e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ un0.s f429407f;

    /* renamed from: g, reason: collision with root package name */
    public int f429408g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(un0.s sVar, kotlin.coroutines.Continuation continuation) {
        super(continuation);
        this.f429407f = sVar;
    }

    @Override // qz5.a
    public final java.lang.Object invokeSuspend(java.lang.Object obj) {
        this.f429406e = obj;
        this.f429408g |= Integer.MIN_VALUE;
        return this.f429407f.b(false, this);
    }
}
